package edareh.managedBean;

import edareh.service.PersonnelService;
import edareh.service.VacationService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class WelcomePageManagedBean {

    @Inject
    private PersonnelService personnelService;
    @Inject
    private VacationService vacationService;






}
