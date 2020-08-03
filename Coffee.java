public enum Coffee {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 20, 20, 7 ),
    CAPPUCCINO(200, 100, 12, 6);

    int water;
    int coffeeBeans;
    int milk;
    int cost;

    Coffee(int water, int milk, int coffeeBeans, int cost ){
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
        this.cost = cost;
    }
}
