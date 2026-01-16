/*
Problem Statement:
Create a HotelBooking class with attributes guestName, roomType, and nights.
Use default, parameterized, and copy constructors.
*/

class HotelBookingDetails {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBookingDetails() {
        this("Guest", "Standard", 1);
    }

    public HotelBookingDetails(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBookingDetails(HotelBookingDetails booking) {
        this(booking.guestName, booking.roomType, booking.nights);
    }

    public void display() {
        System.out.println(guestName + " | " + roomType + " | Nights: " + nights);
    }
}

public class HotelBooking {
    public static void main(String[] args) {
        HotelBookingDetails b1 = new HotelBookingDetails("Varun", "Deluxe", 3);
        HotelBookingDetails b2 = new HotelBookingDetails(b1);

        b2.display();
    }
}
