package com.MainTestThreads;

import com.ThreadProgram.SellTicket;

public class SellTicketMainTest {

    public static void main(String[] args) {
//        SellTicket stOne = new SellTicket("销售窗口1");
//        SellTicket stTwo= new SellTicket("销售窗口2");
//        SellTicket stThree= new SellTicket("销售窗口3");
//        stThree.start();
//        stOne.start();
//        stTwo.start();

        for (int i = 1; i <= 20; i++) {
            SellTicket sellTicket = new SellTicket("销售窗口" + i);
            sellTicket.start();
        }
    }
}
