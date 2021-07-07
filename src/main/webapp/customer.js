var app = new (function name() {
//   alert("App class called");
  this.getAllCustomers = function () {
    // alert("app.getAllCustomers() method called");

    fetch("http://localhost:9090/customer")
      .then((response) => response.json())
      .then((data) => {
        console.log(data); // Prints result from `response.json()` in getRequest
      })
      .catch((error) => console.error(error));
  };
  this.save=function(){
    // alert("app.save() method called");
    // alert(document.getElementById("customername").value);
    var newobj = {
        customerid: 0,
        customername: document.getElementById("customername").value,
      };
      alert(JSON.stringify(newobj));
      fetch("http://localhost:9090/customer", {
      method: "post",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json; charset=UTF-8",
      },

      //make sure to serialize your JSON body
      body: JSON.stringify(newobj),
    }).then((response) => {
      //do something awesome that makes the world a better place
    });
  }
})();
