def reverse_sentence(sentence):
    # Split the sentence into a list of words
    word_list = sentence.split()

    # Reverse the order of the words in the list
    reversed_word_list = word_list[::-1]

    return reversed_word_list

# Input sentence
sentence = input("Enter a sentence: ")

# Call the function to reverse the sentence
reversed_words = reverse_sentence(sentence)

# Print the reversed word list
print("Reversed Word List:", reversed_words)
