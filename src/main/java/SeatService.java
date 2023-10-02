import java.util.HashSet;

public class SeatService {

    public HashSet<Integer> economySeatMap;
    public HashSet<Integer> businesSeatMap;
    private boolean isOccupied;
    private Seat[][] seatMap;


    public SeatService(int row, int col) {
        this.seatMap = new Seat[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                seatMap[i][j] = new Seat();
            }
        }
    }

    public Seat[][] getSeatMap() {
        return seatMap;
    }

    public Seat getSeatByNumber(int row, int col) {
        if (row >= 0 && row < seatMap.length && col >= 0 && col < seatMap[0].length) {
            return seatMap[row][col];
        }
        return null;
    }

    public void bookSeat(int row, int col, String passenggerName, int age) {
        // TODO: YANLIS GIRILEN KOLTUK NUMARASINA HATA DONDUR
        Seat seat = getSeatByNumber(row, col);
        int halfRow = this.seatMap.length / 2;
        boolean checkBusiness = row < halfRow;

        if (seat != null && !seat.isOccupied()) {
            seat.setOccupied(true);
            seat.setPassengerName(passenggerName);
            seat.setAge(age);
            seat.setBusinessClass(checkBusiness);
            System.out.println("Koltuk rezerve edildi");
        } else {
            System.out.println("Koltuk gecersiz yada dolu");
        }
    }

    public void seatCheck(int row, int col) {
        Seat seat = seatMap[row][col];
        if (seat != null) {
            if (seat.isOccupied()) {
                System.out.println("Koltuk Dolu : " + seat.getPassengerName() + " Yas " + seat.getAge());
            } else {
                System.out.println("Koltuk Bos");
            }
        } else {
            System.out.println("Geçersiz koltuk numarası.");
        }
    }

    public void seatList() {
        Seat[][] seatMap = getSeatMap();
        for (int i = 0; i < seatMap.length; i++) {
            for (int j = 0; j < seatMap[i].length; j++) {
                Seat seat = seatMap[i][j];
                String status = seat.isOccupied() ? "Dolu" : "Bos";
                String businessCheck = seat.isBusinessClass() ? " Business Class " : " Economy Class ";
                String pessenger = seat.getPassengerName() != null ? " Yolcu adi : " + seat.getPassengerName() + businessCheck : "";
                System.out.println("Koltuk " + (i + 1) + "-" + (char) ('A' + j) + " = " + status + pessenger);
            }
        }
    }

}
