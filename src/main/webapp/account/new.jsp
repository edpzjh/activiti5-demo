<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="account.model"/><s:text name="title.add"/></title>
</head>
<body>

<table class="page-form" cellspacing="0" width="100%">
    <tr>
        <td class="page-form-title"><s:text name="account.model"/><s:text name="title.add"/></td>
    </tr>
</table>
<br/>

<s:form action="create" method="post" theme="simple">
    <s:include value="_form.jsp"/>
    <table cellspacing="0" width="100%">
        <tr>
            <td class="page-form-centered"><s:submit value="%{getText('action.create')}"/></td>
        </tr>
    </table>
</s:form>

<table class="footer-form" cellspacing="0" width="100%">
    <tr>
        <td class="footer-form-left"><s:url id="url" action="list" /><a href="<s:property value="#url"/>"><s:text name="action.back"/></a></td>
    </tr>
</table>


<script type="text/javascript">
$(document).ready(function() {
    $("#create").validate();
    $("#create_account_targetGoLiveDate").datepicker({dateFormat:'<s:text name="fmt.jq.date"/>'});
    $("#create_account_targetClosingDate").datepicker({dateFormat:'<s:text name="fmt.jq.date"/>'});
    $("#create_account_closingDate").datepicker({dateFormat:'<s:text name="fmt.jq.date"/>'});
});
</script>

</body>
</html>
