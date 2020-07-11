<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/doAddGoods" method="post" class="form-group">
    <table class="table table-hover">

        <tr>
            <th>商品名字</th>
            <td>
                <input type="text" name = "goodsname"   class="form-control">
            </td>
        </tr>
        <tr>
            <th>商品类型</th>
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
<#--        <tr>-->
<#--            <th>生产日期</th>-->
<#--            <td><input type="date" name = "productedtime"   class="form-control"></td>-->
<#--        </tr>-->
        <tr>
            <th>保质期</th>
            <td><input type="text" name = "shelflife"   class="form-control"></td>
        </tr>
        <tr>
            <th>商品数量</th>
            <td><input type="text" name = "goodsnum"   class="form-control"></td>
        </tr>
        <tr>
            <td colspan="5" align="center">
                <input type="submit" value="添加商品信息" class="btn btn-primary btn-lg btn-block">
            </td>
        </tr>
    </table>
</form>
<link rel="stylesheet" href="/bootstrap-4.5.0-dist/css/bootstrap.min.css">
<script src="/js/jquery-3.4.1.min.js"></script>
</body>
</html>