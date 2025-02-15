//Bai 1: find max
function findMax(arr) {
    return Math.max(...arr);
}
console.log(findMax([4, 2, 5, 10, 2, 8]));


//Bai 2: find min
function findMin(array) {
    return Math.min(...array);
}

console.log(findMin([1,4,6,7,8]));


//Bài 3:Mảng số dư
function getRemainders(arr) {
    return arr.map(num => num % 2);
}
const input = [4, 2, 5, 6, 2, 7];
const remainders = getRemainders(input);
console.log("số dư:", remainders);

//Bài 4: Viết function truyền vào 1 chuỗi, hãy sao chép đó chuỗi lên 10 lần
function repeatString1(string) {
    return Array(10).fill(string).join('');
}
console.log(repeatString1('a'));

//Bài 5: Viết function truyền vào 1 chuỗi, hãy sao chép đó chuỗi lên 10 lần, ngăn cách nhau bởi dấu gạch ngang
function repeatString2(string) {
    return Array(10).fill(string).join('-');
}
console.log(repeatString2('a'));

//Bài 6: Viết function truyền vào 1 chuỗi, kiểm tra xem chuỗi đó có phải chuỗi đối xứng hay không (chuỗi đối xứng là chuỗi đọc xuôi 
// hay ngược đều như nhau, không tính khoảng trắng, không phân biệt hoa thường), kết quả trả về true hoặc false.
function isSymmetricString(string) {
    const clean = string.replace(/\s+/g, '').toLowerCase();
    const reversedString = clean.split('').reverse().join('');
    return clean === reversedString;
}
console.log(isSymmetricString('123321'));
console.log(isSymmetricString('hello'));

//Bai 7:Viết function truyền vào 1 số nguyên, hãy sắp xếp lại các chữ số trong số nguyên đó sao cho ra 1 số nhỏ nhất có thể 
// (không tính số 0 đầu tiên).
function sortNumberDigitsMinToMax(number){

}


console.log(sortNumberDigitsMinToMax(53751));
console.log(sortNumberDigitsMinToMax(14350));
console.log(sortNumberDigitsMinToMax(203950));

