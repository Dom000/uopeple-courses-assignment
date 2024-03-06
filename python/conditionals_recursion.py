
# # Countdown function, This function is responsible for counting down numbers
# def countdown(n): 
#      if n <= 0: 
#         print('Blastoff!') 
#      else: 
#         print(n) 
#         countdown(n-1) 

# # Countup function, This function is responsible for counting up numbers
# def countup(n,end=0): 
#      if n >= end: 
#         print('Blastoff!') 
#      else: 
#         print(n) 
#         countup(n+1,end) 

# # Count function, This function is a conditional statement that determine  
# # which function to call based on if the user inputnis positive or negative
# def count_fun():
#     result=input("Enter your number :")
#     num = int(result)
    
#     if num>0:
#         countdown(num)
#     elif num==0:
#         countup(num,5)
#     else:
#         countup(num)

# count_fun()



# def divider():
#     response1=int(input("Enter your dividend :"))
#     response2=int(input("Enter your divisor :"))
#     if response2==0:
#         print("Error. Division by zero is not allowed.")
#     else:
#         result=response1/response2
#         print("The division of {} by {} equals {}".format(response1,response2,result))
 
    
# divider()

res="leLLO"


def checkcase():
    for c in res:
       if c.islower():
               return True
            #  return "true"

def any_lowercase1(s):
    for c in s:
        if c.islower():
            return True
    return False

print(any_lowercase1("lOve"))