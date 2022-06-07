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

    public void doInfo(){
        PersonelData personelData = new PersonelData();
        massage = "Mr "+personelData.getLasteName()+" your iformations are saved";
    }
}
