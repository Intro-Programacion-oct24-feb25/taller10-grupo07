# Taller 10 (Laboratorio):
## Integrantes 
* Dalton Flores
* Diego Espinoza 

## Construcción de programas usando arreglos bidimensionales

* Lenguaje de programación : Java
* IDE de programación : Netbeans
* Usar el proyecto de Netbeans creado llamado **Taller10**

### Problema1

Dadas las notas de tres (3) estudiantes; generar una solución que permita encontrar el promedio de las calificaciones por cada conjunto de notas de los estudiantes.
La problemática sugiere el uso de estructuras de datos.
Las notas están en un arreglo bidimensional llamado **notas**; notas tiene 3 filas y 4 columnas.

![](https://raw.githubusercontent.com/IntroProgramacion-P-Oct20-Feb21/taller9/main/images/taller09-03-1.png)


Los nombres de los estudiantes están en un arreglo unidimensional que tiene 3 elementos. El arreglo se llama **estudiantes**

![](https://raw.githubusercontent.com/IntroProgramacion-P-Oct20-Feb21/taller9/main/images/taller09-03-2.png)

Atención; los valores del arreglo **notas**  de la fila del índice 0 pertenecen al estudiante del índice 0 del arreglo **estudiantes**; y *así con cada fila de notas e índice de estudiantes*

Cada promedio de notas de un estudiante deberá ser almacenado en una posición de un arreglo unidimensional llamado **promedios**; resaltar que el arreglo promedios tendrá 3 elementos.

Al final se debe presentar el siguiente reporte:
```
Estudiante: Jerry Ponce tiene un promedio de ?
Estudiante: Gabriela Lewis tiene un promedio de ?
Estudiante: David Bell tiene un promedio de ?
```

### Problema2

Se requiere ingresar las ventas totales diarias de 2 vendedores; realizadas de lunes a viernes.
Los vendedores están representados en una estructura unidimensional de dos elementos. El arreglo se llama **vendedores**
![](https://raw.githubusercontent.com/IntroProgramacion-P-Oct20-Feb21/taller9/main/images/taller09-04-2.png)

El arreglo bidimensional que permitirá almacenar las ventas diarias tiene 2 filas y 5 columnas. El arreglo se llama **ventas**

![](https://raw.githubusercontent.com/IntroProgramacion-P-Oct20-Feb21/taller9/main/images/taller09-04-1.png)

Existe una relación entre el índice 0 del arreglo vendedores y la fila de índice 0 del arreglo ventas.

Luego de ingresar los valores se necesita presentar el total de ventas de todos los vendedores de la siguiente forma:
```
Vendedor(a) Jessica Cole
Vendedor(a) Robert Wallace
Ha realizado un total de ? en ventas.
```

### Problema3
Dado los siguiente arreglos; llene el arreglo notasCualitativas relacionando las posiciones del arreglo notasCuantitativas. Tomar en consideración lo siguiente
```
	String[][] notasCualitativas = new String[3][3];
	double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        /*
        Referencia para obtener el valor cualitativo de una nota numérica
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente  
        */
```

### Problema4
Realice un proceso que permita ingresar los valores por teclado para el siguiente arreglo. Solo son aceptados los número mayores a 1000 y menores a 1199. Caso contrario, se debe agregar el número 10.

Finalmente presentar el arreglo y además, cuantas veces se agregó un valor fuera de rango

```
double[][] datos = new double[2][2];
```

### Problema5
Dado el siguiente arreglo

```
String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
 {"Carrie Burton", "Lauren Rice"},
{"Emma Escobar", "Lori Flores"},
{"Steven West", "Toni Martin"}
 };
```
Imprima en pantalla a través de una variable acumuladora  solo los estudiantes que tienen como primera letra S,P,T

### Problema6
Dado el siguiente arreglo

```
String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
 {"Carrie Burton", "Lauren Rice"},
{"Emma Escobar", "Lori Flores"},
{"Steven West", "Toni Martin"}
 };
```
Imprima en pantalla a través de una variable acumuladora  solo los estudiantes que tengan 11 caracteres (se cuentan también los espacios en blanco)

### Problema7
Dado el siguiente código

```
public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{0, 2, 0},{1, 0, 0}}; //
        // double[][] dato1 = {{0, 0, 0},{0, 0, 0}}; //
        /*
            Imprimir si el arreglo es NULO, se considera un arreglo NULO cuando
            la suma de los valores es igual a 0

        */

    }
```
Genere una solución

### Problema8
Dado el siguiente código

```
public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3},{6, 8, 9}};
        double[][] dato2 = {{10, 1, 2},{10, 9, 1}};
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
        */

    }
```
Genere una solución
