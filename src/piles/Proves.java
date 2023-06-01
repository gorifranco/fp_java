package piles;

import java.sql.DriverManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Proves {
    public static void main(String[] args) {
ArrayList<String> a = new ArrayList<>();
a.add("asd");


    }
    public void provaPilaStack() {
        Stack<Preferencia> provaStack = new Stack<>();
        provaStack.push(new Preferencia(1, "plat1"));
        System.out.println(provaStack.peek());
        provaStack.pop();
        System.out.println(provaStack.empty());
    }
    public void provaPilaArrayDeque(){
        ArrayDeque<Preferencia> provaDeque = new ArrayDeque<>();
        provaDeque.addFirst(new Preferencia(1, "p1"));
        provaDeque.add(new Preferencia(3, "p2"));
        System.out.println(provaDeque.removeFirst());
    }
    public void provesHashSet(){
        HashSet<Preferencia> hs = new HashSet<>();
        Preferencia p1 = new Preferencia(1, "Paella");
        Preferencia p2 = new Preferencia(2, "Pepito de pollo");
        hs.add(p1);
        hs.forEach(s -> System.out.println(s));
        hs.add(p1);
        hs.forEach(System.out::println);
        hs.add(p2);
        hs.forEach(System.out::println);
        System.out.println(hs.contains(p1));
        System.out.println(hs.size());
        hs.remove(p1);
        System.out.println(hs.contains(p1));
        System.out.println(hs.isEmpty());
    }
    public void provesHashSet2(){
        HashSet<Preferencia> hs2 = new HashSet<>();
        Preferencia p1 = new Preferencia(1, "Paella");
        Preferencia p2 = new Preferencia(2, "Pepito de pollo");
        hs2.add(p1);
        hs2.forEach(s -> System.out.println(s));
        hs2.add(p1);
        hs2.forEach(System.out::println);
        hs2.add(p2);
        hs2.forEach(System.out::println);
        System.out.println(hs2.contains(p1));
        System.out.println(hs2.size());
        hs2.remove(p1);
        System.out.println(hs2.contains(p1));
        System.out.println(hs2.isEmpty());
    }
}
