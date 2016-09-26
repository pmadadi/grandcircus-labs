$(document).ready(function() {
     var cart =[];

 $(".add-button").click(function() {
     var p  = $(this).parent();
     var price = p.children(".price").text();
     var name = p.children(".name").text();
     cart.push({name: name,price: price});
     });
     
  $(".finish-button").click(printReceipt);
  function printReceipt() {
  var total = 0;
  for(var i = 0; i<cart.length;i++) {
  var item = cart[i];
  total += Number(item.price);
  console.log("$" + item.price + " " + item.name);
  }
  console.log("Total:$" + total);
  }
 
  });