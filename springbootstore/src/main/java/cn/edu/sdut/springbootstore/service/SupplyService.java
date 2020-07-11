package cn.edu.sdut.springbootstore.service;

import cn.edu.sdut.springbootstore.entity.Supply;

import java.util.List;

public interface SupplyService {
    List<Supply> querySupplys(Supply supply);

    Supply querySupplyById(int supid);

    Supply querySupplyByName(String supname);

    Supply querySupplyByPurid(int purid);

    int addSupply(Supply supply);

    int updateSupply(Supply supply);

    int deleteSupply(int supid);
}
