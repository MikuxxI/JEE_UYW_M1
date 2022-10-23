<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:structure title="Game" isAdminButton="false">
    <div class="board-content">
        <div class="board-score">
            <t:scoreBoard  listBoard="${ Teams }"/>
            <t:gameBoard />
        </div>
    </div>
</t:structure>