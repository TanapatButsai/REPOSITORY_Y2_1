import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int numSeat,k,count,numReserve,reserveRow,reserveColum;
        numSeat = sn.nextInt();
        if (numSeat <= 0){
            System.out.println("Error");
        } else if (numSeat > 40) {
            System.out.println("Error!");
        } else {
            numReserve = sn.nextInt();
            count = 0;
            k = numSeat / 6;
            String[][] seat = new String[k+1][6];
            for (int i = 0;i < k+1;i++){
                for (int j = 0;j < 6;j++){

                    if (count == numSeat){
                        break;
                    }
                    seat[i][j] = "X";
                    count += 1;
                }
            }
            //รับค่าการจอง
            for (int i = 0;i<numReserve;){
                reserveRow = sn.nextInt(); reserveColum = sn.nextInt();
                if (reserveRow-1 > k || reserveColum-1 > 6){
                    System.out.print(reserveRow +" "+ reserveColum +" Out of range!\n");
                } else if (reserveRow-1 == k && reserveColum > numSeat % 6) {
                    System.out.print(reserveRow +" "+ reserveColum +" Out of range!\n");
                } else {
                    seat[reserveRow-1][reserveColum-1] = "S";
                    i++;
                }

            }
//        ปริ้นที่นั่ง
            count = 0;
            for (int i = 0;i < k+1;i++){
                for (int j = 0;j < 6;j++){
                    if (count == numSeat){
                        break;
                    } else if (j == 5){
                        System.out.print(seat[i][j]+"\n");

                    }else {
                        System.out.print(seat[i][j]+" ");
                    }
                    count+=1;
                }
            }
        }
    }
}