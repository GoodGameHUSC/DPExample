package example.factory;

public class Factory {

    // Factory Method DP with String
    public static Bank createBank(String type) {
        switch (type) {
        case "VBBank":
            return new VBBank();
        case "VietinBank":
            return new VietinBank();
        default:
            return null;
        }
    }

    // Factory Method DP with Enum

    public static Bank createBank(BankType type) {
        switch (type) {
        case VPBank:
            return new VBBank();
        case VietinBank:
            return new VietinBank();
        default:
            return null;
        }
    }

    public static enum BankType {
        VPBank, VietinBank
    }
}
