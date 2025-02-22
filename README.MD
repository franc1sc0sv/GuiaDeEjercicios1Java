# Guía de Ejercicios – Escuela de Computación 1

Este repositorio contiene la solución evaluativa de la **Guía de Ejercicios 1**, desarrollada en equipo (máximo 5 integrantes). Cada uno de los cinco ejercicios se implementa en un archivo Java independiente.

## Tabla de Contenidos

- [Descripción del Proyecto](#descripción-del-proyecto)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Instrucciones Generales](#instrucciones-generales)
- [Detalles de Ejercicios](#detalles-de-ejercicios)
    - [Ejercicio 1: Importadora de Vehículos](#ejercicio-1-importadora-de-vehículos)
    - [Ejercicio 2: Encomiendas Express](#ejercicio-2-encomiendas-express)
    - [Ejercicio 3: Alquiler de Jet Privados](#ejercicio-3-alquiler-de-jet-privados)
    - [Ejercicio 4: Descuento de Matrícula](#ejercicio-4-descuento-de-matrícula)
    - [Ejercicio 5: Pago de Horas Extras](#ejercicio-5-pago-de-horas-extras)
- [Requisitos Técnicos](#requisitos-técnicos)
- [Enlaces Importantes](#enlaces-importantes)

## Descripción del Proyecto

Este proyecto en Java aborda cinco ejercicios complejos:

- **Ejercicio 1:** Importadora de Vehículos
- **Ejercicio 2:** Encomiendas Express
- **Ejercicio 3:** Alquiler de Jet Privados
- **Ejercicio 4:** Descuento de Matrícula
- **Ejercicio 5:** Pago de Horas Extras

Cada ejercicio se implementa en un archivo Java independiente, por ejemplo: `Ejercicio1.java`.

## Estructura del Proyecto

El código se organiza en paquetes para separar cada ejercicio. La estructura recomendada es la siguiente:
~~~
GuiaJavaEvaluativa/
├── src/
│   └── main/
│        ├── ejercicio1/
│        │   └── Ejercicio1.java
│        ├── ejercicio2/
│        │   └── Ejercicio2.java
│        ├── ejercicio3/
│        │   └── Ejercicio3.java
│        ├── ejercicio4/
│        │   └── Ejercicio4.java
│        └── ejercicio5/
│            └── Ejercicio5.java
└── README.md
~~~

## Instrucciones Generales

- **Trabajo en Equipo:** Máximo 5 integrantes por grupo.
- **Representante:** Solo un miembro debe subir la solución final a GitHub.
- **Control de Versiones:** Utilizar GitHub para gestionar el trabajo colaborativo y evidenciar la participación individual mediante commits.
- **Fecha Límite:** 01 de marzo, 11:59 p.m.
- **Formato de Entrega:**
    - Proyecto Java completo, con cada ejercicio en su archivo `.java`.
    - Documento (Word o PDF) que incluya:
        - Portada con el nombre de usuario de GitHub.
        - Enlace al repositorio público.
        - Enlace al vídeo demostrativo.
- **Vídeo Demostrativo:**
    - Duración máxima de 10 minutos (aproximadamente 2 minutos por ejercicio).
    - Debe mostrar el código fuente, una breve explicación y el funcionamiento de cada ejercicio.
- **Código:**
    - Incluir validación de datos y manejo de errores (try-catch).
    - Comentar el código (autor y fecha).

## Detalles de Ejercicios

### Ejercicio 1: Importadora de Vehículos

- **Objetivo:** Calcular el precio final de importación de un vehículo, considerando:
    - Impuesto (según la antigüedad del vehículo).
    - Flete marítimo (según país de origen y tipo de vehículo).
    - Primera matrícula (según el año del vehículo).
- **Salida:**
    - Datos del vehículo: tipo, marca y año.
    - Información de importación: porcentaje y costo del impuesto, lugar y costo del flete, matrícula inicial y total de importación.

### Ejercicio 2: Encomiendas Express

- **Objetivo:** Calcular el costo final de envío de un paquete, considerando:
    - Tarifa por peso.
    - Tarifa por distancia.
    - Cargo adicional por envío express.
    - Descuento para clientes con tarjeta VIP.
- **Salida:**
    - Datos del paquete (peso y tarifa aplicada).
    - Datos del envío (distancia y tarifa aplicada).
    - Subtotales y precio total a pagar, con cargos y descuentos aplicados.

### Ejercicio 3: Alquiler de Jet Privados

- **Objetivo:** Calcular el costo total del alquiler de un jet (Light Jet o Super Jet), considerando:
    - Precio por hora según el tipo de jet.
    - Descuentos según la cantidad de horas alquiladas.
- **Salida:**
    - Nombre y apellidos del cliente.
    - Tipo de jet a alquilar.
    - Cantidad de horas de alquiler.
    - Precio con descuento y monto total a pagar.

### Ejercicio 4: Descuento de Matrícula

- **Objetivo:** Calcular el costo de matrícula de un estudiante aplicando:
    - Descuento del 25% para antiguos ingresos.
    - Tarifas de matrícula diferenciadas por edad.
- **Salida:**
    - Nombre y apellido del estudiante.
    - Costo de la matrícula.
    - Descuento aplicado.
    - Valor final de la matrícula.

### Ejercicio 5: Pago de Horas Extras

- **Objetivo:** Calcular el pago de horas extras para N empleados, considerando:
    - Salario base y horas extras trabajadas (máximo 20 horas mensuales).
    - Bonos por hora según el departamento (Gerencia, Auditoria, Tecnología y Contabilidad).
- **Salida:**
    - Datos del empleado: nombre, salario, departamento y horas extras.
    - Cálculo del pago total de horas extras.

## Requisitos Técnicos

- **Lenguaje de Programación:** Java (consola o Java Swing).
- **Validación de Datos:** Verificar que los campos no estén vacíos y contengan datos correctos.
- **Manejo de Errores:** Uso de try-catch para gestionar excepciones.
- **Comentarios en el Código:** Cada archivo debe incluir comentarios explicativos, indicando autor y fecha.

## Enlaces Importantes

- **Repositorio GitHub:** [https://github.com/franc1sc0sv/GuiaDeEjercicios1Java)
- **Vídeo Demostrativo:** [https://www.youtube.com/tu_video](https://www.youtube.com/tu_video)
