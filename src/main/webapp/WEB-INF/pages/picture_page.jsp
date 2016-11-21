<!DOCTYPE HTML>
<html>
<head>
	<script src="https://code.jquery.com/jquery-2.2.2.min.js"></script>
	<script>
		function updateImage() {
			url= "${URL}";
			$.getJSON(url,function( data ) {
				$("#image").attr("src",data.imageUrl)
			});
			setTimeout(updateImage,${freq});
		}
		$( document ).ready(function() {
			updateImage();
		});
	</script>
</head>
<body style="margin:0px;">
<div class="content">
	<img id="image" width="100%">
</div>
</body>
</html>
