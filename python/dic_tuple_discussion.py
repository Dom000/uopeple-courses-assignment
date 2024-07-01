# Example: Looping over two lists 
# simultaneously using zip
list1 = [1, 2, 3]
list2 = ['a', 'b', 'c']

for num in zip(list1, list2):
    print(*num)



# Example: Looping over a dictionary 
# using items method
my_dict = {'a': 1, 'b': 2, 'c': 3}

for key, value in my_dict.items():
    print(key, value)


# Example: Enumerate over a list
my_list = ['apple', 'banana', 'cherry']

for index, fruit in enumerate(my_list):
    print(index, fruit)


hh=(1,1,3)
hh+=(10,)

print(hh)