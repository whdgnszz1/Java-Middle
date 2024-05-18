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
 * @FileName : StringSearchMain
 * @Date : 5/18/24
 * @description :
 */

public class StringSearchMain {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world";

        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.contains("Java"));
        System.out.println("'Java'의 첫 번째 인덱스: " + str.indexOf("Java"));
        System.out.println("인덱스 10부터 'Java'의 인덱스: " + str.indexOf("Java", 10));
    }
}
