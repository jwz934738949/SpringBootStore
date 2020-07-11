package cn.edu.sdut.springbootstore.service.impl;

import cn.edu.sdut.springbootstore.entity.Purchase;
import cn.edu.sdut.springbootstore.mapper.PurchaseMapper;
import cn.edu.sdut.springbootstore.service.PurchaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Resource
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> queryPurchases(Purchase purchase) {
        return this.purchaseMapper.queryPurchases(purchase);
    }

    @Override
    public Purchase queryPurchaseById(int purid) {
        return this.purchaseMapper.queryPurchaseById(purid);
    }

    @Override
    public int addPurchase(Purchase purchase) {
        return this.purchaseMapper.addPurchase(purchase);
    }

    @Override
    public int updatePurchase(Purchase purchase) {
        return this.purchaseMapper.updatePurchase(purchase);
    }

    @Override
    public int deletePurchase(int purid) {
        return this.purchaseMapper.deletePurchase(purid);
    }

    @Override
    public int deletePurchaseByGoodsid(int goodsid) {
        return this.purchaseMapper.deletePurchaseByGoodsid(goodsid);
    }

    @Override
    public int deletePruchaseBySupid(int supid) {
        return this.purchaseMapper.deletePruchaseBySupid(supid);
    }
}
