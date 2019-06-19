let langs = ["Java", "Ruby", "JavaScript", "Scala", "Clojure"];

langs
	.filter(e => {
		console.log("****J filter called for " + e);
		return e.startsWith("J");
	})
	.filter(e => {
		console.log("----Length filter called for " + e);
		return e.length > 5;
	})
	.forEach(e => {
		console.log(e);	
	});