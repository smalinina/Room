var service = "http://localhost:8080/room";
var service1 = "http://localhost:8080/reservation";

var RestPost = function (room_id, count, date, dateStart, dateEnd,author) {
    var JSONObject = {
        'room_id': room_id,
        'count': count,
        'date': date,
        'dateStart': dateStart,
        'dateEnd': dateEnd,
        'author': author
    };

    $.ajax({
        type: 'POST',
        url: service1 + '/add',
        contentType: 'application/json;utf-8',
        data: JSON.stringify(JSONObject),
        dataType: 'json',
        async: true,
        success: function (result) {
            $('#response').html(JSON.stringify(result))
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


$("select").click(function(){
//$('#category2').click( function () {
//var RestGetByName = function(){
    $.ajax({
        type: 'GET',
        url: service + '/get/all',
        dataType: 'json',
        async: true,
        success: function (result) {
            $('#category1').empty();
            for ( var i = 0; i < result.length; i++ ) {
                // Каждое полученное значение вставим в список категорий транспорта
                $('#category1').append('<option value="' + result[i].name + '">' + result[i].name + '</option>' );
            }
        },
        error: function (jqXHR, testStatus, errorThrown) {
            $('#category1').html(JSON.stringify(jqXHR))
        }
})
    });


var RestGetAll;
RestGetAll = function () {
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/reservation/get/all',
        dataType: 'json',
        async: false,
        success: function (result) {
            $("#response").empty();
            for (var i = 0; i < result.length; i++) {
                $('#response').append('<tr><td>' + result[i].name + '</td><td>' + result[i].count + '</td><td>' + result[i].date + '</td><td>' + result[i].dateStart + '</td><td>' + result[i].dateEnd + '</td></tr>');
            }

        },
        error: function (jqXHR, testStatus, errorThrown) {
            $('#response').html(JSON.stringify(jqXHR))
        }
    });
};



$(function() {
    var tab = $('#tabs .tabs-items > div');
    tab.hide().filter(':first').show();

    // Клики по вкладкам.
    $('#tabs .tabs-nav a').click(function(){
        tab.hide();
        tab.filter(this.hash).show();
        $('#tabs .tabs-nav a').removeClass('active');
        $(this).addClass('active');
        return false;
    }).filter(':first').click();

    // Клики по якорным ссылкам.
    $('.tabs-target').click(function(){
        $('#tabs .tabs-nav a[href=' + $(this).data('id')+ ']').click();
    });
});