<%@ tag pageEncoding="ISO-8859-1" %>

<%@ attribute name="title" %>


<!DOCTYPE html>
<html>
<head>
    <title>${ title }</title>
    <base href="/" />
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous" />
</head>

<body>        
    <!-- doBody ins�re le contenu d�fini dans l'utilisation du tag -->
    <jsp:doBody />
</body>

</html>