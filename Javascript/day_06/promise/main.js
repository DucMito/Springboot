const doTask = (name, time, isOk) => {
    console.log("Thực hiện công việc: " + name);
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (isOk) {
                resolve("Hoàn thành công việc: " + name);
            } else {
                reject("Không thể hoàn thành công việc: " + name);
            }
        }, time);
    });
};

// th1: Các công việc liên quan đến nhau
doTask("Nhặt rau", 3000, true)
    .then(rs => {
        console.log(rs);
        return doTask("Rửa rau", 2000, true);
    })
    .then(rs => {
        console.log(rs);
        return doTask("Luộc rau", 4000, true);
    })
    .then(rs => {
        console.log(rs);
    })
    .catch(err => {
        console.log(err);
    })


    //th2: các tác vụ không liên quan đến nhau
    Promise.all([
        doTask("Ăn cơm", 2000, false),
        doTask("Học bài", 2500, true),
        doTask("Lướt face", 3000, true)
    ])
        .then((values) => {
            console.log(values);
        })
        .catch( err => {
            console.log(err);
        })