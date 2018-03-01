<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Países</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
	<section>
		<div class="container">
			<div class="row">

				<h3 class="text-center">Cadastro de Países</h3>
				<form class="form form-default" action="controller.do" method="get">
					<div class="row">
						<div class="form-group">
						<label>ID:</label> 		<input class="form-control" type="text" name="id"><br>
						</div>
						<button class="btn btn-default btn-warning" type="submit" name="command" value="DeletarPais">DELETAR</button>
					</div>
					
				</form>
			</div>
		</div>
	</section>
</body>
</html>