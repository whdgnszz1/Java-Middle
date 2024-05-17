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
 * @FileName : StringImmutable1
 * @Date : 5/17/24
 * @description :
 */

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
    }
}
