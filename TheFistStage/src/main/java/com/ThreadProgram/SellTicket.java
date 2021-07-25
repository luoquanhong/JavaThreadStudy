package com.ThreadProgram;

import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class SellTicket extends Thread{

    String threadName;

    private static int ticketValue = 1000;

    public SellTicket(String name) {
        super(name);
        this.threadName = name;
    }

    @Override
    public void run() {
        while (ticketValue > 0) {
            System.out.println(String.format("剩余的售票数量是: %d, 当前销售窗口是: %s", ticketValue, Thread.currentThread().getName()));
            ticketValue--;
        }
    }

    private String getStringFromJoiner(String otherMerge){
        return new StringJoiner(otherMerge).toString();
    }
}
