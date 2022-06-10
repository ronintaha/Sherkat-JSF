package edareh.managedBean;

import edareh.service.Massages;
import edareh.service.PersonnelService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class SignInPageManageBean {

    @Inject
    Massages massages;
    @Inject
    PersonnelService personnelService;

    public void doInfo(){
        massages.doInfo();
    }
    public void InsertInfo(){
        personnelService.InsertInfo();
    }

}
