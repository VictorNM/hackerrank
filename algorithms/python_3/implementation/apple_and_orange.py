#!/bin/python3

import os
import sys

#
# Complete the countApplesAndOranges function below.
#
def isOnSamsHouse(s, t, x):
    return (x >= s and x <= t)

def countApplesAndOranges(s, t, a, b, apples, oranges):
    appleOnSamsHouse = sum(1
                          for d in apples
                          if isOnSamsHouse(s, t, a + d))
    print(appleOnSamsHouse)
    
    orangeOnSamsHouse = sum(1
                           for d in oranges
                           if isOnSamsHouse(s, t, b + d))
    print(orangeOnSamsHouse)

if __name__ == '__main__':
    st = input().split()

    s = int(st[0])

    t = int(st[1])

    ab = input().split()

    a = int(ab[0])

    b = int(ab[1])

    mn = input().split()

    m = int(mn[0])

    n = int(mn[1])

    apple = list(map(int, input().rstrip().split()))

    orange = list(map(int, input().rstrip().split()))

    countApplesAndOranges(s, t, a, b, apple, orange)
