package top.fomeiherz.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: viagra
 * @Date: 2019/12/1 16:25
 * @Description:
 */
public class ZuulPreLogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(String.format("Send %s request to %s", request.getMethod(),
                request.getRequestURL().toString()));
        System.out.println("Inside ZuulPreLogFilter Filter.");
        return null;
    }
}
