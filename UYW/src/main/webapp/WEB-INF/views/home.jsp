<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:structure title="Home" isAdminButton="true">

    <div class="board-content">
        <div class="board-score">
            <t:scoreBoard  listBoard="${ PlayerScoreboard }"/>
            <t:scoreBoard  listBoard="${ TeamScoreboard }"/>
        </div>
        <div class="board-button">
            <button class="button-play" onclick="location.href ='/Game'" role="button">
                <span class="text">Play</span>
            </button>
        </div>
    </div>

</t:structure>