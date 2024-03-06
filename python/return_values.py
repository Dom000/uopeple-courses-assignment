import math

def hypotenuse(leg1: float, leg2: float) -> float:
    # test arguements
    print(leg1,leg2,"argument values..")
    # precondition makes sure this parameters are not negative
    if leg1 < 0 or leg2 < 0:
        print("Both legs must be non-negative")
        return
    else:
        # Stage 3: Implement Calculation Logic
        # postcondition  ensures the result is a positive number and return a value
        hypotenuse = math.sqrt(leg1 ** 2 + leg2 ** 2)
        print(hypotenuse,"hypotenuse result...")

        return hypotenuse

# Stage 5: Test and Debug
# Test the function with example inputs
print(hypotenuse(3, 4))  # Expected output: 5.0 (3-4-5 triangle)
print(hypotenuse(5, 12))  # Expected output: 13.0 (5-12-13 triangle)
print(hypotenuse(1.5, -1))  # Expected output: Error (Both legs must be non-negative and None)
