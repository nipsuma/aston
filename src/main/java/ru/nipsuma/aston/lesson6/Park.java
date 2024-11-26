package ru.nipsuma.aston.lesson6;

public class Park {

    private String title;
    private Attraction[] attractions;

    public Park(Attraction[] attractions) {
        this.attractions = attractions;
    }

    public static class Attraction {
        private String title;
        private String workingHours;
        private Double price;

        public Attraction(String title, String workingHours, Double price) {
            this.title = title;
            this.workingHours = workingHours;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Attraction[] attractions = new Attraction[3];
        attractions[0] = new Attraction("Мертвая петля", "8:00-20:00", 500.0);
        attractions[1] = new Attraction("Штопор", "10:00-20:30", 693.5);
        attractions[2] = new Attraction("Сдохни или умри", "0:00-24:00", 2.0);
        Park park = new Park(attractions);
    }
}
