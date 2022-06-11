package edareh.entity;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
public class Vacation {
    private static int dayOfLeave;
    private static String lName;
    private static String confirm;

    private static String nCode;

    public String getnCode() {
        return nCode;
    }

    public void setnCode(String nCode) {
        this.nCode = nCode;
    }



    public String getlName() {
        return lName;
    }

    public  void setlName(String lName) {
        Vacation.lName = lName;
    }

    public  String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        Vacation.confirm = confirm;
    }

    public Vacation(){
        this.dayOfLeave=dayOfLeave;
//        leaveList1.add(this);
//        DataStore.vacationDataList.add(this);
    }
//    public static List<Vacation> leaveList1 = new ArrayList<>();

    public int getDayOfLeave() {
        return dayOfLeave;
    }

    public void setDayOfLeave(int dayOfLeave) {
        this.dayOfLeave = dayOfLeave;
    }
}
