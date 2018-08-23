//package com.dognessnetwork.ble.config;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Component;
//
//import twitter4j.Twitter;
//import twitter4j.TwitterFactory;
//import twitter4j.auth.RequestToken;
//
//@Component
//public class SigninServlet extends HttpServlet {
//    private static final long serialVersionUID = -6205814293093350242L;
// 
//    @SuppressWarnings("unused")
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    
//    	Twitter twitter = new TwitterFactory().getInstance();
//    	request.getSession().setAttribute("twitter", twitter);
//    	 
//    	//OAuth有两种Token，分别是RequestToken和AccessTonke。
//    	//通过OAuth Consumer的key和secret就可以获取RequestTokenKey和RequestTokenSecret：
//    	twitter.setOAuthConsumer( "UCGoimkpcQy3JbdzJSYWRPiua",  "mGlQ0xBHmMzgUFtRG6hH6nC5eN5vSjtdSMPm5UyfeXDi32JKrV");
//    	RequestToken requestToken = null;
//		try {
//			requestToken = twitter.getOAuthRequestToken();
//			request.getSession().setAttribute("requestToken", requestToken);
//			String token = requestToken.getToken();
//			String tokenSecret = requestToken.getTokenSecret();
//			System.out.println(request.getSession());
//			System.out.println(request.getSession().getAttribute("twitter"));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	 
//    	 
//    	
//    	//跳转到Twitter OAuth验证页面
//    	response.sendRedirect(requestToken.getAuthorizationURL());
// 
//    }
//}
