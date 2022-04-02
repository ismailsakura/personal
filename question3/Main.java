package question3;


public class Main {
    public static void main(String[] args) {
        DefaultFormatter defaultFormatter = new DefaultFormatter();

        System.out.println(defaultFormatter.format(100));
       // DecimalSeperatorFormatter decimalSeperatorFormatter=new DecimalSeperatorFormatter();
       // System.out.println(decimalSeperatorFormatter.format(2012576126));
        AccountingFormatter accountingFormatter=new AccountingFormatter();
        System.out.println(accountingFormatter.format(-30));
        BaseFormatter baseFormatter=new BaseFormatter();
        System.out.println(baseFormatter.format(15));
    }

}
