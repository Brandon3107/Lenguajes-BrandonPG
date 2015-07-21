package Collection;

import java.util.Comparator;

public class UsuarioPorEmail  implements Comparator<Usuario>{

    public int compare(Usuario o1, Usuario o2) {
        return (o1.getEmail().compareTo(o2.getEmail()));
    }
    
}
