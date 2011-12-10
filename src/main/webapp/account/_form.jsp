<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div style="color:red;">
	<s:fielderror />
	<s:actionmessage/>
	<s:actionerror/>
</div>

<table class="page-form" cellspacing="0" width="100%">
    <tr>
        <td class="page-form-title" colspan="4"><s:text name="account.model"/><s:text name="title.info"/></td>
        <s:hidden name="id"></s:hidden>
        <s:token/>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.name"/></td>
        <td class="page-form-value"><s:textfield key="account.name" cssClass="required" maxlength="50"/></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.type"/></td>
        <td class="page-form-value"><s:select name="account.type" list="listReferanceCashAccountType" listKey="key" listValue="value" value="account.type" cssClass="required"/></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td width="20%"></td>
        <td width="30%"></td>
        <td width="20%"></td>
        <td width="30%"></td>
    </tr>
</table> 
