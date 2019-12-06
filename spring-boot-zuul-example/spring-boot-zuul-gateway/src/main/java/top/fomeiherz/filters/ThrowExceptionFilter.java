package top.fomeiherz.filters;

import org.apache.log4j.Logger;
import com.netflix.zuul.ZuulFilter;
/**
 * @Auther: viagra
 * @Date: 2019/12/1 17:33
 * @Description:
 */
public class ThrowExceptionFilter extends ZuulFilter {

    private static Logger log = Logger.getLogger(ThrowExceptionFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("This is a pre filter, it will throw a RuntimeException");
        doSomething();
        return null;
    }

    private void doSomething() {
        throw new RuntimeException("Exist some errors...");
    }

}

