package cl.kibernumacademy.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cl.kibernumacademy.model.Contact;

public class ContactManager {
  private List<Contact> contactos = new ArrayList<>();

  public void agregarContacto(Contact contacto) {
    contactos.add(contacto);
  }

  public List<Contact> obtenerContactos() {
    return List.copyOf(contactos); // Devuelve una copia inmutable de la lista de contactos
  }

  public void eliminarContactoPorEmail(String email) {
    Iterator<Contact> iterador = contactos.iterator();
    while(iterador.hasNext()) {
      Contact contacto = iterador.next();
      if(contacto.getEmail().equals(email)) {
        iterador.remove();
        break;
      }
    }
  }

  public List<Contact> buscarContactoPorNombre(String cadena) {
    List<Contact> resultadoBusqueda = new ArrayList<>();
    String filtro = cadena.toLowerCase();
    for(Contact contacto: contactos) {
      if(contacto.getNombre().toLowerCase().contains(filtro)) {
        resultadoBusqueda.add(contacto);
      }
    }
    // retornamos una lista inmutable para evitar modificaciones externas
    return List.copyOf(resultadoBusqueda);
  }



}
