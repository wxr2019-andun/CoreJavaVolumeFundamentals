package reelFour;

/**
 * Description:
 * GET-version:
 * Date:2020-12-15  9:43
 * Author: wxr
 */

public class reel_four_code {

    public reel_four_code(String name, int age, double kg) {
        this.name = name;
        this.age = age;
        this.kg = kg;
    }

    public reel_four_code() {
        System.out.println("null-param");
    }

//??? page 126
//    public reel_four_code(double kg_param) {
//        this("`"+kg,kg_param);
//    }


    private static int identity;
    private String name;
    private int age;
    private double kg;
    {
        System.out.println("object-block");
        age=identity;
        identity++;
    }

    public static int getIdentity() {
        return identity;
    }
    public static void setIdentity(int identity) {
        reel_four_code.identity = identity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getKg() {
        return kg;
    }
    public void setKg(double kg) {
        this.kg = kg;
    }

    public static void main(String[] args) {
        reel_four_code r = new reel_four_code();
        System.out.println(r.getAge());
        System.out.println(reel_four_code.getIdentity());
    }
}
