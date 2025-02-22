const doTask = (name, time, cb) => {
    console.log("Thuc hien cong viec: " + name);
    setTimeout(() => {
        cb();
    }, time);
};

const finish = () => {
    console.log("Ket thuc cong viec");
}

//th1: các tác vụ liên quan đến nhau
console.log("Start");
doTask("Nhặt rau", 3000, () =>{
    doTask("Rửa rau", 4000, () => {
        doTask("Luộc rau", 2000, finish);
    })
})

console.log("End");

//th2: các tác vụ không liên quan đến nhau
console.log("Start");
doTask("Lướt face", 3000, ()=> {
    console.log("lướt xong");
});

doTask("Ăn cơm", 2000, ()=> {
    console.log("ăn cơm xong");
});

doTask("Học bài", 2500, () => {
    console.log("học bài xong");
});

console.log("end");