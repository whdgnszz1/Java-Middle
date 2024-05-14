package lang.immutable.address;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/14/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : RefMain2
 * @Date : 5/14/24
 * @description :
 */

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법이 없음.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산"); // b의 값을 부산으로 변경해야함
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
