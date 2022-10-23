<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:structure title="Administration des ressources">
    <div class="row h-100">
        <div class="col-3 p-2 text-center h-100" style="background-color: darkgray;">
            <form action="/Ressource/ajouter" method="post">     
                <div class="m-2 form-floating">                
                    <input type="text" class="form-control" id="name" name="name" placeholder="Nom de la ressource"></input>                
                    <label for="name">Nom de la ressource</label>
                </div>                
                <div class="m-2 form-floating">
                    <textarea type="text" class="form-control" id="question" name="question" placeholder="Question de la ressource"></textarea>
                    <label for="question">Question de la ressource</label>
                </div>
                <div class="m-2 form-floating">
                    <select class="form-select" id="type" name="type">
                        <option value="IMG">Image</option>
                        <option value="GIF">Gif/Vidéo</option>
                        <option value="TXT">Text à trou</option>
                    </select>
                    <label for="type">Choisir un type de ressource</label>
                </div>
                <div class="m-2">
                    <button type="submit" class="btn btn-primary mb-3">Créer</button>
                </div>
            </form>
        </div>
        <div class="col-9 h-100">
            <div class="row h-100" style="background-color: lightgray;">
                <!-- foreach ressource -->
                <c:forEach var="ressource" items="${ ressourceList }" >
                    
                    <t:ressourceCard ressource="${ ressource }"/>
                </c:forEach>
            
            </div>
        </div>
    </div>
</t:structure>