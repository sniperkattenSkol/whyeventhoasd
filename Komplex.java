// Nils E Lindfors TE15 
// 2017-02-27
// 09:48
public class Komplex {

    double reel, imag;

    //Constructor without args
    Komplex() {}

    Komplex(double TempReel, double TempImag) {
        reel = TempReel;
        imag = TempImag;
        }

    // Adds two complex numbers
    Komplex add(Komplex a, Komplex b) {
        Komplex addXTmp = new Komplex();
        addXTmp.reel = a.reel + b.reel;
        addXTmp.imag = a.imag + b.imag;
        return addXTmp;

        }
    //INTE KLAR
    /* Multiplies two complex numbers
    String multiply(Komplex a, Komplex b) {
        Komplex multiXTmp = new Komplex();
        String llo = a.reel * b.reel + a.reel + "i" + a.imag * ;

        return multiXTmp;
        }
        */
        //räknar ut vinkeln
    double arg(Komplex a) {
        double vinkel = a.imag / a.reel;
        return Math.atan(vinkel);
    }

    //Kollar om de är lika
    boolean equals(Komplex a, Komplex b) {
        if (a.reel == b.reel && a.imag == b.imag) {
            return true;
        } else {
            return false;
        }

    }
    public String toString() {
        return reel + " + " + imag + "i";

    }

}

