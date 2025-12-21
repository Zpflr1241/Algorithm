dic = {"A+":4.5, "A0":4.0,
       "B+":3.5, "B0":3.0,
       "C+":2.5, "C0":2.0,
       "D+":1.5, "D0":1.0,
       "F": 0.0}
total = 0
total_hakjum = 0
input_list = [input() for _ in range(20)]
for i in input_list:
    line_input = list(i.split(" "))
    if line_input[2] == "P":
        continue
    total += float(line_input[1]) * dic[line_input[2]]
    total_hakjum += float(line_input[1])
print(total/total_hakjum)