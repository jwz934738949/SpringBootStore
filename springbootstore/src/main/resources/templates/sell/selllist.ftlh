<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/toaddSell" method="post" class="form-group">
    <table class="table table-hover">
        <tr>
            <th>商品名称：</th>
            <td>
                <select name="goods.goodsid" class="form-control">
                    <option value="00">--请选择--</option>
                    <#if goods?? && (goods?size>0)>
                        <#list goods as good>
                            <option value="${good.goodsid}">${good.goodsname}</option>
                        </#list>
                    </#if>
                </select>
            </td>
        </tr>
        <tr>
            <th>员工姓名：</th>
            <td>
                <select name="employee.empid" class="form-control">
                    <option value="00">--请选择--</option>
                    <#if employees?? && (employees?size>0)>
                        <#list employees as employee>
                            <option value="${employee.empid}">${employee.empname}</option>
                        </#list>
                    </#if>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" value="查询出库信息" class="btn btn-primary btn-lg btn-block">
            </td>
        </tr>
    </table>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>出库编号</th>
            <th>商品名称</th>
            <th>出库数量</th>
            <th>出库时间</th>
            <th>出库价格</th>
            <th>员工姓名</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <#if sells?? &&(sells?size>0)>
            <#list sells as sell>
            <tr>
                <td>${sell.sellid}</td>
                <td>${sell.goods.goodsname}</td>
                <td>${sell.sellnum}</td>
                <td>${sell.selltime?date}</td>
                <td>${sell.sellprice}</td>
                <td>${sell.employee.empname}</td>
                <td>
                        <a href="/querySellid?sellid=#{sell.sellid}" class="btn btn-outline-primary">查看</a>
                        <a href="/toUpdateSell?sellid=#{sell.sellid}" class="btn btn-outline-primary">修改</a>
                        <a href="/deleteSell?sellid=#{sell.sellid}" onclick="return confirm('是否确认删除该信息？')"
                           class="btn btn-outline-primary">删除</a>
                    </td>
            </tr>
            </#list>
        <#else >
            <tr>
                <td colspan="" align="center" style="color: red; font-family: 楷体;">对不起，没有入库信息！</td>
            </tr>
        </#if>
        <tr>
            <td colspan="7" align="center">
                <input type="submit" value="新增出库信息" class="btn btn-primary btn-lg btn-block">
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
            $("form").attr("action", "querySell").submit();
        });
    });
</script>
</body>
</html>