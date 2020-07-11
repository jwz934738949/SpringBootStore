package cn.edu.sdut.springbootstore.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class Goods {
    private int goodsid,goodsnum;
    private String goodsname,goodstype,shelflife;
    private Date productedtime;

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public int getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(int goodsnum) {
        this.goodsnum = goodsnum;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype;
    }

    public Date getProductedtime() {
        return productedtime;
    }

    public void setProductedtime(Date productedtime) {
        this.productedtime = productedtime;
    }

    public String getShelflife() {
        return shelflife;
    }

    public void setShelflife(String shelflife) {
        this.shelflife = shelflife;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid=" + goodsid +
                ", goodsnum=" + goodsnum +
                ", goodsname='" + goodsname + '\'' +
                ", goodstype='" + goodstype + '\'' +
                ", productedtime=" + productedtime +
                ", shelflife=" + shelflife +
                '}';
    }

    public Goods() {
    }

    public Goods(int goodsid, int goodsnum, String goodsname, String goodstype, Date productedtime, String shelflife) {
        this.goodsid = goodsid;

        this.goodsname = goodsname;
        this.goodstype = goodstype;
        this.productedtime = productedtime;
        this.shelflife = shelflife;
        this.goodsnum = goodsnum;
    }
}
