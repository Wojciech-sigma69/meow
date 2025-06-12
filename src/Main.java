public class Main {
    int id = 0;
    String brand = "";
    int year = 0;
    public Main(){
        id = 1 + id;
    }
    public static void main(String[] args){ 
        Main car = new Main();
        car.brand = "Ford";
        car.year = 2000;
        System.out.println(car.brand + car.year);
    }
}
