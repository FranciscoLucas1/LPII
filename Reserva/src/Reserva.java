import com.sun.xml.internal.messaging.saaj.soap.GifDataContentHandler;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva
{
    private int numeroQuarto;
    private Date checkin;
    private Date checkout;


    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Reserva(int numeroQuarto, Date checkin, Date checkout) throws DatasException {

        Date hoje = new Date();
        if(checkin.before(hoje) || checkout.before(hoje)){
            throw new DatasException("Erro nas datas");
        }

        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }


    public String toString() {
        return "Reserva{" +
                "numeroQuarto =" + numeroQuarto +
                ", checkin =" + sdf.format(checkin) +
                ", checkout = " + sdf.format(checkout) +
                ", duracação = " + duracao() +
                '}';
    }
    public void atualizarDatas(Date checkin, Date checkout) throws DatasException{
        Date hoje = new Date();
        if(checkin.after(checkout)) {
            throw new DatasException("Datas inválidas! Check in maior que check out");
        }
        if(checkin.before(hoje) || checkout.before(hoje)){
            throw new DatasException("Erro datas passadas");
        }
        this.checkin = checkin;
        this.checkout = checkout;

    }

    public long duracao(){
        long dif = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);

    }
}