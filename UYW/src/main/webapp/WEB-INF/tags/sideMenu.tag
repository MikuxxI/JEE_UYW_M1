
<%@ attribute name="title" %>

<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:structure title="${ title }">
	<div class="">
        <jsp:doBody />
    </div>
</t:structure>
