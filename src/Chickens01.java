public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken = 4;
        int chickenCount = 8;
        int totalEggs;
        
        //Segunda Feira
        System.out.println("O Fazendeiro possui " + chickenCount + " galinhas");
        totalEggs = chickenCount * eggsPerChicken;
        
        //Terça Feira
        chickenCount++;
        totalEggs += chickenCount * eggsPerChicken;
        
        //Quarta Feira
        chickenCount = chickenCount / 2;
        totalEggs += (chickenCount * eggsPerChicken);        
        
        System.out.println(totalEggs);
    }   
}
