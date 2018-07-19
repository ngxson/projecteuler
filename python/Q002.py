max_num = 4000000
result, a, b, c = 0, 1, 1, 0

while c <= max_num:
    c = a + b
    if c % 2 == 0:
        result += c

    a, b = b, c

print(result)
