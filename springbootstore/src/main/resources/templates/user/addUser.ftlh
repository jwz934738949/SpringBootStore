<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/doAddUser" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>用户名：</th>
      <td>
        <input type="text" name="username" class="form-control">
      </td>
      <td>
        <span id="ajaxUsername" style="color: red; font-family: 楷体;"></span>
      </td>
    </tr>
    <tr>
      <th>密码：</th>
      <td>
        <input type="password" name="password" class="form-control">
      </td>
      <td></td>
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
      <td></td>
    </tr>
    <tr>
      <td colspan="3" align="center">
        <input type="submit" value="添加信息" class="btn btn-primary btn-lg btn-block">
      </td>
    </tr>
  </table>
</form>
<link rel="stylesheet" href="/bootstrap-4.5.0-dist/css/bootstrap.min.css">
<script src="/js/jquery-3.4.1.min.js"></script>
<script>
  $(function () {
    $("input[name='username']").blur(function () {
      var username = $(this).val();
      $.ajax({
        type: "post",
        url: "ajaxQueryUserByUsername",
        data: {"username": username},
        dataType: "json",
        success: function (returnData) {
          if (returnData) {
            $("#ajaxUsername").html("对不起，用户名已存在");
          } else {
            $("#ajaxUsername").html("恭喜，用户名可以使用");
          }
        }
      });
    }).focus(function () {
      $("#ajaxUsername").html("");
      $(this).val("");
    });
  });
</script>
</body>
</html>