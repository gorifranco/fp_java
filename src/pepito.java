public class pepito {

    public static void main(String[] args) {

        pepito p = new pepito();
        Edad has = new Edad();

        System.out.println(p.esPar(5));

    }

    public int suma(int a, int b){
        int resultado;
        resultado = a+b;
        return resultado;
    }

    public boolean esPar(int a){
        boolean par;
        if(a % 2 == 0){
            par = true;
        }else{
            par = false;
        }
        return par;
    }

    public void clase2(){

        System.out.println("hola :)");

    }


}
