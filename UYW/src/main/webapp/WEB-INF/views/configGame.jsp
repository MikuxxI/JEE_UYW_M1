<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:structure title="Game" isAdminButton="false">

    <div class="board-content">
        <div class="Title">
            <h4>Nombre de joueur</h4>
        </div>
        
        <form method="POST">
            <div>
                <label for="">Seul / équipe</label>
                <input type="checkbox" id="isPlayerGamer" name="isPlayer" checked>
                <br />
                <label for="numberPlayerOrTeam">Nombre de joueur</label>
                <select on name="numberPlayerOrTeam" id="numberPlayerOrTeam">
                    <option></option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                </select>
            </div>
            <div id="name"></div>
            <div id="valid-form"></div>
        </form>
    </div>

</t:structure>