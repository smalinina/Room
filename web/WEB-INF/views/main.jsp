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
<div id="container">
    <div id="header">
        <h2>Сервис бронирования комнат</h2>
    </div>

    <div id="menu">
        <h2>Меню</h2>
    </div>

    <div id="content">
        <div class="div_1">
            <div class="div_2">
                <label>Комната</label>
            </div>
            <div class="div_2">
                <label>Количество человек</label>
            </div>
            <div class="div_2">
                <label>Дата</label>
            </div>
            <div class="div_2">
                <label>Время начала</label>
            </div>
            <div class="div_2">
                <label>Время окончания</label>
            </div>
            <div class="div_2"></div>
        </div>
        <div>
            <div class="div_1">
                <div class="div_2">
                    <input>
                </div>
                <div class="div_2">
                    <input>
                </div>
                <div class="div_2">
                    <input type="date" name="calendar"  min="2018-01-01">
                </div>
                <div class="div_2">
                    <input type="time">
                </div>
                <div class="div_2">
                    <input type="time">
                </div>
                <div class="div_2">
                    <button>Найти</button>
                </div>
            </div>
        </div>

        <div>
            <table id="table" class="table_1">
                <tr>
                    <th>Комната</th>
                    <th>Количество человек</th>
                    <th>Описание</th>
                </tr>
            </table>
        </div>
    </div>



    <div id="footer">
        <h2>Подвал сайта</h2>
    </div>
</div>
</body>
</html>
