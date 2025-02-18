let counter = 0;
const counterDisplay = document.getElementById('counter');

const updateCounterColor = () => {
    if (counter > 0) {
        counterDisplay.style.color = 'green';
    } else if (counter === 0) {
        counterDisplay.style.color = '#333333';
    } else {
        counterDisplay.style.color = 'red';
    }
};

const increase = () => {
    counter++;
    counterDisplay.textContent = counter;
    updateCounterColor();
};
const nextBtn = document.querySelector(".nextBtn");
nextBtn.addEventListener("click", increase);

const decrease = () => {
    counter--;
    counterDisplay.textContent = counter;
    updateCounterColor();
};
const prevBtn = document.querySelector(".prevBtn");
prevBtn.addEventListener("click", decrease);




