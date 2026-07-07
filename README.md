En el metodo A:
Que implementacion: Ocupe un TreeSet 
Porque: Ya que es un tipo de Sets que ademas de no permitir duplicados nos permite definir un orden
Como se garantiza la unicidad: Al ser un Set este no permite duplicados los que nos asegura tener datos unicos
como se conserva o se define el orden: creamos un caso base y comparamos ya sea por la prioridad o por el nombre del tecnico
Como funciona la logica implemetada: tenemos la variable prioridadComparable que primero hara su comparacion con los datos de tipos entero y si nos da algun Dato igual pasara a comparar 
por los nombres de los tecnicos usando en compareToIgnoreCase y despues usar un bucle para recorrer y agregar los datos que si cumplan con todo.
En el metodo B:
Que implementacion: Ocupe un TreeMap 
Porque: Ya que es un tipo de Mapa que nos permite comparar las claves y las llaves
Como se garantiza la unicidad: Al un Mapa nos permite comparar ya sea con los valores de las claves o con las llaves
como se conserva o se define el orden: usamos un LinkedHashMap para poder agrupar internamente y el orden lo predefine el valor natural
Como funciona la logica implemetada: al crear un LinkedHashMap en donde guardamos los valores y al agregarlo al TreeMap este nos ayuda a ordenar

