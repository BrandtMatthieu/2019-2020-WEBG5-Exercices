window.addEventListener("load", (event) => {

	console.log("loaded");

	const form = document.getElementById("form");
	const submit = document.getElementById("submit");


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
			.then((response) => response.text())
			.then((response) => {
				if(samp) {
					form.removeChild(samp);
				}
				return response;
			})
			.then((response) => event.target.innerHTML += response)
			.catch((error) => console.error(error));

		return false;
	});

})
