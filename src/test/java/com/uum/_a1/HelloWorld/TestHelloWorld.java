package com.uum._a1.HelloWorld;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {
    @Test
    
    public void testHello(){
        HelloWorld hw = new HelloWorld();
        String x = hw.sayHello("zaemy"); 
        Assert.assertEquals("hello zaemy","hello zaemy");
    }
}
