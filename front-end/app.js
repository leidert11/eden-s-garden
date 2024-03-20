
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

//8
document.getElementById("customer8").addEventListener("click", function() {
    customer.distinctCustomerRepresentativeOffice();
});

//9
document.getElementById("customer9").addEventListener("click", function() {
    customer.customersDoNotPayAnyOrders();
});

// 10 Llamado para la consulta de clientes que han realizado algún pedido pero no han realizado ningún pago
document.getElementById("customer10").addEventListener("click", function() {
    customer.findCustomersWithOrdersButNoPayments();
});


// 11 Llamado para la consulta de clientes que no han realizado ninguna orden
document.getElementById("customer11").addEventListener("click", function() {
    customer.countCustomersByCountry();
});

//12 Llamado para la consulta del número de clientes que tiene la empresa
document.getElementById("customer12").addEventListener("click", function() {
    customer.countCustomer();
});

//13 Llamado para la consulta del número de clientes que existen con domicilio en la ciudad de Madrid
document.getElementById("customer13").addEventListener("click", function() {
    customer.countCustomersByCityMadrid();
});

//14 Llamado para la consulta del número de clientes que tiene cada una de las ciudades que empiezan por M
document.getElementById("customer14").addEventListener("click", function() {
    customer.countCustomersByCityStartingWithM();
});

//15 Llamado para la consulta del número de clientes que no tiene asignado representante de ventas
document.getElementById("customer15").addEventListener("click", function() {
    customer.countCustomersWithNoSalesRepresentative();
});

//16 Llamado para la consulta de la fecha del primer y último pago realizado por cada uno de los clientes
document.getElementById("customer16").addEventListener("click", function() {
    customer.findMinMaxPaymentDatesByCustomer();
});