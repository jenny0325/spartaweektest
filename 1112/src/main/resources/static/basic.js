$(document).ready(function () {
    postingArticles();
});

function postingArticles() {
    var data = {
        content: $('#content').val()
    };


    $.ajax({
        type: 'POST',
        url: '/posts',
        dataType: 'json',
        contentType:'application/json; charset=utf-8',
        data: JSON.stringify(data),
        success: function (response) {
            alert("포스팅 성공!");
            window.location.reload();

        }
    });
}