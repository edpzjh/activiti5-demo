<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%> 
<html>
    <head>
        <link href="<s:url value='/web-static/jquery/css/validate/jquery.validate.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<s:url value='/web-static/jquery/css/ui-lightness/jquery-ui-1.8.4.custom.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<s:url value='/web-static/jquery/css/ui-lightness/jquery-ui-timepicker.css'/>" rel="stylesheet" type="text/css"/>
        <link href="<s:url value='/web-static/static/css/globel.css'/>" rel="stylesheet" type="text/css"/>
        <script src="<s:url value='/web-static/jquery/js/jquery-1.4.2.js'/>" type="text/javascript"></script>
        <script src="<s:url value='/web-static/jquery/js/jquery.validate.js'/>" type="text/javascript"></script>
        <script src="<s:url value='/web-static/jquery/js/jquery.validate.extends.js'/>" type="text/javascript"></script>
        <s:set name="locale" value="#session['WW_TRANS_I18N_LOCALE']" />
        <script src="<s:url value='/web-static/jquery/js/localization/messages_%{#locale}.js'/>" type="text/javascript"></script>
        <script src="<s:url value='/web-static/jquery/js/jquery-ui-1.8.4.custom.min.js'/>" type="text/javascript"></script>
        <script src="<s:url value='/web-static/jquery/js/jquery.cookie.js'/>" type="text/javascript"></script>
        <script src="<s:url value='/web-static/static/js/jquery.cookie.extend.js'/>" type="text/javascript"></script>
        <script src="<s:url value='/web-static/static/js/jquery.cookie.menu.js'/>" type="text/javascript"></script>
        <script src="<s:url value='/web-static/jquery/js/jquery.ui.timepicker.js'/>" type="text/javascript"></script>
        <script src="<s:url value='/web-static/static/js/public.js'/>" type="text/javascript"></script>
        <title><decorator:title default="sitemesh" /></title>
        <decorator:head />
    </head>
    <body>
        <div id="container">
          <div id="header">
          </div>
          <div id="login"><span><a href="?request_locale=en_US">English</a>|<a href="?request_locale=zh_CN">Chinese</a></span></div>
          <div id="main">
            <div id="sidebar">
<div>
    <div class="section">
        <a id="a" class="header-open" href="javascript:void(0);">My Task</a>
        <ul id="a_ul">
            <li class="sub-menu"><a href="<s:url value='/activiti/list.action'/>">Activiti</a></li>
            <li class="sub-menu"><a href="<s:url value='/order/list.action'/>">Order</a></li>
            <li class="sub-menu"><a href="<s:url value='/joda/list.action'/>">Joda</a></li>
            <li class="sub-menu"><a href="<s:url value='/group/list.action'/>">Group</a></li>
            <li class="sub-menu"><a href="<s:url value='/category/list.action'/>">Category</a></li>
            <li class="sub-menu"><a href="<s:url value='/account/list.action'/>">Acount</a></li>
        </ul>
    </div>
    <div class="section">
        <a id="b" class="header-open" href="javascript:void(0);">Admin</a>
        <ul id="b_ul">
            <li class="sub-menu"><a href="<s:url value='/referance/list.action'/>">Referance</a></li>
            <li class="sub-menu"><a href="<s:url value='/user/list.action'/>">User</a></li>
        </ul>
    </div>
    <div class="section">
        <a id="hideAllMenu" class="header-open" href="javascript:void(0);">Hide All</a>
        <a id="showAllMenu" class="header-closed" href="javascript:void(0);">Show All</a>
    </div>
</div>
<script language="JavaScript" type="text/javascript">
    $(document).ready(function(){
        var menus = ['a','b'];
        jQueryMenu.cookieMenu(menus, {path:'/activiti5-demo'});
    });
</script>
            </div>
            <div id="content"><decorator:body /></div>
          </div>
          <hr/>
          <div id="footer"><center>Power by Bulain</center></div>
        </div>
    </body>
</html>