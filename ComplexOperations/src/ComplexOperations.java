public class ComplexOperations {

    private double real;
    private double imaginary;

    public ComplexOperations(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add ( double real, double imaginary) {
        this.real += real;
        this.imaginary +=imaginary;
    }

    public void add ( ComplexOperations complexNo) {
        this.real += complexNo.real;
        this.imaginary += complexNo.imaginary;
    }

    public void subtract ( double real, double imaginary) {
        this.real -= real;
        this.imaginary -=imaginary;
    }

    public void subtract ( ComplexOperations complexNo) {
        this.real -= complexNo.real;
        this.imaginary -= complexNo.imaginary;
    }
}
