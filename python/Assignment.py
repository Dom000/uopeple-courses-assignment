def simple_calculator(num1, num2, operator):
    # Input validation
    # preconditions
    if not isinstance(num1, (int, float)) or not isinstance(num2, (int, float)):
        return "Error: Input numbers must be numeric"
    if operator not in ['+', '-', '*', '/']:
        return "Error: Invalid operator"

    # Perform calculation
    if operator == '+':
        return num1 + num2
    elif operator == '-':
        return num1 - num2
    elif operator == '*':
        return num1 * num2
    elif operator == '/':
        # Handle division by zero
        if num2 == 0:
            return "Error: Division by zero is not allowed"
        else:
            # postcondition
            return num1 / num2

# Example usage
result1 = simple_calculator(5, 3, '*')
result2 = simple_calculator(7, 2, '-')
result3 = simple_calculator(10, 5, '+')
result4 = simple_calculator(9, 3, '/')
print("Result:", result1)  # Output: Result: 15
print("Result:", result2)  # Output: Result: 5
print("Result:", result3)  # Output: Result: 15
print("Result:", result4)  # Output: Result: 3

