package Collection;

import java.util.ArrayList;
import java.util.List;

public class GeneradorDeUsuarios {
    
    private List<Usuario> usuarios;
    
    public GeneradorDeUsuarios(){
        Usuario u1=new Usuario("Brandon", 20, "brandon_31pacheco@hotmail.com");
        Usuario u2=new Usuario("Abu", 21, "yosoyabu.freeman@hotmail.com");
        Usuario u3=new Usuario("Juanito", 19, "juanito@hotmail.com");
        Usuario u4=new Usuario("Pancha", 60, "pancha@hotmail.com");
        
        usuarios=new  ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public String AgregarUsuario(String Nombre, int Edad, String email){
        Usuario u=new Usuario(Nombre, Edad, email);
        usuarios.add(u);
        return "Hecho";
    }
    
}
