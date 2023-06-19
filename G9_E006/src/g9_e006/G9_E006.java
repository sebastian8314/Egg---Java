package g9_e006;

import Entidad.Curso;
import Servicio.CursoServicio;


public class G9_E006 {
    
    public static void main(String[] args) {
        
        
        CursoServicio cs = new CursoServicio();
        Curso c1 = cs.crearCurso();
        
        System.out.println(c1);
        System.out.println(" La ganacia semanal " + cs.calcularGanaciaSemanal(c1));
    }
    
}
