package hashmap;
import java.util.*;
public class Note{
    public static void main(String[] args) {
        HashMap<String, Double> notes = new HashMap<>(); 
        notes.put("Hiba", 17.5);
        notes.put("Asma", 18.0);
        notes.forEach((k, v) -> System.out.println("=> "+ k + " : " + v));
        System.out.println("=> Note Asma : " + notes.get("Asma"));
        notes.put("Hiba", 18.0);
        notes.remove("Asma");
        double somme = 0;
        for (double n : notes.values()) {
            somme += n;
        }
        System.out.println("=> Moyenne = " + (somme / notes.size()));
    }
}