const prompt = require("prompt-sync")();

let studentNumber = Number(prompt("How many students? "));
let subjectNumber = Number(prompt("How many subjects? "));

for (let count = 1; count <= studentNumber; count++) {
    console.log("What is the name of student " + count + "?");
    let name = prompt("Enter student name: ");

    let studentTotal = 0;

    for (let counter = 1; counter <= subjectNumber; counter++) {
        let subjectName = prompt("Enter name of subject " + counter + ": ");
        let score = Number(prompt("Enter score for ${subjectName} (0-100): "));
        studentTotal = studentTotal + score;
    }

    let average = studentTotal / subjectNumber;

    console.log("Name: " + name);
    console.log("Total Score: " + studentTotal);
    console.log("Average: " + average);
    console.log("==========================");
}