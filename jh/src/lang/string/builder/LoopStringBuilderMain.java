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
 * @FileName : LoopStringBuilderMain
 * @Date : 5/20/24
 * @description :
 */

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + sb);
        System.out.println("endTime = " + (endTime - startTime) + "ms");
    }
}
