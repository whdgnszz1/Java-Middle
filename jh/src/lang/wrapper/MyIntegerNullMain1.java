package lang.wrapper;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/23/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : MyIntegerNullMain1
 * @Date : 5/23/24
 * @description :
 */

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {
                new MyInteger(-1),
                new MyInteger(0),
                new MyInteger(1),
                new MyInteger(2),
                new MyInteger(3)
        };
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    public static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
