    window.onload = function() {
          axios.get('http://localhost:3000/reservation')
    .then(resp => {
        data = resp.data;
        var formoption = "";
        var s= "Cancel"
        data.forEach(e => {
            //data1.push(e.location);
            // var val = e.location
            
            formoption +="<tr>";
            formoption += "<td>" + e.id + "</td>";
            formoption += "<td>" + e.flight_name + "</td>";
            formoption += "<td>" + e.from + "</td>";
            formoption += "<td>" + e.to + "</td>";
            formoption += "<td>" + e.name + "</td>";
            formoption += "<td>" + e.price + "</td>";
 formoption += "<td><button onClick='my("+e.id+")'  id='btn"+e.id+"' class='btn btn-primary'>"+s+"</button></td>";           
           
            formoption +="</tr>";
            console.log(e);
        });
         $('#flightdata').html(formoption);
        // $('#to').html(formoption);
    })
    .catch(error => {
        console.log(error);
    });

}; 

function my(id){
	window.swal('Your ticket is cancelled !!')
	axios.delete('http://localhost:3000/reservation/'+id)
	.then(response => {
  console.log("deleted");
  //refreshes Application
  window.location.reload();
  })
}


var elems = document.getElementsByClassName('confirmation');
var confirmIt = function (e) {
    if (!confirm('Do you really want to Log Out ??')) e.preventDefault();
};
for (var i = 0, l = elems.length; i < l; i++) {
    elems[i].addEventListener('click', confirmIt, false);
}
