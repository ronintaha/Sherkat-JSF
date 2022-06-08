package edareh.entity;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class MassagesData {
    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    private String massage;
    private String massage1;

    private String massage2;

    private String massageLeave;

    private String massageConfirm;

    private String massageCheck;

    public String getMassageCheck() {
        return massageCheck;
    }

    public void setMassageCheck(String massageCheck) {
        this.massageCheck = massageCheck;
    }

    public String getMassageConfirm() {
        return massageConfirm;
    }

    public void setMassageConfirm(String massageConfirm) {
        this.massageConfirm = massageConfirm;
    }

    public String getMassageLeave() {
        return massageLeave;
    }

    public void setMassageLeave(String massageLeave) {
        this.massageLeave = massageLeave;
    }

    public String getMassage2() {
        return massage2;
    }

    public void setMassage2(String massage2) {
        this.massage2 = massage2;
    }

    private int manID;

    public int getManID() {
        return manID;
    }

    public void setManID(int manID) {
        this.manID = manID;
    }

    public String getMassage1() {
        return massage1;
    }

    public void setMassage1(String massage1) {
        this.massage1 = massage1;
    }

    PersonelData personelData = new PersonelData();
    VacationData vacationData = new VacationData();
    public void doInfo(){

        massage = "Mr "+personelData.getLasteName()+" your iformations are saved";
    }
    public void doVacation(){
        massage =  "Mr "+personelData.getLasteName()+" welcome , please chose the day of month you want to leave : ";
    }
    public void doDay(){
        massage1 = "Mr "+personelData.getLasteName()+ " you want to leave in "+ vacationData.getDayOfLeave()+ " om";
    }
    public void doManager(){
        if (manID==1234){
            massage2 = "Welcome manager, Enter national code of person for check his vacation request :  ";
        }else {
            massage2 = " You are not the manager";
        }

    }

    public void doLeave(){
        massageLeave =  "Mr "+vacationData.getlName()+ " want to leave in "+ vacationData.getDayOfLeave()+ " om , Do you confirm it ? ";
    }
    public void doconfirm(){
        massageConfirm = "saved";

    }
    public void doCheck(){
        massageCheck = "Mr "+vacationData.getlName()+" your vacation request has "+vacationData.getConfirm();
    }
}
