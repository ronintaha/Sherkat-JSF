package edareh.entity;

public class VacationData {
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
        VacationData.lName = lName;
    }

    public  String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        VacationData.confirm = confirm;
    }

    public VacationData(){
        this.dayOfLeave=dayOfLeave;
//        leaveList1.add(this);
        DataStore.vacationDataList.add(this);
    }
//    public static List<VacationData> leaveList1 = new ArrayList<>();

    public int getDayOfLeave() {
        return dayOfLeave;
    }

    public void setDayOfLeave(int dayOfLeave) {
        this.dayOfLeave = dayOfLeave;
    }
}
