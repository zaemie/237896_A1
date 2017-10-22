/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a1.HelloWorld;

/**
 *
 * @author HP
 */
public class HelloWorld {
    public static void main(String[] args){
        HelloWorld hw = new HelloWorld();
        String x = hw.sayHello("zaemy");
        System.out.println(x);
    }
    public String sayHello(String name){
        String Hello = "hello" + name;
        return Hello;
    }
    
}
