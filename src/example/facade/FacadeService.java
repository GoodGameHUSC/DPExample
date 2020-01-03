package example.facade;

public class FacadeService {

    private static FacadeService INSTANCE = new FacadeService();
    private ChildServiceFirst firstService;
    private ChildServiceSecond secondService;

    public FacadeService() {
        // TODO Auto-generated constructor stub

        this.firstService = new ChildServiceFirst();
        this.secondService = new ChildServiceSecond();
    }

    public static FacadeService getINSTANCE() {
        return INSTANCE;
    }

    public void buy() {
        this.firstService.sendEmail();
        this.secondService.payment();
    }
}
