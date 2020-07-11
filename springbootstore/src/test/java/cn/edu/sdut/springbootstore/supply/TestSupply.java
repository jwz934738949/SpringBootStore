package cn.edu.sdut.springbootstore.supply;

import cn.edu.sdut.springbootstore.SpringbootstoreApplicationTests;
import cn.edu.sdut.springbootstore.entity.Supply;
import cn.edu.sdut.springbootstore.service.SupplyService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestSupply extends SpringbootstoreApplicationTests {
    @Resource
    private SupplyService supplyService;

    @Test
    public void testQuerySupplys() {
        Supply supply = new Supply();
        supply.setSupname("哇哈哈");
        List<Supply> supplies = this.supplyService.querySupplys(supply);
        supplies.forEach(sup -> System.out.println("sup = " + sup));
    }

    @Test
    public void testQuerySupplyById() {
        int supid = 2;
        Supply supply = this.supplyService.querySupplyById(supid);
        System.out.println("supply = " + supply);
    }

    @Test
    public void testQuerySupplyByName() {
        String supname = "伊利";
        Supply supply = this.supplyService.querySupplyByName(supname);
        System.out.println("supply = " + supply);
    }

    @Test
    public void testAddSupply() {
        Supply supply = new Supply(0, "蒙牛", "内蒙古呼和浩特", "096-112233");
        this.print(this.supplyService.addSupply(supply));
    }

    @Test
    public void testUpdateSupply() {
        Supply supply = new Supply();
        supply.setSupid(3);
        supply.setSupname("统一");
        supply.setSupaddress("浙江杭州");
        supply.setSuptel("023-1103234");
        this.print(this.supplyService.updateSupply(supply));
    }

    @Test
    public void testDeleteSupply() {
        int supid = 3;
        this.print(this.supplyService.deleteSupply(supid));
    }

    @Test
    public void testQuerySupplyByPurid() {
        int purid = 2;
        Supply supply = this.supplyService.querySupplyByPurid(purid);
        System.out.println("supply = " + supply);
    }

}
