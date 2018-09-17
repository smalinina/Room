var service = "http://localhost:8080/room";

var RestPost = function (name, description) {
    var JSONObject = {
        'name': name,
        'count': count,
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

var RestGetAll = function () {
    $.ajax({
        type: 'GET',
        url: service + '/get/all',
        dataType: 'json',
        async: false,
        success: function(data){
            if(data){
                var len = data.length;
                var txt = "";
                if(len > 0){
                    for(var i=0;i<len;i++){
                        if(data[i].name && data[i].count && data[i].description){
                            txt += "<tr><td>"+data[i].name+"</td><td>"+data[i].count+"</td><td>"+data[i].description+"</td></tr>";
                        }
                    }
                    if(txt != ""){
                        $("#table").append(txt).removeClass("hidden");
                    }
                }
            }
        },
            error: function (jqXHR, testStatus, errorThrown) {
            $('#table').html(JSON.stringify(jqXHR))
        }
    });
};