var service = "http://localhost:8080/room";

var RestPost = function (name, count, date, dateStart, dateEnd,description) {
    var JSONObject = {
        'name': name,
        'count': count,
        'date': date,
        'dateStart': dateStart,
        'dateEnd': dateEnd,
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
            for (var i = 0; i < result.length; i++) {
                $('#response').append('<tr><td>' + result[i].name + '</td><td>' + result[i].count + '</td><td>' + result[i].date + '</td><td>' + result[i].dateStart + '</td><td>' + result[i].dateEnd + '</td><td>' + result[i].description + '</td></tr>');
            }

        },
        error: function (jqXHR, testStatus, errorThrown) {
            $('#response').html(JSON.stringify(jqXHR))
        }
    });
};

var RestGet = function (id) {
    $.ajax({
        type: 'GET',
        url: service + '/get/' + id,
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


var RestGetAll;
RestGetAll = function () {
    $.ajax({
        type: 'GET',
        url: service + '/get/all',
        dataType: 'json',
        async: false,
        success: function (result) {
            $("#response").empty();
            for (var i = 0; i < result.length; i++) {
                $('#response').append('<tr><td>' + result[i].name + '</td><td>' + result[i].count + '</td><td>' + result[i].date + '</td><td>' + result[i].dateStart + '</td><td>' + result[i].dateEnd + '</td><td>' + result[i].description + '</td></tr>');
            }

        },
        error: function (jqXHR, testStatus, errorThrown) {
            $('#response').html(JSON.stringify(jqXHR))
        }
    });
};