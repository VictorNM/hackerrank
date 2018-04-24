#!/bin/python3

import os
import sys

#
# Complete the plusMinus function below.
#
def plusMinus(arr):
    pos = sum(1 for i in arr if i > 0)
    neg = sum(1 for i in arr if i < 0)
    zer = sum(1 for i in arr if i == 0)
    print(pos / len(arr))
    print(neg / len(arr))
    print(zer / len(arr))

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)