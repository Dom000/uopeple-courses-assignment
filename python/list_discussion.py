
# x= ["book","paper"]
# y=x 
# x= ['apple','orange','cherry'] 
# y=x


# x= ["book","paper"]
# y=x
# x= ['apple','orange','cherry']
# y=x
# y[1]= 'banana' # replacing an orange with a banana 

# print(x )


def modify_list(input_list):
    """Modifies the input list by squaring each element."""
    for i in range(len(input_list)):
        input_list[i] = input_list[i] ** 2

# Example usage:
my_list = [1, 2, 3, 4, 5]
print("Original list:", my_list)

modify_list(my_list)
print("Modified list:", my_list)