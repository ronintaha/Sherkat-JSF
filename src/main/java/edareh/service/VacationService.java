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
    public void confirmData(){
        vacationDao.confirmData();
    }
    public void getVacationDao(){
        vacationDao.getVacationDao();
    }
    public void insertVacation(){
        vacationDao.insertVacation();
    }
}
