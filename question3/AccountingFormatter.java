package question3;

public class AccountingFormatter implements NumberFormatter {


    @Override
    public String format(int n) {
        String formattedNumber=Integer.toString(n);
        if(n>0) {
            formattedNumber = String.valueOf(n);
        }
        else
        {
            formattedNumber="("+n*(-1)+")";

        }
        return formattedNumber;
    }
}
