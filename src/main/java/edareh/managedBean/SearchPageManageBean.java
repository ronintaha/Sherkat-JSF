package edareh.managedBean;

import edareh.dao.PersonelDao;
import edareh.entity.Personnel;
import edareh.service.PersonnelService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class SearchPageManageBean {

    @Inject
    PersonnelService personnelService;

    private Personnel personnel;

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }
    @PostConstruct
    public void init(){
        personnel = new Personnel();
    }

    public void getInformation(){
        personnelService.getInformation();
    }

}
