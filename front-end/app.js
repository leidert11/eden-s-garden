
import * as customer from './js/customer.js';

import * as employee from './js/employee.js';

import * as gamaProduct from './js/gamaProduct.js';

import * as office from './js/office.js';

import * as orderDetail from './js/orderDetail.js';

import * as payment from './js/payment.js';

import * as product from './js/product.js';

// app.js


document.getElementById("customer1").addEventListener("click", function() {
    customer.spanishCustomers();
});

document.getElementById("customer2").addEventListener("click", function() {
    customer.customerSalesRep();
});

