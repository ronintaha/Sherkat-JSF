package edareh.service.menuOptions;

import edareh.dao.PersonelDao;
import edareh.entity.PersonelData;

import java.util.Scanner;

public class PesonelInputs {



    public static void personelInput() throws InterruptedException {

        System.out.println("please enter your information");
        Scanner scanner = new Scanner(System.in);

        System.out.println("your name ?");
        String name1 = scanner.next();
        System.out.println("your lastname ?");
        String lastname = scanner.next();
        System.out.println("your age?");
        String age = scanner.next();
        System.out.println("your NationalCode ?");
        String id = scanner.next();
        System.out.println("your information :");


        PersonelData personelData = new PersonelData();
        personelData.setName(name1);
        personelData.setLasteName(lastname);
        personelData.setAge(age);
        personelData.setNationalCode(id);
        System.out.println(personelData.getName() + "\t" + personelData.getLasteName() + "\t" + personelData.getAge() + "\t" + personelData.getNationalCode());


        try {
            PersonelDao personnelCRUD = new PersonelDao();
            personnelCRUD.create(personelData);
        }catch (Exception e){
            System.out.println("didnt saved at table");
        }

//       DataBase db = new DataBase();
//       db.insertClient(personelData,personelData.getId());


        System.out.println("if you want to continue press '0' :");

        int cunt = scanner.nextInt();
        if (cunt == 0) {
            System.out.println("processing...");
            Thread.sleep(500);
            System.out.println("Saved!");





        }
    }
}
