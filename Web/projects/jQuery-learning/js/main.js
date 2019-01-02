$(document).ready(function () {
    $("p").css("background-color", "red");
    $("p").css("font-size", "3em");
    $("div#intro .head").css("font-size", "1em");
    $(".hider").click(function () {
        $("pre").fadeToggle();
    });

})