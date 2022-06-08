package edareh.service;

import edareh.dao.PersonelDao;
import edareh.entity.PersonelData;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class PersonnelService {
    @Inject
    private PersonelDao personelDao;


    public void create(PersonelData personelData) {
        personelDao.create(personelData);
    }

    public void edit(PersonelData personelData) {
        personelDao.create(personelData);
    }

    public void delete(PersonelData personelData) {
        personelDao.create(personelData);
    }

    public List<PersonelData> findAll() {
        return personelDao.findAll();
    }

    public void findById(PersonelData personelData) {
        personelDao.create(personelData);
    }

    public void creatTable() {
        personelDao.createTable();
    }

}
