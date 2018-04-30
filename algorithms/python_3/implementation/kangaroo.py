#!/bin/python3

import sys

def kangaroo(x1, v1, x2, v2):
	# find a (a > 0, a is an integer)
	# 		x1 + a * v1 = x2 + a * v2
	# <=>	a * v1 - a * v2 = x2 - x1
	# <=>	a * (v1 - v2) = x2 - x1
	# <=>	a = (x2 - x1) // (v1 - v2)

	# Because x2 > x1 (always) => (a > 0 <=> v1 > v2)
	if v1 - v2 <= 0:
		return 'NO'

	a = (x2 - x1) // (v1 - v2)
	if a != (x2 - x1) / (v1 - v2):	# not integer
		return 'NO'

	return 'YES'

x1, v1, x2, v2 = input().strip().split(' ')
x1, v1, x2, v2 = [int(x1), int(v1), int(x2), int(v2)]
result = kangaroo(x1, v1, x2, v2)
print(result)
