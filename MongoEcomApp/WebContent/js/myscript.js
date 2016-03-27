$(document).ready(function() {

function getCustomer() {
	var customer = {};
	customer["customerID"] = "hspector";
	customer["firstName"] = "Harvey";
	customer["lastName"] = "Spector";
	customer["address1"] = "Upper Saddle River";
	customer["city"] = "Brooklyn";
	customer["state"] = "New York";
	customer["postalCode"] = "10014";
	customer["country"] = "U.S.A";
	customer["email"] = "hspector@pearson.com";
	customer["password"] = "Admin@123";
	customer["cardType"] = "CreditCard";
	customer["cardNumber"] = "1234234534564567";
	customer["cardExpMon"] = "04";
	customer["cardExpYr"] = "24";
	customer["billingAddress"] = "23 B,Tech Bolvd,Pearson Spector";
	customer["billingCity"] = "Brooklyn";
	customer["billingPostalCode"] = "10014";
	customer["shippingAddress"] = "23 B,Tech Bolvd,Pearson Spector";
	customer["shippingCity"] = "Brooklyn";
	return customer;
}

function createCustomer(customer) {
	//var id = customer.id;
	//var name = customer.name;
	var obj = JSON.stringify(customer);
	//alert("Nitin id = "+customer.id+",name = "+customer.name+",customer ="+JSON.stringify(customer)+",O = "+obj);
	alert("Nitin customer ="+JSON.stringify(customer));
	$.ajax({
		type : 'POST',
		url : 'rest/ecom_customer/customer/save',
		cache: false,
		contentType: 'application/json',
		dataType: 'text',
		data: obj,
		success: function(data1) {
			alert('The data sent to server is '+data1);
		},
		error: function(data2) {
			alert('Error caused while saving customer'+data2);
		}
	});
}
	
	$('#save').click(function() {
	var customer = getCustomer();
	alert('Now we are sending customer = '+customer);
	createCustomer(customer);
});
});