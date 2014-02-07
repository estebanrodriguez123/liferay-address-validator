<%-- 
/*
 * Copyright (C) 2005-2014 Rivet Logic Corporation.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; version 3 of the License.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ page import="com.rivetlogic.address.model.Address" %>
<%@ page import="com.rivetlogic.address.util.AddressUtil" %>
<%@ page import="com.rivetlogic.address.portlet.util.AddressValidatorConstants" %>

<portlet:defineObjects />
<c:set var="pns"><portlet:namespace /></c:set>

<liferay-ui:error key="addressvalidator.error.callback-functions-required" message="addressvalidator.error.callback-functions-required"/>

<c:choose>
    <c:when test="${fn:length(matchedAddresses) gt 0}">
        <%@ include file="/html/address_validator/list_addresses.jspf"%>
    </c:when>
    <c:otherwise>
        <liferay-ui:message key="addressvalidator.message.no-matching-address" />
    </c:otherwise>
</c:choose>

