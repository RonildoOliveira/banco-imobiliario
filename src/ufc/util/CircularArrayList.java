package ufc.util;

import java.util.ArrayList;

public class CircularArrayList<E> extends ArrayList<E> {

    @Override
    public E get(int index)
    {
        if(index < 0)
            index = index + size();

        return super.get(index);
    }
}
