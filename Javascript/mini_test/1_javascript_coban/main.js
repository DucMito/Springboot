// Bài 1: Hàm tìm các chuỗi có độ dài lớn nhất
function getStringMaxLength(arr) {
    if (!Array.isArray(arr)) {
        console.log("Nhập 1 mảng !!");
        return [];
    }
    if (arr.length === 0) {
        console.log("Mảng trống !!");
        return [];
    }
    let maxLength = Math.max(...arr.map(str => str.length));
    return arr.filter(str => str.length === maxLength);
}

console.log(getStringMaxLength(['aba', 'aa', 'ad', 'c', 'vcd']));

// Bài 2: Cho mảng users
const users = [
    { name: "Bùi Công Sơn", age: 30, isStatus: true },
    { name: "Nguyễn Thu Hằng", age: 27, isStatus: false },
    { name: "Phạm Văn Dũng", age: 20, isStatus: false }
];

// Hàm lọc user có age > 25 và isStatus = true
function filterUsers(users) {
    if (!Array.isArray(users)) {
        console.log("Nhập 1 mảng !!");
        return [];
    }
    return users.filter(user => user.age > 25 && user.isStatus);
}

console.log(filterUsers(users));

// Hàm sắp xếp user theo age tăng dần
function sortUsersByAge(users) {
    if (!Array.isArray(users)) {
        console.log("Nhập 1 mảng !!");
        return [];
    }
    return users.slice().sort((a, b) => a.age - b.age);
}

console.log(sortUsersByAge(users));

// Bài 3: Hàm đếm số lần xuất hiện của các phần tử trong mảng
function getCountElement(arr) {
    if (!Array.isArray(arr)) {
        console.log("Nhập 1 mảng !!");
        return {};
    }
    return arr.reduce((acc, item) => {
        acc[item] = (acc[item] || 0) + 1;
        return acc;
    }, {});
}

console.log(getCountElement(["one", "two", "three", "one", "one", "three"]));
