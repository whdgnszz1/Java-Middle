package lang.immutable.test;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/16/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : MyDateMain
 * @Date : 5/16/24
 * @description :
 */

public class MyDateMain {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024, 1, 1);
        MyDate data2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("data2 = " + data2);

        System.out.println("2025 -> date1");
        date1.setYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("data2 = " + data2);
    }
}
