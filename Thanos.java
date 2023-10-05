import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list

        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        Hero BlackWidow = new Hero("Black Widow", 34);
        Hero CaptainAmerica = new Hero("Captain America", 100);
        Hero Vision = new Hero("Vision", 3);
        Hero IronMan = new Hero("Iron Man", 48);
        Hero ScarletWitch = new Hero("Scarlet Witch", 29);
        Hero Thor = new Hero("Thor", 1500);
        Hero Hulk = new Hero("Hulk", 49);
        Hero DoctorStrange = new Hero("Doctor Strange", 42);

        heroes.add(BlackWidow); //index 0
        heroes.add(CaptainAmerica); //index 1
        heroes.add(Vision); //index 2
        heroes.add(IronMan); //index 3
        heroes.add(ScarletWitch); //index 4
        heroes.add(Thor); //index 5
        heroes.add(Hulk); //index 6
        heroes.add(DoctorStrange); //index 7

        // TODO 3 : It's Thor birthday, now he's 1501

        Thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list

        List<Hero> heroesStillAlive = heroes.subList(0,4);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        System.out.println("Les héros toujours en vie sont: ");
                for (Hero hero : heroesStillAlive){
            System.out.println("- " + hero.getName());
        };
    }
}
