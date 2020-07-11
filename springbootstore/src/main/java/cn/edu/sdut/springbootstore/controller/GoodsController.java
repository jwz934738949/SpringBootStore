package cn.edu.sdut.springbootstore.controller;

import cn.edu.sdut.springbootstore.entity.Goods;
import cn.edu.sdut.springbootstore.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    public static String SUCCESS = "redirect:queryGoods";

    @RequestMapping("queryGoods")
    public String queryGoods(Goods goods, ModelMap modelMap){
        List<Goods> queryGoods = this.goodsService.queryGoods(goods);
        modelMap.put("goods",queryGoods);
        return "goods/Goodslist";
    }

    @RequestMapping("detailGoods")
    public String detailGoods(int goodsid,ModelMap modelMap){
        Goods good = this.goodsService.queryGoodsid(goodsid);
        modelMap.put("goods",good);
        return "goods/Goodsdetail";
    }

    @RequestMapping("toupdateGoods")
    public String toupdateGoods(Goods goods,ModelMap modelMap){
        Goods goods1 = this.goodsService.queryGoodsid(goods.getGoodsid());
        modelMap.put("goods",goods1);
        return "goods/Goodsupdate";
    }

    @RequestMapping("doupdateGoods")
    public String doupdateGoods(Goods goods){
        this.goodsService.updateGoods(goods);
        return SUCCESS;
    }

    @RequestMapping("toAddGoods")
    public String toAddGoods(){
        return "goods/Goodsadd";
    }

    @RequestMapping("doAddGoods")
    public String doAddGoods(Goods goods){
        this.goodsService.addGoods(goods);
        return SUCCESS;
    }

    @RequestMapping("deleteGoods")
    public String deleteGoods(int goodsid) {
        this.goodsService.deleteGoods(goodsid);
        return SUCCESS;
    }
}
