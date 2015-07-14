package Collection;

import java.util.ArrayList;

public class ProbarArreglos {

    public static void main(String[] args) {
        
        GeneradorDeUsuarios gdu=new GeneradorDeUsuarios();
        gdu.AgregarUsuario("Chana", 20, "chiquitas_calientes@hotmail.com");
        ArrayList<Usuario> usuarios=(ArrayList<Usuario>) gdu.getUsuarios();
        System.out.println(usuarios.size());
        for(Usuario x:usuarios){
            System.out.println(x.getNombre());
        }
        
    }
    
}
