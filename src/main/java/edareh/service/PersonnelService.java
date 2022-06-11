package edareh.service;

import edareh.dao.PersonelDao;
import edareh.entity.Personnel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class PersonnelService {
    @Inject
    private PersonelDao personelDao;
    @Inject
    private Personnel personnel;

//    public void create(Personnel personnel) {
//        personnelDao.create(personnel);
//    }

//    public void edit(Personnel personnel) {
//        personnelDao.create(personnel);
//    }

//    public void delete(Personnel personnel) {
//        personnelDao.create(personnel);
//    }

//    public List<Personnel> findAll() {
//        return personnelDao.findAll();
//    }

//    public void findById(Personnel personnel) {
//        personelDao.create(personnel);
//    }

    public void creatTablePersonnel() {
        personelDao.createTablePersonnel();
    }

    public void InsertInfo(){
        personelDao.InsertInfo(personnel);
    }

    public void getInformation(){
        personelDao.getInformation();
    }

}
