


def check_for_vowels():
    # take inputes from users
    n=input("Enter your name :")

    # vowels
    vowel="aeiou"
    #index for loop
    index = 0
    # reverse count
    revers_count=0
    # vowel counts
    numer_of_vowel=0
    # display n from left
    display_from_left=""
    
    # Reversed n input
    reverse="" 

    while index<len(n): 
        # conditional check to make sure the 
        # reverse count is exactly 0 before assigning
        # the character lenghth
        
        if revers_count==0:
           revers_count=len(n)
        # each character count
        letter=n[index] 
        reversal=n[revers_count-1]
        # Building reversed string
        reverse+=reversal
        # concatenating each character count to 
        # sum up display_from_left
        display_from_left+=letter
        # check if it contains a vowel
        if letter in vowel:
            #  sum up number of vowels 
            numer_of_vowel+=1
        index+=1
        revers_count-=1
       
    print("Displayed from Left :",display_from_left)
    print("Reversed :",reverse)
    print("Number of vowels :",numer_of_vowel)


check_for_vowels()



