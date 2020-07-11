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
      <th>用户编号：</th>
      <td>
          ${user.userid}
      </td>
    </tr>
    <tr>
      <th>用户名：</th>
      <td>
          ${user.username}
      </td>
    </tr>
    <tr>
      <th>用户角色：</th>
      <td>
          <#switch user.userroles>
              <#case "2">营业员<#break >
              <#case "3">经理<#break >
              <#case "4">店长<#break >
              <#default >收银员<#break >
          </#switch>
      </td>
    </tr>
    <tr>
      <th>注册时间：</th>
      <td>
          ${user.regtime?date}
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