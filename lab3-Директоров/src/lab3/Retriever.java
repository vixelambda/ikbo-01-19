package lab3;

class Retriever extends Dog {
    private String wool;
    public Retriever(int weight, int age, String color, String name, String wool) {
        super(weight, age, color, name);
        this.wool=wool;
    }
    public void displayInfo() {
        System.out.println("Вес: "+super.getWeight()+" Возраст: "+super.getAge()+" Цвет: "+super.getColor()+" Кличка: "+super.getName()+" Тип шерсти: "+wool);
    }
}