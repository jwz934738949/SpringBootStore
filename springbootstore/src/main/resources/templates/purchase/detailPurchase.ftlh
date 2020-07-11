<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>入库编号：</th>
      <td>
        ${purchase.purid}
      </td>
    </tr>
    <tr>
      <th>商品名称：</th>
      <td>
        ${goods.goodsname}
      </td>
    </tr>
    <tr>
      <th>商品类型：</th>
      <td>
          <#switch goods.goodstype>
              <#case "1">饮料<#break >
              <#case "2">食品<#break >
              <#case "3">水果<#break >
              <#default >其他<#break >
          </#switch>
      </td>
    </tr>
      <th>供应商名称：</th>
      <td>
        ${supply.supname}
      </td>
    </tr>
    <tr>
      <th>供应商地址：</th>
      <td>
        ${supply.supaddress}
      </td>
    </tr>
    <tr>
      <th>入库数量：</th>
      <td>
        ${purchase.purnum}
      </td>
    </tr>
    <tr>
      <th>入库时间：</th>
      <td>
        ${purchase.purtime?date}
      </td>
    </tr>
    <tr>
      <th>入库价格：</th>
      <td>
        ${purchase.purprice}
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="button" value="返回" onclick="window.history.go(-1);" class="btn btn-primary btn-lg btn-block">
      </td>
    </tr>
  </table>
</form>
<link rel="stylesheet" href="/bootstrap-4.5.0-dist/css/bootstrap.min.css">
<script src="/js/jquery-3.4.1.min.js"></script>
</body>
</html>