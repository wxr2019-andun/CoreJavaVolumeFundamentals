package reelFour;

import java.lang.reflect.Field;

/**
 * Description:
 * GET-version:
 * Date:2020-12-23  14:48
 * Author: wxr
 */

public class practiceCode {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        HQ hq1 = new HQ();
//        hq1.getConsume();
//
//        Class c  = HQ.class;
//        System.out.println(c.getName());;
//        System.out.println(c.getField("cool"));



        Employee  harry =  new  Employee("Harry",10,null);
        Class cl =  harry.getClass();
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
        Object v = f.get(harry);

        System.out.println(v);
    }
}
