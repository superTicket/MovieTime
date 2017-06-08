(function () {
    "use strict";

    // custom scrollbar

    $("html").niceScroll({
        styler: "fb",
        cursorcolor: "#000",
        cursorwidth: '4',
        cursorborderradius: '10px',
        background: '#ccc',
        spacebarenabled: false,
        cursorborder: '0',
        zindex: '1000'
    });

    $(".scrollbar1").niceScroll({
        styler: "fb",
        cursorcolor: "#000",
        cursorwidth: '4',
        cursorborderradius: '0',
        autohidemode: 'false',
        background: '#ccc',
        spacebarenabled: false,
        cursorborder: '0'
    });


    $(".scrollbar1").getNiceScroll();
    if ($('body').hasClass('scrollbar1-collapsed')) {
        $(".scrollbar1").getNiceScroll().hide();
    }

})(jQuery);

function findAndDelete(selectedList, seat) {
    for (i = 0; i < selectedList.length; i++) {
        if (selectedList[i].row == seat.row)
            if (selectedList[i].col == seat.col)
                selectedList.splice(i, 1)
    }
}

function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        strs = str.split("&");
        for (var i = 0; i < strs.length; i++) {
            theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
        }
    }
    return theRequest;
}

function proceed() {
    var Request = new Object();
    Request = GetRequest();

    var get_theater_id = function () {
        var path = window.location.pathname;
        var i;
        for (var i = path.length - 1; i >= 0; i--)
            if (path[i] == '/')
                break;
        return path.substr(i + 1, path.length);
    };

    if (selectedList.length > 0) {
        $.ajax({
            url: window.location.href,
            method: 'POST',
            data: {
                theater_id: get_theater_id(),
                show_id: show_id,
                selectedList_JSON: JSON.stringify(selectedList)
            },
            success: function (data) {
                if (data == "succeed") {
                    window.location.href = '/payment'
                }
                else {
                    $("#seat_taken").modal('show');
                }
            }
        });
    }
    else {
        $("#no_selected").modal("show");
    }
}