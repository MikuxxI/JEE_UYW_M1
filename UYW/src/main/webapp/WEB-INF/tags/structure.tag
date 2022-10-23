<%@ tag pageEncoding="ISO-8859-1" %>

<%@ attribute name="title"%>
<%@ attribute name="isAdminButton"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>${ title }</title>
    <base href="/" />

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous" />
    <style><%@include file="/WEB-INF/assets/style/index.css"%></style>
</head>

<body>
    <div class="body">
        <c:choose>
            <c:when test="${isAdminButton}">
                <a class="link_home" href="<%=request.getContextPath()+"/Play"%>">
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512" fill="white" width="80px"   >
                        <path d="M413.5 237.5c-28.2 4.8-58.2-3.6-80-25.4l-38.1-38.1C280.4 159 272 138.8 272 117.6V105.5L192.3 62c-5.3-2.9-8.6-8.6-8.3-14.7s3.9-11.5 9.5-14l47.2-21C259.1 4.2 279 0 299.2 0h18.1c36.7 0 72 14 98.7 39.1l44.6 42c24.2 22.8 33.2 55.7 26.6 86L503 183l8-8c9.4-9.4 24.6-9.4 33.9 0l24 24c9.4 9.4 9.4 24.6 0 33.9l-88 88c-9.4 9.4-24.6 9.4-33.9 0l-24-24c-9.4-9.4-9.4-24.6 0-33.9l8-8-17.5-17.5zM27.4 377.1L260.9 182.6c3.5 4.9 7.5 9.6 11.8 14l38.1 38.1c6 6 12.4 11.2 19.2 15.7L134.9 484.6c-14.5 17.4-36 27.4-58.6 27.4C34.1 512 0 477.8 0 435.7c0-22.6 10.1-44.1 27.4-58.6z"/>
                    </svg>
                </a>
            </c:when>
            <c:otherwise>
                <a class="link_home" href="<%=request.getContextPath()+"/"%>">
                    <svg xmlns="http://www.w3.org/2000/svg"  viewBox="0 0 576 512" fill="white" width="80px">
                        <path d="M575.8 255.5c0 18-15 32.1-32 32.1h-32l.7 160.2c0 2.7-.2 5.4-.5 8.1V472c0 22.1-17.9 40-40 40H456c-1.1 0-2.2 0-3.3-.1c-1.4 .1-2.8 .1-4.2 .1H416 392c-22.1 0-40-17.9-40-40V448 384c0-17.7-14.3-32-32-32H256c-17.7 0-32 14.3-32 32v64 24c0 22.1-17.9 40-40 40H160 128.1c-1.5 0-3-.1-4.5-.2c-1.2 .1-2.4 .2-3.6 .2H104c-22.1 0-40-17.9-40-40V360c0-.9 0-1.9 .1-2.8V287.6H32c-18 0-32-14-32-32.1c0-9 3-17 10-24L266.4 8c7-7 15-8 22-8s15 2 21 7L564.8 231.5c8 7 12 15 11 24z"/>
                    </svg>
                </a>
            </c:otherwise>
        </c:choose>
        
        <!-- doBody ins�re le contenu d�fini dans l'utilisation du tag -->
        <jsp:doBody />
    </div>
    <script><%@include file="/WEB-INF/assets/js/index.js"%></script>
</body>

</html>