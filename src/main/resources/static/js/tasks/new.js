
	$(document).ready(
			function() {
				var dateInput = $('input[name="scheduled_date"]'); // Our date input has the name "date"
				var container = $('.bootstrap-iso form').length > 0 ? $(
						'.bootstrap-iso form').parent() : 'body';
				dateInput.datepicker({
					format : 'yyyy/mm/dd',
					container : container,
					todayHighlight : true,
					autoclose : true,
					startDate : truncateDate(new Date())
				// <-- THIS WORKS
				});

				$('#scheduled_date').datepicker('setStartDate',
						truncateDate(new Date())); // <-- SO DOES THIS
			}

	);

	$(document).ready(
			function() {
				var dateInput = $('input[name="complete_date"]'); // Our date input has the name "date"
				var container = $('.bootstrap-iso form').length > 0 ? $(
						'.bootstrap-iso form').parent() : 'body';
				dateInput.datepicker({
					format : 'yyyy/mm/dd',
					container : container,
					todayHighlight : true,
					autoclose : true,
					startDate : truncateDate(new Date())
				// <-- THIS WORKS
				});

				$('#complete_date').datepicker('setStartDate',
						truncateDate(new Date())); // <-- SO DOES THIS
			});

	function truncateDate(date) {
		return new Date(date.getFullYear(), date.getMonth(), date.getDate());
	};


	$(document).ready(function() {

		$('#task-form').validate({
			rules : {
				title : 'required',
				description : 'required',
				scheduled_date : {
					required : true
				},
				complete_date : {
					required : true
				}
			},
			messages : {
				title : '必須項目です。',
				description : '必須項目です。',
				scheduled_date : '必須項目です。',
				complete_date : '必須項目です。'
			},
			
			submitHandler : function(form) {
				console.log("summit")
				var r = confirm("タスクを登録します。本当によろしいですか？");
				if (r == true) {
					form.submit();
				}
			}
		});

	});
