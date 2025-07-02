print("Welcome to the MBTI Personality Test!")
print("Please answer the following 20 questions with 'A' or 'B' only.\n")

questions = [
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
]

a_count = 0
b_count = 0

for question in questions:
    while True:
        answer = input(question + "\nYour answer (A/B): ")
        if answer.upper() == "A":
            a_count += 1
            break
        elif answer.upper() == "B":
            b_count += 1
            break
        else:
            print("Please enter only 'A' or 'B'.")

if a_count > b_count:
    personality = "ESTJ"
    description = "Extroverted, Sensing, Thinking, Judging"
else:
    personality = "INFP"
    description = "Introverted, Intuitive, Feeling, Perceiving"

print("\n--- Test Complete ---")
print(f"You chose A {a_count} times.")
print(f"You chose B {b_count} times.")
print(f"Note: Your result is {personality} ({description}).")
