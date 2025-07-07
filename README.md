# ContactManager

## Enunciado del Ejercicio

### ACTIVIDAD:  
**Evalúa tu Código: Pruebas para un Sistema de Gestión de Contactos**

---

### Objetivo

Aplicar los conocimientos sobre pruebas unitarias, buenas prácticas de testing y herramientas como JUnit y Hamcrest, desarrollando un pequeño programa que permita administrar una lista de contactos y evaluar su funcionalidad mediante pruebas automatizadas.

---

### Instrucciones

1. **Crea un proyecto llamado `ContactManager`**  
   Este proyecto será un sistema para gestionar contactos: agregar, eliminar y buscar contactos.

2. **Implementa las pruebas utilizando el ciclo RED-GREEN-REFACTOR.**

3. **Funciones a implementar:**
   - **Agregar un contacto:**  
     Cada contacto debe tener un nombre, un número de teléfono y un correo electrónico.  
     Debe añadirse correctamente a una lista de contactos.
   - **Eliminar un contacto:**  
     Eliminar un contacto por su correo electrónico (email).  
     *Nota:* Eliminar por nombre puede causar problemas si hay nombres repetidos. El email es un identificador único y es una mejor práctica para evitar ambigüedades y errores.
   - **Buscar contactos por nombre:**  
     Mostrar todos los contactos cuyo nombre contenga una cadena dada (búsqueda parcial).

4. **Implementa pruebas unitarias que incluyan:**
   - Aserciones tradicionales de JUnit.
   - Aserciones con Hamcrest.
   - Uso de `assumeTrue()` o `assumingThat()`.
   - Pruebas parametrizadas.
   - Anotaciones `@BeforeEach` y `@AfterEach`.

---

### Requisitos Técnicos

- Java OpenJDK 17
- JUnit 5
- Hamcrest

---

### Estructura Sugerida

```
src/
  main/
    java/
      cl/
        kibernumacademy/
          contactmanager/
            Contact.java
            ContactManager.java
  test/
    java/
      cl/
        kibernumacademy/
          contactmanager/
            ContactManagerTest.java
```