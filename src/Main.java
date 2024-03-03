//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human human = new Human(35, 75, "Moskow", "sport");
        System.out.println("Возраст " + human.age + ", вес " + human.weight + ", город " + human.address + ", профессия " +  human.work + ", имя " + human.name);
        Human human1 = new Human("Kira", 33);
        System.out.println("Возраст " + human1.age + ", вес " + human1.weight + ", город " + human1.address + ", профессия " +  human1.work + ", имя " + human1.name);
        Human human2 = new Human("Oleg", "Gr");
        System.out.println("Возраст " + human2.age + ", вес " + human2.weight + ", город " + human2.address + ", профессия " +  human2.work + ", имя " + human2.name);
        Human human3 = new Human("Andrey", 42, 88);
        System.out.println("Возраст " + human3.age + ", вес " + human3.weight + ", город " + human3.address + ", профессия " +  human3.work + ", имя " + human3.name);
        Human human4 = new Human("Kostea", 37, "shynomontaj");
        System.out.println("Возраст " + human4.age + ", вес " + human4.weight + ", город " + human4.address + ", профессия " +  human4.work + ", имя " + human4.name);
        System.out.println("radu");
        System.out.println("Katea");
        System.out.println("Alisa");
    }

}