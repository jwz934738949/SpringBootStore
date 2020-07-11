package cn.edu.sdut.springbootstore.service.impl;

import cn.edu.sdut.springbootstore.entity.Goods;
import cn.edu.sdut.springbootstore.mapper.GoodsMapper;
import cn.edu.sdut.springbootstore.mapper.PurchaseMapper;
import cn.edu.sdut.springbootstore.mapper.SellMapper;
import cn.edu.sdut.springbootstore.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServicelmpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Resource
    private PurchaseMapper purchaseMapper;
    @Resource
    private SellMapper sellMapper;

    @Override
    public List<Goods> queryGoods(Goods goods) {
        return this.goodsMapper.queryGoods(goods);
    }

    @Override
    public Goods queryGoodsname(String goodsname) {
        return this.goodsMapper.queryGoodsname(goodsname);
    }

    @Override
    public Goods queryGoodsid(int goodsid) {
        return this.goodsMapper.queryGoodsid(goodsid);
    }

    @Override
    public Goods queryGoodsByPurid(int purid) {
        return this.goodsMapper.queryGoodsByPurid(purid);
    }

    @Override
    public int updateGoods(Goods goods) {
        return this.goodsMapper.updateGoods(goods);
    }


    @Override
    public int addGoods(Goods goods) {
        return this.goodsMapper.addGoods(goods);
    }

    @Transactional
    @Override
    public int deleteGoods(int goodsid) {
        this.purchaseMapper.deletePurchaseByGoodsid(goodsid);
        this.sellMapper.deleteSellByGoodsid(goodsid);
        return this.goodsMapper.deleteGoods(goodsid);
    }

    @Override
    public Goods queryGoodsBysellid(int sellid) {
        return this.goodsMapper.queryGoodsBysellid(sellid);
    }
}
