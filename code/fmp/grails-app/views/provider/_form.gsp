<%@ page import="edu.osumc.bmi.ird.ready.fmp.Provider" %>



<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="provider.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${providerInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'middleName', 'error')} ">
	<label for="middleName">
		<g:message code="provider.middleName.label" default="Middle Name" />
		
	</label>
	<g:textField name="middleName" value="${providerInstance?.middleName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="provider.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${providerInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'streetAdress1', 'error')} ">
	<label for="streetAdress1">
		<g:message code="provider.streetAdress1.label" default="Street Adress1" />
		
	</label>
	<g:textField name="streetAdress1" value="${providerInstance?.streetAdress1}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'streetAdress2', 'error')} ">
	<label for="streetAdress2">
		<g:message code="provider.streetAdress2.label" default="Street Adress2" />
		
	</label>
	<g:textField name="streetAdress2" value="${providerInstance?.streetAdress2}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'city', 'error')} ">
	<label for="city">
		<g:message code="provider.city.label" default="City" />
		
	</label>
	<g:textField name="city" value="${providerInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'state', 'error')} ">
	<label for="state">
		<g:message code="provider.state.label" default="State" />
		
	</label>
	<g:textField name="state" value="${providerInstance?.state}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'zipcode', 'error')} ">
	<label for="zipcode">
		<g:message code="provider.zipcode.label" default="Zipcode" />
		
	</label>
	<g:textField name="zipcode" value="${providerInstance?.zipcode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'country', 'error')} ">
	<label for="country">
		<g:message code="provider.country.label" default="Country" />
		
	</label>
	<g:textField name="country" value="${providerInstance?.country}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'phoneNumber', 'error')} ">
	<label for="phoneNumber">
		<g:message code="provider.phoneNumber.label" default="Phone Number" />
		
	</label>
	<g:textField name="phoneNumber" value="${providerInstance?.phoneNumber}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'fax', 'error')} ">
	<label for="fax">
		<g:message code="provider.fax.label" default="Fax" />
		
	</label>
	<g:textField name="fax" value="${providerInstance?.fax}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'credential', 'error')} ">
	<label for="credential">
		<g:message code="provider.credential.label" default="Credential" />
		
	</label>
	<g:textField name="credential" value="${providerInstance?.credential}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'npi', 'error')} required">
	<label for="npi">
		<g:message code="provider.npi.label" default="Npi" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="npi" required="" value="${providerInstance?.npi}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'prefix', 'error')} ">
	<label for="prefix">
		<g:message code="provider.prefix.label" default="Prefix" />
		
	</label>
	<g:textField name="prefix" value="${providerInstance?.prefix}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: providerInstance, field: 'suffix', 'error')} ">
	<label for="suffix">
		<g:message code="provider.suffix.label" default="Suffix" />
		
	</label>
	<g:textField name="suffix" value="${providerInstance?.suffix}"/>

</div>

