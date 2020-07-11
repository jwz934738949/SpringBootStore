<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/toAddGoods" method="post" class="form-group">
    <table class="table table-hover">
        <tr>
            <th>商品名</th>
            <td>
                <input type="text" name="goodsname" class="form-control">
            </td>
        </tr>
        <tr>
            <th>商品类别</th>
            <td>
                <select name="goodstype" class="form-control">
                    <option value="">--请选择商品类别--</option>
                    <option value="1">饮料</option>
                    <option value="2">食品</option>
                    <option value="3">水果</option>
                    <option value="4">其他</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" value="查询" class="btn btn-primary btn-lg btn-block">
            </td>
        </tr>
    </table>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>商品id</th>
            <th>商品名</th>
            <th>商品类型</th>
            <th>生产时间</th>
            <th>保质期</th>
            <th>数量</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <#if goods?? && (goods?size>0)>
            <#list goods as good>
                <tr>
                    <td>${good.goodsid}</td>
                    <td>${good.goodsname}</td>
                    <td>
                        <#switch good.goodstype>
                            <#case "1"> 饮料<#break >
                            <#case "2"> 食品<#break >
                            <#case "3"> 水果<#break >
                            <#default >其他<#break >
                        </#switch>
                    </td>
                    <td>${good.productedtime?date}</td>
                    <td>${good.shelflife}</td>
                    <td>${good.goodsnum}</td>
                    <td>
                        <a href="/detailGoods?goodsid=${good.goodsid}" class="btn btn-outline-primary">查看</a>
                        <a href="/toupdateGoods?goodsid=${good.goodsid}" class="btn btn-outline-primary">修改</a>
                        <a href="/deleteGoods?userid=${good.goodsid}" onclick="return confirm('是否确认删除该信息？')"
                           class="btn btn-outline-primary">删除</a>
                    </td>
                </tr>
                </#list>
        <#else >
            <tr>
                <td colspan="7" align="center" style="color: red; font-family: 楷体;">对不起，查询不到任何数据！！</td>
            </tr>
        </#if>
        <tr>
            <td colspan="7" align="center">
                <input type="submit" value="新增商品" class="btn btn-primary btn-lg btn-block">
            </td>
        </tr>
        </tbody>
    </table>
</form>
<link rel="stylesheet" href="/bootstrap-4.5.0-dist/css/bootstrap.min.css">
<script src="/js/jquery-3.4.1.min.js"></script>
<script>
    $(function () {
        $("input[type='button']").click(function () {
            $("form").attr("action", "queryGoods").submit();
        });
    });
</script>
</body>
</html>