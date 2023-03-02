
db.trabajador.insertMany([{
    cod: 100, 
        nombre: 'Pepe', 
        apellido: 'Valdez', 
        correo: 'pepevaldez@gmail.com', 
        cargo: 'empaquetador', 
        f_nacimiento: '02/06/1994', 
        sueldo: 4000},
        {
    cod: 200, 
        nombre: 'Juan', 
        apellido: 'Alvarez', 
        correo: 'juanalvarez@gmail.com', 
        cargo: 'operador', 
        f_nacimiento: '13/11/1998', 
        sueldo: 5000},
        {
    cod: 300, 
        nombre: 'Julia', 
        apellido: 'Perez', 
        correo: 'juliaperez@gmail.com', 
        cargo: 'empaquetador', 
        f_nacimiento: '26/05/1985', 
        sueldo: 3500},
        {
    cod: 400, 
        nombre: 'Claudia', 
        apellido: 'Smith', 
        correo: 'claudiasmith@gmail.com', 
        cargo: 'empaquetador', 
        f_nacimiento: '30/01/1998', 
        sueldo: 4000},
        {
    cod: 500, 
        nombre: 'Juana', 
        apellido: 'Pena', 
        correo: "juanapena@gmail.com", 
        cargo: 'empaquetador', 
        f_nacimiento: '08/03/1988', 
        sueldo: 4500},
        {
    cod: 600, 
        nombre: 'Carlos', 
        apellido: 'Guitierrez', 
        correo: 'carlosgutierrez@gmail.com', 
        cargo: 'operador', 
        f_nacimiento: '06/06/1972', 
        sueldo: 6000}
]);

db.trabajador.find();
