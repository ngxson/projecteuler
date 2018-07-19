import math
my_num = 600851475143


def is_prime(num):
    for i in range(2, int(math.sqrt(num))):
        if num % i == 0:
            return False

    return True


def run():
    for i in reversed(range(int(math.sqrt(my_num)))):
        if my_num % i == 0 and is_prime(i):
            print(i)
            exit(0)


run()
