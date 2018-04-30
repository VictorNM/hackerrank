#!/bin/python3

import os
import sys

# greatest common division
def gcd(a, b = None):
    # gcd for 2 integers
    if b is not None:
        while b != 0:
            t = b; 
            b = a % b; 
            a = t;
        return a;
    
    # gcd for an array of integers
    res = a[0]
    for i in a[1:]:
        res = gcd(i, res)
    return res

# least common multiple
def lcm(a, b = None):
    # lcm of 2 integer
    if b is not None:
        return (a*b)/gcd(a,b)
    
    # lcm of an array of integers
    res = a[0]
    for i in a[1:]:
        res = res * i / gcd(res,i)
    return res

def getTotalX(a, b):
	# Idea:
	# number t satisfy 2 conditions:
	# - t % lcm(a) == 0
	# - gcd(b) % t == 0
    lcm_a = lcm(a)
    gcd_b = gcd(b)
    i = 1
    count = 0
    t = lcm_a * i
    while t <= gcd_b:
        if gcd_b % t == 0: count += 1
        i += 1        
        t = lcm_a * i

    return count

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    a = list(map(int, input().rstrip().split()))

    b = list(map(int, input().rstrip().split()))

    total = getTotalX(a, b)

    f.write(str(total) + '\n')

    f.close()
