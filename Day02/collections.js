var arr = [];
var numbers = [1, 2, 3, 4];
for(var i=0; i < numbers.length; i++) {
	console.log(numbers[i]);
}

numbers.forEach(num => console.log(num));

numbers
	.filter(num => num % 2 == 0)
	.map(num => num * num)
	.forEach(num => console.log(num));

/*
function eat(item){
	return "Eating " + item;
}
*/

//Arrow function
var eat = (item) => "Eating " + item;

var output = eat("Roti");
console.log(output);