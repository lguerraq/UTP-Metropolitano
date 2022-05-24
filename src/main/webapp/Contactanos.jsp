<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<title>UTP - Metropolitano</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
	<link href="https://fonts.googleapis.com/css2?family=Lobster&family=Viaoda+Libre&display=swap" rel="stylesheet">
        <script type="text/javascript" src="js/script.js"></script>
    </head>
    
    <body>
        
        <header class="Contactanos">
	<h1 class="subtitulo">Contactanos</h1>
        
        <div>
	 <center>
            <table>
		<tr>
                    <td>
			<td>
                            <form name="Contactanos" method="post" class="tablas">
                            <fieldset>
                            <legend>Informacion General</legend>
				<table>
                                    <tr>
                                        <td>Nombres:</td>
                                        <td><input type="text" name="Nombres" id="Nombres"></td>
                                    </tr>
                                    <tr>
                                        <td>Apellidos:</td>
                                        <td><input type="text" name="Apellidos" id="Apellidos"></td>
                                    </tr>
                                    <tr>
                                        <td>Distrito</td>
					<td>
                                            <select name="Distrito" id="Distrito">
                                            <option>Callao</option>
                                            <option>Lima</option>
                                            <option>Surco</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><label>Comentarios:</label></td>
                                        <td><textarea cols="35" rows="10" name="Comentarios"></textarea></td>
                                    </tr>
                                    <tr>
                                        <td>
                                        </td>
					<td>
                                            <input type="button" name="Borrar" value="Borrar">
                                            <input type="button" name="Enviar" value="Enviar" onclick="Contactanos">
					</td>								
                                    </tr>
                                </table>
                            </fieldset>
                            </form>
                        </td>
                    </td>
                </tr>
                <br>
            </table>
	</center>
        </div>
        
         <div>
            <center>
                <br>
                <a class="boton" href="index.jsp">Retornar</a>
            </center>    
        </div>
        
        </header>
    </body>
</html>