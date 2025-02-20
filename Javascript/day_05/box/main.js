// let colors = [
//     '#3498db',
//     '#9b59b6',
//     '#e74c3c',
//     '#2c3e50',
//     '#d35400',
// ];

// const btn = document.getElementById("btn");
// const boxesContainer = document.querySelector(".boxes");
// const points = document.querySelector(".points");
// let count = 0;

// const renderBoxes = (number) => {
//     const newBoxes = [];
//     colors.forEach((color, index) => {
//         if (index < number) {
//             const box = document.createElement("div");
//             box.classList.add("box");
//             box.style.backgroundColor = color;
//             box.addEventListener("click", () => {
//                 box.remove(); 
//                 count--;
//                 points.textContent = count;     
//             });
//             newBoxes.push(box);
//         }
//     });
//     newBoxes.forEach(box => boxesContainer.appendChild(box));
//     count += newBoxes.length;
//     points.textContent = count;
// };
// renderBoxes(5);


// btn.addEventListener("click", () => {
//     renderBoxes(5);
// });
const defaultColors = ['#3498db', '#9b59b6', '#e74c3c', '#2c3e50', '#d35400'];
let colors = defaultColors.slice();

const btn = document.querySelector("#btn");
const points = document.querySelector(".points");
const boxes = document.querySelector(".boxes");

const renderBoxes = (colors) => {
    let html = "";
    colors.forEach((color, index) => {
        html += `<div 
                    class="box" 
                    style="background-color: ${color}"
                    onclick="removeBox(${index})"
                ></div>`;
    });
    boxes.innerHTML = html;

    // Update total boxes
    points.innerHTML = colors.length;
}

// Xóa box
const removeBox = (index) => {
    colors.splice(index, 1);
    renderBoxes(colors);
}

// Thêm box
btn.addEventListener("click", () => {
    colors = colors.concat(defaultColors);
    renderBoxes(colors);
})

// Vừa vào trang thì hiển thị danh sách box ban đầu
renderBoxes(colors);