
with open("./files/input_file.txt")  as file:
    data = eval(file.read())
    inverted_dict = dict()
    for value in data:
        item=data[value]  
        if item not in  inverted_dict:   
            inverted_dict[item] =[value]
        else:
            inverted_dict[item].append(value)
    with open("./files/ouput_file.txt","w") as file:
        file.write(str(inverted_dict))
        
        
