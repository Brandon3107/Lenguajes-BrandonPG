package Collection;

import java.util.Comparator;

public class UsuarioPorEdad implements Comparator<Usuario>{
    
        public int compare(Usuario o1, Usuario o2) {
        return (o1.getEdad().compareTo(o2.getEdad()));
    }
    
}
