package com.github.kelly.controller;

import com.github.kelly.http.cookie.Cookie;
import com.github.kelly.http.cookie.CookieParser;
import com.github.kelly.http.cookie.CookieTypes;
import com.github.kelly.http.request.HttpRequest;
import com.github.kelly.http.response.HttpResponse;
import com.github.kelly.http.session.Session;
import com.github.kelly.http.session.SessionManager;

public class LogOutController implements Controller {


    @Override
    public void process(HttpRequest httpRequest, HttpResponse httpResponse) {
        System.out.println("LogOutController.process");

        String cookieValue = CookieParser.parseCookie(httpRequest);
        SessionManager sessionManager = SessionManager.getInstance();
        Session session = sessionManager.getSession(cookieValue);

        Cookie cookie = new Cookie(CookieTypes.YH_COOKIE, session.getId());
        cookie.setMaxAge(0);
        session.invalidate();

        httpResponse.addHeader("Set-Cookie", cookie.createCookie());
        httpResponse.redirect("/home.html");
    }
}