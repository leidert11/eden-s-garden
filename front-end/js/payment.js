//1 Función para la consulta de códigos de cliente con pagos en 2008
export function customerCodesWithPaymentsIn2008() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/payment/customer-codes-with-payments-in-2008', {
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

//2 Función para la consulta de pagos realizados en PayPal en 2008, ordenados por total descendente
export function paypalPaymentsIn2008OrderByTotalDesc() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/payment/paypal-payments-2008', {
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        console.log(data);
    })
    .catch(error => console.error('Error:', error));
}

// 3 Función para la consulta de formas de pago distintas en la tabla de pagos
export function distinctPaymentMethods() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/payment/distinct-payment-methods', {
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

//4 Función para la consulta del promedio de total de pago para el año 2009
export function findAveragePaymentTotalForYear2009() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/payment/find-average-payment-total-for-year', {
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

//5 Función para la consulta del total de pagos por año
export function getTotalPaymentsByYear() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/payment/get-total-payments-by-year', {
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