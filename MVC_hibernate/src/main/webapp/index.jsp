<html>
<body>


<div class="container">
  <div class="card">
    <h2>Company Registration form</h2>
    <form action="savedata" method="post">
      <input type="text"  name="cname" placeholder="Enter Company name" required>
      <input type="text" name="cemail" placeholder="Enter Company Email" required>
      <input type="text"  name="cpass" placeholder="Enter Password" required>
      
      <button type="submit">Register</button>
    </form>
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
