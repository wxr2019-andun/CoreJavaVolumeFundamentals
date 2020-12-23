package reelFour;

import java.util.Date;

/**
 * Description:
 * GET-version:
 * Date:2020-12-22  14:56
 * Author: wxr
 */

public class Agent_2 extends HQ {
    private String declared;
    public Agent_2(){
    }
    public Agent_2(int income, int consume, Date incomeDate, Date consumeDate, String site, String hQName) {
        super(income, consume, incomeDate, consumeDate, site, hQName);
    }

}
