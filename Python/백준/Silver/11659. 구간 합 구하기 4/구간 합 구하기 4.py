import sys
N,M = map(int,sys.stdin.readline().split())
arr = list(map(int,sys.stdin.readline().split()))

arr_s = [0 for i in range(len(arr)+1)] #구간 합 배열

for i in range(1,len(arr_s)):
    arr_s[i] = arr_s[i-1] + arr[i-1]

query = []
for q in range(M):
    i, j = map(int,sys.stdin.readline().split())
    sys.stdout.write(str(arr_s[j] - arr_s[i-1])+"\n")