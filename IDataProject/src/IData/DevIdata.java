package IData;

public class DevIdata extends BaseIdata {
    @Override
    public MainWork getMainWork() {
        return MainWork.Digital;
    }
    
    @Override
    public String getDepartment() {
        return "Development";
    }
}