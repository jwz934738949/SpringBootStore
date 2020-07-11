<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<form action="/doAddSupply" method="post" class="form-group">
  <table class="table table-hover">
    <tr>
      <th>供应商名称：</th>
      <td>
        <input type="text" name="supname" class="form-control">
      </td>
      <td>
        <span id="ajaxSupname" style="color: red; font-family: 楷体;"></span>
      </td>
    </tr>
    <tr>
      <th>供应商地址：</th>
      <td>
        <input type="text" name="supaddress" class="form-control">
      </td>
      <td></td>
    </tr>
    <tr>
      <th>联系方式：</th>
      <td>
        <input type="text" name="suptel" class="form-control">
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
    $("input[name='supname']").blur(function () {
      var supname = $(this).val();
      $.ajax({
        type: "post",
        url: "ajaxQuerySupname",
        data: {"supname": supname},
        dataType: "json",
        success: function (returnData) {
          if (returnData) {
            $("#ajaxSupname").html("对不起，供应商名称已存在");
          } else {
            $("#ajaxSupname").html("恭喜，供应商名称可以使用");
          }
        }
      });
    }).focus(function () {
      $("#ajaxSupname").html("");
      $(this).val("");
    });
  });
</script>
</body>
</html>