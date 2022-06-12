package edareh.managedBean;

import edareh.entity.Personnel;
import edareh.service.PersonnelService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class SignInPageManageBean {


    @Inject
    PersonnelService personnelService;

    private Personnel personnel;
    private String message;

    @PostConstruct
    public void init() {
        personnel = new Personnel();
    }

    public void doInfo(){
        message = "Mr "+ personnel.getLasteName()+" your iformations are saved";
    }

    public void InsertInfo(){
        personnelService.InsertInfo(personnel);
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void createTablePersonnel() {
        personnelService.creatTablePersonnel();
    }

}
