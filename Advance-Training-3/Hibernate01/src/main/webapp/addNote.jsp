<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

   
     
  <title>Hello, world!</title>
  <%@include file="allnOne.jsp" %>
  </head>
  <body>
 <h1 align="center">This is Add Note Page</h1>
 
 <form action="saveMyData" method="post">
      <div class="container">
        <div class="mb-3">
        Note Title
        <input type="text" class="form-control" name="title" >
         </div>
      <div class="mb-3">
        Note Content
        <input type="text" class="form-control" name="content" ">
      </div>
     <button type="submit" class="btn btn-primary">Submit</button>
       </div>
 </form>

  </body>
</html>