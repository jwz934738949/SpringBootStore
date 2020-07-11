package cn.edu.sdut.springbootstore.mapper;

import cn.edu.sdut.springbootstore.entity.Supply;

import java.util.List;

public interface SupplyMapper {
    List<Supply> querySupplys(Supply supply);

    Supply querySupplyById(int supid);

    Supply querySupplyByName(String supname);

    Supply querySupplyByPurid(int purid);

    int addSupply(Supply supply);

    int updateSupply(Supply supply);

    int deleteSupply(int supid);

}
