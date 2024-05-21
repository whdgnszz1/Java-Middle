package lang.string.test;
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
 * @FileName : TestString9
 * @Date : 5/22/24
 * @description :
 */

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] strings = email.split("@");
        String id = strings[0];
        String domain = strings[1];

        System.out.println("id = " + id);
        System.out.println("domain = " + domain);
    }
}
