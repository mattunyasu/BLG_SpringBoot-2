window.addEventListener('DOMContentLoaded', function() {
    var items = [
        {
            name: '鉛筆',
            price: 500,
            quantity: 0
        },
        {
            name: 'ノート',
            price: 5000,
            quantity: 0
        },
        {
            name: '消しゴム',
            price: 500,
            quantity: 0
        }
    ];

    var app = new Vue({
        el: '#app',
        data: {
            items: items
        }
    });
})
