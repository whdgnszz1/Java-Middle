package lang.wrapper;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/22/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : MyIntegerMethodMain0
 * @Date : 5/22/24
 * @description :
 */

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }


}
