import sys

n,m = map(int,sys.stdin.readline().rstrip().split())
ndict, res = {}, []

for i in range(n):
    ndict[sys.stdin.readline().rstrip()] = 0

for i in range(m):
    tmp = sys.stdin.readline().rstrip()
    if tmp in ndict.keys():
        res.append(tmp)


res.sort()
sys.stdout.write(str(len(res))+"\n")
print("\n".join(res))