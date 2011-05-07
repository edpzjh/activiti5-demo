<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<tr><td colspan="4"><div class="line"></div></td></tr>
<tr>
    <td class="page-form-label"><s:text name="common.createdBy"/></td>
    <td class="page-form-value"><s:property value="#track.createdBy"/></td>
    <td class="page-form-label"><s:text name="common.createdAt"/></td>
    <td class="page-form-value"><s:date name="#track.createdAt" format="%{getText('fmt.timestamp')}" /></td>
</tr>
<tr>
    <td class="page-form-label"><s:text name="common.updatedBy"/></td>
    <td class="page-form-value"><s:property value="#track.updatedBy"/></td>
    <td class="page-form-label"><s:text name="common.updatedAt"/></td>
    <td class="page-form-value"><s:date name="#track.updatedAt" format="%{getText('fmt.timestamp')}" /></td>
</tr>
