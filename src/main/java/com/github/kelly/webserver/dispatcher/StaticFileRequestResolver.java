package com.github.kelly.webserver.dispatcher;

import com.github.kelly.http.request.HttpRequest;
import com.github.kelly.controller.Controller;
import com.github.kelly.webserver.controller.StaticFileController;
import java.io.*;


/**
 * Resolver 의 역할:
 * 1. 들어온 요청을 지원하는지 확인한다.
 * 2. 지원하지 않으면 null, 지원 한다면 StaticController 반환
 */
public class StaticFileRequestResolver implements RequestResolver {


    private final String DIRECTORY = "static";

    private static final StaticFileController STATIC_FILE_CONTROLLER = new StaticFileController();


    @Override
    public boolean support(HttpRequest httpRequest) {
        String filePath = DIRECTORY + httpRequest.getRequestLine().getUrl();
        System.out.println("filePath = " + filePath);
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filePath);
        try {
            return inputStream != null;

        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Controller resolve(HttpRequest httpRequest) {
        if (support(httpRequest)) {
            return STATIC_FILE_CONTROLLER;
        }

        return null;
    }
}
