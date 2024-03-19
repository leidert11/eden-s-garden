
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