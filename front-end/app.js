
import * as customer from './js/customer.js';

import * as employee from './js/employee.js';

import * as gamaProduct from './js/gamaProduct.js';

import * as office from './js/office.js';

import * as orderDetail from './js/orderDetail.js';

import * as payment from './js/payment.js';

import * as product from './js/product.js';

// app.js

// 1

document.getElementById("customer1").addEventListener("click", function() {
    customer.spanishCustomers();
});

// 2
document.getElementById("customer2").addEventListener("click", function() {
    customer.madridSalesRep11To30();
});
// 3
document.getElementById("customer3").addEventListener("click", function() {
    customer.customerSalesRep();
});

//4
document.getElementById("customer4").addEventListener("click", function() {
    customer.customersWithPayments();
});

//5
document.getElementById("customer5").addEventListener("click", function() {
    customer.customersWithoutPayments();
});
//6
document.getElementById("customer6").addEventListener("click", function() {
    customer.customersWithPaymentsRepCity();
});
//7
document.getElementById("customer7").addEventListener("click", function() {
    customer.withoutPayments();
});
