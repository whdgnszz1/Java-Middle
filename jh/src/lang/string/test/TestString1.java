package lang.string.test;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/21/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : TestString1
 * @Date : 5/21/24
 * @description :
 */

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";
        boolean res = url.startsWith("https://");
        System.out.println("res = " + res);
    }
}
