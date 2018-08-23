package com.dognessnetwork.ble.common;

public class OAuthInfo {
	private String access_token;
	private String openid;
	private Integer errcode;
	private String errmsg;
	private Integer expires_in;
	private String refresh_token;
	private String scope;
	private String unionid;

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public Integer getErrcode() {
		return errcode;
	}
	public void setErrcode(Integer errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public Integer getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	private String session_key;
	
	public String getSession_key() {
		return session_key;
	}
	public void setSession_key(String session_key) {
		this.session_key = session_key;
	}
	@Override
	public String toString() {
		return "OAuthInfo [access_token=" + access_token + ", openid=" + openid + ", errcode=" + errcode + ", errmsg="
				+ errmsg + ", expires_in=" + expires_in + ", refresh_token=" + refresh_token + ", scope=" + scope
				+ ", unionid=" + unionid + ", session_key=" + session_key + "]";
	}
	
	
	
	
}
