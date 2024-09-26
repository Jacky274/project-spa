package TestForHtml;
public class test {
    public static void main(String[] args) {
        final double rate = 0.0084;
        
        // 每月的利率
        double monthlyInterestRate = rate / 12;

        int b1 = 240000;
        int b2 = 1500000;

        // 计算一个月后的本利合
        double totalAmount1 = b1 * (1 + monthlyInterestRate);
        double totalAmount2 = b2 * (1 + monthlyInterestRate);

        

        System.out.println(totalAmount1+"    "+totalAmount2);
    }
}


