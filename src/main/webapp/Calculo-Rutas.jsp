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
        <header class="Calculo">
        <h1 class="subtitulo">Rutas del Metropolitano</h1>

        <div>
        <center>
            <table>
		<tr>
                    <td>
			<td>
                            <form method="post" class="tablas">
                            <fieldset>
                            <legend>Calcula de la unidad de BUS</legend>
				<table>
                                    <tr>
                                        <td>Ruta</td>
					<td>
                                            <select>
                                            <option>Regular A</option>
                                            <option>Regular B</option>
                                            <option>Regular C</option>
                                            <option>Regular D</option>
                                            <option>Expreso 1</option>
                                            <option>Expreso 2</option>
                                            <option>Expreso 3</option>
                                            <option>Expreso 4</option>
                                            <option>Expreso 5</option>
                                            <option>Expreso 6</option>
                                            <option>Expreso 7</option>
                                            <option>Expreso 8</option>
                                            <option>Expreso 9</option>
                                            <option>Super Expreso</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Parada Origen</td>
					<td>
                                            <select>
                                            <option>Matellini</option>
                                            <option>Rosario de Villa</option>
                                            <option>Teran</option>
                                            <option>Escuela Militar</option>
                                            <option>Bulevar</option>
                                            <option>Balta</option>
                                            <option>Plaza de Flores</option>
                                            <option>28 de Julio</option>
                                            <option>Benavides</option>
                                            <option>Ricardo Palma</option>
                                            <option>Angamos</option>
                                            <option>Domingo Orue</option>
                                            <option>Aramburu</option>
                                            <option>Canaval y Moreyra</option>
                                            <option>Javier Prado</option>
                                            <option>Canada</option>
                                            <option>Mexico</option>
                                            <option>Estadio Nacional</option>
                                            <option>España</option>
                                            <option>Quilca</option>
                                            <option>2 de Mayo</option>
                                            <option>Ramon Castilla</option>
                                            <option>Caqueta</option>
                                            <option>Parque del Trabajo</option>
                                            <option>UNI</option>
                                            <option>Honorio Delgado</option>
                                            <option>El Milagro</option>
                                            <option>Tomas Valle</option>
                                            <option>Los Jazmines</option>
                                            <option>Independencia</option>
                                            <option>Pacifico</option>
                                            <option>Izaguirre</option>
                                            <option>Naranjal</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Parada Destino</td>
					<td>
                                            <select>
                                            <option>Matellini</option>
                                            <option>Rosario de Villa</option>
                                            <option>Teran</option>
                                            <option>Escuela Militar</option>
                                            <option>Bulevar</option>
                                            <option>Balta</option>
                                            <option>Plaza de Flores</option>
                                            <option>28 de Julio</option>
                                            <option>Benavides</option>
                                            <option>Ricardo Palma</option>
                                            <option>Angamos</option>
                                            <option>Domingo Orue</option>
                                            <option>Aramburu</option>
                                            <option>Canaval y Moreyra</option>
                                            <option>Javier Prado</option>
                                            <option>Canada</option>
                                            <option>Mexico</option>
                                            <option>Estadio Nacional</option>
                                            <option>España</option>
                                            <option>Quilca</option>
                                            <option>2 de Mayo</option>
                                            <option>Ramon Castilla</option>
                                            <option>Caqueta</option>
                                            <option>Parque del Trabajo</option>
                                            <option>UNI</option>
                                            <option>Honorio Delgado</option>
                                            <option>El Milagro</option>
                                            <option>Tomas Valle</option>
                                            <option>Los Jazmines</option>
                                            <option>Independencia</option>
                                            <option>Pacifico</option>
                                            <option>Izaguirre</option>
                                            <option>Naranjal</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><label>El velocidad es de:</label></td>
                                        <td><textarea cols="10" rows="3"></textarea></td>
                                    </tr>
                                    <tr>
                                        <td><label>El Tiempo es de:</label></td>
                                        <td><textarea cols="10" rows="3"></textarea></td>
                                    </tr>
                                    <tr>
                                        <td><label>La Distancia es de:</label></td>
                                        <td><textarea cols="10" rows="3"></textarea></td>
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
            <table>
		<tr>
			<td>
                            <form method="post">
                            <fieldset>
                            <legend></legend>
				<table>
                                    <tr>
					<td>
                                            <input type="button" name="Calcular" value="Calcular">
					</td>								
                                    </tr>
                                </table>
                            </fieldset>
                            </form>
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