let langs = ["Java", "Joomla", "Ruby", "JavaScript", "Scala", "Clojure"];

let result = langs
	.filter(e => {
		console.log("****J filter called for " + e);
		return e.startsWith("J");
	})
	.filter(e => {
		console.log("----Length filter called for " + e);
		return e.length > 5;
	});
console.log(result);
	// .forEach(e => {
	// 	console.log(e);
	// });