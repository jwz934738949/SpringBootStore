<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/toAddEmployee" method="post" class="form-group">
  <table class=" table table-hover">
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
      <td colspan="2" align="center">
        <input type="button" value="查询员工" class="btn btn-primary btn-lg btn-block">
      </td>
    </tr>
  </table>
  <table class="table table-hover">
    <thead>
    <tr>
      <th>员工编号</th>
      <th>员工姓名</th>
      <th>性别</th>
      <th>年龄</th>
      <th>联系方式</th>
      <th>工资</th>
      <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <#if employees?? && (employees?size>0)>
        <#list employees as employee>
          <tr>
            <td>${employee.empid}</td>
            <td>${employee.empname}</td>
            <td>
                <#switch employee.gender>
                    <#case "2">女<#break >
                    <#default >男<#break >
                </#switch>
            </td>
            <td>${employee.age}</td>
            <td>${employee.emptel}</td>
            <td>${employee.salary}</td>
            <td>
              <a href="/detailEmployee?empid=${employee.empid}" class="btn btn-outline-primary">查看</a>
              <a href="/toUpdateEmployee?empid=${employee.empid}" class="btn btn-outline-primary">修改</a>
              <a href="/deleteEmployee?empid=${employee.empid}" onclick="return confirm('是否确认删除该信息？')"
                 class="btn btn-outline-primary">删除</a>
            </td>
          </tr>
        </#list>
    <#else >
      <tr>
        <td colspan="7" align="center" style="color: red; font-family: 楷体;">对不起，查询不到任何数据！！</td>
      </tr>
    </#if>
    <tr>
      <td colspan="7" align="center">
        <input type="submit" value="新增员工" class="btn btn-primary btn-lg btn-block">
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
      $("form").attr("action", "queryEmployees").submit();
    });
  });
</script>
</body>
</html>