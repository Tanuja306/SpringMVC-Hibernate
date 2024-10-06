<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>


<div class="container">
  <div class="card">
    <h2>Edit form</h2>
    <c:forEach items="${kk}" var="e">
    <form action="/MVC_hibernate/updatedata" method="post">
    <input type="hidden"  value="${e.cid}" name="cid" placeholder="Enter Username" required>
      <input type="text"  value="${e.cname}" name="cname" placeholder="Enter Username" required>
      <input type="text"  value="${e.cemail}" name="cemail" placeholder="Enter Email" required>
      <input type="text"  value="${e.cpass}" name="cpass" placeholder="Enter Password" required>
      
      <button type="submit">Update</button>
    </form>
    </c:forEach>
  </div>
</div>
</body>
</html>
<style>

body {
  font-family: "Poppins", sans-serif;
  margin: 0;
  display: flex;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
  background: #f5f5f5;
  color: #333;
}

.container {
  width: 100%;
  max-width: 400px;
}

.card {
  background-color: #fff;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h2 {
  text-align: center;
  color: #333;
}

form {
  display: flex;
  flex-direction: column;
}

input {
  padding: 10px;
  margin-bottom: 12px;
  border: 1px solid #ddd;
  border-radius: 4px;
  transition: border-color 0.3s ease-in-out;
  outline: none;
  color: #333;
}

input:focus {
  border-color: #555;
}

button {
  background-color: #3498db;
  color: #fff;
  padding: 10px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s ease-in-out;
}

button:hover {
  background-color: #2980b9;
}



</style>
