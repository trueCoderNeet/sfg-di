package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifecycleDemoBean implements InitializingBean, DisposableBean, BeanFactoryAware, ApplicationContextAware, BeanNameAware {
    public LifecycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("##nLifecycle set bean factory method..");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## Lifecycle bean bean aware");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("###  Lifecycle bean has been terminated..##.");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## Lifecycle bean after properties set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Lifecycle bean in set application context");
    }
}
