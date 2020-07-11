<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/doAddPurchase" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>商品名称：</th>
      <td>
        <select name="goods.goodsid" class="form-control">
          <option value="00">--请选择--</option>
            <#if goods?? && (goods?size>0)>
                <#list goods as good>
                  <option value="${good.goodsid}">${good.goodsname}</option>
                </#list>
            </#if>
        </select>
      </td>
    </tr>
    <tr>
      <th>供应商名称：</th>
      <td>
        <select name="supply.supid" class="form-control">
          <option value="00">--请选择--</option>
            <#if supplies?? && (supplies?size>0)>
                <#list supplies as supply>
                  <option value="${supply.supid}">${supply.supname}</option>
                </#list>
            </#if>
        </select>
      </td>
    </tr>
    <tr>
      <th>入库数量：</th>
      <td>
        <input type="number" name="purnum" class="form-control">
      </td>
    </tr>
    <tr>
      <th>入库价格：</th>
      <td>
        <input type="text" name="purprice" class="form-control">
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" value="添加信息" class="btn btn-primary btn-lg btn-block">
      </td>
    </tr>
  </table>
</form>
<link rel="stylesheet" href="/bootstrap-4.5.0-dist/css/bootstrap.min.css">
<script src="/js/jquery-3.4.1.min.js"></script>
</body>
</html>