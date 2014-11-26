
<%@ page import="edu.osumc.bmi.ird.ready.fmp.Provider" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'provider.label', default: 'Provider')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-provider" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-provider" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list provider">
			
				<g:if test="${providerInstance?.firstName}">
				<li class="fieldcontain">
					<span id="firstName-label" class="property-label"><g:message code="provider.firstName.label" default="First Name" /></span>
					
						<span class="property-value" aria-labelledby="firstName-label"><g:fieldValue bean="${providerInstance}" field="firstName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.middleName}">
				<li class="fieldcontain">
					<span id="middleName-label" class="property-label"><g:message code="provider.middleName.label" default="Middle Name" /></span>
					
						<span class="property-value" aria-labelledby="middleName-label"><g:fieldValue bean="${providerInstance}" field="middleName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.lastName}">
				<li class="fieldcontain">
					<span id="lastName-label" class="property-label"><g:message code="provider.lastName.label" default="Last Name" /></span>
					
						<span class="property-value" aria-labelledby="lastName-label"><g:fieldValue bean="${providerInstance}" field="lastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.streetAdress1}">
				<li class="fieldcontain">
					<span id="streetAdress1-label" class="property-label"><g:message code="provider.streetAdress1.label" default="Street Adress1" /></span>
					
						<span class="property-value" aria-labelledby="streetAdress1-label"><g:fieldValue bean="${providerInstance}" field="streetAdress1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.streetAdress2}">
				<li class="fieldcontain">
					<span id="streetAdress2-label" class="property-label"><g:message code="provider.streetAdress2.label" default="Street Adress2" /></span>
					
						<span class="property-value" aria-labelledby="streetAdress2-label"><g:fieldValue bean="${providerInstance}" field="streetAdress2"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.city}">
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="provider.city.label" default="City" /></span>
					
						<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${providerInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.state}">
				<li class="fieldcontain">
					<span id="state-label" class="property-label"><g:message code="provider.state.label" default="State" /></span>
					
						<span class="property-value" aria-labelledby="state-label"><g:fieldValue bean="${providerInstance}" field="state"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.zipcode}">
				<li class="fieldcontain">
					<span id="zipcode-label" class="property-label"><g:message code="provider.zipcode.label" default="Zipcode" /></span>
					
						<span class="property-value" aria-labelledby="zipcode-label"><g:fieldValue bean="${providerInstance}" field="zipcode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.country}">
				<li class="fieldcontain">
					<span id="country-label" class="property-label"><g:message code="provider.country.label" default="Country" /></span>
					
						<span class="property-value" aria-labelledby="country-label"><g:fieldValue bean="${providerInstance}" field="country"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.phoneNumber}">
				<li class="fieldcontain">
					<span id="phoneNumber-label" class="property-label"><g:message code="provider.phoneNumber.label" default="Phone Number" /></span>
					
						<span class="property-value" aria-labelledby="phoneNumber-label"><g:fieldValue bean="${providerInstance}" field="phoneNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.fax}">
				<li class="fieldcontain">
					<span id="fax-label" class="property-label"><g:message code="provider.fax.label" default="Fax" /></span>
					
						<span class="property-value" aria-labelledby="fax-label"><g:fieldValue bean="${providerInstance}" field="fax"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.credential}">
				<li class="fieldcontain">
					<span id="credential-label" class="property-label"><g:message code="provider.credential.label" default="Credential" /></span>
					
						<span class="property-value" aria-labelledby="credential-label"><g:fieldValue bean="${providerInstance}" field="credential"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.npi}">
				<li class="fieldcontain">
					<span id="npi-label" class="property-label"><g:message code="provider.npi.label" default="Npi" /></span>
					
						<span class="property-value" aria-labelledby="npi-label"><g:fieldValue bean="${providerInstance}" field="npi"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.prefix}">
				<li class="fieldcontain">
					<span id="prefix-label" class="property-label"><g:message code="provider.prefix.label" default="Prefix" /></span>
					
						<span class="property-value" aria-labelledby="prefix-label"><g:fieldValue bean="${providerInstance}" field="prefix"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.suffix}">
				<li class="fieldcontain">
					<span id="suffix-label" class="property-label"><g:message code="provider.suffix.label" default="Suffix" /></span>
					
						<span class="property-value" aria-labelledby="suffix-label"><g:fieldValue bean="${providerInstance}" field="suffix"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="provider.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${providerInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${providerInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="provider.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${providerInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:providerInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${providerInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
