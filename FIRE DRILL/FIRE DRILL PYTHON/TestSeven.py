sum = 0
product = 1
for number in range(1, 11):
	for count in range(1, 6):
		if number % 4 == 0:
			product *= number;
			sum += product;
		if count == 5:
 			print(sum, end=" ")



