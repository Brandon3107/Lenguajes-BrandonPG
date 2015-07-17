package Collection;

import java.util.Comparator;

public class UsuarioPorNombre  implements Comparator<Usuario>{

    public int compare(Usuario o1, Usuario o2) {
        return (o1.getNombre().compareTo(o2.getNombre()));
    }
    
}
