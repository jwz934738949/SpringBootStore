<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/doupdateGoods" method="post" class="form-group">
    <table class="table table-hover">
        <tr>
            <th>商品编号</th>
            <td>${goods.goodsid}</td>
        </tr>
        <tr>
            <th>商品名字</th>
            <td>${goods.goodsname}</td>
        </tr>
        <tr>
            <th>生产日期</th>
            <td>${goods.productedtime?date}</td>
        </tr>
        <tr>
            <th>商品类别</th>
            <td>
                <select name = "goodstype" class = "form-control">
                    <option value=""> --请选择商品类别--</option>
                    <option value="1">饮料</option>
                    <option value="2">食品</option>
                    <option value="3">水果</option>
                    <option value="4">其他</option>
                </select>
            </td>
        </tr>

        <tr>
            <th>截止日期</th>
            <td>
                <input type="text" name = "shelflife" value="${goods.shelflife}"  class="form-control">
            </td>
        </tr>
        <tr>
            <th>数量</th>
            <td>
                <input type="text" name = "goodsnum" value="${goods.goodsnum}"  class="form-control">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="修改信息" class="btn btn-primary btn-lg btn-block">
            </td>
        </tr>
    </table>
</form>
<link rel="stylesheet" href="/bootstrap-4.5.0-dist/css/bootstrap.min.css">
<script src="/js/jquery-3.4.1.min.js"></script>
<script>
    $("select[name='goodstype']").val("${goods.goodstype}");
</script>
</body>
</html>