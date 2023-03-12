package gt.edu.umg.progra3.parcial1;

import java.util.*;

public class StaticStructureManager<T> {

    T[] values ;

    public StaticStructureManager(T[] values) {
        this.values = values;
    }

    public T[] ordenar(){
        Arrays.sort(values, new Comparador());
        return values;
    }

    public T[] ordenarInversa(){
        Arrays.sort(values, new Comparador());
        Collections.reverse(Arrays.asList(values));
        return values;
    }


}
