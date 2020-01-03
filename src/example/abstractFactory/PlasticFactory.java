package example.abstractFactory;

public class PlasticFactory implements IFurnitureFactory {

    @Override
    public Chair createChair() {
        // TODO Auto-generated method stub
        return new ChairPlastic();
    }

    @Override
    public Table createTable() {
        // TODO Auto-generated method stub
        return new TablePlastic();
    }

}
