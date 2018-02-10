if __name__ == '__main__':
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])
    students_without_lowest_students = [student for student in students
                                        if student[1] != min(students, key = lambda s:s[1])[1]]
    second_lowest_students = [student for student in students_without_lowest_students
                              if student[1] == min(students_without_lowest_students, key = lambda s:s[1])[1]]
    second_lowest_students.sort()

    for student in second_lowest_students:
    	print(student[0])