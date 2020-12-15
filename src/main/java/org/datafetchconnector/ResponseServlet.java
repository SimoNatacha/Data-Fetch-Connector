package org.datafetchconnector;

import com.intuit.oauth2.exception.InvalidRequestException;

import java.io.*;
import javax.servlet.http.*;

public class ResponseServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            response.sendRedirect(AuthConfig.getUrl());


        } catch (InvalidRequestException e) {
            e.printStackTrace();
        }

    }



}
