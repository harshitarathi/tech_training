/*
* Function to load header and footer
*/
window.onload = function() {
  $("#header").load("include/header.html"); 
  $("#footer").load("include/footer.html");
  //$("#adminModal").load("include/AdminLoginModal.html");
  //$("#userModal").load("include/UserLoginModal.html"); 

  var data1=[];
/*
* Get airport names to populate in autocomplete search box
*/
axios.get('http://localhost:3000/airport')
    .then(resp => {
        data = resp.data;
        data.forEach(e => {
            data1.push(e.location);
            console.log(e.location);
        });
    })
    .catch(error => {
      console.log(error);
});

/*
* Function to populate data in search box source
*/
$( function() {
    $( "#tags" ).autocomplete({
      source: data1
    });
  } );
  
/*
* Function to populate data in search box destinantion
*/
$( function() {
    $( "#tags1" ).autocomplete({
      source: data1
    });
  } );

};


/*
 * fetching flight from server
 */
function getFlight(){
      var from = $("#tags").val();
      var to = $("#tags1").val();
      var clas = $('#class_select').find(":selected").text();
      window.location.href = "http://localhost:8080/aerotrek/showFlights.html?from="+from+"&to="+to+"&clas="+clas;
    }

var elems = document.getElementsByClassName('confirmation');
var confirmIt = function (e) {
    if (!confirm('Do you really want to Log Out ??')) e.preventDefault();
};
for (var i = 0, l = elems.length; i < l; i++) {
    elems[i].addEventListener('click', confirmIt, false);
}
