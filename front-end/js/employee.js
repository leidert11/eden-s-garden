

export function employeesByBossId7() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/api/employee/employees-by-boss-id-7', {
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