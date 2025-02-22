// 1.Truy cập vào thẻ h1 có id=“heading” thay đổi màu chữ thành ‘red’, và in hoa nội dung của thẻ đó
// const heading = document.getElementById("heading");
// console.log(heading);

// const heading2 = document.querySelector("#heading");
// console.log(heading2);


// const heading3 = document.querySelector("h1");
// console.log(heading3);

// const heading4 = document.querySelector("h1:nth-child(1)");
// console.log(heading4);

// heading.style.color = "red";
// heading.style.textTransform = "uppercase";

const heading = document.getElementById("heading");
heading.style.color = "red";
heading.style.textTransform = "uppercase";


// 2.Thay đổi màu chữ của tất cả thẻ có class “para” thành màu “blue” và có font-size = “20px”
// const paraList = document.querySelectorAll("p.para");
// console.log(paraList);

//c1: paraList.forEach((para) => {

//     para.style.color = "blue";
//     para.style.fontSize = "20px";
// });

// c2: Array.from(paraList).map((para) => {
//     para.style.color = "blue";
//     para.style.fontSize = "20px";
// });

const paraList = document.querySelectorAll(".para");
paraList.forEach((para) => {
    para.style.color = "blue";
    para.style.fontSize = "20px";
});

// 3.Thêm thẻ a link đến trang ‘facebook’ ở đằng sau thẻ có class “para-3”
// const link = document.createElement("a");
// link.href="https://www.facebook.com/";
// link.innerHTML = "<b>Facebook</b>";
// console.log(link);



// const content = document.querySelector(".content");
// document.body.insertBefore(link, content);

// const link = document.createElement("a");
// link.href = "https://www.facebook.com/";
// link.innerHTML = "<b>Facebook</b>";

// const content = document.querySelector(".content");
// document.body.insertBefore(link, content);




// 4.Thay đổi nội dung của thẻ có id=“title” thành “Đây là thẻ tiêu đề”
// const title = document.getElementById("title");
// title.innerText = "Đây là thẻ tiêu đề";

// 

// 5.Thêm class “text-bold” vào thẻ có class=“description” (định nghĩa class “text-bold” có tác dụng in đậm chữ)
// const desription = document.querySelector(".description");
// desription.classList.add("text-bold", "abc", "xyz");
// desription.classList.remove("abc", "xyz");

// console.log(desription.classList.contains("abc"));
// console.log(desription.classList.contains("text-bold"));

// setInterval(() => {
//     desription.classList.toggle("text-bold");
// }, 1000); //1000ms = 1s





// 6.Thay thế thẻ có class=“para-3” thành thẻ button có nội dung là “Click me”
// const btn = document.createElement("button");
// btn.innerHTML = "Click me";
// console.log(btn);

// const p3 = document.querySelector(".para-3"); // Đổi từ getElementById sang querySelector
// if (p3) { // Kiểm tra nếu p3 tồn tại
//     document.body.replaceChild(btn, p3);
// } else {
//     console.error("Không tìm thấy phần tử có class 'para-3'");
// }



// 7.Copy thẻ có class=“para-2” và hiển thị ngay đằng sau thẻ đó
// const p2 = document.querySelector(".para-2");
// const p2Copy = p2.cloneNode(true);
// document.body.insertBefore(p2Copy, btn);




// 8.Xóa thẻ có class=“para-1”
// const p1 = document.querySelector(".para-1");
// // document.body.removeChild(p1);
// p1.remove(".para-1");


// Thực hành: cho 1 aray có cấu trúc như sau: 
// const socials = [
//     {id: 1, name: 'Facebook', url: 'https://www.facebook.com/'},
//     {id: 2, name: 'Instagram', url: 'https://www.instagram.com/'},
//     {id: 1, name: 'Youtube', url: 'https://www.youtube.com/'},
// ]


const socials = [
    {id: 1, name: 'Facebook', url: 'https://facebook.com'},
    {id: 2, name: 'Instagram', url: 'https://instagram.com'},
    {id: 3, name: 'Twitter', url: 'https://twitter.com'},
];

//c1: 
// const ul = document.createElement("ul");
// socials.forEach((social) => {
//     const li = document.createElement("li");
//     const a = document.createElement("a");
//     a.innerHTML = social.name;
//     a.href = social.url;
//     li.appendChild(a);
//     ul.appendChild(li);
// });
// console.log(ul);

// const div = document.createElement("div");
// div.classList.add("socials");

// div.appendChild(ul);
// document.body.appendChild(div);



//c2: 
let html = "";
socials.forEach((social) => {
    html += `<li> <a href = ${social.url}> ${social.name}</a></li>`;
});
console.log(html);

let div = `
    <div class = "socials">
        <ul>
            ${html}
        </ul>
    </div>
`

btn.insertAdjacentHTML("beforebegin", div)
