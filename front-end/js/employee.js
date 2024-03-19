
// 1

export function employeesByBossId7() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/employees-by-boss-id-7', {
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
export function getBossOfCompany() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/boss-of-company', {
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
export function findEmployeesNotSalesRepresentatives() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/employees-not-sales-representatives', {
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
export function getEmployeeAndBossNames() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/employee-and-boss-names', {
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
export function getAllEmployeesWithBossAndGrandBoss() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/with-boss-and-grandboss', {
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
// 6
export function getEmployeesNotAssociatedOffice() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/employees-not-associated-office', {
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
// 7
export function getNonClientOfficeEmployeesWork() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/non-client-office-employees-work', {
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
// 8
export function getEmployeesDoNotHaveClients() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/employees-do-not-have-clients', {
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
// 9
export function getEmployeesNotAssociatedOfficeAndNotClient() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/employees-not-associated-office-and-not-client', {
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
// 10
export function findEmployeesWithoutCustomers() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/find-employees-without-customers', {
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
// 11
export function countEmployees() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/count-employees', {
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
// 12
export function countCustomersByEmployee() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/employee/count-customers-by-employee', {
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

