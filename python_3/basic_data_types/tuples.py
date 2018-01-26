if __name__ == '__main__':
    n = int(input())
    integer_list = list(map(int, input().split()))	# see more: https://stackoverflow.com/questions/6800481/python-map-object-is-not-subscriptable
    t = tuple(integer_list)							# see more: https://docs.python.org/3/library/stdtypes.html#tuple
    print(hash(t))									# see more: https://docs.python.org/3/library/functions.html#hash