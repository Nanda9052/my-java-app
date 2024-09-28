document.getElementById('fetch').addEventListener('click', function() {
    fetch('/middleware/hello')
        .then(response => response.text())
        .then(data => {
            document.getElementById('message').innerText = data;
        });
});
