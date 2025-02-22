 const doTassk = (name, time, isOk) => {
    console.log("Thục hiện công việc " + name);
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if(isOk) {
                console.log("Hoàn thành công việc " + name);
            }else {
                console.log("Không hoàn thành công việc : " + name);
            }
        }, time);
    });
 };

 const handleTask = async () => {
    try{
        let rs = await doTassk("Nhặt rau", 3000, true)
        console.log(rs);

        let rs1 = await doTassk("Rửa rau", 2000, true)
        console.log(rs1);

        let rs2 = await doTassk("Luộc rau", 1000, true);
        console.log(rs2);
    }catch(err) {
        console.log(err);
    }
 };

 handleTask();

