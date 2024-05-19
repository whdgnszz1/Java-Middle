package lang.string.builder;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/20/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : LoopStringMain
 * @Date : 5/20/24
 * @description :
 */

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("endTime = " + (endTime - startTime) + "ms");
    }
}
