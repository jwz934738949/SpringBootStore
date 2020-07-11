<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/doAddEmployee" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>员工姓名：</th>
      <td>
        <input type="text" name="empname" class="form-control">
      </td>
    </tr>
    <tr>
      <th>性别：</th>
      <td>
        <select name="gender" class="form-control">
          <option value="">--请选择--</option>
          <option value="1">男</option>
          <option value="2">女</option>
        </select>
      </td>
    </tr>
    <tr>
      <th>年龄：</th>
      <td>
        <input type="number" name="age" class="form-control">
      </td>
    </tr>
    <tr>
      <th>联系方式：</th>
      <td>
        <input type="text" name="emptel" class="form-control">
      </td>
    </tr>
    <tr>
      <th>工资：</th>
      <td>
        <input type="text" name="salary" class="form-control">
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" value="添加信息" class="btn btn-primary btn-lg btn-block">
      </td>
    </tr>
  </table>
</form>
<link rel="stylesheet" href="/bootstrap-4.5.0-dist/css/bootstrap.min.css">
<script src="/js/jquery-3.4.1.min.js"></script>
</body>
</html>