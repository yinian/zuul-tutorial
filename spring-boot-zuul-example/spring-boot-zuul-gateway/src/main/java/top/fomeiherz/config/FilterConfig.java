package top.fomeiherz.config;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.fomeiherz.filters.*;

@EnableZuulProxy
@Configuration
public class FilterConfig {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

    @Bean
    public ZuulPreLogFilter zuulPreLogFilter(){
        return new ZuulPreLogFilter();
    }
    @Bean
    public ThrowExceptionFilter throwExceptionFilter() {
        return new ThrowExceptionFilter();
    }

}
