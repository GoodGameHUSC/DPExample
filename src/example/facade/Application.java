package example.facade;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        FacadeService service = FacadeService.getINSTANCE();
        service.buy();
    }

}
