package intermediate_certification;

public class CatCreate {
    public static void main(String[] args) {
        // Создание экземпляра класса Cat
        Cat cat = new Cat("Барсик", 3, "рыжий");
        
        // Использование методов класса Cat
        cat.printInfo();
        System.out.println("Изначальный цвет: " + cat.getColor());
        
        cat.setColor("черный");
        System.out.println("Новый цвет: " + cat.getColor());
    }
}
