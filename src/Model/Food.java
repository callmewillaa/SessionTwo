package Model;

public class Food {
    private String food_code;
    private String food_name;
    private String food_category;
    private int food_price;

    public Food(String code, String name, String category, int price){
        this.food_code = code;
        this.food_name = name;
        this.food_category = category;
        this.food_price = price;
    }

    public void PrintFoodMenu(){
        System.out.println(food_code + " "+food_name+" " +food_category+ " "+food_price);
    }
}