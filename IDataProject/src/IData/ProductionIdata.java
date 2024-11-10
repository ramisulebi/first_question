package IData;

public class ProductionIdata extends BaseIdata {
    @Override
    public MainWork getMainWork() {
        return MainWork.Paper;
    }
    
    @Override
    public String getDepartment() {
        return "Production";
    }
}