package edareh.managedBean;

import edareh.entity.PersonelData;
import edareh.service.PersonnelService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class PersonnelManagedBean {

    @Inject
    private PersonnelService personnelService;
    List<PersonelData> personelDatas;


    @PostConstruct
    public void init(){
        personelDatas = personnelService.findAll();
    }

    public void createTable() {
        personnelService.creatTable();
    }
}
