```java
package cl.kibernumacademy.services;

import java.util.ArrayList;
import java.util.List;

import cl.kibernumacademy.model.Contact;

public class ContactManager {
  private List<Contact> contactos = new ArrayList<>();

  public void agregarContacto(Contact contacto) {
    contactos.add(contacto);
  }

  public List<Contact> obtenerContactos() {
    return contactos;
  }

}
```