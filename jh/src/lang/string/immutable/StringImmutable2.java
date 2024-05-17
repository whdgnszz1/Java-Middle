package lang.string.immutable;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/17/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : StringImmutable2
 * @Date : 5/17/24
 * @description :
 */

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
