t=tuple([1,2,3,4])
a,b=1,2

tr="hell-world".split("-")
def return_tuple():
    return 1,2,3
i,w,u=return_tuple()


def gather_all(*args):
    print(args)

tp = [('a', 0), ('b', 1), ('c', 2)]
for number in tp:
    print(*number,"jj")

gather_all([1,2],"Hello")


ff= enumerate(['abc'])
f2=zip(['abc'],[1,2,3],['xyz'],range(5),'hello')

for i in ff:
    print(i)
    
for i in f2:
    print(i,"f2 here...")
    
do = {'a':0, 'b':1, 'c':2}
tc = do.items()

print(tc)
# print(tr)
# print(type(t),t+("888",))
# print((0, 1, 5, 2) > (0, 1.0, 4, 3.1))

d = {'apple': 1, 'banana': 2, 'orange': 3, 'grape': 2}

v = 2 

for k in d:
    if d[k] == v:
        print(k)
        
print(dict().get("no", "help!"))
my_tup = (3, 2, 1, 2)
print(tuple(sorted(my_tup)))

