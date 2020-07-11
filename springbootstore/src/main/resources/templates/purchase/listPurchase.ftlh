<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/toAddPurchase" method="post">
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
      <td colspan="2" align="center">
        <input type="button" value="查询入库信息" class="btn btn-primary btn-lg btn-block">
      </td>
    </tr>
  </table>
  <table class="table table-hover">
    <thead>
    <tr>
      <th>入库编号</th>
      <th>商品名称</th>
      <th>入库数量</th>
      <th>入库时间</th>
      <th>入库价格</th>
      <th>供货商名称</th>
      <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <#if purchases?? &&(purchases?size>0)>
        <#list purchases as purchase>
          <tr>
            <td>${purchase.purid}</td>
            <td>${purchase.goods.goodsname}</td>
            <td>${purchase.purnum}</td>
            <td>${purchase.purtime?date}</td>
            <td>${purchase.purprice}</td>
            <td>${purchase.supply.supname}</td>
            <td>
              <a href="/detailPurchase?purid=${purchase.purid}" class="btn btn-outline-primary">查看</a>
              <a href="/toUpdatePurchase?purid=${purchase.purid}" class="btn btn-outline-primary">修改</a>
              <a href="/deletePurchase?purid=${purchase.purid}" onclick="return confirm('是否确认删除该信息？')"
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
        <input type="submit" value="新增入库信息" class="btn btn-primary btn-lg btn-block">
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
      $("form").attr("action", "queryPurchases").submit();
    });
  });
</script>
</body>
</html>