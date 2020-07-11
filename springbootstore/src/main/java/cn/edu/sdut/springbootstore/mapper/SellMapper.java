package cn.edu.sdut.springbootstore.mapper;

import cn.edu.sdut.springbootstore.entity.Sell;

import java.util.List;

public interface SellMapper {
    List<Sell> querySell(Sell sell);

    Sell querySellid(int sellid);

    int updatesell(Sell sell);

    int addSell(Sell sell);

    int deleteSell(int sellid);

    int deleteSellByEmpid(int empid);

    int deleteSellByGoodsid(int goodsid);
}
