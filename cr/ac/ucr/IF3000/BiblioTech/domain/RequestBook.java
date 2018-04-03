
package cr.ac.ucr.IF3000.BiblioTech.domain;

import cr.ac.ucr.IF3000.BiblioTech.domain.Books;
import java.io.Serializable;


public class RequestBook extends Books implements Serializable{
    private String id_card;
    private int available;
    private String date_remove;
    private String date_delivey;
    
    //construtor

    public RequestBook() {
        
    }

    public RequestBook(String id_card, int available, String date_remove, String date_delivey, String title, String authors, String type, String code, int amount, int age) {
        super(title, authors, type, code, amount, age);
        this.id_card = id_card;
        this.available = available;
        this.date_remove = date_remove;
        this.date_delivey = date_delivey;
    }
    
    //setter's and getter's
    
    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getDate_remove() {
        return date_remove;
    }

    public void setDate_remove(String date_remove) {
        this.date_remove = date_remove;
    }

    public String getDate_delivey() {
        return date_delivey;
    }

    public void setDate_delivey(String date_delivey) {
        this.date_delivey = date_delivey;
    }
    
    
    //toString

    @Override
    public String toString() {
        return super.toString()+"RequestBook{" + "id_card="+ id_card+ ", available=" + available + ", date_remove=" + date_remove + ", date_delivey=" + date_delivey + '}';
    }
    
    
}
