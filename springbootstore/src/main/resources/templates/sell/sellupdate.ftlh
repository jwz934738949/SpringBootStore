<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>

<form action="/doupdateSell" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>出库编号：</th>
      <td>
          ${sell.sellid}
        <input type="hidden" name="sellid" value="${sell.sellid}">
      </td>
    </tr>
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
      <th>员工姓名：</th>
      <td>
        <select name="employee.empid" class="form-control">
          <option value="00">--请选择--</option>
            <#if employees?? && (employees?size>0)>
                <#list employees as employee>
                  <option value="${employee.empid}">${employee.empname}</option>
                </#list>
            </#if>
        </select>
      </td>
    </tr>
    <tr>
      <th>出库数量：</th>
      <td>
        <input type="number" name="sellnum" value="${sell.sellnum}" class="form-control">
      </td>
    </tr>
    <tr>
      <th>出库价格：</th>
      <td>
        <input type="text" name="sellprice" value="${sell.sellprice}" class="form-control">
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
  $(function () {
    $("select[name='goods.goodsid']").val("${sell.goods.goodsid}");
    $("select[name='employee.empid']").val("${sell.employee.empid}");
  });
</script>

</body>
</html>