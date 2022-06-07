package edareh.service.menuOptions.jsfMethods;

import edareh.entity.MassagesData;
import edareh.entity.PersonelData;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class JsfListeners {
    public void informationConfirm(){

        MassagesData massagesData = new MassagesData();
        PersonelData personelData = new PersonelData();
        massagesData.setMassage("Mr your informations are saved.");
    }
}
