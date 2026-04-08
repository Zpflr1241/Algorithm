n = int(input())
arr = list(map(int, input().split()))
key = max(arr)
for i in range(n):
    if arr[i] == 0:
        continue

    arr[i] = arr[i]/key*100
print(sum(arr)/n)