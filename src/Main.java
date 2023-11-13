public class Main {
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("FNAF", 2023, 16),
                new Movie("Creed 3", 2022, 16)
        };
    }
    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Сергей Живописец", 2016, 16)
        };
    }
    public static void validEvent(Event event){
        if(event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle() == null){
            throw new RuntimeException("Mistake");
        }
    }
}
