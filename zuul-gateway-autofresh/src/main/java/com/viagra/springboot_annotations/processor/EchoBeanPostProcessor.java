package com.viagra.springboot_annotations.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;

/**
 * @Auther: viagra
 * @Date: 2019/12/5 19:56
 * @Description:
 */
//实现BeanPostProcessor接口的类，放入spring容器中后，容器启动和关闭时会执行以下两个重写的方法

public class EchoBeanPostProcessor implements BeanPostProcessor {

    private List<String> packages;


    //该方法在spring容器初始化前执行
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {

        for (String pack : packages){
            if (o.getClass().getName().startsWith(pack)){
                System.out.println("echo bean:" + o.getClass().getName());
            }
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }
}
