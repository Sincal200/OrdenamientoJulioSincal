package gt.edu.umg.progra3.parcial1;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager<T> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        Collections.sort();
        return null;
    }

    public List<T> ordenarInversa(){
        //inserte codigo aqui
        return values;
    }

}
