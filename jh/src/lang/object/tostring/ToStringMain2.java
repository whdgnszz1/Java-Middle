package lang.object.tostring;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/9/24
 *
 ****************************************************/


import static lang.object.tostring.ObjectPrinter.print;

/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : ToStringMain2
 * @Date : 5/9/24
 * @description :
 */

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model3");
        Dog dog1 = new Dog("뽀삐1", 1);
        Dog dog2 = new Dog("뽀삐2", 3);


        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        print(car);
        print(dog1);
        print(dog2);

        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);
    }
}
