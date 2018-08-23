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
//import twitter4j.TwitterException;
//import twitter4j.User;
//import twitter4j.auth.AccessToken;
//import twitter4j.auth.RequestToken;
//import twitter4j.conf.ConfigurationBuilder;
//
//@Component
//public class CallbackServlet extends HttpServlet {
//    private static final long serialVersionUID = 1657390011452788111L;
// 
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	System.out.println(request.getSession());
//        Twitter twitter = (Twitter) request.getSession().getAttribute("twitter");
//        RequestToken requestToken = (RequestToken) request.getSession().getAttribute("requestToken");
//        String verifier = request.getParameter("oauth_verifier");
//        //String verifier = "ykGHyc1w49UVLYF9Vt2giOsv4u9QnUEA";
//        try {
//        	
//            AccessToken accessToken = twitter.getOAuthAccessToken(requestToken, verifier);
//            request.getSession().removeAttribute("requestToken");
//            ConfigurationBuilder builder = new ConfigurationBuilder();
//            builder.setOAuthConsumerKey("UCGoimkpcQy3JbdzJSYWRPiua");
//            builder.setOAuthConsumerSecret("mGlQ0xBHmMzgUFtRG6hH6nC5eN5vSjtdSMPm5UyfeXDi32JKrV");
//            builder.setOAuthAccessToken(accessToken.getToken());
//            builder.setOAuthAccessTokenSecret(accessToken.getTokenSecret());
//            builder.setIncludeEmailEnabled(true); 
//            User user = twitter.verifyCredentials();
//            System.out.print(user);
//           // User user = twitter.showUser(accessToken.getUserId());
//            System.out.println(user);
//        } catch (Exception e) {
//            throw new ServletException(e);
//        }
//        response.sendRedirect(request.getContextPath() + "/");
//    }
//}
