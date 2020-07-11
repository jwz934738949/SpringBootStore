package cn.edu.sdut.springbootstore.mapper;

import cn.edu.sdut.springbootstore.entity.Purchase;

import java.util.List;

public interface PurchaseMapper {
    List<Purchase> queryPurchases(Purchase purchase);

    Purchase queryPurchaseById(int purid);

    int addPurchase(Purchase purchase);

    int updatePurchase(Purchase purchase);

    int deletePurchase(int purid);

    int deletePurchaseByGoodsid(int goodsid);

    int deletePruchaseBySupid(int supid);

}
