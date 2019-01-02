
const count = document.getElementsByClassName('count')[0];
const worker = new Worker('demo.js');
let c = 0;
worker.onmessage = function (ev) {
    count.innerText = ev.data;
}

document.getElementsByClassName('start')[0].addEventListener('click', ev => {
    worker.postMessage(c);
});

document.getElementsByClassName('stop')[0].addEventListener('click', ev => {
    worker.terminate();
});