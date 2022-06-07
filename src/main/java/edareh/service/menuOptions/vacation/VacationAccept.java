package edareh.service.menuOptions.vacation;

import edareh.dao.GetVacationDao;
import edareh.dao.VacationDao;
import edareh.entity.VacationData;

import java.util.Scanner;

import static edareh.dao.ConfirmDao.confirmData;
import static edareh.service.menuOptions.GUI.MenuBar.menu;

public class VacationAccept {
    public static void leaveAccept() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("please enter your manager id: (its: 1234) ");
        int mId = scanner3.nextInt();
        if (mId == 1234) {
            System.out.println("welcome manager: \n\n");
        } else {
            System.out.println("Wrong manager id!");
            try {
                menu();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("enter NationalCode of person you want for check his leave request: ");
        int ii = scanner3.nextInt();
//        if (ii == 0) {
//
//            PersonelData personelData = new PersonelData();
//            VacationData leave = new VacationData();
//
//            System.out.println(personelData.getLasteName() + " wants to leave " + "in " + leave.getDayOfLeave() + " om");
//        } else {
//            System.out.println("Out of range!");
//            try {
//                menu();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
       VacationDao vacationDao = new VacationDao();
//        vacationDao.insertVacation();
        GetVacationDao getVacationDao = new GetVacationDao();
       getVacationDao.getVacationDao(ii);
        VacationData vacationData = new VacationData();
        System.out.println(vacationData.getlName() + " wants to leave " + "in " + vacationData.getDayOfLeave()+ " om");



        System.out.println("if you want to confirm type 'confirmed' if you dont press else :");
        String conn = scanner3.next();

        if (conn.equals("confirmed")) {
//            ManagerData managerData = new ManagerData();

            vacationData.setConfirm(conn);
            System.out.println("saved");
            confirmData();

            try {
                menu();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
//            ManagerData managerData = new ManagerData();

            vacationData.setConfirm("not confirmed");
            confirmData();
            try {
                menu();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}