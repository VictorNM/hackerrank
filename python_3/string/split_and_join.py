def split_and_join(line):
    # write your code here
    word_list = line.split(" ")
    return "-".join(word_list)

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(line)
    print(result)