package Collection;

import java.util.ArrayList;
import java.util.List;

public class GeneradorDeUsuarios {
    
    private List<Usuario> usuarios;
    
    public GeneradorDeUsuarios(){
        Usuario u1=new Usuario("Brandon", 20, "brandon_31pacheco@hotmail.com");
        Usuario u2=new Usuario("Abu", 21, "yosoyabu.freeman@hotmail.com");
        Usuario u3=new Usuario("Juanito", 19, "juanito@hotmail.com");
        
        usuarios=new  ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
