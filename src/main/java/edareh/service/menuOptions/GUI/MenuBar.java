package edareh.service.menuOptions.GUI;

import edareh.service.menuOptions.vacation.CheckVacation;

import java.util.Scanner;

import static edareh.service.menuOptions.PesonelInputs.personelInput;
import static edareh.service.menuOptions.Search.search;
import static edareh.service.menuOptions.vacation.VacationAccept.leaveAccept;
import static edareh.service.menuOptions.vacation.VacationRequest.leaveRequestInput;

public class MenuBar {
    public static void menu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("WELCOME\n\n");

        System.out.println("Press '1' for insert your information ");
        System.out.println("Press '2' for search your person ");
        System.out.println("press '3' for leave request ");
        System.out.println("press '4' if you are manager ");
        System.out.println("press '5' for checking your vacation request \n");
        System.out.print("Please select : ");
        int number = scanner.nextInt();


            switch (number){

                case 1 :
                    personelInput();

                    break;
                case 2:
                    search();
                    break;
                case 3:
                    leaveRequestInput();
                    break;
                case 4:
                    leaveAccept();
                case 5:

                    CheckVacation checkVacation = new CheckVacation();
                    checkVacation.checkVacation();
                case 0:
                    break;
                default:
                    System.out.println("select invalid");

            }
        }



    }

}
