
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
        const clientCardsContainer = document.querySelector('.info-data');
        const title = document.querySelector('.title').textContent = "Employees";
        const point = document.querySelector('#point').textContent = "Employees";
        const statement = document.querySelector('#statement').textContent = "Returns a list with the first name, last name and email of the employees whose boss has a boss code equal to 7.";

		let html = '';
		data.forEach(data => {
			const name = data[0];
			const lastName1 = data[1];
            const lastName2 = data[2];
            const email = data[3];
			html += `
				<div class="card">
					<div class="head">
						<div>
							<h1>Employee</h1>
                            <br>
							<h2>${name}</h2>
							
							<li><strong>Last name: </strong> ${lastName1} ${lastName2}</li>	
							<li><strong>Email: </strong> ${email} </li>					

						</div>
					</div>
					</div>
				</div>
			`;
		});
		clientCardsContainer.innerHTML = html;
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

