package view;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaA {

private String nuevaFecha;
    
    


    public void setNuevaFecha(String nuevaFecha) {
        this.nuevaFecha = nuevaFecha;
    }

    public String getNuevaFecha() {
        Calendar fecha = new GregorianCalendar();
        //usando el método get y el parámetro correspondiente
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        nuevaFecha = dia + "/" + (mes + 1) + "/" + anio;
        return nuevaFecha;
    }
    
    public static void main(String[] args) {
        FechaA y = new FechaA();
        String x;
        x = y.getNuevaFecha();
        System.out.println(x);
      }
}

