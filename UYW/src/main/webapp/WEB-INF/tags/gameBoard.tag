<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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