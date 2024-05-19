package lang.string.method;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/19/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : jh
 * @FileName : StringSplitJoinMain
 * @Date : 5/19/24
 * @description :
 */

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] strings = str.split(",");
        for (String string : strings) {
            System.out.println("string = " + string);
        }

        String joinStr = "";
        for (String string : strings) {
            joinStr += string + "-";
        }
        
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            joinStr += string;
            if(i != strings.length-1) {
                joinStr += "-";
            }
        }

        System.out.println("joinStr = " + joinStr);
        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);
        
        // 문자열 배열 열ㄴ결
        String result = String.join("-", strings);
        System.out.println("result = " + result);
    }
}
