package org.sonatype.mavenbook.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	out.println( "SimpleServlet Executed zhouyao by 11:24" );
        out.flush();
        out.close();
    }
}