import java.sql.SQLOutput;
import java.text.ParseException;
    import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Check-in: ");
            Date checkin = sdf.parse(sc1.nextLine());
            System.out.println("Check-out: ");
            Date checkout = sdf.parse(sc1.nextLine());
            Reserva r = new Reserva(1, checkin, checkout);
            System.out.println(r);
            System.out.println("Atualizando reserva");
            System.out.println("Check-in: ");
            checkin = sdf.parse(sc1.nextLine());
            System.out.println("Check-out: ");
            checkout = sdf.parse(sc1.nextLine());
            r.atualizarDatas(checkin, checkout);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido");
        }
        catch(DatasException e){
            System.out.println(e.getMessage());
        }


    }
}
