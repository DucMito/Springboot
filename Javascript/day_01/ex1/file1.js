//Bài 1: Viết function truyền vào 1 số nguyên dường. Tính giai thừa của số đó
function calculateFactorial(number) {
    if (number < 0) {
        return "Nhap so lon hon 0.";
    }
    let factorial = 1;
    for (let i = 1; i <= number;i++) {
        factorial *= i;
    }
    return factorial;
}
console.log("Factorial of 3:", calculateFactorial(3));

//Bài 2: Viết function truyền vào 1 chuỗi. In ra chuỗi đảo ngược của chuỗi đó
function reverseString(str) {
    return str.split('').reverse().join('');
}

console.log("Reversed string 'hello':", reverseString('hello'));

// Bai 3: Viết function truyền vào mã quốc gia. 
function translate(countryCode) {
    switch (countryCode.toUpperCase()) {
        case 'VN':
            return "Xin chào";
        case 'EN':
            return "Hello";
        default:
            return "chi co vn or en";
    }
}

console.log("Greeting for 'VN':", translate('VN'));
console.log("Greeting for 'EN':", translate('EN'));

// Bài 4: Cho function truyền vào 1 chuỗi dài hơn 15 ký tự. Viết 1 function cắt chuỗi, lấy ra 10 ký tự đầu tiên và thêm vào dấu “…” ở cuối chuỗi.
function subString(str) {
    if (str.length > 15) {
        return str.slice(0, 10) + '...';
    }
    return str;
}

console.log("Substring 'xinchaocacbandenvoiTechmaster':", subString("xinchaocacbandenvoiTechmaster"));
