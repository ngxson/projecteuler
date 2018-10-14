import math

num = 10
result1 = 0
result2 = 0
result = 0

def sum_of_square(result1):
    for i in range(0, num +1):
        result1 = result1 + math.pow(i,2)
    return(result1)
sum_of_square(result1)
x = sum_of_square(result1)
#m = int(x)

def square_of_sum(result2):
    for i in range(0, num+1):
        result2 = i + result2
    result2 = math.pow(result2,2)
    return(result2)
square_of_sum(result2)
y = square_of_sum(result2)

result = y-x
print(result)






