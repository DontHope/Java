package inn.Homework4;

public class Mov2 {
    public static void main(String[] args) {
        Movie[] films = {new Movie("TheLordoftheRings", 8, "fantasy", "New Zeland", 11),
                new Movie("Time", 7, "action movie", "USA", 0),
                new Movie("gentlemen", 3, "action movie", "Great Britain", 0)
        };
        for (var i = 0; i < films.length; i++) {
            Movie currentCar = films[i];
            System.out.println(currentCar.name + " " + currentCar.rating + " " + currentCar.rating + currentCar.genre + " " + currentCar.country + " " + currentCar.oscar);
        }
    }
}
