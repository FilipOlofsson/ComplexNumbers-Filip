public class Complex {

    public Complex(double a, double b) {                // Constructor, har med a och b som argument där a
        this.re = a;                                    // är reella delen och b är imaginära delen
        this.im = b;
    }

    public double getRe() {                             // Getter för reella delen
        return re;
    }

    public double getIm() {                             // Getter för imaginära delen
        return im;
    }

    private double re;                                  // Reella delen
    private double im;                                  // Imaginära delen

    public String toString() {                          // Metod för att returnera hela complexa talet som en sträng
        return re + " + " + im + "i";                   // Sätt ihop talet och returna det
    }

    Complex add(Complex b) {                            // Additionsmetoden
        return new Complex(this.re + b.re, this.im + b.im); //Returnera ett nytt komplext tal som är summan av båda
    }

    Complex multiply(Complex b) {                       // Multiplikationsmetoden
        return new Complex(                             // Returnera det nya komplexa talet som är produkten av båda
                (this.re * b.re) + (this.im * b.im * -1),   // Reella delen
                (this.re * b.im) + (this.im * b.re));       // Komplexa delen
    }

    boolean equals(Complex b) {                         // equals metoden, returnar true om båda komplexa talen har likadana reella och imaginära delar.
        if(this.re == b.re && this.im == b.im) {
            return true;
        } else {
            return false;
        }
    }

    double arg() {                                      // Argumentmetoden
        return Math.atan(this.re/this.im);              // Returnera arctan av reella delen delat på imaginära delen
    }

}
