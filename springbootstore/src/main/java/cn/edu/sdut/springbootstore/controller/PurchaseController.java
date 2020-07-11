package cn.edu.sdut.springbootstore.controller;

import cn.edu.sdut.springbootstore.entity.Goods;
import cn.edu.sdut.springbootstore.entity.Purchase;
import cn.edu.sdut.springbootstore.entity.Supply;
import cn.edu.sdut.springbootstore.service.GoodsService;
import cn.edu.sdut.springbootstore.service.PurchaseService;
import cn.edu.sdut.springbootstore.service.SupplyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PurchaseController {
    @Resource
    private PurchaseService purchaseService;
    @Resource
    private GoodsService goodsService;
    @Resource
    private SupplyService supplyService;
    public static String SUCCESS = "redirect:queryPurchases";

    @RequestMapping("queryPurchases")
    public String queryPurchases(Purchase purchase, ModelMap modelMap) {
        List<Purchase> purchases = this.purchaseService.queryPurchases(purchase);
        modelMap.put("purchases", purchases);
        List<Goods> goods = this.goodsService.queryGoods(new Goods());
        modelMap.put("goods", goods);
        List<Supply> supplies = this.supplyService.querySupplys(new Supply());
        modelMap.put("supplies", supplies);
        return "purchase/listPurchase";
    }

    @RequestMapping("toAddPurchase")
    public String toAdd(ModelMap modelMap) {
        List<Goods> goods = this.goodsService.queryGoods(new Goods());
        modelMap.put("goods", goods);
        List<Supply> supplies = this.supplyService.querySupplys(new Supply());
        modelMap.put("supplies", supplies);
        return "purchase/addPurchase";
    }

    @RequestMapping("doAddPurchase")
    public String doAdd(Purchase purchase) {
        this.purchaseService.addPurchase(purchase);
        return SUCCESS;
    }

    @RequestMapping("detailPurchase")
    public String detailPurchase(int purid, ModelMap modelMap) {
        Purchase purchase = this.purchaseService.queryPurchaseById(purid);
        modelMap.put("purchase", purchase);
        Goods goods = this.goodsService.queryGoodsByPurid(purid);
        modelMap.put("goods", goods);
        Supply supply = this.supplyService.querySupplyByPurid(purid);
        modelMap.put("supply", supply);
        return "purchase/detailPurchase";
    }

    @RequestMapping("toUpdatePurchase")
    public String toUpdate(int purid, ModelMap modelMap) {
        Purchase purchase = this.purchaseService.queryPurchaseById(purid);
        modelMap.put("purchase", purchase);
        List<Goods> goods = this.goodsService.queryGoods(new Goods());
        modelMap.put("goods", goods);
        List<Supply> supplies = this.supplyService.querySupplys(new Supply());
        modelMap.put("supplies", supplies);
        return "purchase/updatePurchase";
    }

    @RequestMapping("doUpdatePurchase")
    public String doUpdate(Purchase purchase) {
        this.purchaseService.updatePurchase(purchase);
        return SUCCESS;
    }

    @RequestMapping("deletePurchase")
    public String deletePurchase(int purid) {
        this.purchaseService.deletePurchase(purid);
        return SUCCESS;
    }
}
