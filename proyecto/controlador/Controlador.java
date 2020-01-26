package proyecto.controlador;



import proyecto.Hilo_IniciarSesion;
import proyecto.modelo.Modelo_Usuario;
import proyecto.modelo.UsuarioVO;
import proyecto.vista.IniciarSesion;
import proyecto.vista.VistaAlumno;
import proyecto.vista.VistaProfesor;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador implements ActionListener, ListSelectionListener {


    Modelo_Usuario modelo;
    IniciarSesion vista;
    VistaAlumno vistaAlumno;
    VistaProfesor vistaProfesor;


    public void setModelo(Modelo_Usuario modelo) {
        this.modelo = modelo;
    }

    public void setVista(IniciarSesion vista) {
        this.vista = vista;
    }

    public void setVista(VistaAlumno vista) {
        this.vistaAlumno = vista;
    }
    public void setVista(VistaProfesor vista) {
        this.vistaProfesor = vista;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        String aux = e.getActionCommand();

        switch (aux) {

            case "Iniciar sesion":


                        UsuarioVO usuario = new UsuarioVO(vista.getTextFieldUsuario(), vista.getTextFieldContrasena());

                                    Hilo_IniciarSesion hilo1= new Hilo_IniciarSesion(usuario);
                                    hilo1.start();

                                    break;

            case "Crear calendario":




        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {


    }
}


