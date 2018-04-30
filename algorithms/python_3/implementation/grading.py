#!/bin/python3

import os
import sys

def roundGrade(grade):
    if grade % 5 >= 3:
        grade = ((grade // 5) + 1) * 5
    return grade

def gradingStudents(grades):
    for i in range(len(grades)):
        if grades[i] >= 38:
            grades[i] = roundGrade(grades[i])

    return grades

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    grades = []

    for _ in range(n):
        grades_item = int(input())
        grades.append(grades_item)

    result = gradingStudents(grades)

    f.write('\n'.join(map(str, result)))
    f.write('\n')

    f.close()
