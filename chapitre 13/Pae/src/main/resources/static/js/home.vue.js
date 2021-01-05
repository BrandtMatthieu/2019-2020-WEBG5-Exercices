const body = new Vue({
	el: "#main",
	data: {
		courses: [],
		selectedCourse: null,
	},
	async mounted() {
		this.$nextTick()
		.then(() => fetch(`/api/courses`))
		.then((response) => response.json())
		.then((response) => body.courses = response);
	},
	methods: {
		change: (event) => {
			body.selectedCourse = body.courses.find((course) => course.id == event.target.value);
		},
	}
});
