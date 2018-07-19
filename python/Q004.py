def is_palindromic(num):
    num = str(num)
    for i in range(int(len(num) / 2)):
        if num[i] != num[-i-1]:
            return False

    return True


result = 0
for x in reversed(range(1, 999)):
    for y in reversed(range(1, 999)):
        temp = x * y
        if is_palindromic(temp) and temp > result:
            result = temp

print(result)
