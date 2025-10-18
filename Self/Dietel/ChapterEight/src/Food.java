public enum Food {
    APPLE("fruit", 52),
    BANANA("fruit", 89),
    CARROT("vegetable", 41);

    public final String classOfFood;
    public final int numberOfCalories;

    Food(String nameOfFood, int numberOfCalories) {
        this.classOfFood = nameOfFood;
        this.numberOfCalories = numberOfCalories;
    }

    public String getNameOfFood() {
        return classOfFood;
    }

    public int getNumberOfCalories() {
        return numberOfCalories;
    }

}
