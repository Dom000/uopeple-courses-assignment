# import math

# def print_circum(radius):
#   circumference=2*round(math.pi,5)*radius
#   print(circumference)

# print_circum(8)
# print_circum(2)
# print_circum(100)

# This are the list of items available in my store with there individual prices
item1=400 #prices
item2=600
item3=800

# print  out all the information about each item  and its price
def print_receipt(discount,total,finalprice,category,sum,perc):
    print("Output:\n\nOnline Store\n--------------------------------------------------")
    print("Items \t\t\t\t\t\t\t\t\t Price")
    print("Item 1\t\t\t\t\t\t\t\t\t ${}".format(item1))
    print("Item 2\t\t\t\t\t\t\t\t\t ${}".format(item2))
    print("Item 3\t\t\t\t\t\t\t\t\t ${}".format(item3))
    print("{} Items ({}) \t\t\t\t\t ${}".format(category,sum,total))
    print("discount ({}) \t\t\t\t\t\t\t ${}".format(perc,discount))
    print("Total \t\t\t\t\t\t\t\t\t ${}".format(finalprice))
    print("\n\nYou have added a {} item worth ${} to your order.".format(category,total))
    print("Your discount is ${} = {} so you will pay only ${}".format(discount,perc,finalprice))
    print("____________________________________________________")
    print("For delivery contact +2347082524010")


def cart(item_1=None,item_2=None,item_3=None):
  if item_1 and not (item_2 or item_3): #if you only buy one thing it will automatically set the other two to None so this statement makes sure that at least one item is bought
    total=item1 
    discount=0
    finalprice=total-discount
    print_receipt(discount=discount,total=total,finalprice=finalprice,category="Single",sum="item1",perc="None")

  elif item_1 and item_2 and  not item_3: # if user adds two items but doesn't add third one 
    total=item1+item2 
    discount=(total)/100*10
    finalprice=total-discount
    print_receipt(discount=discount,total=total,finalprice=finalprice,category="Combo",sum="item1 + item2",perc="10%")

  elif item_1 and item_3 and not item2: #  if user adds first and last item but not middle one
    total=item1+item3 
    discount=(total)/100*10
    finalprice=total-discount
    print_receipt(discount=discount,total=total,finalprice=finalprice,category="Combo", sum="item1 + item3",perc="10%")

  elif item_2 and item_3 and not item_1: #  if user adds second and third item but not first one
    total=item2+item3 
    discount=(total)/100*10
    finalprice=total-discount
    print_receipt(discount=discount,total=total,finalprice=finalprice,category="Combo",sum="item2 + item3",perc="10%")

  elif item_2 and item_3 and item_1: #  if user adds all three items
    total=item1+item2+item3 
    discount=(total)/100*25
    finalprice=total-discount
    print_receipt(discount=discount,total=total,finalprice=finalprice,category="Gift Pack",sum="item1 + item2 + item3",perc="25%")
  else :
    print("Please add items to cart")

cart(item1)
cart(item1,item2)
cart(item1,item2,item3)
    