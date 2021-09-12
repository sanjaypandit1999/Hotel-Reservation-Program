import com.bridgelabz.HotelReservation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    void givenHotelNameWhenAddedShoulReturnTrue() {
        System.out.println("Welcome to Hotel Reservation Program");
        HotelReservation hotelReservation = new HotelReservation();
        try{
            boolean hotelOne = hotelReservation.AddHotelToList("Lakewood", 110);
            boolean hotelTwo = hotelReservation.AddHotelToList("Bridgewood", 160);
            boolean hotelThree = hotelReservation.AddHotelToList("Ridgewood", 220);
            System.out.println(hotelReservation.hotelsList);
            Assertions.assertEquals(true, hotelOne);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
