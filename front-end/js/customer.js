
// 1

export function spanishCustomers() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/api/customers/spanish-customers', {
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => console.error('Error:', error));
}

// 2
export function madridSalesRep11To30() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/api/customers/madrid-sales-rep-11-30', {
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => console.error('Error:', error));
}
// 3
export function customerSalesRep() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/api/customers/customer-salesrep', {
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => console.error('Error:', error));
}
//4
export function customersWithPayments() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/api/customers/customers-with-payments', {
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => console.error('Error:', error));
}
//5
export function customersWithoutPayments() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/api/customers/customers-without-payments', {
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => console.error('Error:', error));
}
//6
export function customersWithPaymentsRepCity() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/api/customers/customers-with-payments-rep-city', {
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => console.error('Error:', error));
}
//7
export function withoutPayments() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/api/customers/without-payments', {
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => console.error('Error:', error));
}

// Función para la consulta 8
export function distinctCustomerRepresentativeOffice() {
  const token = sessionStorage.getItem('jwtToken');
  fetch('http://localhost:8080/api/customers/distinct-customer-representative-office', {
      method: 'GET',
      headers: {
          'Authorization': `Bearer ${token}`
      }
  })
  .then(response => response.json())
  .then(data => {
      console.log(data);
  })
  .catch(error => console.error('Error:', error));
}

//9 Función para la consulta de clientes que no han realizado ningún pago y los que no han realizado ningún pedido
export function customersDoNotPayAnyOrders() {
  const token = sessionStorage.getItem('jwtToken');
  fetch('http://localhost:8080/api/customers/customers-do-not-pay-any-orders', {
      method: 'GET',
      headers: {
          'Authorization': `Bearer ${token}`
      }
  })
  .then(response => response.json())
  .then(data => {
      console.log(data);
  })
  .catch(error => console.error('Error:', error));
}

//10 Función para la consulta de clientes que han realizado algún pedido pero no han realizado ningún pago
export function findCustomersWithOrdersButNoPayments() {
  const token = sessionStorage.getItem('jwtToken');
  fetch('http://localhost:8080/api/customers/find-customers-with-orders-but-no-payments', {
      method: 'GET',
      headers: {
          'Authorization': `Bearer ${token}`
      }
  })
  .then(response => response.json())
  .then(data => {
      console.log(data);
  })
  .catch(error => console.error('Error:', error));
}

// 11 Función para la consulta de cuántos clientes tiene cada país
export function countCustomersByCountry() {
  const token = sessionStorage.getItem('jwtToken');
  fetch('http://localhost:8080/api/customers/count-customers-by-country', {
      method: 'GET',
      headers: {
          'Authorization': `Bearer ${token}`
      }
  })
  .then(response => response.json())
  .then(data => {
      console.log(data);
  })
  .catch(error => console.error('Error:', error));
}

// 12 Función para la consulta del número de clientes que tiene la empresa
export function countCustomer() {
  const token = sessionStorage.getItem('jwtToken');
  fetch('http://localhost:8080/api/customers/count-customer', {
      method: 'GET',
      headers: {
          'Authorization': `Bearer ${token}`
      }
  })
  .then(response => response.json())
  .then(data => {
      console.log(data);
  })
  .catch(error => console.error('Error:', error));
}

//13 Función para la consulta del número de clientes que existen con domicilio en la ciudad de Madrid
export function countCustomersByCityMadrid() {
  const token = sessionStorage.getItem('jwtToken');
  fetch('http://localhost:8080/api/customers/count-customers-by-city-madrid', {
      method: 'GET',
      headers: {
          'Authorization': `Bearer ${token}`
      }
  })
  .then(response => response.json())
  .then(data => {
      console.log(data);
  })
  .catch(error => console.error('Error:', error));
}

//14 Función para la consulta del número de clientes que tiene cada una de las ciudades que empiezan por M
export function countCustomersByCityStartingWithM() {
  const token = sessionStorage.getItem('jwtToken');
  fetch('http://localhost:8080/api/customers/count-customers-by-city-starting-with-m', {
      method: 'GET',
      headers: {
          'Authorization': `Bearer ${token}`
      }
  })
  .then(response => response.json())
  .then(data => {
      console.log(data);
  })
  .catch(error => console.error('Error:', error));
}


// 15 Función para la consulta del número de clientes que no tiene asignado representante de ventas
export function countCustomersWithNoSalesRepresentative() {
  const token = sessionStorage.getItem('jwtToken');
  fetch('http://localhost:8080/api/customers/count-customers-with-no-sales-representative', {
      method: 'GET',
      headers: {
          'Authorization': `Bearer ${token}`
      }
  })
  .then(response => response.json())
  .then(data => {
      console.log(data);
  })
  .catch(error => console.error('Error:', error));
}

// 16 Función para la consulta de la fecha del primer y último pago realizado por cada uno de los clientes
export function findMinMaxPaymentDatesByCustomer() {
  const token = sessionStorage.getItem('jwtToken');
  fetch('http://localhost:8080/api/customers/find-min-max-payment-dates-by-customer', {
      method: 'GET',
      headers: {
          'Authorization': `Bearer ${token}`
      }
  })
  .then(response => response.json())
  .then(data => {
      console.log(data);
  })
  .catch(error => console.error('Error:', error));
}