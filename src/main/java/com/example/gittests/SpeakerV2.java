package com.example.gittests;

import org.springframework.stereotype.Component;

@Component
public class SpeakerV2 implements Speaker{
    @Override
    public void speak() {
        HelloWorld.hi();
    }
}
