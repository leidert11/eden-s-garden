//1 Función para la consulta de productos ornamentales en stock
export function getOrnamentalProductsInStock() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/product/get-ornamental-products-in-stock', {
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

//2 Función para la consulta de productos que no están en ninguna orden
export function getProductsAreNotInAnyOrder() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/product/products-are-not-in-any-order', {
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

//3 Función para la consulta de productos que no están en ninguna orden (forma alternativa)
export function getProductsAreNotInAnyOrderNDI() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/product/products-are-not-in-any-order-n-d-i', {
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

// 4 Función para la consulta de precio máximo y mínimo de productos
export function findMaxAndMinPrice() {
    const token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/product/find-max-and-min-price', {
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