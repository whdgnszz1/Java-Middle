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


import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : TestString10
 * @Date : 5/22/24
 * @description :
 */

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] strings = fruits.split(",");
        for (String string : strings) {
            System.out.println(string);
        }
//        String joined = Arrays.stream(strings).collect(Collectors.joining("->"));
        String joined = String.join("->", strings);
        System.out.println("joinedString = " + joined);
    }
}
