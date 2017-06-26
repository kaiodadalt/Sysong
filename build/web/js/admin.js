var Admin = {};

Admin.init = function (){
    $("#all").delay(2000).fadeIn();
};


$(".button-collapse").sideNav();

document.addEventListener("DOMContentLoaded", function(){
    $('.preloader-background').delay(1700).fadeOut();
    $('.preloader-wrapper').delay(1700).fadeOut();
});

Admin.GeralSave = function (){
     Materialize.toast('Salvo com sucesso!', 4000, 'rounded green darken-4');
     Materialize.toast('Aconteceu algo de errado! Tente novamente.', 4000, 'rounded red darken-4');
};

$(document).ready(function() {
    $('select').material_select();
    $('.modal').modal();
    $('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15 // Creates a dropdown of 15 years to control year
    });
});
