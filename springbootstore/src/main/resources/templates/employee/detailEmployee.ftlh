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
      <th>员工编号：</th>
      <td>
          ${employee.empid}
      </td>
    </tr>
    <tr>
      <th>员工姓名：</th>
      <td>
          ${employee.empname}
      </td>
    </tr>
    <tr>
      <th>性别：</th>
      <td>
          <#switch employee.gender>
              <#case "2">女<#break >
              <#default >男<#break >
          </#switch>
      </td>
    </tr>
    <tr>
      <th>年龄：</th>
      <td>
        ${employee.age}
      </td>
    </tr>
    <tr>
      <th>联系方式：</th>
      <td>
        ${employee.emptel}
      </td>
    </tr>
    <tr>
      <th>工资：</th>
      <td>
        ${employee.salary}
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