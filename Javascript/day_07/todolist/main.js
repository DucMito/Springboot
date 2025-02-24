// Tạo mảng todos (mockup data)
const API_URL = "http://localhost:8000/todos"
let todos = [];
// Lấy danh sách từ server
const getAllTodos = async () => {
    try{
        let res = await axios.get(API_URL);
        console.log(res);

        todos = res.data;
        renderTodos(todos);
    }catch(error){
        console.log(error);
    }
};



// Hiển thị danh sách todo ra ngoài giao diện
const ul = document.querySelector("ul");
const renderTodos = (todos) => {
    if (todos.length === 0) {
        ul.innerHTML = "<li>Danh sách công việc trống</li>";
        return;
    }

    let html = "";
    todos.forEach(todo => {
        html += `
            <li>
                <input 
                    type="checkbox" 
                    ${todo.status ? "checked" : ""}
                    onchange="toggleStatus(${todo.id})"
                />
                <span class=${todo.status ? "active" : ""}>${todo.name}</span>
                <button onclick="editTodo(${todo.id})">Edit</button> <!-- Sửa sự kiện Edit -->
                <button onclick="deleteTodo(${todo.id})">Delete</button>
            </li>
        `;
    });
    ul.innerHTML = html;
}

// Chức năng xóa todo
const deleteTodo = (id) => {
    const isConfirm = window.confirm("Bạn muốn xóa không?");
    if(!isConfirm) return;

    const index = todos.findIndex(todo => todo.id === id);
    todos.splice(index, 1);
    renderTodos(todos);
};

// Chức năng status change
const toggleStatus = (id) => {
    const todo = todos.find(todo => todo.id === id);
    todo.status = !todo.status;
    renderTodos(todos);
};

// Chức năng add
const inputTodo = document.querySelector("#input-todo");
const btnAdd = document.querySelector("#btn-add");
const addTodo = () => {
    const newTodoName = inputTodo.value.trim(); 
    if (newTodoName === "") {
        alert("Vui lòng nhập tên công việc.");
        return;
    }

    const newTodo = {
        id: Date.now(),
        name: newTodoName,
        status: false,
    };
    todos.push(newTodo);
    inputTodo.value = "";
    renderTodos(todos);
};

// Chức năng edit
const editTodo = (id) => {
    const todo = todos.find(todo => todo.id === id);
    const newName = prompt("Sửa tên công việc:", todo.name);

    if (newName && newName.trim() !== "") {
        todo.name = newName.trim();
        renderTodos(todos);
    }
};

btnAdd.addEventListener("click", addTodo);

// Render ban đầu
getAllTodos();




