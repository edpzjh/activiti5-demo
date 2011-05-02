<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="page" uri="/page-tags" %>

<table class="page-form" cellspacing="0" width="100%">
    <tr>
        <td class="page-form-title" colspan="4"><s:text name="joda.model"/><s:text name="title.info"/></td>
        <s:token/>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="joda.xdate"/></td>
        <td class="page-form-value"><s:property value="joda.xdate"/></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="joda.xtime"/></td>
        <td class="page-form-value"><s:property value="joda.xtime"/></td>
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