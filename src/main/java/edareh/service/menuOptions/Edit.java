package edareh.service.menuOptions;

import edareh.dao.EditDao;
import edareh.entity.PersonelData;

import java.util.Scanner;

public class Edit {
    PersonelData personelData = new PersonelData();
    EditDao editDao = new EditDao();
    Scanner scanner = new Scanner(System.in);
    public void editFirstName(){

        System.out.println("Please enter your nationalCode for edit your information : ");
        String nCode = scanner.next();
        System.out.println("enter your name : ");
        String nChange = scanner.next();
        personelData.setName(nChange);
        editDao.editNameDao(nCode);
    }
    public void editLastName(){
        System.out.println("Please enter your nationalCode for edit your information : ");
        String n2Code = scanner.next();
        System.out.println("enter your Lastname : ");
        String n2Change = scanner.next();
        personelData.setLasteName(n2Change);
        editDao.editLastNameDao(n2Code);
    }
    public void editAge(){
        System.out.println("Please enter your nationalCode for edit your information : ");
        String n3Code = scanner.next();
        System.out.println("enter your age : ");
        String n3Change = scanner.next();
        personelData.setAge(n3Change);
        editDao.editAgeDao(n3Code);
    }
}
