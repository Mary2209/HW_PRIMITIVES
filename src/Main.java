public class Main {
    public static void main(String[] args) {
        int ticketPrice = 25491;
        int pricePerMile = 25;
        int miles = ticketPrice / pricePerMile;
        System.out.println("За билет стоимостью " + ticketPrice + " руб. будет начислено " + miles + " миль.");
    }
}