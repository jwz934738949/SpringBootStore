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
      <th>供应商编号：</th>
      <td>
          ${supply.supid}
      </td>
    </tr>
    <tr>
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
      <th>联系方式：</th>
      <td>
          ${supply.suptel}
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