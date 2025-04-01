/*
 * UNIDAD EDUCATIVA TECNICO SALESIANO
 * Trabajo en grupo: vectores con MVC
 * Programado por: Juan Riquetti y Jhon Pambi
 * Curso: Segundo E1 - G2
 */
package actividad;

import actividad.Vistas.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    VistaPrincipal vista;
    Modelo modelo;
    VistaAcerca vistaAcer;
    VistaIngresarDatos vistaIngresar;
    VistaInstructivo vistaInst;
    VistaMostrarMayor vistaMost;
    VistaVector vistaVec;
    VistaListado vistaLis;

    public Controlador(VistaPrincipal vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vistaAcer = new VistaAcerca();
        this.vistaIngresar = new VistaIngresarDatos();
        this.vistaInst = new VistaInstructivo();
        this.vistaMost = new VistaMostrarMayor();
        this.vistaVec = new VistaVector();
        this.vistaLis = new VistaListado();
        
        vista.itmAcerca.addActionListener(this);
        vistaAcer.btnCerrar.addActionListener(this);
        
        vista.itmIngresar.addActionListener(this);
        vistaIngresar.btnCerrarIn.addActionListener(this);
        
        vista.itmMostrarM.addActionListener(this);
        vistaMost.btnCerrarMostrar.addActionListener(this);
        
        vista.itmInstructivo.addActionListener(this);
        vistaInst.btnCerrarInstruc.addActionListener(this);
        
        vista.itmVector.addActionListener(this);
        vistaVec.btnCerrarVector.addActionListener(this);
        
        vista.itmMostrarList.addActionListener(this);
        vistaLis.btnCerrarList.addActionListener(this);
        vista.itmVector.addActionListener(this);
        vistaVec.btnCerrarVector.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object buttonPressed = ae.getSource();
        if (buttonPressed == vista.itmAcerca) {
            vistaAcer.setVisible(true);
        } else if (buttonPressed == vistaAcer.btnCerrar) {
            vistaAcer.setVisible(false);

        } else if (buttonPressed == vista.itmIngresar) {
            vistaIngresar.setVisible(true);
        } else if (buttonPressed == vistaIngresar.btnCerrarIn) {
            vistaIngresar.setVisible(false);
            
        }else if(buttonPressed == vista.itmMostrarM){
            vistaMost.setVisible(true);
        }else if(buttonPressed == vistaMost.btnCerrarMostrar){
            vistaMost.setVisible(false);
            
        }else if(buttonPressed == vista.itmInstructivo){
            vistaInst.setVisible(true);
        }else if(buttonPressed == vistaInst.btnCerrarInstruc){
            vistaInst.setVisible(false);
            
        }else if(buttonPressed == vista.itmVector){
            vistaVec.setVisible(true);
        }else if(buttonPressed == vistaVec.btnCerrarVector){
            vistaVec.setVisible(false);
            
        }else if(buttonPressed == vista.itmMostrarList){
            vistaLis.setVisible(true);
        }else if(buttonPressed == vistaLis.btnCerrarList){
            vistaLis.setVisible(false);
    }
}
}
