public class Main {
    public static void main(String[] args) {

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_GREEN = "\u001B[32m";

        // First Task
        System.out.println(ANSI_GREEN+"First Task"+ANSI_RESET);

        int Age=17;
        if(Age>=18)
            System.out.println("Поздравляем с совершеннолетием");
        if(Age<18)
            System.out.println("Вы еще не достигли совершеннолетия, нужно немного подождать");

        // Second Task
        System.out.println(ANSI_GREEN+"Second Task"+ANSI_RESET);
        int Age2 = 24;
        if(Age2>=7)
            System.out.println("Ребенок ходит в школу");
        if(Age2>=18)
            System.out.println("Человек закончил школу и может отправляться в университет");
        if(Age2>=24)
            System.out.println("Человек окончил университет и пора искать работу");

        // Third Task
        System.out.println(ANSI_GREEN+"Third Task"+ANSI_RESET);
    }
}