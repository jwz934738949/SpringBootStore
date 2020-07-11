package cn.edu.sdut.springbootstore.service.impl;

import cn.edu.sdut.springbootstore.entity.Sell;
import cn.edu.sdut.springbootstore.mapper.SellMapper;
import cn.edu.sdut.springbootstore.service.SellService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SellServicelmpl implements SellService {
    @Resource
    private SellMapper sellMapper;

    @Override
    public List<Sell> querySell(Sell sell){
        return this.sellMapper.querySell(sell);
    }

    @Override
    public Sell querySellid(int sellid){
        return this.sellMapper.querySellid(sellid);
    }

    @Override
    public int updatesell(Sell sell){
        return this.sellMapper.updatesell(sell);
    }

    @Override
    public int addSell(Sell sell){
        return this.sellMapper.addSell(sell);
    }

    @Override
    public int deleteSell(int sellid) {
        return this.sellMapper.deleteSell(sellid);
    }

    @Override
    public int deleteSellByEmpid(int empid) {
        return this.sellMapper.deleteSellByEmpid(empid);
    }

    @Override
    public int deleteSellByGoodsid(int goodsid) {
        return this.sellMapper.deleteSellByGoodsid(goodsid);
    }
}
