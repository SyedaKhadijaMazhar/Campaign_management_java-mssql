

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link href="css/style.css" rel="stylesheet" type="text/css" media="screen" /> 
        <style type="text/css">
<!--
.style1 {
	color: #FF0000;
	font-weight: bold;
}
-->
</style>
 <style>
       body{
    background-image: url(images/img01.jpg); 
                 
    }
    html {
  font: 16px 'Open sans', sans-serif;
}

      @import url(https://fonts.googleapis.com/css?family=Dancing+Script:700);
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
.header{
 height: 3em;
 background-color: #A6DCED;
  
}

.navbar {width: 100%;  background-color: #A6DCED;
}
/* make navbar to be as wide as needed to hold all links - 10pts */
div.header ul.navbar li{
  display: inline-block;
  width: 22.6vw; 
  height: 45px;
  margin-left: -5px;
  text-align: center;
  background-color: #A6DCED;
}

/* make navbar links share the row and with proper padding - 10pts */
div.header ul.navbar li{
  display: inline-block;
  padding-top: 10px;
  vertical-align: top;
}
.navbar > li a:hover {
  color: rgb(150, 150, 150);
}
/* set grey color, sans-serif font and remove underline for links - 5pts */
a[href='index.html']{
  color: white;
  font-family: sans-serif;
   text-decoration: none;
}
a[href='http://medlifeweb.org/']{
  color:white;
  font-family: sans-serif;
   text-decoration: none;
}
a[href='contact.html']{
  color:white;
  font-family: sans-serif;
   text-decoration: none;
}
a[href='services.html']{
  color:white;
  font-family: sans-serif;
   text-decoration: none;
}
a[href='https://www.android.com/intl/en_us/auto/']{
  color:grey;
  font-family: sans-serif;
   text-decoration: none;
}
a[href='https://www.android.com/intl/en_us/one/']{
  color:grey;
  font-family: sans-serif;
   text-decoration: none;
}
a[href='https://www.android.com/intl/en_us/play/']{
  color:grey;
  font-family: sans-serif;
   text-decoration: none;
}
.header {
  background-image: url("http://www.medlifeweb.org/images/stories/Banner_Ecuador.jpg");
background-color:white;
  background-size: cover;
background-position: center;
background-height:1em;
width:100%;
background-repeat: no-repeat;
padding-bottom: 286px
}
.body{
  width: 100%;
  background-color: white;
  border:solid white;
  border-width: 0 40px;
}
.head{
  margin-top:1em;
  font-size:xx-large;
  color:#6C87A3;
  text-align:center;
}
.body{
  color:black;
  text-align:justify;
  font-size:x-large;
  font-family: 'Dancing Script', cursive;
}
.head1{
   font-size:xx-large;
  color:#6C87A3;
  text-align:center;
  margin-top: 1em;
  
}
.foot{
  margin-top:4em;
  text-align:center;
  color: grey;
  background-color:black;
  position: relative;
  top: 240px;
}




iframe { display: block; margin: 2em auto; }
            </style>
             <style>
    
            
        
html {
  font: 16px 'Open sans', sans-serif;
}

form label {
  font-size: .9em;
}


/* Base */

* {
  box-sizing: border-box;
}

html,
body {
  margin: 0;
  padding: 0;
  width: 100%;
  height: 100%;
}


/* Form */

form {
  margin: 2% auto;
  padding: 1em;
  width: 320px;
  color: #aaa;
  border: .1em solid #ddd;
  border-color: black;
  position: relative;
  top:40px; 
 
}

.name {
  width: 100%;
}

.name input,
.submit input,
select,
textarea {
  width: 47%;
  height: 3em;
  text-indent: .5em;
  border: .1em solid #ddd;

  outline-color: #1abc9c;
}

.name input[name="surname"] {
  float: right;
}

.name input[type="mail"] {
  margin-top: 1em;
  width: 100%;
}

.radio,
.dropdown,
.message,
.check,
.submit {
  margin-top: 1em;
}

.dropdown select,
.message textarea,
.submit input {
  width: 100%;
}

.dropdown select {
  color: #aaa;
}

.message textarea {
  height: 8em;
}

.radio input,
.check input {
  position: relative;
  top: 1px;
}

.radio input:before,
.check input:before {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  width: 1em;
  height: 1em;
  background: #e9e9e9;

  transition: all .35s ease;
}

.radio input:before {
  border-radius: 50%;
}

.radio input:checked:before {
  top: -.1em;
  left: -.1em;
  width: .5em;
  height: .5em;
  border: .35em solid #e9e9e9;
  background: #1abc9c;
}

.check input:checked:before {
  content: "\f00c";
  font-family: 'fontAwesome';
  color: #1abc9c;
}

.check input:before {
  left: -.1px;
}

.submit input {
  //display: block;
  //margin: auto;
  //width: 99.5%;
  background: black;
  color: #fff;
  border: 0;
  border-bottom: solid darken(#1abc9c, 7%);
  font-size: 1em;
  font-weight: bold;
  &:focus,
  &:hover {
    background: #16a085;
    border-bottom-color: darken(#16a085, 7%);
  }
  &:active {
    background: #1bc2a2;
    border-bottom-color: darken(#1bc2a2, 7%);
  }
}
            </style>
    </head>
    <body>
        		<div id="logo">
				<h1><jsp:include page="header.html"/></h1>
			</div>
			
		
 <div class="header">
  
 
</div>
               
              <form action="UpdateDelProduct.jsp" id="js-form">
    <h1 style="color:black; position: relative; left:35px; top: 55px ">Product Category Is Inserted.</h1>
  <div class="name">
      <br/>
       <br />
  <br />
  <br/> <br/>
   </div>
      <br />
      <br />
   </div>
   <div class="submit">
  </div>
</form>
                
                                <div id="menu">
                                 <ul  style="position:relative; bottom: 395px; right: 510px">
        <li class="active"><a href="index.jsp">Homepage</a></li>
        
                
		<li class="active"><a href="services.jsp">Services</a></li>
		<li class="active"><a href="aboutus.jsp">About Us</a></li>
                <li class="active"><a href="help.jsp">Help</a></li></ul>
                                </div>
<div class= "foot">
  <footer>
<br />  
    <br />

    <br />

<br />

  
  </footer>
</div>
              


    </body>
</html>



