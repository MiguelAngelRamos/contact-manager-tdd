package cl.kibernumacademy.services;

import org.junit.jupiter.api.Test;

import cl.kibernumacademy.model.Contact;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
public class ContactManagerTest {
  
  @Test
  void agregarContacto_debeAgregarUnContactoALaLista() {
    // Se espera que exista una clase ContactManager con un método agregarContacto
    ContactManager contactManager = new ContactManager();

    // Se espera que exista una clase Contact con un constructor que reciba nombre, numero telefono y correo electronico
    Contact contacto = new Contact("Sofia", "055-9491091940", "sofia@correo.cl");

    // Se espera que la instancia pueda acceder al metodo agregarContacto y que añada el contacto en una lista interna
    contactManager.agregarContacto(contacto);

    // Aqui validamos que la lista tenga solo un elemento
    assertThat(contactManager.obtenerContactos(), hasSize(1));
    assertThat(contactManager.obtenerContactos().get(0).getNombre(), is("Sofia"));
  }
}
