const quizes = [
    {
        id: 1,
        question: "1 + 1 = ?",
        answers: [1, 2, 3, 4],
    },
    {
        id: 2,
        question: "2 + 2 = ?",
        answers: [2, 3, 4, 5],
    },
    {
        id: 3,
        question: "3 + 3 = ?",
        answers: [3, 4, 5, 6],
    },
];

document.getElementById("btn").addEventListener("click", function () {
    document.querySelectorAll(".quiz-item").forEach((questionElement, index) => {
        const answers = questionElement.querySelectorAll("input[type='radio']");
        if (answers.length > 0) {
            const randomIndex = Math.floor(Math.random() * answers.length);
            answers[randomIndex].checked = true;
        }
    });
});
