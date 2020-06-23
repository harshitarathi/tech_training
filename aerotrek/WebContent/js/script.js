/*
* Function to load header and footer
*/
window.onload = function() {

  $("#header").load("include/header.html"); 
  $("#footer").load("include/footer.html");
  $("#adminModal").load("include/AdminLoginModal.html");
  //$("#userModal").load("include/UserLoginModal.html"); 
 console.log("on load cookie"+readCookie("name"))
 if(readCookie("name") !== null){
      $("#login").hide();
      $("#logout").show();

  }else{
    $("#login").show();
      $("#logout").hide();

  }
};
function readCookie(name) {
    var nameEQ = name + "=";
    var ca = document.cookie.split(';');
    for(var i=0;i < ca.length;i++) {
        var c = ca[i];
        while (c.charAt(0)==' ') c = c.substring(1,c.length);
        if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length,c.length);
    }
    return null;
}

/*
* Function for admin Logout
*/
function deleteAllCookies() {
    var cookies = document.cookie.split(";");

    for (var i = 0; i < cookies.length; i++) {
        var cookie = cookies[i];
        var eqPos = cookie.indexOf("=");
        var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
        document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
    }
    window.location.href = "http://localhost/flight/flight/index.html";
}

function deleteAllCookie() {
   $("#logout").hide();
     $("#login").show();
    var cookies = document.cookie.split(";");

    for (var i = 0; i < cookies.length; i++) {
        var cookie = cookies[i];
        var eqPos = cookie.indexOf("=");
        var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
        document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
    }
    //window.location.href = "http://localhost/flight/flight/index.html";
    console.log("delete cookie"+readCookie("name"))
   
      
}

/*
* Function for admin Login
*/
function adminLogin() {

   var email = $("#email"). val();
   var password = $("#password"). val();
   console.log(email);
   $.getJSON('http://localhost:3000/admin/1', function(jd) {
   console.log(jd.name);
   if(jd.email == email && jd.password == password){

      document.cookie = "token="+jd.token;
      window.location.href = "http://localhost/flight/flight/Adminpage.html";
                     
    }else{

      swal("Hey.." ,"Email or password is incorrect!")

    }
  });
}

function onSuccess(googleUser) {
	window.location = "http://localhost:8080/aerotrek/HomePage.html";
  }
  function onFailure(error) {
    console.log(error);
  }
  function renderButton() {
    gapi.signin2.render('my-signin2', {
      'scope': 'profile email',
      'width': 345,
      'height': 50,
      'longtitle': true,
      'theme': 'dark',
      'onsuccess': onSuccess,
      'onfailure': onFailure
    });                    
  }


	function myFunction() {
		swal("Please Login First !!");
	}


	/*
	* Function to check is admin valid
	*/	
	function readCookie(name) {
	    var nameEQ = name + "=";
	    var ca = document.cookie.split(';');
	    for(var i=0;i < ca.length;i++) {
	        var c = ca[i];
	        while (c.charAt(0)==' ') c = c.substring(1,c.length);
	        if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length,c.length);
	    }
	    return null;
	}	
	window.onload = function() {


	  var name = document.cookie;
	  //console.log(name);
	  var nam = name.split(";");
	  var value = readCookie('token');
	  console.log(value);
	  $.getJSON('http://localhost:3000/admin/1', function(jd) {
	  	//console.log(nam[0]);
	  	var match = jd.token;
	  	//console.log(match);
	  	var n = match.localeCompare(value);
	  	if(n == 0){
	  		$("#login").hide();
	  		$("#logout").show();
	  		//window.location.href = "file:///F:/Techment/Flight%20reservation/Flight-Reservation/index.html";
	  	}else{
	  		window.location.href = "http://localhost/flight/flight/index.html";
	  	}
	  });

	  			var data1=[];
				axios.get('http://localhost:3000/airport')
	    .then(resp => {
	        data = resp.data;
	        var formoption = "";
	        data.forEach(e => {
	            //data1.push(e.location);
	            var val = e.location
	            formoption += "<option value='" + val + "'>" + val + "</option>";
	           // console.log(e.location);
	        });
	         $('#from').html(formoption);
	         $('#to').html(formoption);
	    })
	    .catch(error => {
	        console.log(error);
	    });
	};


	/*
	* Function to insert Location in db
	*/
	function addLocation() {
	var id = new Date().getUTCMilliseconds();
	var location = $("#location").val();
	axios.post('http://localhost:3000/airport', {
	    id: ""+id,
	    location: location
	}).then(resp => {
		swal("Location added");
	   // console.log(resp.data);
	}).catch(error => {
		swal("SOmething went wrong!")
	    console.log(error);
	});
	}

/*
 * Adding flight details.
 */
	function addFlight(){
	var id = new Date().getUTCMilliseconds();
	var from = $('#from').find(":selected").text();
	var to = $('#to').find(":selected").text();
	var flight_name = $('#flight_name').val();
	var depart_time = $('#depart_time').val();
	var arrival_time = $('#arrival_time').val();
	var economy_price = $('#economy_price').val();
	var business_price = $('#business_price').val();
	
	
	axios.post('http://localhost:3000/flight', {
	    id: ""+id,
	    from: from,
	    to: to,
	    flight_name: flight_name,
	    depart_time: depart_time,
	    arrival_time: arrival_time,
	    economy_price: economy_price,
	    business_price: business_price
	}).then(resp => {
	    console.log(resp.data);
	}).catch(error => {
	    console.log(error);
	}); 
		}
	 
	    var elems = document.getElementsByClassName('confirmation');
	    var confirmIt = function (e) {
	        if (!confirm('Do you really want to Log Out ??')) e.preventDefault();
	    };
	    for (var i = 0, l = elems.length; i < l; i++) {
	        elems[i].addEventListener('click', confirmIt, false);
	    }