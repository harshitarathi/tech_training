<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script src="https://apis.google.com/js/platform.js" async defer></script>
<meta name="google-signin-client_id" content="72829907432-59t7rc1pvf1b41t4fre0aiqlj061gcc4.apps.googleusercontent.com">

<div class="g-signin2" data-onsuccess="onSignIn" id="myP"></div>


<img id="myImg"><br>
<p id="name"></p> 

  
<div id="status"></div>



<script type="text/javascript">
			function onSignIn(googleUser) {
			// window.location.href='success.jsp';

				
			
				  var profile = googleUser.getBasicProfile();
				  var imagurl=profile.getImageUrl();
				  var name=profile.getName();
				  var email=profile.getEmail();
				  document.getElementById("myImg").src = imagurl;
				  document.getElementById("name").innerHTML = name;
                   document.getElementById("myP").style.visibility = "hidden";
				  document.getElementById("status").innerHTML = 'Welcome '+name+'!<a href=success.jsp?email='+email+'&name='+name+'/>Continue with Google login</a></p>'

				   
				   
			 }
			
			
			function myFunction() {
				gapi.auth2.getAuthInstance().disconnect();
			    location.reload();
			}
</script>
 
                                     
 


<button onclick="myFunction()">Sign Out</button>



</body>
</html>