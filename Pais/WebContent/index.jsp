<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
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
						<label>NOME</label> 		<input class="form-control" type="text" name="usuario"><br>
						</div>
						<div class="form-group">
						<label>Senha:</label> 		<input class="form-control" type="password" name="senha"><br>
						</div>
						<button class="btn btn-default btn-warning" type="submit" name="command" value="FazerLogin">
							LOGAR
						</button>
					</div>
					
				</form>
			</div>
		</div>
	</section>
</body>
</html>