package com.jpa.baisc.filter;


import jakarta.servlet.*;

import java.io.IOException;

public class AuthenticationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //다음 필터를 호출
        chain.doFilter(request, response);
    }
}
