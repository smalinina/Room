<!—
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
-->
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script src="js/jquery.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap..">
</head>

<script>
    var service = "http://localhost:8080/room";

    var RestPost = function (name, description) {
        var JSONObject = {
            'name': name,
            'description': description
        };

        $.ajax({
            type: 'POST',
            url: service + '/add',
            contentType: 'application/json;utf-8',
            data: JSON.stringify(JSONObject),
            dataType: 'json',
            async: false,
            success: function (result) {
                $('#response').html(JSON.stringify(result))
            },
            error: function (jqXHR, testStatus, errorThrown) {
                $('#response').html(JSON.stringify(jqXHR))
            }
        });
    };

</script>

<body>
<h1>Сервис бронирования комнат</h1>

<table class="table">
    <td>
        <tr>
            <td>Комната
            </td>
            <td>
                <input>
            </td>
        </tr>
        <tr>
            <td>Дата
            </td>
            <td>
                <input>
            </td>
        </tr>
        <tr>
            <td>Время начала
            </td>
            <td>
                <input>
            </td>
        </tr>
        <tr>
            <td>Время окончания
            </td>
            <td>
                <input>
            </td>
        </tr>
        <tr>
            <td>
            </td>
            <td>
                <button> Поиск</button>
            </td>
        </tr>
    </td>
</table>

<table class="table">
    <tr>
        <th>Request type</th>
        <th>URL</th>
        <th>value</th>
    </tr>
    <tr>
        <td>
            Add room <code><strong>POST</strong></code>
        </td>
        <td>/room/add</td>
        <td>
            <form class="form-inline">
                name: <input type="text" id="postName" value="Room name">
                description: <input type="text" id="postDescription" value="Room description">
                <button type="button" onclick="RestPost($('#postName').val(), $('#postDescription').val())">try</button>
            </form>
        </td>
    </tr>
</table>

<div class="panel panel-default">
    <div class="panel-heading">
        <strong>RESPONSE</strong>
    </div>
    <div class="panel-body" id="response"></div>
</div>
</body>
</html>
