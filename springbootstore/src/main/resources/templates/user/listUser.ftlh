<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/toAddUser" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>用户名：</th>
      <td>
        <input type="text" name="username" class="form-control">
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
        <input type="button" value="查询" class="btn btn-primary btn-lg btn-block">
      </td>
    </tr>
  </table>
  <table class="table table-hover">
    <thead>
    <tr>
      <th>用户编号</th>
      <th>用户名</th>
      <th>用户角色</th>
      <th>注册时间</th>
      <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <#if users?? && (users?size>0)>
        <#list users as user>
          <tr>
            <td>${user.userid}</td>
            <td>${user.username}</td>
            <td>
                <#switch user.userroles>
                    <#case "2">营业员<#break >
                    <#case "3">经理<#break >
                    <#case "4">店长<#break >
                    <#default >收银员<#break >
                </#switch>
            </td>
            <td>${user.regtime?date}</td>
            <td>
              <a href="/detailUser?userid=${user.userid}" class="btn btn-outline-primary">查看</a>
              <a href="/toUpdateUser?userid=${user.userid}" class="btn btn-outline-primary">修改</a>
              <a href="/deleteUser?userid=${user.userid}" onclick="return confirm('是否确认删除该信息？')" class="btn btn-outline-primary">删除</a>
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
        <input type="submit" value="新增用户" class="btn btn-primary btn-lg btn-block">
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
      $("form").attr("action", "queryUsers").submit();
    });
  });
</script>
</body>
</html>