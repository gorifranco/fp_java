package piles;

public class PilaIntegers<T> {
    private ElementInteger<T> inici;

    public boolean isEmpty(){
        return inici == null;
    }
    public void push(T valor){
        if(isEmpty()){
            inici = new ElementInteger<T>(valor, null);
        }else{
            inici = new ElementInteger<T>(valor, inici);
        }
    }
    public T peek(){
        try {
            return inici.getInfo();
        }catch (Exception e){
            return null;
        }
    }
    public void pop(){
        if(!isEmpty()) inici = inici.getSeguent();
    }
    public T poll(){
        T seguent = peek();
        pop();
        return seguent;
    }

    @Override
    public String toString() {
        String cadena = "";
        ElementInteger<T> e = inici;
        do{
            cadena += e.getInfo() + " ";
            e = e.getSeguent();
        }while(e != null);
        return cadena;
    }
}
