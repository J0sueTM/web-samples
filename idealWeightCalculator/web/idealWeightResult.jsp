<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
		<meta charset = "utf-8"/>
		<meta name = "viewport" content = "width=device-width, initial-scale=1.0"/>
		<title>Ideal Weight Calculator</title>

		<link rel = "stylesheet" href = "./web/style/index.css"/>
		<link rel = "stylesheet" herf = "./web/style/page-landing.css"/>
		<link rel = "stylesheet" href = "./web/style/result.css"/>
		<link rel = "stylesheet" href = "./web/style/footer.css"/>
	</head>
	<body>
		<div id = "page-landing">
				<h1>Calculation done</h1>
				<h4>${name}, your Ideal Weight is</h4>
				<p id = "weight">${calculatedIdealWeight}</p>
				<footer>
					<p>Copyright © 2021, Josué Teodoro Moreira</p>				
				</footer>
		</div>
	</body>
</html>
