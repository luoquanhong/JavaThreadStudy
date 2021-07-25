package com.ThreadProgram;

import java.util.concurrent.TimeUnit;

public class RandomThreadsTest {

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
