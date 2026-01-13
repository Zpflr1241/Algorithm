arr = [i for i in range(0,21)]
for _ in range(10):
    min_i, max_i = map(int, input().split(" "))
    arr[min_i:max_i+1] = arr[max_i:min_i-1:-1]
print(*arr[1:21])