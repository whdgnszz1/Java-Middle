package lang.immutable.address;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/10/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : PrimitiveMain
 * @Date : 5/10/24
 * @description :
 */

public class PrimitiveMain {

    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; // a -> b, 값 복사 후 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
