def convert_cel_to_far(celsius):
    fahrenheit = celsius * 9/5 + 32
    return float(fahrenheit)

def convert_far_to_cel(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return float(celsius)

f_input = float(input("Enter a temperature in degrees Fahrenheit: "))
c_result = convert_far_to_cel(f_input)
print(f"{f_input} degrees F = {c_result:.2f} degrees C")

c_input = float(input("Enter a temperature in degrees Celsius: "))
f_result = convert_cel_to_far(c_input)
print(f"{c_input} degrees C = {f_result:.2f} degrees F")