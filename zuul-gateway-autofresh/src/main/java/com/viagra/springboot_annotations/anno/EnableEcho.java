package com.viagra.springboot_annotations.anno;

import com.viagra.springboot_annotations.processor.BamuImportBeanDefunitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Auther: viagra
 * @Date: 2019/12/5 20:13
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({BamuImportBeanDefunitionRegistrar.class})
public @interface EnableEcho {
    //传入包名
    String[] packages() default "";
}
