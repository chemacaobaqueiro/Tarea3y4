import datos.LerDatos;

import javax.swing.*;

public class ComprobarNumero implements Validador{
    public static void comprobador (){
        Integer opcion = LerDatos.LerEntero("Introduce un numero para comprobar paridad, o 0 para salir");
        if (opcion == 0){
            return;
        }else{
            if(Validador.esPar(opcion)){
                JOptionPane.showMessageDialog(null,"ES PAR");
            }else{
                JOptionPane.showMessageDialog(null, "ES IMPAR");
            }
            comprobador();
        }
    }
}
