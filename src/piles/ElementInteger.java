package piles;

public class ElementInteger<T> {
    private T info;
    private ElementInteger<T> seguent;

    public ElementInteger(T info, ElementInteger<T> seguent) {
        this.info = info;
        this.seguent = seguent;
    }

    public T getInfo() {
        return info;
    }

    public ElementInteger<T> getSeguent() {
        return seguent;
    }

    public void setSeguent(ElementInteger<T> seguent) {
        this.seguent = seguent;
    }

    @Override
    public String toString() {
        return "ElementInteger{" +
                "info=" + info +
                '}';
    }
}
