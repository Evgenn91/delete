import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.util.*;

public class Main {


//    Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files, а также метод openStream() класса URL.

    public static void main(String[] args) throws Exception {
    }

    public void testMethod(){
        System.out.println("fds");
    }




    public static int min(int a, int b){
        return Math.min(a, b);
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

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        HashMap<Integer, String> result = new HashMap<>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            result.put(i, programmingLanguages.get(i));
        }
        return result;
    }



    //========
    public static Integer min(ArrayList<Integer> list) {
        HashMap<String, Double> grades = new HashMap<>();
        grades.put("fdsf", 0.1);
        grades.put("fdsf", 0.1);
        grades.put("fdsf", 0.1);
        grades.put("fdsf", 0.1);
        grades.put("fdsf", 0.1);

        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        return Collections.binarySearch(list, key);
    }

    //====

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишите тут ваш код
        return new HashSet<>(Arrays.asList(strings));
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }

    private int size;
    private int capacity;
    private String[] elements;


    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        elements = Arrays.copyOf(elements,elements.length + (elements.length/2));
    }



    public static int countDigits(String string) {
        //напишите тут ваш код
        return string.length() - string.replaceAll("\\d", "").length();

    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        System.out.println(string.replaceAll("[a-zA-Zа-яА-Я]", ""));
        return string.length() - string.replaceAll("[a-zA-Zа-яА-Я]", "").length();
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        return string.length() - string.replaceAll(" ", "").length();
    }

//    public  String reverseString(String string) {
//        string.
//        //напишите тут ваш код
//        return new StringBuilder(string).reverse().toString();
//    }


}


class DataForConcreteUnit{
    private Integer code;
    private String number;

    public DataForConcreteUnit(Integer code, String number) {
        this.code = code;
        this.number = number;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "DataForConcreteUnit{" +
                "code=" + code +
                ", number='" + number + '\'' +
                '}';
    }
}
