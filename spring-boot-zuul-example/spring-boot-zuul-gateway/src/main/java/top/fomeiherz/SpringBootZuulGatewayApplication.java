package top.fomeiherz;


import com.netflix.zuul.FilterProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.fomeiherz.config.DidiFilterProcessor;

@SpringBootApplication
public class SpringBootZuulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootZuulGatewayApplication.class, args);
        FilterProcessor.setProcessor(new DidiFilterProcessor());
    }

}
