package edareh.entity;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class PersonelData {
    private static String name ;
    private static String lasteName;
    private static String age;
    private static String nationalCode;

    public PersonelData(){
        this.name=name;
        this.lasteName=lasteName;
        this.age=age;
        this.nationalCode = nationalCode;

//        list.add(this);
        DataStore.dataList.add(this);

    }
//    public static List<PersonelData> list = new ArrayList<>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasteName() {
        return lasteName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

//    public static PersonelData getPersonByID(String a){
//
//        for (int i=0;i<PersonelData.list.size();i++){
//
//
//            if (PersonelData.list.get(i).getId().equals(a)){
//                return list.get(i);
//            }
//
//
//        }
//return null;
//    }
//    public static PersonelData getPersonByLastname(String b){
//        for (int i =0;i<PersonelData.list.size();i++){
//            if (PersonelData.list.get(i).getLasteName().equals(b)){
//                return list.get(i);
//            }
//        }
//        return null;
//    }

}
