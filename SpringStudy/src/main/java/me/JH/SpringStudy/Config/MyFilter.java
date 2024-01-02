package me.JH.SpringStudy.Config;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {//todo : PasswordEncoder = null 체크하는 로직 작성하기, log 찍는 내용도

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

	}

	@Override
	public void destroy() {
		Filter.super.destroy();
	}
}
