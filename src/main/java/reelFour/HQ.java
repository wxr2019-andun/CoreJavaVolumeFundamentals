package reelFour;

import java.util.Date;

/**
 * Description:
 * GET-version:
 * Date:2020-12-17  13:43
 * Author: wxr
 */

public class HQ {
    public HQ() {
    }

    public HQ(int income, int consume, Date incomeDate, Date consumeDate, String site, String hQName) {
        this.income = income;
        this.consume = consume;
        this.incomeDate = incomeDate;
        this.consumeDate = consumeDate;
        this.site = site;
        this.hQName = hQName;
    }

    private int income;
    private int consume;
    private Date incomeDate;
    private Date consumeDate;
    private String site;
    private String hQName;

    public void cool(){
        System.out.println("keep-real");
    }
    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getConsume() {
        return consume;
    }

    public void setConsume(int consume) {
        this.consume = consume;
    }

    public Date getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }

    public Date getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String gethQName() {
        return hQName;
    }

    public void sethQName(String hQName) {
        this.hQName = hQName;
    }
}
