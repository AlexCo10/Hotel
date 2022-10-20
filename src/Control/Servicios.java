
package Control;
import Modelo.Alquiler;
import Vista.Vista;

public class Servicios 
{
    public void Alquilar(Alquiler alquiler)
    {
        try
        {
            UsuarioServicios us = new UsuarioServicios();
            us.guardar(Conexion.obtener(), alquiler.getUsuario);
        } catch(Exception e){}
    }
    public void obtener(Vista vista)
    {
        String nombre = vista.txtNombre.getText();
        String identificacion = vista.txtDocumento.getText();
        String id = identificacion.substring(identificacion.length()-4, identificacion.length());
        String edad = edad = vista.txtEdad.getText();
    }
}
