// $( "#numberPlayer" ).change(function(e) {
//     console.log(e)
// });
$("#numberPlayerOrTeam").change( function(e){
    let content=""

    for (let x = 1; x <= e.target.value; x++) {
        content += '<div><input id="Player'+x+'" type="text" name="player"></div>'
    }

    document.getElementById("name").innerHTML = content;
    document.getElementById("valid-form").innerHTML = '<div class="button-play"><input type="submit" class="text" value="Valider"/></div>'
});