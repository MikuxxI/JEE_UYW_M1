<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="Ressource" type="java.lang.Object" %>

<div class="board-Game">
    <div class="Game">
        <c:choose>
            <c:when test="${condition1}">
                ok
            </c:when>
            <c:when test="${condition2}">
                ok 2
            </c:when>
            <c:otherwise>
                nop
            </c:otherwise>
        </c:choose>
    </div>
</div>