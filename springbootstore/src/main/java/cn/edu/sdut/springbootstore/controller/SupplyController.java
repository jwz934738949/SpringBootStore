package cn.edu.sdut.springbootstore.controller;

import cn.edu.sdut.springbootstore.entity.Supply;
import cn.edu.sdut.springbootstore.service.SupplyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SupplyController {
    @Resource
    private SupplyService supplyService;
    public static String SUCCESS = "redirect:querySupplys";

    @RequestMapping("querySupplys")
    public String querySupplys(Supply supply, ModelMap modelMap) {
        List<Supply> supplies = this.supplyService.querySupplys(supply);
        modelMap.put("supplies", supplies);
        return "supply/listSupply";
    }

    @RequestMapping("toAddSupply")
    public String toAdd() {
        return "supply/addSupply";
    }

    @RequestMapping("doAddSupply")
    public String doAdd(Supply supply) {
        this.supplyService.addSupply(supply);
        return SUCCESS;
    }

    @RequestMapping("ajaxQuerySupname")
    @ResponseBody
    public boolean ajaxQuerySupname(String supname) {
        Supply supply = this.supplyService.querySupplyByName(supname);
        if (supply != null) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("detailSupply")
    public String detailSupply(int supid, ModelMap modelMap) {
        Supply supply = this.supplyService.querySupplyById(supid);
        modelMap.put("supply", supply);
        return "supply/detailSupply";
    }

    @RequestMapping("toUpdateSupply")
    public String toUpdate(int supid, ModelMap modelMap) {
        Supply supply = this.supplyService.querySupplyById(supid);
        modelMap.put("supply", supply);
        return "supply/updateSupply";
    }

    @RequestMapping("doUpdateSupply")
    public String doUpdate(Supply supply) {
        this.supplyService.updateSupply(supply);
        return SUCCESS;
    }

    @RequestMapping("deleteSupply")
    public String deleteSupply(int supid) {
        this.supplyService.deleteSupply(supid);
        return SUCCESS;
    }
}
