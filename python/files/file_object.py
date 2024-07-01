import os


with open("words.txt") as ff:
    for data in ff:
        print(type(data))
        words=data.split()
        if 'e' in words:
            print(words)
        # print(ff.read(), end=" \n\n donw!!")

# cars=100
# print(' i have %d cars ' % cars)
# print(' i have {} cars {} '.format(cars,50))
# print(os.getcwd())  # get current working directoryq

# try:
#     # Attempt to open a file that may not exist
#     with open('non_existent_file.txt', 'r') as file:
#         content = file.read()
#     print("File successfully opened.")
# except FileNotFoundError:
#     print("The file does not exist.")
cwd = os.getcwd()


print(os.path.isdir(cwd))
try:
    fin = open('answer.txt')
    fin.write('Yes')
except:
    print('No')
print( '%g' % (0,1))