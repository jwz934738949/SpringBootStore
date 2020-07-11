package cn.edu.sdut.springbootstore.sell;

import cn.edu.sdut.springbootstore.SpringbootstoreApplicationTests;
import cn.edu.sdut.springbootstore.entity.Employee;
import cn.edu.sdut.springbootstore.entity.Goods;
import cn.edu.sdut.springbootstore.entity.Sell;
import cn.edu.sdut.springbootstore.service.SellService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class sellTest extends SpringbootstoreApplicationTests {
    @Resource
    private SellService sellService;

    @Test
    public void testQuerySell() {
        Sell sell = new Sell();
        Goods goods = new Goods();
        goods.setGoodsid(1);
        Employee employee = new Employee();
        employee.setEmpid(1);
        sell.setGoods(goods);
        sell.setEmployee(employee);
        List<Sell> sells = this.sellService.querySell(sell);
        sells.forEach(sup -> System.out.println("sup = " + sup));
    }

    @Test
    public void testQuerySellid() {
        int sellid = 202007071;
        Sell sell1 = this.sellService.querySellid(sellid);
        System.out.println("Sell1 = " + sell1);
    }

    @Test
    public void testupdateSell() {
        Sell sell = new Sell();
        sell.setSellid(202007081);
        sell.setSellnum(33);
        this.print(this.sellService.updatesell(sell));

    }

    @Test
    public void testaddSell() {
        Sell sell = new Sell();
        sell.setSellnum(66);
        sell.setSellprice(90);
        Goods goods = new Goods();
        goods.setGoodsid(11);
        sell.setGoods(goods);
        Employee employee = new Employee();
        employee.setEmpid(1);
        sell.setEmployee(employee);
        this.print(this.sellService.addSell(sell));
    }

    @Test
    public void testDeleteSell() {
        int sellid = 1;
        this.print(this.sellService.deleteSell(sellid));
    }

    @Test
    public void testDeleteSellByEmpid() {
        int empid = 1;
        this.print(this.sellService.deleteSellByEmpid(empid));
    }

    @Test
    public void testDeleteSellByGoodsid() {
        int goodsid = 7;
        this.print(this.sellService.deleteSellByGoodsid(goodsid));
    }
}
