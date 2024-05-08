package lang.object;
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
 * @FileName : Parent
 * @Date : 5/8/24
 * @description :
 */

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
