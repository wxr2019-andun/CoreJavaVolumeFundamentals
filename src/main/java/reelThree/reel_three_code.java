package reelThree;

/**
 * Description:
 * GET-version:
 * Date:2020-12-14  14:36
 * Author: wxr
 */

public class reel_three_code {
    public static void main(String[] args) {
//        //3.10.3 数组拷贝-
//        //在 Java 中，允许将一个数组变量拷贝给另一个数组变量。这时， 两个变量将引用同一个数组：
//        int[] array_one = {1, 2, 3, 4, 5};
//        int[] array_two = array_one;
//        array_one[2] = 100;
////        for (int i = 0; i < array_two.length; i++) {
////            System.out.println(array_two[i]);
////        }
//        //如果希望将一个数组的所有值拷贝到一个新的数组中去，就要使用 Arrays 类的 copyOf方法：
//        int[] array_three = Arrays.copyOf(array_one, array_one.length);
//        array_one[3] = 200;
//        for (int i = 0; i < array_three.length; i++) {
//            System.out.println(array_three[i]);
//        }
//        System.out.println("_______________________________________________________");
//        for (int i = 0; i < array_two.length; i++) {
//            System.out.println(array_two[i]);
//        }



        //3.10.4 命令行参数
        if(args.length==0 || args[0].equals("-h")){
            System.out.println("hey");
        }
        else if(args[0].equals("-g")){
            System.out.println("bye");
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(" "+args[i]);
            System.out.println("!");
        }

    }
}
