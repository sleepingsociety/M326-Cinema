import Model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jethif on 23.06.2017.
 */
public class CreateDemoData {
    public static void main(String [] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        ArrayList<String> times = new ArrayList<String>();
        times.add("15:00");
        times.add("17:30");
        times.add("18:00");
        times.add("20:15");

        ArrayList<Auditorium> auditoriums = new ArrayList<Auditorium>();
        for (int k = 0; k < 4; k++) {
            Auditorium auditorium = new Auditorium();
            auditorium.setAuditoriumName("Auditorium" + k);
            ArrayList<Row> rows = new ArrayList<Row>();
            for (int j = 0; j < 10; j++) {
                Row row = new Row();
                row.setRowName("" + letters[j]);
                ArrayList<Seat> seats = new ArrayList<Seat>();
                for (int i = 0; i < 10; i++) {
                    Seat seat = new Seat();
                    seat.setName("" + i + 1);
                    seat.setIsReserved(SeatStatus.Free);
                    seats.add(seat);
                }
                row.setSeats(seats);
                rows.add(row);
            }
            auditorium.setRows(rows);
            auditoriums.add(auditorium);
        }

        // First Movie
        Presentation presentation1 = new Presentation();
        presentation1.setPresentationTime("15:30");
        presentation1.setAuditorium(auditoriums.get(0));
        Presentation presentation2 = new Presentation();
        presentation2.setPresentationTime("18:30");
        presentation2.setAuditorium(auditoriums.get(2));
        Presentation presentation3 = new Presentation();
        presentation3.setPresentationTime("20:15");
        presentation3.setAuditorium(auditoriums.get(1));
        ArrayList<Presentation> presentations1 = new ArrayList<Presentation>();
        presentations1.add(presentation1);
        presentations1.add(presentation2);
        presentations1.add(presentation3);

        Movie movie1 = new Movie();
        movie1.setMovieTitle("Die Mumie");
        movie1.setMinAge(16);
        movie1.setMovieDescription("Eine einst mächtige Königin (Sofia Boutella aus Kingsman: The Secret Service und Star Trek Beyond) wird in unserer heutigen Zeit zu neuem Leben erweckt, nachdem sie vor Jahrhundert...");
        movie1.setMovieLength(110);
        movie1.setRating("5.8/10");
        movie1.setPresentations(presentations1);
        // Second Movie
        Presentation presentation4 = new Presentation();
        presentation4.setPresentationTime("15:30");
        presentation4.setAuditorium(auditoriums.get(1));
        Presentation presentation5 = new Presentation();
        presentation5.setPresentationTime("20:15");
        presentation5.setAuditorium(auditoriums.get(1));
        Presentation presentation6 = new Presentation();
        presentation6.setPresentationTime("21:15");
        presentation6.setAuditorium(auditoriums.get(0));

        ArrayList<Presentation> presentations2 = new ArrayList<Presentation>();
        presentations2.add(presentation4);
        presentations2.add(presentation5);
        presentations2.add(presentation6);

        Movie movie2 = new Movie();
        movie2.setMovieTitle("Churchill");
        movie2.setMinAge(12);
        movie2.setMovieDescription("Juni 1944. Die alliierten Streitkräfte, die das Nazi-besetzte Europa befreien sollen, erwarten an der Südküste Englands die Entscheidung Churchills (Brian Cox) über den tatsächlich...");
        movie2.setMovieLength(105);
        movie2.setRating("6.9/10");
        movie2.setPresentations(presentations2);

        // Third Movie
        Presentation presentation7 = new Presentation();
        presentation7.setPresentationTime("18:30");
        presentation7.setAuditorium(auditoriums.get(1));
        Presentation presentation8 = new Presentation();
        presentation8.setPresentationTime("20:15");
        presentation8.setAuditorium(auditoriums.get(0));
        Presentation presentation9 = new Presentation();
        presentation9.setPresentationTime("21:15");
        presentation9.setAuditorium(auditoriums.get(1));

        ArrayList<Presentation> presentations3 = new ArrayList<Presentation>();
        presentations3.add(presentation7);
        presentations3.add(presentation8);
        presentations3.add(presentation9);

        Movie movie3 = new Movie();
        movie3.setMovieTitle("The Boss Baby");
        movie3.setMinAge(6);
        movie3.setMovieDescription("He wears a suit, speaks with the voice and wit of Alec Baldwin, and stars in the animated comedy, DreamWorks' THE BOSS BABY. THE BOSS BABY is a hilariously universal story about ho...");
        movie3.setMovieLength(97);
        movie3.setRating("6.4/10");
        movie3.setPresentations(presentations3);

    }

    public static String getRandom(ArrayList<String> array) {
        int rnd = new Random().nextInt(array.size());
        return array.get(rnd);
    }
}
