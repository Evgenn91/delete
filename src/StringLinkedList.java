import java.util.HashMap;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public static String greet(String language){
        HashMap<String, String> countires = new HashMap<>();
        countires.put("english", "Welcome");
        countires.put("czech", "Vitejte");
        countires.put("danish", "Velkomst");
        countires.put("dutch", "Welkom");
        countires.put("estonian", "Tere tulemast");
        countires.put("finnish", "Tervetuloa");
        countires.put("flemish", "Welgekomen");
        countires.put("french", "Bienvenue");
        countires.put("german", "Willkommen");
        countires.put("irish", "Failte");
        countires.put("italian", "Benvenuto");
        countires.put("latvian", "Gaidits");
        countires.put("lithuanian", "Laukiamas");
        countires.put("polish", "Witamy");
        countires.put("spanish", "Bienvenido");
        countires.put("swedish", "Valkommen");
        countires.put("welsh", "Croeso");

        return countires.get(language);
    }



    public String get(int index) {
        //напишите тут ваш код
        Node currectNode = first;
        int count = -1;
        while (count != index){
            currectNode = currectNode.next;
            if(currectNode == null)
                break;
            count++;
        }
        return currectNode != null ? currectNode.value : null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
