<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
        <ul>
            <li>Date now: ${dateNow}</li>
            <li>Date in 50 days: ${dateIn50days}</li>
            <li>Days till birthday: ${nextBirthday}</li>
        </ul>
        <p>Domain info</p>
        <ul>
            <g:each in="${domainInfo}" var="aDomain">
                <li>${aDomain}</li>
            </g:each>
        </ul>
</body>
</html>