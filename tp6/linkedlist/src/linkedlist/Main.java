package linkedlist;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Client> file = new LinkedList<>();
        file.add(new Client(1, "Ali"));
        file.add(new Client(2, "Asma"));
        System.out.println(file);
        Client servi = file.poll();
        System.out.println("Client servi : " + servi);
        file.addLast(new Client(3, "Hiba"));
        System.out.println("Premier : " + file.peek());
    }
}