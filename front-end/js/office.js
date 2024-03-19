// 1
export function getOfficeCodeAndCity() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/office/office-code-and-city', {
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
export function getCityAndPhoneInSpain() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/office/city-and-phone-in-spain', {
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
export function findCustomersWithPaymentsAndTheirSalesRepAndOfficeCity() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/office/get-customers-with-payments-and-their-sales-reps-and-office-city', {
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
// 4
export function findOfficeAddressesInFuenlabrada() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/office/fuenlabrada-office-addresses', {
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
// 5
export function getOfficesNotEmployeesHaveClientWithGamaFrutales() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/office/ofices-not-employees-have-client-with-gama-frutales', {
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
