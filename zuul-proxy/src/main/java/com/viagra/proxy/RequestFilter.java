package com.viagra.proxy;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;
/**
 * @Auther: viagra
 * @Date: 2019/12/6 13:36
 * @Description:
 */
public class RequestFilter extends ZuulFilter
{
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        return null;
    }
}
