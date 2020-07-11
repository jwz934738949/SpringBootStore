<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>登录</title>
</head>
<body style="background-image: url('/images/background.png');background-size: cover">
<form action="/doLogin" method="post" class="form-group" style="margin: 100px auto; width: 50%">
  <table class="table table-hover table-borderless">
    <tr>
      <th style="color: #fff">用户名</th>
      <td>
        <input type="text" name="username" placeholder="username" class="form-control">
      </td>
    </tr>
    <tr>
      <th style="color: #fff">密码</th>
      <td>
        <input type="password" name="password" placeholder="password" class="form-control">
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" value="登录" class="btn btn-primary btn-lg btn-block">
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center" style="color: red; font-family: 楷体;">
        <#if msg??>
            ${msg}
        </#if>
      </td>
    </tr>
  </table>
</form>
<link rel="stylesheet" href="/bootstrap-4.5.0-dist/css/bootstrap.min.css">
<script src="/js/jquery-3.4.1.min.js"></script>
</body>
</html>