<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="page" uri="/page-tags" %>

<table class="page-form" cellspacing="0" width="100%">
    <tr>
        <td class="page-form-title" colspan="4"><s:text name="account.model"/><s:text name="title.info"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.iban"/></td>
        <td class="page-form-value"><s:property value="account.iban"/></td>
        <td class="page-form-label"><s:text name="account.schemeName"/></td>
        <td class="page-form-value"><s:property value="account.schemeName"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.identification"/></td>
        <td class="page-form-value"><s:property value="account.identification"/></td>
        <td class="page-form-label"><s:text name="account.issuer"/></td>
        <td class="page-form-value"><s:property value="account.issuer"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.name"/></td>
        <td class="page-form-value"><s:property value="account.name"/></td>
        <td class="page-form-label"><s:text name="account.status"/></td>
        <td class="page-form-value"><s:property value="account.statusName"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.currency"/></td>
        <td class="page-form-value"><s:property value="account.currencyName"/></td>
        <td class="page-form-label"><s:text name="account.type"/></td>
        <td class="page-form-value"><s:property value="account.typeName"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.monthlyPaymentValue"/></td>
        <td class="page-form-value"><s:property value="account.monthlyPaymentValue"/></td>
        <td class="page-form-label"><s:text name="account.monthlyReceivedValue"/></td>
        <td class="page-form-value"><s:property value="account.monthlyReceivedValue"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.monthlyTransactionNumber"/></td>
        <td class="page-form-value"><s:property value="account.monthlyTransactionNumber"/></td>
        <td class="page-form-label"><s:text name="account.averageBalance"/></td>
        <td class="page-form-value"><s:property value="account.averageBalance"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.floorNotificationAmount"/></td>
        <td class="page-form-value"><s:property value="account.floorNotificationAmount"/></td>
        <td class="page-form-label"><s:text name="account.ceilingNotificationAmount"/></td>
        <td class="page-form-value"><s:property value="account.ceilingNotificationAmount"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.statementCycle"/></td>
        <td class="page-form-value"><s:property value="account.statementCycleName"/></td>
        <td class="page-form-label"><s:text name="account.closingDate"/></td>
        <td class="page-form-value"><s:date id="closingDate" name="account.closingDate" format="%{getText('fmt.date')}" /><s:property value="%{closingDate}"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.purpose"/></td>
        <td class="page-form-value"><s:property value="account.purpose"/></td>
        <td class="page-form-label"><s:text name="account.restriction"/></td>
        <td class="page-form-value"><s:property value="account.restriction"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.targetGoLiveDate"/></td>
        <td class="page-form-value"><s:date id="targetGoLiveDate" name="account.targetGoLiveDate" format="%{getText('fmt.date')}" /><s:property value="%{targetGoLiveDate}"/></td>
        <td class="page-form-label"><s:text name="account.targetClosingDate"/></td>
        <td class="page-form-value"><s:date id="targetClosingDate" name="account.targetClosingDate" format="%{getText('fmt.date')}" /><s:property value="%{targetClosingDate}"/></td>
    </tr>
    <tr>
        <td class="page-form-label"><s:text name="account.urgencyFlag"/></td>
        <td class="page-form-value"><s:property value="account.urgencyFlagName"/></td>
        <td />
        <td />
    </tr>
    
    <s:set name="track" value="account"/>
    <s:include value="/common/_track.jsp"/>
    <tr>
        <td width="20%"></td>
        <td width="30%"></td>
        <td width="20%"></td>
        <td width="30%"></td>
    </tr>
</table> 