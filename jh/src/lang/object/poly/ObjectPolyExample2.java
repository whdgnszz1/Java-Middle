package lang.object.poly;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/8/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : ObjectPolyExample2
 * @Date : 5/8/24
 * @description :
 */

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}
