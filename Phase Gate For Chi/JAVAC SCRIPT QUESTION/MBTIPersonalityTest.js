const prompt = require('prompt-sync')();

const questions = [
  "1. Do you enjoy being around people? (A) Yes (B) No",
  "2. Do you prefer facts over ideas? (A) Yes (B) No",
  "3. Are you guided by logic more than emotions? (A) Yes (B) No",
  "4. Do you like to have a plan rather than being spontaneous? (A) Yes (B) No",
  "5. Do you find it easy to make new friends? (A) Yes (B) No",
  "6. Do you enjoy solving problems more than talking about them? (A) Yes (B) No",
  "7. Are you more practical than imaginative? (A) Yes (B) No",
  "8. Do you usually stick to deadlines? (A) Yes (B) No",
  "9. Do you enjoy group activities? (A) Yes (B) No",
  "10. Do you prefer real things to ideas? (A) Yes (B) No",
  "11. Are you more critical than forgiving? (A) Yes (B) No",
  "12. Do you prefer routines over surprises? (A) Yes (B) No",
  "13. Do you talk more than you listen? (A) Yes (B) No",
  "14. Do you trust facts more than feelings? (A) Yes (B) No",
  "15. Are you more serious than playful? (A) Yes (B) No",
  "16. Do you like to finish tasks before relaxing? (A) Yes (B) No",
  "17. Do you make decisions quickly? (A) Yes (B) No",
  "18. Do you enjoy being the center of attention? (A) Yes (B) No",
  "19. Do you follow rules closely? (A) Yes (B) No",
  "20. Do you prefer to work alone? (A) Yes (B) No"
];

let aCount = 0;
let bCount = 0;

console.log("Welcome to the MBTI Personality Test!");
console.log("Please answer the following questions with 'A' or 'B'.\n");

for (let count = 0; count < questions.length; count++) {
  while (true) {
    console.log(questions[count]);
    let answer = prompt("Your answer (A/B): ");
    if (answer === "A" || answer === "a") {
      aCount++;
      break;
    } else if (answer === "B" || answer === "b") {
      bCount++;
      break;
    } else {
      console.log("Please enter only 'A' or 'B'.");
    }
  }
}

let personality, description;

if (aCount > bCount) {
  personality = "ESTJ";
  description = "Extroverted, Sensing, Thinking, Judging";
} else {
  personality = "INFP";
  description = "Introverted, Intuitive, Feeling, Perceiving";
}

console.log("\n--- Test Complete ---");
console.log("You chose A " + aCount + " times.");
console.log("You chose B " + bCount + " times.");
console.log("Your result: " + personality);
console.log(description);
