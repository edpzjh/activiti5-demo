package com.bulain.mybatis.log;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ThreadFilter implements Filter{

    private static final String DEBUG_NAME = "debug";
    private static final String DEBUG_VALUE = "true";

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
        throws IOException, ServletException {
        
        String debug = request.getParameter(DEBUG_NAME);
        if(DEBUG_VALUE.equalsIgnoreCase(debug)){
            ThreadContext.active();
        }
        
        try{
            chain.doFilter(request, response);
        }finally{
            if(DEBUG_VALUE.equalsIgnoreCase(debug)){
                List<String> list = ThreadContext.get();
                PrintWriter writer = response.getWriter();
                writer.print("<div>");
                for(String s: list){
                    writer.print("<div>");
                    writer.print(s);
                    writer.print("</div>");
                }
                writer.print("</div>");
                writer.flush();
                ThreadContext.clear();
            }
        }
    }

    public void destroy() {
    }

}
