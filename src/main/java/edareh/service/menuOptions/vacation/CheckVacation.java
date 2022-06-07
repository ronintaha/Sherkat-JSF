package edareh.service.menuOptions.vacation;

import edareh.dao.GetVacationDao;
import edareh.entity.VacationData;

import java.util.Scanner;

//import static edareh.dao.GetVacationDao.getVacationDao;

public class CheckVacation {
    public  void checkVacation() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        VacationData vacationData = new VacationData();
        GetVacationDao getVacationDao = new GetVacationDao();
        System.out.println("please enter your national code : ");
        int ncode = scanner.nextInt();
       getVacationDao.getVacationDao(ncode);
        System.out.println("Mr "+vacationData.getlName()+" your vacation request has "+vacationData.getConfirm());
        Thread.sleep(500);



    }
}
