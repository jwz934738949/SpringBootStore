package cn.edu.sdut.springbootstore.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class Sell {
    private int sellid,sellnum;
    private double sellprice;
    private Date selltime;
    private Goods goods;
    private Employee employee;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Sell{" +
                "sellid=" + sellid +
                ", sellnum=" + sellnum +
                ", sellprice=" + sellprice +
                ", selltime=" + selltime +
                ", goods=" + goods +
                ", employee=" + employee +
                '}';
    }

    public int getSellid() {
        return sellid;
    }

    public void setSellid(int sellid) {
        this.sellid = sellid;
    }



    public int getSellnum() {
        return sellnum;
    }

    public void setSellnum(int sellnum) {
        this.sellnum = sellnum;
    }



    public double getSellprice() {
        return sellprice;
    }

    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    public Date getSelltime() {
        return selltime;
    }

    public void setSelltime(Date selltime) {
        this.selltime = selltime;
    }

    public Sell(int sellid, int goodsid, int sellnum, int userid, double sellprice, Date selltime) {
        this.sellid = sellid;

        this.sellnum = sellnum;

        this.sellprice = sellprice;
        this.selltime = selltime;
    }

    public Sell() {
    }
}
