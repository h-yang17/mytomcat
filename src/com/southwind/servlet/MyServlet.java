package com.southwind.servlet;

import javax.servlet.*;
import java.io.IOException;

public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String id = servletRequest.getParameter("id");
        System.out.println("我已经接收到了请求"+id);

        System.out.println("我是Servlet,我已经接收到了客户端发送来的请求");
        servletResponse.setContentType("text/html;charset=UTF-8");
        servletResponse.getWriter().write("hello world11杨永安康");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
