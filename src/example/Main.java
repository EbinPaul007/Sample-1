package example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Search Patient Details by typing Patient Name \n Type name here:   ");
        String PatientName=s.next();
        Patient1 P1=new Patient1();

            P1.setName('ram','tom','tim','john','jerry');
            P1.setAddress({"ACD HOUSE ERNAKULAM");
            P1.setPatientID(4567);
            P1.setRoomNo(12);

            //P1.changeRoomNo(45);




        if(PatientName.equals(P1.getName())){
            System.out.println("Name: " + P1.getName());
            System.out.println("Address: " + P1.getAddress());
            System.out.println("PatientID: " + P1.getPatientID());
            System.out.println("Room No: " + P1.getRoomNo());
        }
        else {
           System.out.println("No Patient is admitted in that name");
        }


    }
}
