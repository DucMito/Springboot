console.log("Hello world");

// alert("Hello world");

// document.write("Hello world");

let age = 20;

let year = 2003;


let fullname = "Duc";
console.log(`Xin chao, minh ${fullname} sinh nam ${year}`);



// function
function sum(a, b) {
    return a +b ;
}

console.log(sum(10,20));

// function experesstion -> first-class function
const sum1 = function(a, b) {
    return a +b;
}

console.log(sum(30,40));

//c3: arrow function (ES6) - lambra expresstion java 8(giong cu phap)
const sum2 = (a,b) => {
    return a + b;
}

// const sum3 = (a,b) => a + b;

console.log(sum2(30,40));
