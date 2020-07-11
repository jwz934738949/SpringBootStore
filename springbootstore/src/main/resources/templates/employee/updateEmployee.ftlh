<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/doUpdateEmployee" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>员工编号：</th>
      <td>
        ${employee.empid}
        <input type="hidden" value="${employee.empid}" name="empid">
      </td>
    </tr>
    <tr>
      <th>员工姓名：</th>
      <td>
        <input type="text" name="empname" value="${employee.empname}" class="form-control">
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
        <input type="number" value="${employee.age}" name="age" class="form-control">
      </td>
    </tr>
    <tr>
      <th>联系方式：</th>
      <td>
        <input type="text" value="${employee.emptel}" name="emptel" class="form-control">
      </td>
    </tr>
    <tr>
      <th>工资：</th>
      <td>
        <input type="text" value="${employee.salary}" name="salary" class="form-control">
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
    $("select[name='gender']").val("${employee.gender}");
  });
</script>
</body>
</html>