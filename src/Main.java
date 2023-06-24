public class Main {
    public static void main(String[] args) {
        int ticketPrice = 8000; // стоимость билета
        int milesPerRubles = 20; // количество рублей для одной бонусной мили

        int bonusMiles = ticketPrice / milesPerRubles; // расчет количества бонусных миль
        System.out.println(bonusMiles); // вывод количества бонусных миль на экран
    }
}