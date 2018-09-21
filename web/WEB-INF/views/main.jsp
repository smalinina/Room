<!—
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
-->
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script src="js/jquery.min.js" type="text/javascript"></script>
    <script src="js/ajax.js" type="text/javascript"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
</head>

<body>
<h1>Сервис бронирования переговорных комнат</h1>
<div id = "test">
<div id="content">
    <div id = "menu" class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Бронирование комнаты</h3>
        </div>
        <div class="panel-body">
            <div class="section_main">
                <div class="section">
                    <label>Комната</label>
                </div>
                <div class="section">
                    <label>Количество человек</label>
                </div>
                <div class="section">
                    <label>Дата</label>
                </div>
                <div class="section">
                    <label>Время начала</label>
                </div>
                <div class="section">
                    <label>Время окончания</label>
                </div>
                <div class="section">
                    <label>Цель</label>
                </div>
            </div>
            <div class="section_main">
                <div class="section">
                    <input id = "postName">
                </div>
                <div class="section">
                    <input id = "postCount">
                </div>
                <div class="section">
                    <input id = "postDate" type="date" min = "01-01-2018">
                </div>
                <div class="section">
                    <input id = "postTimeStart" type="time">
                </div>
                <div class="section">
                    <input id = "postTimeEnd" type="time">
                </div>
                <div class="section">
                    <input id = "postDescription">
                </div>
            </div>
        </div>
    </div>
    <div id = "menu1" class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Поиск комнат</h3>
        </div>
        <div class="panel-body">
            <div class="section_main">
                <div class="section">
                    <label>Комната</label>
                </div>
                <div class="section">
                    <label>Количество человек</label>
                </div>
                <div class="section">
                    <label>Дата</label>
                </div>
                <div class="section">
                    <label>Время начала</label>
                </div>
                <div class="section">
                    <label>Время окончания</label>
                </div>
            </div>
            <div class="section_main">
                <div class="section">
                    <input>
                </div>
                <div class="section">
                    <input>
                </div>
                <div class="section">
                    <input>
                </div>
                <div class="section">
                    <input>
                </div>
                <div class="section">
                    <input>
                </div>
            </div>
        </div>
    </div>
    <div class="test2">
        <button type="button" onclick="RestPost($('#postName').val(), $('#postCount').val(), $('#postDate').val(), $('#postTimeStart').val(), $('#postTimeEnd').val(), $('#postDescription').val())">Забронировать комнату</button>
        <button>Поиск комнаты</button>
        <button>Поиск забронированных комнат</button>
    </div>
    <div id = "section_test" class="panel panel-default">
        <div class="panel-heading"> Результаты </div>
        <table class="table">
            <thead>
            <tr>
                <th>Комната</th>
                <th>Количество человек</th>
                <th>Дата</th>
                <th>Время начала</th>
                <th>Время окончания</th>
                <th>Цель</th>
            </tr>
            </thead>
            <tbody id="response"></tbody>
        </table>
    </div>
</div>
</div>
</body>
</html>