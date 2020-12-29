package org.datafetchconnector.routes;
import org.datafetchconnector.ReadPropertyFile;

import java.io.*;
import javax.servlet.http.*;

public class ResponseServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(ReadPropertyFile.getProperty("authorizationUrl"));


    }



}
