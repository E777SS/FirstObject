class Dog { //создаём класс
    int size;
    String breed;
    String name;

    void bark() { //создаём метод класса(поведение)
        System.out.println("Гав Гав!");
    }
}
class DogTest{ //создаём проверочный(тест) класс
    public static void main(String[] args) {
        Dog layka = new Dog(); //создаём объект
        layka.size = 40; //получаем доступ к переменным экземпляра и
        layka.bark();// методам через оператор доступа
    }
}
