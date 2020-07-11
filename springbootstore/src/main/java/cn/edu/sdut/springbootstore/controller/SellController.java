package cn.edu.sdut.springbootstore.controller;

import cn.edu.sdut.springbootstore.entity.Employee;
import cn.edu.sdut.springbootstore.entity.Goods;
import cn.edu.sdut.springbootstore.entity.Sell;
import cn.edu.sdut.springbootstore.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class SellController {
    @Resource
    private SellService sellService;
    @Resource
    private GoodsService goodsService;
    @Resource
    private EmployeeService employeeService;

    public static String SUCCESS = "redirect:querySell";

    @RequestMapping("querySell")
    public String querySell(Sell sell, ModelMap modelMap){
        List<Sell> sells = this.sellService.querySell(sell);
        modelMap.put("sells",sells);
        List<Goods> goods = this.goodsService.queryGoods(new Goods());
        modelMap.put("goods",goods);
        List<Employee> employees = this.employeeService.queryEmployees(new Employee());
        modelMap.put("employees",employees);
        return "sell/selllist";

    }

    @RequestMapping("querySellid")
    public String querySellid(int sellid,ModelMap modelMap){
        Sell sells = this.sellService.querySellid(sellid);
        modelMap.put("sells",sells);
        Goods goods = this.goodsService.queryGoodsBysellid(sellid);
        modelMap.put("goods",goods);
        Employee employees = this.employeeService.queryEmployeeBysellid(sellid);
        modelMap.put("employees",employees);
        return "sell/selldetail";
    }

    @RequestMapping("toUpdateSell")
    public String toUpdateSell(int sellid,ModelMap modelMap){
        Sell sell = this.sellService.querySellid(sellid);
        modelMap.put("sell",sell);
        List<Goods> goods = this.goodsService.queryGoods(new Goods());
        modelMap.put("goods",goods);
        List<Employee> employee =this.employeeService.queryEmployees(new Employee());
        modelMap.put("employees",employee);
        return "sell/sellupdate";
    }

    @RequestMapping("doupdateSell")
    public String doUpdateSell(Sell sell){
        this.sellService.updatesell(sell);
        return SUCCESS;
    }

    @RequestMapping("toaddSell")
    public String toaddSell(ModelMap modelMap){
        List<Goods> goods =this.goodsService.queryGoods(new Goods());
        modelMap.put("goods",goods);
        List<Employee> employees = this.employeeService.queryEmployees(new Employee());
        modelMap.put("employees",employees);
        return "sell/selladd";
    }

    @RequestMapping("doaddSell")
    public String doaddSell(Sell sell){
        this.sellService.addSell(sell);
        return SUCCESS;
    }
}
