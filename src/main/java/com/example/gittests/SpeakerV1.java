package com.example.gittests;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Component
public class SpeakerV1 implements Speaker{
    @Override
    public boolean speak() {
        Method[] methods = HelloWorld.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("hi")) {
                try {
                    method.invoke(null);
                    return true;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    System.out.println("Method failed to invoke:\n" + e.getMessage());
                }
            }
        }
        return false;
    }
}
