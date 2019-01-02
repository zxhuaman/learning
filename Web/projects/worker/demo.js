self.onmessage = function (ev) {
    let count = ev.data;
    setInterval(() => {
        count += 1;
        self.postMessage(count);
    }, 1000);
}