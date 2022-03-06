import Model.Food;

public class MyFoodMenu {
    public static void main(String[] args) {
        Food[] myMenu = new Food[5];

        myMenu[0] = new Food("001","Nasi Putih","Makanan",5000);
        myMenu[1] = new Food("002","Chicken Smash","Makanan",12000);
        myMenu[2] = new Food("003","Tempe Underpressure","Makanan",4000);
        myMenu[3] = new Food("004","Cute Es teh","Minuman",3000);
        myMenu[4] = new Food("005","Lalapan","Makanan",2000);

        for (int indexArrayMenu=0;indexArrayMenu< myMenu.length;indexArrayMenu++){
            myMenu[indexArrayMenu].PrintFoodMenu();
        }
    }
}
