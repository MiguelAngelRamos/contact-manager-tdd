package cl.kibernumacademy.services;

import org.junit.jupiter.api.Test;

import cl.kibernumacademy.model.Contact;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


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

  @Test
  void eliminarContactoPorEmail_debeEliminarElContactoConEmailDado() {
    // Se espera que exista una clase ContactManager con un método agregarContacto
    ContactManager contactManager = new ContactManager();
    // Se espera que exista una clase Contact con un constructor que reciba nombre, numero telefono y correo electronico
    Contact contacto = new Contact("Sofia", "055-9491091940", "sofia@correo.cl");

     // Se espera que la instancia pueda acceder al metodo agregarContacto y que añada el contacto en una lista interna
    contactManager.agregarContacto(contacto);

    // Se espera que exista un método llamado eliminarContactoPorEmail, que elimine contacto
    contactManager.eliminarContactoPorEmail("sofia@correo.cl");

    assertThat(contactManager.obtenerContactos(), hasSize(0));

  }

  @Test
  void buscarContactoPorNombre_debeRetornarContactosQueContienenLaCadena() {
     // Se espera que exista una clase ContactManager con un método agregarContacto
    ContactManager contactManager = new ContactManager();
    contactManager.agregarContacto(new Contact("Sofia", "055-9491091940", "sofia@correo.cl"));
    contactManager.agregarContacto(new Contact("Sonia", "055-9491091940", "sonia@correo.cl"));
    contactManager.agregarContacto(new Contact("Richard", "055-9445171940", "richard@correo.cl"));
    contactManager.agregarContacto(new Contact("Margarita", "055-9491091940", "margarita@correo.cl"));

    /// ContactManager resultado = contactmanager.buscarContactoPorNombre();
    // var a partir de java 9
    var resultado = contactmanager.buscarContactoPorNombre("So");

    assertThat(resultado, hasSize(2));
    assertThat(resultado.get(0).getNombre(), containsString("So"));
    assertThat(resultado.get(1).getNombre(), containsString("So"));
   
  }
}
