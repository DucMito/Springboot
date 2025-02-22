const btn = document.getElementById('btn');
const image = document.getElementById('image');
const select = document.getElementById('breed-list');

// Gọi API để lấy danh sách 
async function getBreedList() {
    try {
        let res = await axios.get("https://dog.ceo/api/breeds/list/all");
        renderBreed(res.data.message);
    } catch (error) {
        console.error("Lỗi khi lấy danh sách loài chó:", error);
    }
}

// Hiển thị danh sách trong thẻ select
function renderBreed(breeds) {
    select.innerHTML = '<option value="">Chọn giống chó</option>';
    Object.keys(breeds).forEach(breed => {
        let option = document.createElement('option');
        option.value = breed;
        option.textContent = breed.charAt(0).toUpperCase() + breed.slice(1);
        select.appendChild(option);
    });
}

// Gọi API để lấy hình ảnh đã chọn
async function getDogImage() {
    let breed = select.value;
    if (!breed) {
        alert("Vui lòng chọn một loài!");
        return;
    }
    try {
        let res = await axios.get(`https://dog.ceo/api/breed/${breed}/images/random`);
        image.src = res.data.message;
    } catch (error) {
        console.error("Lỗi khi lấy hình ảnh:", error);
    }
}

btn.addEventListener('click', getDogImage);

getBreedList();
