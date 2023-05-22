public class Cat {
    int age;
    String color = "orange";
    String breed = "oriental"; // дефолтное значение есть
    String name; // дефолтное значение null(нету)
    public static void main(String[] args){
        Cat Cat1 = new Cat();
        Cat Cat2 = new Cat();
        Cat Cat3 = new Cat();
        Cat Cat4 = new Cat();
        Cat1.age = 5;
        Cat1.color = "tricolor";
        Cat1.breed= "no";
        Cat1.name = "Tom";

        System.out.println(Cat1.name);
        System.out.println(Cat4.breed);

    }


}
