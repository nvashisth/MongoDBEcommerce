$(document).ready(function() {

function getCustomer() {
	var customer = {};
	customer["id"] = "8855";
	customer["name"] = "Mike Ross";
    //return JSON.stringify(customer);
	return customer;
}

function createCustomer(customer) {
	var id = customer.id;
	var name = customer.name;
	alert("Nitin id = "+id+",name = "+name+",customer ="+customer);
	$.ajax({
		type : 'POST',
		url : 'rest/nitin/customer/save',
		cache: false,
		contentType: 'application/json; charset=utf-8',
		dataType: 'json',
		data: JSON.stringify({"name": customer.name}),
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