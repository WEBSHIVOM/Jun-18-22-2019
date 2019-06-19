let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let find = (logic) => {
	return numbers
		.reduce(logic, numbers[0]);

}
let max = find((first, second) => first > second ? first : second);
console.log("Max", max);

let min = find((first, second) => first < second ? first : second);
console.log("Min", min);

let output = numbers
	.filter(e => e % 2 == 0)
	.filter(e => e > 3)
	.map(e => e * 2);
	
if(output.length > 0) {
	console.log(output[0]);
}	
else {
	console.log(-1);
}

