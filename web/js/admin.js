var Admin = {};

Admin.init = function (){
    $("#all").delay(2000).fadeIn();
};

$(".button-collapse").sideNav();

document.addEventListener("DOMContentLoaded", function(){
    $('.preloader-background').delay(1700).fadeOut();
    $('.preloader-wrapper').delay(1700).fadeOut();
});