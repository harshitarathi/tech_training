
     
window.onload = function() {

  $("#header").load("include/header.html"); 
  $("#footer").load("include/footer.html");
const queryString = window.location.search;

const urlParams = new URLSearchParams(queryString);

const from = urlParams.get('from')
const to = urlParams.get('to')
const clas = urlParams.get('clas')


//http://localhost:3000/flight?from=Chandigarh%20International%20Airport,Chandigarh&to=Mysore%20Airport,Mysuru
    console.log(from);
    console.log(to);
          axios.get('http://localhost:3000/flight?from='+from+"&to="+to)
    .then(resp => {
        data = resp.data;
        var formoption = "";
        var s= "Book Now"
        data.forEach(e => {
            //data1.push(e.location);
            // var val = e.location
            formoption +="<tr>";
            formoption += "<td>" + e.flight_name + "</td>";
            formoption += "<td>" + e.arrival_time + "</td>";
            formoption += "<td>" + e.depart_time + "</td>";
            formoption += "<td>" + e.from + "</td>";
            formoption += "<td>" + e.to + "</td>";
            if(clas == "Economy"){
  formoption += "<td>" + e.economy_price + "</td>";
}else{
formoption += "<td>" + e.business_price + "</td>";
}
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
   const queryString = window.location.search;
var from,to,flight_name,depart_time,arrival_time,price;
const urlParams = new URLSearchParams(queryString);
const clas = urlParams.get('clas')

  axios.get('http://localhost:3000/flight?id='+id)
    .then(resp => {
        data = resp.data;
        var formoption = "";
        data.forEach(e => {
            //data1.push(e.location);
            var nid = new Date().getUTCMilliseconds();
   from = e.from;
   to = e.to;
   flight_name = e.flight_name;
   depart_time = e.depart_time;
   arrival_time = e.arrival_time;
  if(clas == "Economy"){
   price = e.economy_price
}else{
 price = e.business_price;
}
  axios.post('http://localhost:3000/reservation', {
    id: ""+nid,
    from: from,
    to: to,
    flight_name: flight_name,
    depart_time: depart_time,
    arrival_time: arrival_time,
    price: price,
}).then(resp => {
  swal("Great!", "Ticket Booked!", "success");
    console.log(resp.data);
}).catch(error => {
    console.log(error);
});
            console.log(e.flight_name);
        });
    })
    .catch(error => {
        console.log(error);
    });
  console.log(from);


}

var elems = document.getElementsByClassName('confirmation');
var confirmIt = function (e) {
    if (!confirm('Do you really want to Log Out ??')) e.preventDefault();
};
for (var i = 0, l = elems.length; i < l; i++) {
    elems[i].addEventListener('click', confirmIt, false);
}
