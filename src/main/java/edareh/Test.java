package edareh;

import edareh.dao.PersonnelDao;
import edareh.entity.Personnel;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PersonnelDao personnelDao = new PersonnelDao();
        Personnel personnel = new Personnel();
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
//        personnel.setNationalCode(n);
        personnelDao.getInformation(n);
    }
}
