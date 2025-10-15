public class Main {
    public static void main(String[] args) {


        String name="BroCode ";


        int len = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("");
        int Lastindex = name.lastIndexOf("o");

//          name=name.toLowerCase();
//          name=name.toUpperCase();
//          name=name.trim();
            name=name.replace("o","d");


        System.out.println("Last Index: " + Lastindex);
        System.out.println("len: " + len);
        System.out.println(" Index: " + index);
        System.out.println("letter: " + letter);
        System.out.println("Name: " + name);
        System.out.println(name.isEmpty()?"salut":"Bonjour");
        System.out.println(name.contains("d")?"salut":"Bonjour");

    }
}
















