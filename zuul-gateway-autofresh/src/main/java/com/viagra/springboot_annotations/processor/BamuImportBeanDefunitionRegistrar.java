package com.viagra.springboot_annotations.processor;

import com.viagra.springboot_annotations.anno.EnableEcho;
import org.bouncycastle.operator.MacCalculatorProvider;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Auther: viagra
 * @Date: 2019/12/5 19:59
 * @Description:
 */
public class BamuImportBeanDefunitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                        BeanDefinitionRegistry beanDefinitionRegistry) {
        // 获取EnableEcho注解的所有属性的value
        Map<String, Object> attributes =
                annotationMetadata.getAnnotationAttributes(EnableEcho.class.getName());
        // 获取package 属性的value
        List<String> packages =
                Arrays.asList((String[]) attributes.get("packages"));

        // 使用beanDefinitionRegistry对象将EchoBeanPostProcessor注入到Spring容器中
        BeanDefinitionBuilder beanDefinitionBuilder =
                BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcessor.class);
        // 给EchoBeanPostProcessor.class中注入packages
        beanDefinitionBuilder.addPropertyValue("packages", packages);

        beanDefinitionRegistry.registerBeanDefinition(EchoBeanPostProcessor.class.getName(),
                beanDefinitionBuilder.getBeanDefinition());































    }
}
