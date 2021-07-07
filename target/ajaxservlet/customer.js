var app = new (function name() {
  alert("App class called");
  this.getAllCustomers = function () {
    alert("app.getAllCustomers() method called");

    fetch("http://localhost:9090/customer")
      .then((response) => response.json())
      .then((data) => {
        console.log(data); // Prints result from `response.json()` in getRequest
      })
      .catch((error) => console.error(error));
  };
})();
