import java.util.Objects;

public class ComplexNumber{
    private float realPart;
    private float imaginaryPart;
    public static final double integralPart = Math.sqrt(-1);

    public ComplexNumber() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public ComplexNumber(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    //The question said the add method should be an instance method
    public ComplexNumber addComplexNumbers(ComplexNumber values){
        float sumOfRealPart;
        sumOfRealPart = realPart + values.realPart;
        float sumOfImaginaryPart;
        sumOfImaginaryPart = imaginaryPart + values.imaginaryPart;
        return new ComplexNumber(sumOfRealPart, sumOfImaginaryPart);
    }

    //This method is static because the question said it should be a function
    public static ComplexNumber subtractComplexNumbers(ComplexNumber expression1, ComplexNumber expression2){
        float differenceOfRealPart = expression1.realPart - expression2.realPart;
        float differenceOfImaginaryPart = expression1.imaginaryPart - expression2.imaginaryPart;
        return new  ComplexNumber(differenceOfRealPart, differenceOfImaginaryPart);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof ComplexNumber)) return false;
        ComplexNumber other = (ComplexNumber) obj;
        return Float.compare(other.realPart, realPart) == 0 && Float.compare(other.imaginaryPart, imaginaryPart) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }

}
