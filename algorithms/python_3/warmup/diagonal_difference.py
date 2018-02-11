#!/bin/python3

import sys

def diagonalDifference(a):
    # Complete this function
    dimen = len(a)
    sum_1 = 0
    sum_2 = 0
    for i in range(dimen):
        sum_1 += a[i][i]
        sum_2 += a[i][dimen - 1 - i]
    return abs(sum_1 - sum_2)

if __name__ == "__main__":
    n = int(input().strip())
    a = []
    for a_i in range(n):
       a_t = [int(a_temp) for a_temp in input().strip().split(' ')]
       a.append(a_t)
    result = diagonalDifference(a)
    print(result)
