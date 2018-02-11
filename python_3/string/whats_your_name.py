def print_full_name(a, b):
    print("Hello %s %s! You just delved into python." %(a, b))

# another solution
# def print_full_name(a, b):
#     print("Hello {0} {1}! You just delved into python.".format(a, b))

if __name__ == '__main__':
	firstname = input()
	lastname = input()
	print_full_name(firstname, lastname)