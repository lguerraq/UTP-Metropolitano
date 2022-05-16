function Contactanos(){
	let nombres, apellidos, distrito, b1, b2, b3;
	nombres = document.getElementById("Nombres").value;
	apellidos = document.getElementById("Apellidos").value;
	distrito = document.getElementById("Distrito").value;
	b1=document.getElementsByName("Callao");
	b2=document.getElementsByName("Lima");
	b3=document.getElementsByName("Surco");
	if(b1[0].checked)
		h1="Callao";
	if(b2[0].checked)
		h2="Lima";
	if(b3[0].checked)
		h3="Surco";
	document.Contactanos.Comentarios.value = 
	"\nSus Nombres es "+nombres+
	"\nSus Apellidos es "+apellidos+
	"\nSu Distrito es "+distrito;

}