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
 * @FileName : TestString8
 * @Date : 5/22/24
 * @description :
 */

public class TestString8 {

    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        String replaced = input.replace("java", "jvm");
        System.out.println("replaced = " + replaced);
    }
}
