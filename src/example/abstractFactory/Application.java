package example.abstractFactory;

public class Application {
    // Example idea is from
    // https://gpcoder.com/4365-huong-dan-java-design-pattern-abstract-factory/
    // Abstract Factory is a method to solve too many factory problem
    // with solution is devide it to a m*n ( m is number of parent type, n is number
    // of child type)

    public static void main(String[] args) {
        PlasticFactory plasticFactory = (PlasticFactory) FurnitureFactory
                .createFactory(FurnitureFactory.FurnitureType.Plastic);
        WoodFactory woodFactory = (WoodFactory) FurnitureFactory.createFactory(FurnitureFactory.FurnitureType.Wood);

        System.out.println(plasticFactory.createTable().getTableName());
        System.out.println(plasticFactory.createChair().getChairName());
        System.out.println(woodFactory.createTable().getTableName());
        System.out.println(woodFactory.createChair().getChairName());
        
        // OK
    }

}
