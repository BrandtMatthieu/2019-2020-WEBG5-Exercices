const input = new Vue({
	el: "#form",
	data: {
		gender: "male",
		length: 177,
		weight: 69,
	},
	methods: {
		computeBMI: () => {
			fetch(`/api/bmi?length=${input.length}&weight=${input.weight}&gender=${input.gender}`)
			.then((response) => {
				if(!response.ok) {
					throw new Error("No ok");
				}
				return response;
			})
			.then((response) => response.json())
			.then((response) => Object.assign(output, response))
			.catch((error) => console.error(error));
		}
	}
});

const output = new Vue({
	el: "#samp",
	data: {
		bmi: 20,
		corpulence: "normale"
	}
})
