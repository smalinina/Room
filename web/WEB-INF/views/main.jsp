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

<div id="tabs">
    <ul class="tabs-nav">
        <li><a href="#tab-1">Поиск свободных комнат</a></li>
        <li><a href="#tab-2">Поиск забронированных комнат</a></li>
        <li><a href="#tab-3">Забронировать комнату</a></li>
    </ul>
    <div class="tabs-items">
        <div class="tabs-item" id="tab-1">
            <div class="menu">
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
                </div>
            </div>
            <div class="menu">
                <div class="section">
                    <select id="category1">
                        <option value="">Выберите из списка</option>
                    </select>
                </div>
                <div class="section">
                    <input id="getRoomCount" value="">
                </div>
                <div class="section">
                    <input type="date" min = "01-01-2018">
                </div>
                <div class="section">
                    <input type="time">
                </div>
                <div class="section">
                    <input type="time">
                </div>
                <div class="section">
                    <button type="button" onclick="RestGetCount($('#getRoomCount').val())">Поиск комнаты</button>
                </div>
            </div>
            <div id="section_test" class="panel panel-default">
                <div class="panel-heading"> Результаты поиска </div>
                <table class="table">
                    <thead>
                    <tr>
                        <th>Комната</th>
                        <th>Кол-во человек</th>
                        <th>Дата</th>
                    </tr>
                    </thead>
                    <tbody id="responseCount"></tbody>
                </table>
            </div>
        </div>
        <div class="tabs-item" id="tab-2">
            <div class="menu">
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
                </div>
            </div>
            <div class="menu">
                <div class="section">
                    <select>
                        <option value="">Выберите из списка</option>
                    </select>
                </div>
                <div class="section">
                    <input>
                </div>
                <div class="section">
                    <input type="date" min = "01-01-2018">
                </div>
                <div class="section">
                    <input type="time">
                </div>
                <div class="section">
                    <input type="time">
                </div>
                <div class="section">
                    <button>Найти</button>
                </div>
            </div>
            <div id="section_test1" class="panel panel-default">
                <div class="panel-heading"> Результаты поиска </div>
                <table class="table">
                    <thead>
                    <tr>
                        <th>Комната</th>
                        <th>Кол-во человек</th>
                        <th>Дата</th>
                        <th>Время начала</th>
                        <th>Время окончания</th>
                        <th>Кол-во человек на совещании</th>
                    </tr>
                    </thead>
                    <tbody></tbody>
                </table>
            </div>
        </div>
        <div class="tabs-item" id="tab-3">
            <div class="menu">
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
                    <label>Цель собрания</label>
                </div>
                <div class="section">
                    <label>ФИО бронирующего</label>
                </div>
                <div class="section">
                </div>
            </div>
            <div class="menu">
                <div class="section">
                    <select id="postName">
                        <option value="">Выберите из списка</option>
                    </select>
                </div>
                <div class="section">
                    <input id="postCount">
                </div>
                <div class="section">
                    <input id="postDate" type="date" min = "01-01-2018">
                </div>
                <div class="section">
                    <input id="postStartTime" type="time">
                </div>
                <div class="section">
                    <input id="postEndTime"type="time">
                </div>
                <div class="section">
                    <input id="postDescription">
                </div>
                <div class="section">
                    <input id="postAuthor">
                </div>
                <div class="section">
                    <button type="button" onclick="RestPost($('#postName').val(),$('#postCount').val(), $('#postDate').val(), $('#postStartTime').val(), $('#postEndTime').val(),$('#postAuthor').val() )">Забронировать комнату</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>