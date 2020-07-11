package cn.edu.sdut.springbootstore.service.impl;

import cn.edu.sdut.springbootstore.entity.Supply;
import cn.edu.sdut.springbootstore.mapper.PurchaseMapper;
import cn.edu.sdut.springbootstore.mapper.SupplyMapper;
import cn.edu.sdut.springbootstore.service.SupplyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SupplyServiceImpl implements SupplyService {
    @Resource
    private SupplyMapper supplyMapper;
    @Resource
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Supply> querySupplys(Supply supply) {
        return this.supplyMapper.querySupplys(supply);
    }

    @Override
    public Supply querySupplyById(int supid) {
        return this.supplyMapper.querySupplyById(supid);
    }

    @Override
    public Supply querySupplyByName(String supname) {
        return this.supplyMapper.querySupplyByName(supname);
    }

    @Override
    public Supply querySupplyByPurid(int purid) {
        return this.supplyMapper.querySupplyByPurid(purid);
    }

    @Override
    public int addSupply(Supply supply) {
        return this.supplyMapper.addSupply(supply);
    }

    @Override
    public int updateSupply(Supply supply) {
        return this.supplyMapper.updateSupply(supply);
    }

    @Transactional
    @Override
    public int deleteSupply(int supid) {
        this.purchaseMapper.deletePruchaseBySupid(supid);
        return this.supplyMapper.deleteSupply(supid);
    }
}
