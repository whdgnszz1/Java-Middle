package lang.string.chaining;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/21/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : MethodChainingMain2
 * @Date : 5/21/24
 * @description :
 */

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("adder = " + adder.getValue());
        System.out.println("adder1 = " + adder1.getValue());
        System.out.println("adder2 = " + adder2.getValue());
        System.out.println("adder3 = " + adder3.getValue());
    }
}
