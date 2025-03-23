# Preparacion Examen Programacion2T
Enunciado
Concesionario de coches
a. Implementa un sistema de clases para representar un concesionario de coches. Ten en cuenta la siguiente información donde un vehículo debe tener atributos como marca, modelo, color, capacidad del depósito, precio y cualquier otra información que consideres relevante. Además algunos vehículos son eléctricos y cuentan con atributos adicionales como capacidad de la batería y carga actual. Define los constructores, métodos de acceso y cualquier otro método que consideres relevante para representar correctamente estos vehículos.

b. Implementa una jerarquía de excepciones para los vehículos. Tendrá dos tipos de excepciones:
  i. Excepción de velocidad excesiva. Se lanzará cuando la velocidad del   coche sea superior a 120.
  ii. Excepción de falta de recursos. En el caso de que estemos en los   coches eléctricos, lanzaremos una excepción de que estamos sin carga y en el coche de combustión una   excepción cuando estemos sin combustible.
  
c. Implementa un interfaz Reparable con método reparar() que permitirá incrementar la carga al 100% o el combustible a 100.

d. Implementa un main que tenga lo siguiente:
  i. Menú que dé la opción de:
  1. mostrar todos los coches registrados,
  2. registrar un coche,
  3. borrar un coche,
  4. mostrar información de un coche seleccionado
  5. ordenar los coches por precio
  6. ordenar los coches alfabéticamente por marca
  7. Ordena por marca y luego por precio

Toma de decisiones:
- Se ha añadido al menú dos opciones más: reparar vehículo y arrancar coche para poder implementar las excepciones en el código principal.
- Se han añadido otro tipo de excepciones, en concreto la excepción InputMismatchException para aquellos datos en los que sólo se pueden introducir números (ej: nivel de combustible, etc).
- Se ha añadido un número de serie a cada coche para poder buscarlos en el concesionario. (Es un número de serie y no la matrícula porque se supone que los coches están sin matricular en un concesionario :D)
