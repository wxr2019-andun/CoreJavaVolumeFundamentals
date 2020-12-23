package reelFour;

import java.util.Date;

/**
 * Description:
 * GET-version:
 * Date:2020-12-17  13:48
 * Author: wxr
 */

public class agent extends HQ {
    public agent() {
    }

    public agent(int income, int consume, Date incomeDate, Date consumeDate, String site, String hQName) {
        super(income, consume, incomeDate, consumeDate, site, hQName);
    }
    //    public agent(int income, int consume, Date incomeDate, Date consumeDate, String site, String hQName, String agentName, String agentId) {
//        super(income, consume, incomeDate, consumeDate, site, hQName);//这里 super 有什么作用吗？ [如果这里不用super 就没法在构造器李 对超类的成员变量 变量赋值]
//        this.agentName = agentName;
//        this.agentId = agentId;
//    }


//    agent(int income, int consume, Date incomeDate, Date consumeDate, String site, String hQName){
//        income = income;
//        consume = consume;
//        incomeDate = incomeDate;
//        consumeDate = consumeDate;
//        site = site;
//        hQName = hQName;
//    }


    private String agentName;
    private String agentId;
    private double  receiveDividends;

    public double receiveDividends_value(int ratio){
        receiveDividends=receiveDividends*ratio;//receiveDividends在这里被调用属于隐式参数
        return receiveDividends;
    }
    void method_test(){
        System.out.println("method_test-run");
    }
    void method_test_two(){
        this.method_test();
        System.out.println();
    }

}
