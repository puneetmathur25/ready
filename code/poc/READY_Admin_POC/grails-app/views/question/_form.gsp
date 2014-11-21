<%@ page import="com.ready.Question" %>



<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'questionString', 'error')} required">
	<label for="questionString">
		<g:message code="question.questionString.label" default="Question String" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="questionString" required="" value="${questionInstance?.questionString}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'responseType', 'error')} ">
	<label for="responseType">
		<g:message code="question.responseType.label" default="Response Type" />
		
	</label>
	<g:select name="responseType" from="${com.ready.ResponseType.list()}" multiple="multiple" optionKey="id" size="5" value="${questionInstance?.responseType*.id}" class="many-to-many"/>

</div>

