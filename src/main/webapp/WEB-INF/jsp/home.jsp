<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ include file="header.jspf" %>

<div class="ui segment">
    <h3>Welcome to TPS at BigCo!</h3>
    <p><b>Select one of the following actions:</b></p>
    <ul>
        <li><a href="/task/" rel="collection /rels/task">Manage Tasks<a/></li>
        <li><a href="/user/" rel="collection /rels/user">Manage Users<a/></li>
    </ul>
</div>

<%@ include file="footer.jspf" %>
