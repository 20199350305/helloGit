package com.zpb;

import com.zpb.maven.Hello;
import org.junit.Test;

/**
 * @author 张鹏博
 * @version 1.0
 */
public class HelloTest {

    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}
