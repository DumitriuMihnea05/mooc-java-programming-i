
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Inițializarea listei strings
        ArrayList<String> strings = new ArrayList<>();
        
        // Adăugarea elementelor în listă
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        // Afișarea listei înainte de a elimina elemente
        System.out.println(strings);

        // Apelarea metodei pentru a elimina ultimul element
        removeLast(strings);
        removeLast(strings);

        // Afișarea listei după eliminare
        System.out.println(strings); 
    }

    // Metodă pentru a elimina ultimul element din listă
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;  // Dacă lista e goală, nu face nimic
        } else {
            // Ștergerea ultimului element din listă
            strings.remove(strings.size() - 1);
        }
    }

}