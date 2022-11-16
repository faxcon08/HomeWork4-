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
        int wagonCapacity = 102;
        int sittingPlaces = 60;
        int currentPlace = 59;

        if (currentPlace>=wagonCapacity){
            System.out.println("В вагоне нет мест");
        }
        if(currentPlace<wagonCapacity){
            if(currentPlace<sittingPlaces)
                System.out.println("В вагоне есть сидячие места");
            if(currentPlace>=sittingPlaces)
                System.out.println("В Вагне есть стоячие места");
        }

        // Fourth Task or 2.1
        System.out.println(ANSI_GREEN+"Fourth Task or 2.1"+ANSI_RESET);
        Age = 18;
        if(Age>=18)
            System.out.println("Поздравляем с совершеннолетием");
        else
            System.out.println("Вы еще не достигли совершеннолетия, нужно немного подождать");

        // Fifth Task or 2.2
        System.out.println(ANSI_GREEN+"Fifth Task or 2.2"+ANSI_RESET);
        Age2 = 19;

        if(Age2>=24)
            System.out.println("Человек окончил университет и пора искать работу");
        else if(Age2>=18)
            System.out.println("Человек закончил школу и может отправляться в университет");
        else if(Age2>=7)
            System.out.println("Ребенок ходит в школу");
        else
            System.out.println("Ребенок ходит в детский сад или сидит дома");


    } // main
} // class Main