function borrar(){
    alert('lista borrada')
}

function editar(){
    alert('lista editada')
}

function resaltarBoton(enlaces) {
    enlaces.style.backgroundColor = 'red'; // Cambia el color de fondo para resaltar
    enlaces.style.color = 'white'; // Cambia el color de fondo para resaltar
}

function quitarResaltado(enlaces) {
    enlaces.style.backgroundColor = ''; // Restaura el color original
    enlaces.style.color = ''; // Restaura el color original
}