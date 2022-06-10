package edareh.service;

import edareh.dao.VacationDao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class VacationService {
    @Inject
    VacationDao vacationDao;

    public void creatTableVacation(){

        vacationDao.creatTableVacation();

    }
}
