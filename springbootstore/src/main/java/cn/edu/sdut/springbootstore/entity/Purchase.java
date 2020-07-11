package cn.edu.sdut.springbootstore.entity;

import java.util.Date;

public class Purchase {
    private int purid, purnum;
    private Date purtime;
    private double purprice;
    private Supply supply;
    private Goods goods;

    public int getPurid() {
        return purid;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public void setPurid(int purid) {
        this.purid = purid;
    }

    public int getPurnum() {
        return purnum;
    }

    public void setPurnum(int purnum) {
        this.purnum = purnum;
    }

    public Date getPurtime() {
        return purtime;
    }

    public void setPurtime(Date purtime) {
        this.purtime = purtime;
    }

    public double getPurprice() {
        return purprice;
    }

    public void setPurprice(double purprice) {
        this.purprice = purprice;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purid=" + purid +
                ", purnum=" + purnum +
                ", purtime=" + purtime +
                ", purprice=" + purprice +
                ", supply=" + supply +
                ", goods=" + goods +
                '}';
    }

    public Purchase(int purid, int purnum, Date purtime, double purprice) {
        this.purid = purid;
        this.purnum = purnum;
        this.purtime = purtime;
        this.purprice = purprice;
    }

    public Purchase() {
    }
}
