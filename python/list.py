t = [[1, 2], [3], [4, 5, 6]]


def nested_list(a):
    holder=[]
    for i in a:
        holder.extend(i)
    result=sum(holder)
    print(result)
    # holder.
nested_list(t)

my_list = [3, 2, 1]
print(my_list)

index = "Ability is a poor man's wealth"

print(index)


mylist = [ [2,4,1], [1,2,3], [2,3,5] ]
a=0
total = 0
while a < 3:
    b = 0
    while b < 2:
        total += mylist[a][b]
        b += 1
    a += 1
print(total)

dd='Unit 6'[-1]
print(dd)


mylist = ["now", "four", "is", "score", "the", "and seven", "time", "years", "for"]
print(" ".join(mylist[1::2]))


def function2(param):
    print (param, param)
def function1(part1, part2):
    cat = part1 + part2
    function2(cat)
chant1 = "See You"
chant2 = "See Me"
function1(chant1, chant2)

percentage = float ( 60 * 100) / 55
print (percentage)

word = 'bAnana'

index = word.find('a')

print(index)

if "Ni!":
    print ('We are the Knights who say, "Ni!"')
else:
    print ("Stop it! No more of this!")
    
    
isinstance(10.001, float)


n = 10
while n != 1:
    print(n,)
    if n % 2 == 0: # n is even
        n = n / 2
    else: # n is odd
        n = n * 3 + 1