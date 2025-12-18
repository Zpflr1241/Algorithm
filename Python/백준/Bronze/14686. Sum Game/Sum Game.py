N = int(input())
arr1 = list(map(int,input().split()))
arr2 = list(map(int,input().split()))
K = 0
s1 = 0
s2 = 0
for i in range(N):
    s1 += arr1[i]
    s2 += arr2[i]
    if s1 == s2:
        K = i+1
print(K)