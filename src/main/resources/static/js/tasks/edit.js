
$(document).ready(
		function() {
			var dateInput = $('input[name="scheduled_date"]'); // Our date input has the name "date"
			var container = $('.bootstrap-iso form').length > 0 ? $(
					'.bootstrap-iso form').parent() : 'body';
			dateInput.datepicker({
				format : 'yyyy/mm/dd',
				container : container,
				todayHighlight : true,
				autoclose : true
			// <-- THIS WORKS
			});

		});

$(document).ready(
		function() {
			var dateInput = $('input[name="complete_date"]'); // Our date input has the name "date"
			var container = $('.bootstrap-iso form').length > 0 ? $(
					'.bootstrap-iso form').parent() : 'body';
			dateInput.datepicker({
				format : 'yyyy/mm/dd',
				container : container,
				todayHighlight : true,
				autoclose : true
			});

			
		});

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
			var r = confirm("タスクを変更します。本当によろしいですか？");
			if (r == true) {
				form.submit();
			}
		}
	});

});

/* $(document).ready(function(){
    $("#complete_flg").click(function(){
        if($(this).is(':checked')){
        	$("#complete_flg").val("1"));
        
        }else{
//uncheck - clear input
        $("#complete_flg").val("0");
       
        }
    });
}); */

function truncateDate(date) {
	return new Date(date.getFullYear(), date.getMonth(), date.getDate());
};

/* $('#dd-priority').select2() */
