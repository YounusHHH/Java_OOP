
package printpro;

public class PrintPro {

    
    public static void main(String[] args) {
     Printer p1,p2,p3;
     p1=new CanonPro();
     p2=new canonOffice();
     p3=new CanonBasic();
     Printer [] printers={p1,p2,p3};
        for (Print p : printers) {
            if (p instanceof Fax)
            ((Fax)p).fax();
        }
     
     
    }
    
}
