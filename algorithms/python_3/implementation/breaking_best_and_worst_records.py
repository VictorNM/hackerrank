#!/bin/python3

import os
import sys

#
# Complete the breakingRecords function below.
#
def breakingRecords(score):
    min_score = max_score = score[0]
    break_min = break_max = 0
    for s in score[1:]:
        if s < min_score:
            break_min += 1
            min_score = s
        elif s > max_score:
            break_max += 1
            max_score = s
            
    return break_max, break_min

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    score = list(map(int, input().rstrip().split()))

    result = breakingRecords(score)

    f.write(' '.join(map(str, result)))
    f.write('\n')

    f.close()
