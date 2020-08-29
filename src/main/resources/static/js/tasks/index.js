function updateTask(taskId) {
		// your code that does something with param

		$.ajax({
			type : "POST",
			url : "/tasks/complete_task/" + taskId,
			data : {
				id : taskId
			},

			success : function(data) {
				$('.table-uncomplete').html(data);
				
				console.log(data);
				
				
				$.ajax({
					type : "GET",
					url : "/tasks/completed_task/" + taskId,
					

					success : function(data2) {
						$('.table-completed').html(data2);
						
						//console.log(data);
					}
				});
				
				
				$("#alertSuccess").show(); //or fadeIn
				setTimeout(function() {
					$("#alertSuccess").hide(); //or fadeOut
				}, 5000);
			}
		});

	};

	function redirectEdit(id) {
		window.location.href = "/tasks/" + id + "/edit";
	}

	function redirectCreate() {
		window.location.href = "/tasks/new";
	}
	var listIDDelete = [];
	function getListIdDelete(id) {

		if ($("#cb_delete" + id).is(':checked')) {
			listIDDelete.push(id);
		} else {
			//uncheck - clear input

			const index = listIDDelete.indexOf(id);
			if (index > -1) {
				listIDDelete.splice(index, 1);
			}
		}

		console.log(listIDDelete);
	}

	function deleteListId() {
		if (listIDDelete.length > 0) {
			var r = confirm("タスクを削除します。本当によろしいですか？");
			if (r == true) {
				$.ajax({
					type : "post",
					url : "/tasks/delete/" + listIDDelete,
					data : {
						listId : listIDDelete
					},

					success : function(data) {
						listIDDelete = [];
						location.reload()

					}
				});
			}
		}
		};