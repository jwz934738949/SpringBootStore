package cn.edu.sdut.springbootstore.goods;

import cn.edu.sdut.springbootstore.SpringbootstoreApplicationTests;
import cn.edu.sdut.springbootstore.entity.Goods;
import cn.edu.sdut.springbootstore.service.GoodsService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestGoods extends SpringbootstoreApplicationTests {
    @Resource
    private GoodsService goodsService;

    @Test
    public void testQueryUsers(){
        Goods goods =new Goods();
        goods.setGoodstype("3");
        List<Goods> goods1 = this.goodsService.queryGoods(goods);
        goods1.forEach(u -> System.out.println("u = "+u));
    }

    @Test
    public void testDetailGoods(){
        int goodsid = 2;
        Goods goods = new Goods();
        goods = this.goodsService.queryGoodsid(goodsid);
        System.out.println("goods = "+ goods);

    }

    @Test
    public void testupdeteGoods(){
        Goods goods = new Goods();
        goods.setGoodsid(1);
        goods.setGoodstype("2");
        goods.setGoodsnum(6);
        this.goodsService.updateGoods(goods);
    }

    @Test
    public void testaddGoods(){
        Goods goods = new Goods();
        goods.setGoodsname("芒果");
        goods.setGoodstype("3");
        goods.setGoodsnum(2);
        goods.setProductedtime(null);
        goods.setShelflife("2");
        goods.toString();
        this.goodsService.addGoods(goods);
    }

    @Test
    public void testQueryGoodsByPurid() {
        int purid = 3;
        Goods goods = this.goodsService.queryGoodsByPurid(purid);
        System.out.println("goods = " + goods);
    }

    @Test
    public void testDeleteGoods() {
        int goodsid = 2;
        this.print(this.goodsService.deleteGoods(goodsid));
    }
}
