var head = document.querySelector('h1');
head.textContent = "Hello wrold!";

var image = document.querySelector("img");
image.onclick = function() {
    var src = image.getAttribute('src');
    if (src === 'images/firefox-icon.png') {
        image.setAttribute('src', 'images/mozilla.jpg')
    } else {
        image.setAttribute('src', 'images/firefox-icon.png')
    }
}

var button = document.querySelector('button')
button.onclick = function() {
    var name = prompt('Please enter your name')
    head.textContent = 'Hello ' + name;
}
