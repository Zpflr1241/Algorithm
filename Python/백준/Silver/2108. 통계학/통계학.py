import sys

n = int(sys.stdin.readline())
arr = [int(sys.stdin.readline()) for _ in range(n)] # 수들이 담길 배열
arr = sorted(arr)
count_arr = [0 for _ in range(abs(arr[0]-arr[n-1])+1)] # 최솟값부터 최댓값까지 개수를 셀 배열(0포함)

for num in arr:
    count_arr[num+arr[0]*(-1)] += 1 # -1을 곱하여 부호를 반전시킴 -2가 최솟값이라면 index 0이 -2이기 때문

max_count = max(count_arr)
max_nums = []
for i in range(len(count_arr)):
    if count_arr[i] == max_count:
        max_nums.append(i+arr[0]) # 원래 값으로 바꿈

print(round(sum(arr)/n))    # 산술평균
print(arr[n//2])            # 중앙값
if len(max_nums) == 1:
    print(max_nums[0])
else:
    print(max_nums[1])
print(abs(arr[0]-arr[n-1])) # 범위