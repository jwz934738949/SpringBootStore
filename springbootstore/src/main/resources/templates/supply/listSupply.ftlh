<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/toAddSupply" method="post" class="form-group">
  <table class=" table table-hover">
    <tr>
      <th>供货商名称：</th>
      <td>
        <input type="text" name="supname" class="form-control">
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="button" value="查询供货商" class="btn btn-primary btn-lg btn-block">
      </td>
    </tr>
  </table>
  <table class="table table-hover">
    <thead>
    <tr>
      <th>供货商编号</th>
      <th>供货商名称</th>
      <th>供货商地址</th>
      <th>联系方式</th>
      <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <#if supplies?? && (supplies?size>0)>
        <#list supplies as supply>
          <tr>
            <td>${supply.supid}</td>
            <td>${supply.supname}</td>
            <td>${supply.supaddress}</td>
            <td>${supply.suptel}</td>
            <td>
              <a href="/detailSupply?supid=${supply.supid}" class="btn btn-outline-primary">查看</a>
              <a href="/toUpdateSupply?supid=${supply.supid}" class="btn btn-outline-primary">修改</a>
              <a href="/deleteSupply?supid=${supply.supid}" onclick="return confirm('是否确认删除该信息？')"
                 class="btn btn-outline-primary">删除</a>
            </td>
          </tr>
        </#list>
    <#else >
      <tr>
        <td colspan="5" align="center" style="color: red; font-family: 楷体;">对不起，查询不到任何数据！！</td>
      </tr>
    </#if>
    <tr>
      <td colspan="5" align="center">
        <input type="submit" value="新增供货商" class="btn btn-primary btn-lg btn-block">
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
      $("form").attr("action", "querySupplys").submit();
    });
  });
</script>
</body>
</html>