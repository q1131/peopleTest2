<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>EasyUI</title>
    <LINK rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
    <LINK rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
    <LINK rel="stylesheet" type="text/css" href="easyUI/css/demo.css">
    <script src="js/jquery-1.8.3.min.js" language="JavaScript"></script>
    <script src="js/jquery.easyui.min.js"></script>
    <script language="JavaScript">
        $(function () {
            $("#dv").datagrid({
                url:'/getAllPeopleController',
                pagination:true,  // 显示分页插件
                pageList:[3,6,9,12],  //设置每页显示条数
                pageSize:3,  //默认页大小
                columns:[[
                    {field:'id',title:'编号',width:100},
                    {field:'name',title:'姓名',width:100},
                    {field:'sex',title:'性别',width:100,align:'right'},
                    {field:'age',title:'年龄',width:100,align:'right'},
                    {field:'address',title:'地址',width:100,align:'right'},
                    {field:'aslary',title:'工资',width:100,align:'right'},
                    {field:'idcard',title:'ID编号',width:100,align:'right'},
                    {field:'dempId',title:'Demp编号',width:100,align:'right'}
                ]]
            })
        })
    </script>
</head>
<body>
<div id="dv">
</div>
</body>
</html>

