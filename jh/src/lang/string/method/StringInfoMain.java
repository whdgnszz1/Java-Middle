package lang.string.method;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/18/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : StringInfoMain
 * @Date : 5/18/24
 * @description :
 */

public class StringInfoMain {

    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("문자열의 길이: " + str.length());
        System.out.println("문자열이 비어있는지: " + str.isEmpty());
        System.out.println("문자열이 비어있거나 공백인지: " + str.isBlank());
        System.out.println("문자열이 비어있거나 공백인지: " + "     ".isBlank());

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자 = " + c);
    }
}
