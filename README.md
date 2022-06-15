# Tercer taller de ARSW

Creacion de un servidor web en Java

## Preparacion

Clonamos el repositorio con la siguiente instrucción en consola:

```
https://github.com/ronis97/ARSWT2.git
```


### Prerrequisitos

Necesitamos de:
* Maven
* Intellij IDEA (O cualquier IDE de Java)

Para una correcta ejecucion del aplicativo.

### Instalacion

Ejecutamos la siguiente instruccion en consola:

```
mvn package
```

con esto maven se encargara de descargar todos los recursos necesarios para la ejecucion del aplicativo.

Para ejecutar el programa simplemente corremos la instrucción:

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arsw.app.taller2.app.Taller.LoadFile" -Dexec.args="src/main/resources/columna2.txt"
```

En consola veremos en primera linea el promedio y la segunda linea la desviacion estandar, podemos hacer lo mismo para la otra columna de datos solicitada:

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arsw.app.taller2.app.Taller.LoadFile" -Dexec.args="src/main/resources/columna1.txt"
```


## Pruebas

Para verificar las pruebas simplemente corremos el comando:

```
mvn test
```

Como muestra la consola:
![]()

### JAVADOC

La documentacion del aplicativo se puede ver directamente en el archivo `index.html` encontrado en la carpeta resources/apidocs.

![]()


### Diagrama de clases

El diagrama completo se puede encontrar en el archivo `Taller2ARSW.asta` 

![]()




## Autor

**Edgar Ronaldo Henao Villarreal**


## License

Este proyecto esta bajo la licencia [GNU General Public License v2.0](https://github.com/ronis97/ARSW-T1/blob/master/LICENSE) de uso libre. 



