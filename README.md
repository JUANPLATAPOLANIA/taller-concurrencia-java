# Taller Concurrencia y Paralelismo en Java

## Integrantes
Juan David Plata Polania  
Cristian Alirio Ruiz Sarmiento

## Universidad
Ingeniería de Software

## Descripción
Taller sobre uso de hilos en Java para comprender paralelismo y concurrencia.
¿Qué diferencia existe entre paralelismo y concurrencia?

El paralelismo consiste en ejecutar múltiples tareas al mismo tiempo utilizando varios hilos o procesadores para acelerar el procesamiento. La concurrencia, en cambio, permite que varios hilos accedan o gestionen recursos compartidos de manera controlada, aunque no necesariamente se ejecuten exactamente al mismo tiempo.

¿Qué problema ocurre cuando varios hilos acceden al mismo recurso?

Cuando varios hilos acceden al mismo recurso al mismo tiempo pueden generarse inconsistencias en los datos, errores en los resultados o comportamientos inesperados en el programa.

¿Qué es una condición de carrera (Race Condition)?

Una condición de carrera ocurre cuando dos o más hilos acceden y modifican un mismo recurso compartido al mismo tiempo, provocando que el resultado final dependa del orden en que se ejecutan los hilos.

¿Por qué es importante sincronizar el acceso a recursos compartidos?

Es importante sincronizar el acceso a recursos compartidos para evitar inconsistencias en los datos, garantizar que solo un hilo modifique el recurso a la vez y mantener la integridad del sistema.
