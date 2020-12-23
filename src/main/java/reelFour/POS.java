package reelFour;

/**
 * Description:
 * GET-version:
 * Date:2020-12-17  14:17
 * Author: wxr
 */

public class POS extends agent {
    private double sell_ady;
    private double sell_time;

    public double getSell_ady() {
        return sell_ady;
    }

    public void setSell_ady(double sell_ady) {
        this.sell_ady = sell_ady;
    }

    public double getSell_time() {
        return sell_time;
    }

    public void setSell_time(double sell_time) {
        this.sell_time = sell_time;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;//自己和自己比
        if (getClass() != otherObject.getClass()) return false;//反射判断是否相等

        POS pos = (POS) otherObject;
        return sell_ady == pos.sell_ady && sell_time == pos.sell_time;//判断值是否相等

    }
}
