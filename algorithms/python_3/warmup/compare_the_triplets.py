#!/bin/python3

import sys

def solve(a0, a1, a2, b0, b1, b2):
    # Complete this function
    a_point = 0
    b_point = 0
    # compare a0 & b0
    if (a0 > b0):
        a_point += 1
    elif (a0 < b0):
        b_point += 1
    # compare a1 & b1
    if (a1 > b1):
        a_point += 1
    elif (a1 < b1):
        b_point += 1
    # compare a2 & b2
    if (a2 > b2):
        a_point += 1
    elif (a2 < b2):
        b_point += 1

    return [a_point, b_point]

a0, a1, a2 = input().strip().split(' ')
a0, a1, a2 = [int(a0), int(a1), int(a2)]
b0, b1, b2 = input().strip().split(' ')
b0, b1, b2 = [int(b0), int(b1), int(b2)]
result = solve(a0, a1, a2, b0, b1, b2)
print (" ".join(map(str, result)))