

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