public class Program {
    public static void main(String[] args) {

        Vacuum vc =  new Vacuum();

        vc.displayAttributes();

        vc.controlTemp();

        vc.setTemperature(-120);
        vc.controlTemp();
        vc.displayAttributes();







    }

}
