// 1
export function getDistinctOrderStatus() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order/distinct-order-status', {
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
export function getDelayedOrders() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order/delayed-orders', {
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
export function findOrdersWithLateDelivery() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order/late-delivery', {
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
export function findRejectedOrdersIn2009() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order/rejected-2009', {
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
export function findOrdersDeliveredInJanuary() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order/delivered-in-january', {
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

export function countOrderByStatus() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order/count-order-by-status', {
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