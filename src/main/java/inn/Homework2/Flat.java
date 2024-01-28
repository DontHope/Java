package inn.Homework2;

public class Flat {
    String kitchen;
        String bathroom;
        String bedroom;
    String balcony;
    String loggia;
    String wardrobe;

        public Flat(String kitchen, String bathroom, String bedroom, String balcony){
            this.kitchen = kitchen;
            this.bathroom = bathroom;
            this.bedroom = bedroom;
            this.balcony = balcony;
        }

        public Flat(String kitchen, String bathroom, String bedroom, String loggia, String wardrobe){
            this.kitchen = kitchen;
            this.bathroom = bathroom;
            this.bedroom = bedroom;
            this.loggia = loggia;
            this.wardrobe = wardrobe;

        }


    }
