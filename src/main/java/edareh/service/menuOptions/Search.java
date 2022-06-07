package edareh.service.menuOptions;

import edareh.dao.GetPersonelDao;
import edareh.entity.PersonelData;

import java.util.Scanner;


//import static edareh.dao.GetPersonelDao.getInformation;

public class Search {


    public static void search() {
        Scanner scanner1 = new Scanner(System.in);
        PersonelData personelData = new PersonelData();
        GetPersonelDao getPersonelDao = new GetPersonelDao();
        System.out.println("please enter the ID of person you want :");
        String id = scanner1.next();
//        System.out.println(getPersonByID(id).getName()+" "+getPersonByID(id).getLasteName()+ " is here!\n");
        getPersonelDao.getInformation();
        System.out.println("Information of person you want is : \n"+"Name : " + personelData.getName() +"\n" +"LastName : " +personelData.getLasteName()+ "\n" + "Age : " +personelData.getAge()+"\n");
        System.out.println("If you want to continue press any thing : ");
        String sabr = scanner1.next();

    }

//    public static PersonelData getPersonByID(String a){
//
//
//    for (int i = 0; i< DataStore.dataList.size(); i++){
//
//        if (DataStore.dataList.get(i).getId().equals(a)){
//            return DataStore.dataList.get(i);
//        }
//
//    }
//
//        return null;
//}
//    public static PersonelData getPersonByLastname(String b){
//
//        for (int i =0;i<DataStore.dataList.size();i++){
//            if (DataStore.dataList.get(i).getLasteName().equals(b)){
//                return DataStore.dataList.get(i);
//            }
//        }
//        return null;
//    }
}
