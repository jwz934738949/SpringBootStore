<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/doUpdateSupply" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>供应商编号：</th>
      <td>
        ${supply.supid}
        <input type="hidden" name="supid" value="${supply.supid}">
      </td>
    </tr>
    <tr>
      <th>供应商名称：</th>
      <td>
        <input type="text" name="supname" value="${supply.supname}" class="form-control">
      </td>
    </tr>
    <tr>
      <th>供应商地址：</th>
      <td>
        <input type="text" name="supaddress" value="${supply.supaddress}" class="form-control">
      </td>
    </tr>
    <tr>
      <th>联系方式：</th>
      <td>
        <input type="text" name="suptel" value="${supply.suptel}" class="form-control">
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
</body>
</html>