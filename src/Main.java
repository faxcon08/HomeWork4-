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

        // Sixth Task or 2.3
        System.out.println(ANSI_GREEN+"Sixth Task or 2.3"+ANSI_RESET);

        currentPlace = 103;

        if (currentPlace>=wagonCapacity){
            System.out.println("В вагоне нет мест");
        }
       else {
            if(currentPlace<sittingPlaces)
                System.out.println("В вагоне есть сидячие места");
            else
                System.out.println("В Вагне есть стоячие места");
        }// else

        // Seventh Task or 3.1
        System.out.println(ANSI_GREEN+"Seventh Task or 3.1"+ANSI_RESET);
        Age = 25;
        boolean goToKinderGarten = Age >2 && Age<=6;
        boolean goToSchool = Age >= 7 && Age < 18;
        boolean goToUniversity = Age > 18 && Age <=24;
        boolean goToWork = Age > 24;

        if(goToKinderGarten){
            System.out.println("Если возраст человека равен "+Age+" , то ему нужно ходить в детский сад");
        } else if(goToSchool){
            System.out.println("Если возраст человека равен "+Age+" , то ему нужно ходить в школу");
        } else  if (goToUniversity){
            System.out.println("Если возраст человека равен "+Age+" , то ему нужно ходить в университет");
        } else if(goToWork){
            System.out.println("Если возраст человека равен "+Age+" , то ему нужно ходить на работу");
        } else
            System.out.println("Если возраст человека равен "+Age+" , то он слишком мал");


        // Eighth Task or 3.2
        System.out.println(ANSI_GREEN+"Eighth Task or 3.2"+ANSI_RESET);
        int Age3 = 21;
        if(Age3<5)
            System.out.println("Ребенок не может кататься на аттракционе");
        else if(Age3>=5 && Age3<=14)
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        else
            System.out.println("Ребенок может кататься без сопровождения взрослого");

        // Ninth Task or 3.3
        System.out.println(ANSI_GREEN+"Ninth Task or 3.3"+ANSI_RESET);

    } // main
} // class Main