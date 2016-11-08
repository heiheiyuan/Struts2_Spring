package com.snaillemon.ss.test;

import com.snaillemon.ss.action.CrmAction;
import com.snaillemon.ss.service.impl.CrmServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GoodBoy on 11/8/2016.
 */
public class CrmTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CrmAction crmAction = context.getBean("crmAction", CrmAction.class);
        System.out.println("web层");
        crmAction.exectue();
    }
}
