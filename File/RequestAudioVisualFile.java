
package File;

import cr.ac.ucr.IF3000.BiblioTech.domain.RequestAudioVisual;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class RequestAudioVisualFile {
    
    //method to insert loan of books with serializable files
    public void insertLoanAudio(RequestAudioVisual insertLoan){
        FileOutputStream fos = null;
        ObjectOutputStream write = null;
        try {
            fos = new FileOutputStream("./LoanAudioVisual.dat");
            write = new ObjectOutputStream(fos);
            write.writeObject(insertLoan);
        } catch (FileNotFoundException fnte) {
        }catch(IOException ioe){
        }finally {
            try {
                if(fos!=null) fos.close();
                if(write!=null) write.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }//end method
    
    //save the object in arrayList
    public ArrayList<RequestAudioVisual> getLoanList() throws IOException{
        FileInputStream fis= null;
        ObjectInputStream read = null;
        ArrayList<RequestAudioVisual> arrayListOfLoan = null;
        RequestAudioVisual loanTemp;
        try {
            fis = new FileInputStream("./LoanAudioVisual.dat");
            read = new ObjectInputStream(fis);
            arrayListOfLoan = new ArrayList<>();
            loanTemp = (RequestAudioVisual)read.readObject();
            while(loanTemp != null){
                arrayListOfLoan.add(loanTemp);
                loanTemp = (RequestAudioVisual)read.readObject();
            }
        } catch (FileNotFoundException fnte) {
        }catch(IOException ioe){
        }catch(ClassNotFoundException cntf){
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (read != null) {
                    read.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return arrayListOfLoan;
    }//end method
}
