let usuario1 = "Fabio"
let edad1 = 26
let usuario2 = "Maria"
let edad2 = 27
let usuario3 = "Florencia"
let edad3 = 15

function validarEdad(usuario, edad){

    if(edad>=18){
        alert("El usuario " + usuario + " es mayor edad")
    } else {
        alert("El usuario " + usuario + " no es mayor edad")
    }
}

validarEdad(usuario1, edad1)
validarEdad(usuario2, edad2)
validarEdad(usuario3, edad3)

function validarElUsuarioMayor(){
    if(edad1 > edad2 && edad1 > edad3){
        alert("El usuario " + usuario1 + " es el mayor de todos")
    } else if(edad2 > edad1 && edad2 > edad3){
        alert("El usuario " + usuario2 + " es el mayor de todos")
    } else {
        alert("El usuario " + usuario3 + " es el mayor de todos")
    }
}

validarElUsuarioMayor()





