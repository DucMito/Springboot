//c1: Html- attribute
const sayHello = () => {
    alert("Xin chao cac ban 1");
};

//C2: DOM property
const sayHello2 = () => {
    alert("Xin chao cac ban 2");
};

const btn2 = document.getElementById("btn2");
btn2.onclick = sayHello2;

//C3: Method addEventListener
const btn3 = document.getElementById("btn3");
const sayHello3 = () => {
    alert("Xin chao cac ban 3");
};

btn3.addEventListener("click", sayHello3);