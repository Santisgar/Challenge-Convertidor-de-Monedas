# Conversor de Monedas en Java

Este proyecto es una aplicación de consola en Java que permite consultar y convertir valores entre diferentes monedas. La lógica se basa en tasas de conversión predefinidas y estructuras de control para facilitar la operación del usuario.

## Archivos del proyecto

- **Principal.java**  
  Archivo principal que contiene el método `main`. Aquí se muestra un menú de opciones al usuario para seleccionar el tipo de conversión que desea realizar.

- **ConsultarMoneda.java**  
  Clase responsable de imprimir el menú de opciones para la conversión de monedas.

- **Calculos.java**  
  Clase que contiene los métodos para realizar las conversiones entre diferentes monedas, como pesos a dólares, dólares a pesos colombianos, dólares a pesos argentinos, etc.

## Conversión de monedas soportadas

- Dólares a pesos argentivos y viceversa.
- Dólares a reales brasileños y viceversa.
- Dólares a pesos colombianos y viceversa.


## Cómo usar el programa

1. **Compilación**  
   Asegúrate de tener instalado Java. Abre la terminal o línea de comandos y navega a la carpeta que contiene los archivos. Luego ejecuta:

   ```bash
   javac Principal.java ConsultarMoneda.java Calculos.java
   ```

2. **Ejecución**

   ```bash
   java Principal
   ```

3. **Uso**

   El programa mostrará un menú con opciones de conversión. Elige la opción deseada ingresando el número correspondiente, luego ingresa el valor a convertir.

## Ejemplo de uso

```
Seleccione una opción de conversión:
1. Dólares a pesos argentinos.
2. Pesos argentinos a dólares
...
Ingrese una opción: 1
Ingrese el valor a convertir: 50
Resultado: $56,912. pesos argentinos
```

## Notas

- Las tasas de conversión son estáticas, definidas directamente en el código.
- Este programa es una base ideal para extenderse a tasas dinámicas mediante una API externa.

## Autor

Desarrollado como proyecto académico para practicar estructuras de control, clases y métodos en Java.
