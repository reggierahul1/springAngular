<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Accounts with angularjs</title>
</head>
<body ng-app="simpleAngularJsApp">
    <div class="generic-container" ng-controller="AccountController as ctrl">
        <table border="1">
            <tr>
                <td>ID</td>
                <td>NAME</td>
                <td>BALANCE</td>
            </tr>
            <tbody>
                <tr ng-repeat="account in ctrl.accounts">
                    <td><span ng-bind="account.id"></span></td>
                    <td><span ng-bind="account.name"></span></td>
                    <td><span ng-bind="account.balance"></span></td>
                </tr>
            </tbody>
        </table>
    </div>
 
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
    <script src="<c:url value='/static/js/app.js' />"></script>
    <script src="<c:url value='/static/js/service/account_service.js' />"></script>
    <script src="<c:url value='/static/js/controller/account_controller.js' />"></script>
</body>
</html>