size = int(input())
numbers = list(map(int, input().split()))
weights = list(map(int, input().split()))

mean =  sum(x[0] * x[1] for x in zip(numbers, weights)) / sum(weights)
print("%.1f" % mean)