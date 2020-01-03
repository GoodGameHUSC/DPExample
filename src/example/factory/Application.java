package example.factory;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        VBBank instance = (VBBank) Factory.createBank("VBBank");
        VietinBank instance2 = (VietinBank) Factory.createBank(Factory.BankType.VietinBank);
        System.out.println(instance.getBankName());
        System.out.println(instance2.getBankName());
        
        // OK
    }

}
