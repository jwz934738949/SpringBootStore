package cn.edu.sdut.springbootstore.service;

import cn.edu.sdut.springbootstore.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> queryGoods(Goods goods);

    Goods queryGoodsname(String goodsname);

    Goods queryGoodsid(int goodsid);

    Goods queryGoodsByPurid(int purid);

    Goods queryGoodsBysellid(int sellid);

    int updateGoods(Goods goods);

    int addGoods(Goods goods);

    int deleteGoods(int goodsid);
}
