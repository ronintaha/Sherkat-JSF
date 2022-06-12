package edareh.service;

import edareh.dao.VacationDao;
import edareh.entity.Vacation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class VacationService {
    @Inject
    VacationDao vacationDao;


    public void creatTableVacation(){

        vacationDao.creatTableVacation();

    }
    public void confirmData(Vacation vacation){
        vacationDao.confirmData(vacation);
    }
    public Vacation getVacationDao(String nationalCode){
       return vacationDao.getVacationDao(nationalCode);
    }
    public void insertVacation(Vacation vacation){
        vacationDao.insertVacation(vacation);
    }
    public Vacation getInformationForVacation(String nationalCode){
       return vacationDao.getInformationForVacation(nationalCode);
    }
}
