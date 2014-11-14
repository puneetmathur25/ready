<%@ page import="edu.osumc.bmi.ready.domain.Note" %>



<div class="fieldcontain ${hasErrors(bean: noteInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="note.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${noteInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: noteInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="note.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${noteInstance?.title}"/>

</div>

