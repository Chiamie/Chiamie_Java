import org.junit.jupiter.api.Test;

public class TestFood {
    @Test
    public void testFoodThatItDisplaysTheNamesAndTheirInformation() {
        for (Food food : Food.values()) {
            System.out.printf("%s: %s-%s, %s-%s%n", food, "class of food"
                    , food.classOfFood, "number of calories",
                    food.numberOfCalories);
        }
    }
}
