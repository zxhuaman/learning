var number = Number(Math.floor(Math.random()*100+1))
console.log("number is " + number)

var submit = document.getElementById('submit');
var guessFiled = document.getElementById('guessFiled');
var previous = document.getElementById('previous');
var result = document.getElementById('result');
var tip = document.getElementById('tip');

function update() {
    var guessNumber = guessFiled.value;
    if (number > guessNumber) {
        previous.innerHTML = "Previous guesses: " + guessNumber;
        result.innerHTML = "Wrong!"
        result.style.backgroundColor = 'red';
        tip.innerHTML = "Last guess was too low!";
    } else if (number < guessNumber) {
        previous.innerHTML = "Previous guesses: " + guessNumber;
        result.innerHTML = "Wrong!"
        result.style.backgroundColor = 'red';
        tip.innerHTML = "Last guess was too hight!";
    } else {
        result.innerHTML = "Right!"
        tip.innerHTML = "";
    }
}

submit.onclick = update;