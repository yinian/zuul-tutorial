package com.viagra.springboot_annotations;

import com.viagra.springboot_annotations.anno.EnableEcho;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: viagra
 * @Date: 2019/12/5 20:19
 * @Description:
 */
@SpringBootApplication
@EnableEcho(packages = {"com.viagra.springboot_annotations.vo", "com.viagra.springboot_annotations.dto"})
public class BlogApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(BlogApplication.class,args);
        context.close();
    }
}
