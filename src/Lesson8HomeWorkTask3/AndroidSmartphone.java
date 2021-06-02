package Lesson8HomeWorkTask3;

public class AndroidSmartphone extends Phone{
    String OS;
    String charge;
    String market;

    public AndroidSmartphone() {
        setOS("Android");
        setCharge("Type-C");
        setMarket("Play Market");
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }


    @Override
    public String operationSystem() {
        return getOS();
    }

    @Override
    public String chargingInterface() {
        return getCharge();
    }

    @Override
    public String appsMarket() {
        return getMarket();
    }
}

