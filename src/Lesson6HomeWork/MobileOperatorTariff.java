package Lesson6HomeWork;

public class MobileOperatorTariff {
    private double gb;
    private double minInUkr;
    private int smsCount;
    private double minCallsAbroad1;
    private double minCallsAbroad2;
    private double phoneBill;



    public MobileOperatorTariff(double gb, double minInUkr, int smsCount, double minCallsAbroad1, double minCallsAbroad2) {
        this.gb = gb;
        this.minInUkr = minInUkr;
        this.smsCount = smsCount;
        this.minCallsAbroad1 = minCallsAbroad1;
        this.minCallsAbroad2 = minCallsAbroad2;
        setPhoneBill(internetCosts() + callsInUkrCosts() + sms() + callsAbroad1() + callsAbroad2());


    }
    public double getPhoneBill() {
        return phoneBill;
    }

    public void setPhoneBill(double phoneBill) {
        this.phoneBill = phoneBill;
    }

    public double getGb() {
        return gb;
    }

    public void setGb(double gb) {
        this.gb = gb;
    }

    public double getMinInUkr() {
        return minInUkr;
    }

    public void setMinInUkr(double minInUkr) {
        this.minInUkr = minInUkr;
    }

    public double getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    public double getMinCallsAbroad1() {
        return minCallsAbroad1;
    }

    public void setMinCallsAbroad1(double minCallsAbroad1) {
        this.minCallsAbroad1 = minCallsAbroad1;
    }

    public double getMinCallsAbroad2() {
        return minCallsAbroad2;
    }

    public void setMinCallsAbroad2(double minCallsAbroad2) {
        this.minCallsAbroad2 = minCallsAbroad2;
    }


    public double internetCosts() {
        double sumForGb;
        if (gb <= 8){
            sumForGb = 0;
        }
        else {
            sumForGb = ((gb - 8.0) / 0.5) * 50.0;
        }
            return sumForGb;
        }

         public double callsInUkrCosts(){
            double min1 = 500;
            double min2 = minInUkr - min1;
            double sumForCallsInUkraine = (min1 * 0.5) + (min2 * 0.75);
            return sumForCallsInUkraine;
        }
         public double sms(){
            int sms1 = 50;
            int sms2 = smsCount - sms1;
            double sumForSms = 0;
            if (sms2 != 0 ) {
                sumForSms = 2.5;
            } else {
                sumForSms = 1;
            }
            return sumForSms;

        }
         public double callsAbroad1() {
            double sumForCallsAbroad1 = minCallsAbroad1 * 1.5;
            return sumForCallsAbroad1;
        }
         public double callsAbroad2(){
            double sumForCallsAbroad2 = minCallsAbroad2 * 2;
            return sumForCallsAbroad2;
        }
}
