package gt.edu.umg.progra3.parcial1;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DinamicStructuresManager<T> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        Collections.sort(values, new Comparador()); //
        return values;
    }

    public List<T> ordenarInversa(){
        Collections.sort(values, new Comparador()); //
        Collections.reverse(values); //
        return values;
    }

}
