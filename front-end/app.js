
import * as customer from './js/customer.js';

import * as employee from './js/employee.js';

import * as gamaProduct from './js/gamaProduct.js';

import * as office from './js/office.js';

import * as orderDetail from './js/orderDetail.js';

import * as order from './js/order.js';

import * as payment from './js/payment.js';

import * as product from './js/product.js';

// customer

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



// -----------------------------------------------------------------------------------------

// employee

// 1
document.getElementById("employee1").addEventListener("click", function() {
    employee.employeesByBossId7();
});

// 2
document.getElementById("employee2").addEventListener("click", function() {
    employee.getBossOfCompany();
});

// 3
document.getElementById("employee3").addEventListener("click", function() {
    employee.findEmployeesNotSalesRepresentatives();
})

// 4 
document.getElementById("employee4").addEventListener("click", function() {
    employee.getEmployeeAndBossNames();
})

// 5
document.getElementById("employee5").addEventListener("click", function() {
    employee.getAllEmployeesWithBossAndGrandBoss();
})

// 6
document.getElementById("employee6").addEventListener("click", function() {
    employee.getEmployeesNotAssociatedOffice();
})

// 7
document.getElementById("employee7").addEventListener("click", function() {
    employee.getEmployeesDoNotHaveClients();
})

// 8
document.getElementById("employee8").addEventListener("click", function() {
    employee.getNonClientOfficeEmployeesWork();
})

// 9
document.getElementById("employee9").addEventListener("click", function() {
    employee.getEmployeesNotAssociatedOfficeAndNotClient();
})

// 10
document.getElementById("employee10").addEventListener("click", function() {
    employee.findEmployeesWithoutCustomers();
})

// 11
document.getElementById("employee11").addEventListener("click", function() {
    employee.countEmployees();
})

// 12
document.getElementById("employee12").addEventListener("click", function() {
    employee.countCustomersByEmployee();
})


// -----------------------------------------------------------------------------------------

// office

// 1
document.getElementById("office1").addEventListener("click", function() {
    office.getOfficeCodeAndCity();
})

// 2
document.getElementById("office2").addEventListener("click", function() {
    office.getCityAndPhoneInSpain()
});

// 3
document.getElementById("office3").addEventListener("click", function() {
    office.findCustomersWithPaymentsAndTheirSalesRepAndOfficeCity();
})

// 4
document.getElementById("office4").addEventListener("click", function() {
    office.findOfficeAddressesInFuenlabrada();
})

// 5
document.getElementById("office5").addEventListener("click", function() {
    office.getOfficesNotEmployeesHaveClientWithGamaFrutales();
})

// -----------------------------------------------------------------------------------------

// orderDetail

// 1
document.getElementById("orderDetail1").addEventListener("click", function() {
   orderDetail.countDistinctProductsByOrder();
})

// 2 
document.getElementById("orderDetail2").addEventListener("click", function() {
    orderDetail.sumQuantityByOrder();
})

// 3
document.getElementById("orderDetail3").addEventListener("click", function() {
    orderDetail.findTop20ProductsByTotalSold();
})

// 4
document.getElementById("orderDetail4").addEventListener("click", function() {
    orderDetail.calculateInvoiceTotals();
})

// 5
document.getElementById("orderDetail5").addEventListener("click", function() {
    orderDetail.calculateProductInvoiceTotals();
})

// 6
document.getElementById("orderDetail6").addEventListener("click", function() {
    orderDetail.calculateTotalByProductStartingWithOR();
})

// 7
document.getElementById("orderDetail7").addEventListener("click", function() {
    orderDetail.calculateTotalByProduct();
})

// -----------------------------------------------------------------------------------------

// order

// 1
document.getElementById("order1").addEventListener("click", function() {
    order.getDistinctOrderStatus();
})

// 2
document.getElementById("order2").addEventListener("click", function() {
    order.getDelayedOrders();
})

// 3
document.getElementById("order3").addEventListener("click", function() {
    order.findOrdersWithLateDelivery();
})

// 4
document.getElementById("order4").addEventListener("click", function() {
    order.findRejectedOrdersIn2009();
})

// 5
document.getElementById("order5").addEventListener("click", function() {
    order.findOrdersDeliveredInJanuary();
})

// 6
document.getElementById("order6").addEventListener("click", function() {
    order.countOrderByStatus();
})

//-----------------------------------------------------------------------------------------

// payment

// 1 Llamado para la consulta de códigos de cliente con pagos en 2008
document.getElementById("payment1").addEventListener("click", function() {
    payment.customerCodesWithPaymentsIn2008();
});

//2 Llamado para la consulta de pagos realizados en PayPal en 2008, ordenados por total descendente
document.getElementById("payment2").addEventListener("click", function() {
    payment.paypalPaymentsIn2008OrderByTotalDesc();
});

//3 Llamado para la consulta de formas de pago distintas en la tabla de pagos
document.getElementById("payment3").addEventListener("click", function() {
    payment.distinctPaymentMethods();
});

// 4 Llamado para la consulta del promedio de total de pago para el año 2009
document.getElementById("payment4").addEventListener("click", function() {
    payment.findAveragePaymentTotalForYear2009();
});

//5 Llamado para la consulta del total de pagos por año
document.getElementById("payment5").addEventListener("click", function() {
    payment.getTotalPaymentsByYear();
});

//-----------------------------------------------------------------------------------------

// product

//1 Llamado para la consulta de productos ornamentales en stock
document.getElementById("product1").addEventListener("click", function() {
    product.getOrnamentalProductsInStock();
});

//2 Llamado para la consulta de productos que no están en ninguna orden
document.getElementById("product2").addEventListener("click", function() {
    product.getProductsAreNotInAnyOrder();
});

//3 Llamado para la consulta de productos que no están en ninguna orden (forma alternativa)
document.getElementById("product3").addEventListener("click", function() {
    product.getProductsAreNotInAnyOrderNDI();
});

//4Llamado para la consulta de precio máximo y mínimo de productos
document.getElementById("product4").addEventListener("click", function() {
    product.findMaxAndMinPrice();
});