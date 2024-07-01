# funcyion to invert dictionary
def invert_dict(original_dict):
    inverted_dict = dict()
    for student, courses in original_dict.items():
        for course in courses:
            if course not in inverted_dict:
                inverted_dict[course] = [student]
            else:
                inverted_dict[course].append(student)
    return inverted_dict

# Sample input
original_dict = {
    'Stud1': ['CS1101', 'CS2402', 'CS2001'],
    'Stud2': ['CS2402', 'CS2001', 'CS1102']
}

# Print original dictionary
print("Original Dictionary:")
print(original_dict)

# Invert the dictionary
inverted_dict = invert_dict(original_dict)

# Print inverted dictionary
print("\nInverted Dictionary:")
print(inverted_dict)
