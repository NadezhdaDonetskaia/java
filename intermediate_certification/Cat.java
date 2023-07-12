package intermediate_certification;
public class Cat {
    // Поля класса Cat
    private String name;
    private int age;
    private String color;
    
    // Конструктор класса Cat
    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    // Метод для получения имени кота
    public String getName() {
        return name;
    }
    
    // Метод для получения возраста кота
    public int getAge() {
        return age;
    }
    
    // Метод для получения цвета кота
    public String getColor() {
        return color;
    }
    
    // Метод для изменения цвета кота
    public void setColor(String color) {
        this.color = color;
    }
    
    // Метод для вывода информации о коте
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " года");
        System.out.println("Цвет: " + color);
    }
}

