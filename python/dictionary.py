import pprint


eng2sp = {'one': 'uno', 'two': 'dos', 'three': 'tres'}
def histogram(n):
    my_dict=dict()
    for l in n:
        if l in my_dict:
            my_dict[l]+=1
        else:
         my_dict[l]=1
    return my_dict
def invert_dict(d):
    inverse = dict()
    for key in d:
        val = d[key]
        if val not in inverse:
            inverse[val] = [key]
    else:
        inverse[val].append(key)
    return inverse

def lookup(dic_to_lookup,value):
    for v in dic_to_lookup:
        if dic_to_lookup[v]==value:
            return v 
   
    raise LookupError("value does not appear in the dictionary")  
 
result = histogram("International") 
inverted=invert_dict(result) 
# print(lookup(result,5))     
print(result)
pprint.pprint(inverted)