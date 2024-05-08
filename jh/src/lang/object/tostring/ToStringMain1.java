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


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : ToStringMain1
 * @Date : 5/9/24
 * @description :
 */

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println("string = " + string);

        // object 직접 출력
        System.out.println("object = " + object);
    }
}
