<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/doUpdateUser" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>用户编号：</th>
      <td>
        ${user.userid}
        <input type="hidden" name="userid" value="${user.userid}">
      </td>
    </tr>
    <tr>
      <th>用户名：</th>
      <td>
        ${user.username}
      </td>
    </tr>
    <tr>
      <th>密码：</th>
      <td>
        <input type="text" name="password" value="${user.password}" class="form-control">
      </td>
    </tr>
    <tr>
      <th>用户角色：</th>
      <td>
        <select name="userroles" class="form-control">
          <option value="">--请选择用户角色--</option>
          <option value="1">收银员</option>
          <option value="2">营业员</option>
          <option value="3">经理</option>
          <option value="4">店长</option>
        </select>
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
  $("select[name='userroles']").val("${user.userroles}");
</script>
</body>
</html>