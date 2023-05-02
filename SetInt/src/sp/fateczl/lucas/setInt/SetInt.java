package sp.fateczl.lucas.setInt;

import sp.fateczl.lucas.listaInt.*;

public class SetInt extends Lista {
    
    @Override
    public void addFirst(final int valor) {
        if (!contains(valor)) {
            super.addFirst(valor);
        }
    }
    
    @Override
    public void addLast(final int valor) throws Exception {
        if (!contains(valor)) {
            super.addLast(valor);
        }
    }
    
    @Override
    public void add(final int valor, final int pos) throws Exception {
        if (!contains(valor)) {
            super.add(valor, pos);
        }
    }
    
    private boolean contains(int valor) {
        try {
            return super.contains(this, valor);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
