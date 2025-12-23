arr = []
hap = 0
n = int(input())
for i in range(1, int((n ** 1/2)+1)):
    if n%i == 0:
        if i not in arr:
            arr.append(i)
            hap += i
        if int(n/i) not in arr:
            arr.append(int(n/i))
            hap += int(n/i)
if hap == 0: hap = 1
print(hap*5-24)