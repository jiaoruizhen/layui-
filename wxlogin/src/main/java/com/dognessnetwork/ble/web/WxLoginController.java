package com.dognessnetwork.ble.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dognessnetwork.ble.common.Constant;
import com.dognessnetwork.ble.common.OAuthInfo;
import com.dognessnetwork.ble.util.HttpClientUtil;

import net.sf.json.JSONObject;





@RestController
public class WxLoginController {
	
	private static final Logger log = LoggerFactory.getLogger(WxLoginController.class);

	@RequestMapping(value="/test")
	@ResponseBody
	public Object getCode(){
		String url="https://open.weixin.qq.com/connect/qrconnect?"
		+ "appid=APPID"
		+ "&redirect_uri=https://www.dognessnetwork.com/wxlogin/hello"
		+ "&response_type=code"
		+ "&scope=snsapi_login"
		+ "&state=123456"
		+ "#wechat_redirect";
		String result=HttpClientUtil.doGet(url.replace("APPID", Constant.APPKEY));
		System.out.println(result);
		return result.replace("/connect/qrcode/0118hFTCOyAIIhRn", "https://open.weixin.qq.com/connect/qrcode/0118hFTCOyAIIhRn");
	}
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public Object test(String code,String state){
		String url="https://api.weixin.qq.com/sns/oauth2/access_token"
				+ "?appid=APPID"
				+ "&secret=SECRET"
				+ "&code=CODE"
				+ "&grant_type=authorization_code";
		url=url.replace("APPID", Constant.APPKEY)
				.replace("SECRET", Constant.SECRET)
				.replace("CODE", code);
		log.info("============="+url);
		String result=HttpClientUtil.doGet(url);
		
		log.info("result:====="+result);
		  OAuthInfo auth = null;
	        try {
	        	auth=(OAuthInfo)JSONObject.toBean(JSONObject.fromObject(result), OAuthInfo.class);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        log.info("============="+auth.toString());
		String userUrl="https://api.weixin.qq.com/sns/userinfo"
				+ "?access_token=ACCESS_TOKEN"
				+ "&openid=OPENID";
		log.info("============="+userUrl);
		log.info("============="+auth.getAccess_token());
		userUrl=userUrl.replace("ACCESS_TOKEN", auth.getAccess_token()).replace("OPENID", auth.getOpenid());
		String userInfo=HttpClientUtil.doGet(userUrl);
		return userInfo;
	}
}
