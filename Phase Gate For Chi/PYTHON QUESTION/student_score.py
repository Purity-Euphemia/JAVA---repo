student_number = int(input("How many students? "))
subject_number = int(input("How many subjects? "))

for count in range(1, student_number + 1):
    print(f"\nWhat is the name of student {count}?")
    name = input("Enter student name: ")

    student_total = 0

    for counter in range(1, subject_number + 1):
        subject_name = input(f"Enter name of subject {counter}: ")
        score = float(input(f"Enter score for {subject_name} (0-100): "))
        student_total = student_total + score

    average = student_total / subject_number

    print("Name:", name)
    print("Total Score:", student_total)
    print("Average:", average)
    print("===========================")