if __name__ == '__main__':
    N = int(input())
    arr = []
    for i in range(0,N):
        command = str(input()).split()	# create list of input words
        if command[0] == "print":
            print(arr)
        elif command[0] == "sort":
            arr.sort()
        elif command[0] == "pop":
            arr.pop()
        elif command[0] == "reverse":
            arr.reverse()
        elif command[0] == "insert":
            arr.insert(int(command[1]), int(command[2]))
        elif command[0] == "remove":
            arr.remove(int(command[1]))
        elif command[0] == "append":
            arr.append(int(command[1]))

'''
Sample input:
12
insert 0 5
insert 1 10
insert 0 6
print 
remove 6
append 9
append 1
sort 
print
pop
reverse
print

Sample output:
[6, 5, 10]
[1, 5, 9, 10]
[9, 5, 1]
'''