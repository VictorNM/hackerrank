#!/bin/python3

import os
import sys

#
# Complete the timeConversion function below.
#
def timeConversion(s):
    am_pm, time = s[-2:], s[:-2].split(':')
    hour = int(time[0])     # only need to care about hour
    if am_pm == 'AM' and hour == 12:
        time[0] = '00'
    if am_pm == 'PM' and hour != 12:
        time[0] = str(hour + 12)
    return ':'.join(time)

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    f.write(result + '\n')

    f.close()
