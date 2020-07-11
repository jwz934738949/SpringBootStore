package cn.edu.sdut.springbootstore.purchase;

import cn.edu.sdut.springbootstore.SpringbootstoreApplicationTests;
import cn.edu.sdut.springbootstore.entity.Goods;
import cn.edu.sdut.springbootstore.entity.Purchase;
import cn.edu.sdut.springbootstore.entity.Supply;
import cn.edu.sdut.springbootstore.service.PurchaseService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestPurchase extends SpringbootstoreApplicationTests {
    @Resource
    private PurchaseService purchaseService;

    @Test
    public void testQueryPurchases() {
        Purchase purchase = new Purchase();
        Goods goods = new Goods();
        Supply supply = new Supply();
        goods.setGoodsid(1);
        purchase.setGoods(goods);
        supply.setSupid(3);
        purchase.setSupply(supply);
        List<Purchase> purchases = this.purchaseService.queryPurchases(purchase);
        purchases.forEach(pur -> System.out.println("pur = " + pur));
    }

    @Test
    public void testQueryPurchaseById() {
        int purid = 1;
        Purchase purchase = this.purchaseService.queryPurchaseById(purid);
        System.out.println("purchase = " + purchase);
    }

    @Test
    public void testAddPurchase() {
        Purchase purchase = new Purchase();
        Goods goods = new Goods();
        Supply supply = new Supply();
        goods.setGoodsid(5);
        supply.setSupid(3);
        purchase.setPurnum(20);
        purchase.setPurprice(45);
        purchase.setGoods(goods);
        purchase.setSupply(supply);
        this.print(this.purchaseService.addPurchase(purchase));
    }

    @Test
    public void testUpdatePurchase() {
        Purchase purchase = new Purchase();
        purchase.setPurid(4);
        purchase.setPurnum(5);
        purchase.setPurprice(15);
        Goods goods = new Goods();
        goods.setGoodsid(3);
        purchase.setGoods(goods);
        Supply supply = new Supply();
        supply.setSupid(2);
        purchase.setSupply(supply);
        this.print(this.purchaseService.updatePurchase(purchase));
    }

    @Test
    public void testDeletePurchase() {
        int purid = 4;
        this.print(this.purchaseService.deletePurchase(purid));
    }

    @Test
    public void testDeletePurchaseByGoodsid() {
        int goodsid = 1;
        this.print(this.purchaseService.deletePurchaseByGoodsid(goodsid));
    }

    @Test
    public void testDeletePurchaseBySupid() {
        int supid = 2;
        this.print(this.purchaseService.deletePruchaseBySupid(supid));
    }
}
