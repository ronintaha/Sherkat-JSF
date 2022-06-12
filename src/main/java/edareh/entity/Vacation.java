package edareh.entity;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
public class Vacation {
    private  int dayOfLeave;
    private  String lName;
    private  String confirm;

    private  String nCode;

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
        this.lName = lName;
    }

    public  String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public Vacation(){
//        this.dayOfLeave=dayOfLeave;
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
