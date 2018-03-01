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

				<h3 class="text-center">CRIADO COM SUCESSO!</h3>
				<form class="form form-default" action="controller.do" method="get">
					<div class="row">
						<div class="form-group">
						<label>ID:</label> 		<input class="form-control" type="text" name="id" placeholder="${pais.id}" disabled><br>
						</div>
						
						<div class="form-group">
						<label>Nome:</label> 		<input class="form-control" type="text" name="nome" placeholder="${pais.nome}" disabled><br>
						</div>
						
						<div class="form-group">
						<label>População:</label> 	<input class="form-control" type="text" name="populacao" placeholder="${pais.populacao}" disabled><br>
						</div>
						
						<div class="form-group">
						<label>Area:</label> 		<input class="form-control" type="text" name="area" placeholder="${pais.area}" disabled><br>
						</div>
 						<a href="opcao.jsp" class="btn btn-default">VOLTAR</a>					</div>
					
				</form>
			</div>
		</div>
	</section>
</body>
</html>