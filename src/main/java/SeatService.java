import java.util.HashSet;

public class SeatService {

    public HashSet<Integer> economySeatMap;
    public HashSet<Integer> businesSeatMap;
    private boolean isOccupied;



    SeatService (){
  businesSeatMap =new HashSet<>();
  economySeatMap=new HashSet<>();

        for (int i = 1; i <=10 ; i++) {

            this.businesSeatMap.add(i);
        }

        for (int i = 11; i <=32 ; i++) {

            this.economySeatMap.add(i);
        }
    }


public boolean isOccupied(int seatNo){

    if (seatNo<0&&seatNo>=32){
        System.out.println("Koltuk numarasi 0 dan kucuk 32 den buyuk olamaz.");
        return false;
    }

    for (Integer w:this.economySeatMap) {
        if (w==seatNo){
            return true;
        }
    }


    for (Integer w:this.businesSeatMap) {
        if (w==seatNo){
            return true;
        }
    }

    return false;
}



   public void occupySeat(Seat seat,int no){



        if (isOccupied(no)){

          if (no>10){
              this.economySeatMap.remove(no);
          }else {
              this.businesSeatMap.remove(no);
          }
          seat.setSitNo(no);
          System.out.println(no+"numarali koltugunuz rezerve edilmistir.");

      } else System.out.println("Sectiginiz koltuk baskasi tarafindan rezerve edilmis.");
   }



}
