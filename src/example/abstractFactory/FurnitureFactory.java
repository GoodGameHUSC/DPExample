package example.abstractFactory;

public class FurnitureFactory {

    public static IFurnitureFactory createFactory(FurnitureType type) {
        switch (type) {
        case Plastic:
            return new PlasticFactory();

        case Wood:
            return new WoodFactory();

        default:
            return null;
        }
    }

    public static enum FurnitureType {
        Plastic, Wood
    }
}
