<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Pa�ses</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
	<section>
		<div class="container">
			<div class="row">

				<h3 class="text-center">Cadastro de Pa�ses</h3>
				<form class="form form-default" action="controller.do" method="get">
					<div class="row">
						<div class="form-group">
						<label>Nome:</label> 		<input class="form-control" type="text" name="nome"><br>
						</div>
						
						<div class="form-group">
						<label>Popula��o:</label> 	<input class="form-control" type="text" name="populacao"><br>
						</div>
						
						<div class="form-group">
						<label>Area:</label> 		<input class="form-control" type="text" name="area"><br>
						</div>
						<input class="btn btn-default btn-warning" type="submit" name="command" value="CriarPais">
					</div>
					
				</form>
			</div>
		</div>
	</section>
</body>
</html>