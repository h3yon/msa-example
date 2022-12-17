package com.example.zuulservice.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.util.RequestContentDataExtractor;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Slf4j
@Component
public class ZuulLoggingFilter extends ZuulFilter {

    @Override
    public Object run() throws ZuulException {
        log.info("************* printing logs: ");

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("************* printing logs: " + request.getRequestURI());
        return null;
    }

    @Override
    public String filterType() {
        return "pre"; //사전 필터인지 사후 필터인지
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true; //필터로 쓰겠다
    }
}
