package com.github.alexv1993;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Alex on 08.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        NullKeyMap nullKeyMap = (NullKeyMap) applicationContext.getBean("nullKeyMap");
        NullTreeMap nullTreeMap = (NullTreeMap) applicationContext.getBean("nullTreeMap");

        //nullTreeMap.test1();
        //nullTreeMap.test2();
        nullTreeMap.test3();

    }

}
