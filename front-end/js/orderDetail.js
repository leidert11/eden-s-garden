// 1
export function countDistinctProductsByOrder() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order-detail/count-distinct-products-by-order', {
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
export function sumQuantityByOrder() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order-detail/sum-quantity-by-order', {
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
export function findTop20ProductsByTotalSold() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order-detail/find-top-20-products-by-total-sold', {
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
export function calculateInvoiceTotals() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order-detail/calculate-invoice-totals', {
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
export function calculateProductInvoiceTotals() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order-detail/calculate-product-invoice-totals', {
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
export function calculateTotalByProductStartingWithOR() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order-detail/calculate-total-by-product-starting-with-o-r', {
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
export function calculateTotalByProduct() {
    const token = sessionStorage.getItem('jwtToken'); 
    fetch('http://localhost:8080/order-detail/calculate-total-by-product', {
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
