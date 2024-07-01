# The HR department needs you to carry out following
# operation on existing list of 10 employees name 
# (you can assume 10 names in a list here).
employee_list = ["Mike", "Emmanuella", "Godknows",
                 "Bianca", "Daniella", "Gloryia", "Isa", "John", "Maria","Jane"]

# Split the list into two sub-list namely subList1 and 
# subList2, each containing 5 names
subList1 = employee_list[0:5]
subList2 = employee_list[5:10]

# A new employee (assume the name “Kriti Brown”) 
# joins, and you must add that name in subList2.
subList2.append("Kriti Brown")

# Remove the second employee's name from subList1. 

subList1.remove(subList1[1])

# Merge both the lists. 

merged_list = subList1+subList2

# Assume there is another list salaryList
# that stores salary of these employees. Give a rise 
# of 4% to every employee and update the salaryList.  
salary_list = [10_000, 20_000, 30_000, 40_000, 50_000, 
               60_000, 70_000, 80_000, 90_000, 100_000]


# rise of 4% to every employee and update the salaryList.
def increase_salary(employees, increment):
   
    for i in range(len(employees)):
       employees[i] += (employees[i] / 100)*increment
    print(salary_list) 
increase_salary(salary_list,4)


# Sort the SalaryList and show top 3 salaries
sorted_salaries = sorted(salary_list, reverse=True)[0:3]
       
    
print(sorted_salaries)


