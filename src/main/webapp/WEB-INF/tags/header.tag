<%@ tag pageEncoding="ISO-8859-1" %>

<%@ attribute name="title" %>


<!DOCTYPE html>
<html>
<head>
    <title>${ title }</title>
</head>

<body>
    <h1>${ title }</h1>
    
    <!-- doBody ins�re le contenu d�fini dans l'utilisation du tag -->
    <jsp:doBody />
</body>

</html>