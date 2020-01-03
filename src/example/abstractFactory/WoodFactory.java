package example.abstractFactory;

public class WoodFactory implements IFurnitureFactory {

    @Override
    public Chair createChair() {
        // TODO Auto-generated method stub
        return new ChairWood();
    }

    @Override
    public Table createTable() {
        // TODO Auto-generated method stub
        return new TableWood();
    }

}
