public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        int qntdOvosSeg, qntdOvosTer, qntdOvosQua;
        double dailyAverage, monthlyProfit, monthlyAverage;

        //Segunda Feira
        qntdOvosSeg = 100;
        //terça Feira
        qntdOvosTer = 121;
        //Quarta Feira
        qntdOvosQua = 117;
        
       dailyAverage = (qntdOvosSeg + qntdOvosTer + qntdOvosQua) / 3.0;
       
       monthlyAverage = dailyAverage * 30;
       
       monthlyProfit = monthlyAverage * 0.18;
        
       System.out.println("Daily Average:   " +dailyAverage);
       System.out.println("Monthly Average: " +monthlyAverage);
       System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
