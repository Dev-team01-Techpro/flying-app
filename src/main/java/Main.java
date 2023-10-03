
public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
//        airplane.run();
        SeatService seatService = new SeatService(4,2);

        // Row ve col bilgisini scannerden alirken birer eksik almak gerekli

        seatService.bookSeat(1,1, "John Smith", 30);
        seatService.bookSeat(2,0, "David Brown", 40);

        seatService.seatCheck(1,1);
        seatService.seatCheck(0,1);
        seatService.seatCheck(0,1);

        seatService.seatList();


    }

}
