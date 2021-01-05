window.addEventListener("load", (event) => {

	console.log("loaded");

	const form = document.getElementById("form");
	const submit = document.getElementById("submit");
	const bmi = document.getElementById("bmi");
	const corpulence = document.getElementById("corpulence");


	form.onsubmit = ((event) => {
		event.preventDefault();

		const samp = document.getElementById("samp");

		fetch(`/api/bmi?length=${event.target.length.value}&weight=${event.target.weight.value}&gender=${event.target.gender.value}`)
			.then((response) => {
				if(!response.ok) {
					throw new Error("Not ok");
				}
				return response;
			})
			.then((response) => response.json())
			.then((response) => {
				bmi.innerText = response.bmi;
				corpulence.innerText = response.corpulence;
			})
			.catch((error) => console.error(error));

		return false;
	});

})
