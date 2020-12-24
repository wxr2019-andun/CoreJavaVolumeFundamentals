package reelSix;

/**
 * Description:
 * GET-version:
 * Date:2020-12-24  11:48
 * Author: wxr
 */

public interface TestInterface {
    public static String conventInteger(){
        return "";
    }
    public final int pool=30000;

    default double randomDoubleValue(){
        return 10.10;
    }

    void InterfaceMethod();

}
