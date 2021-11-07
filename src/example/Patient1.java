package example;

public class Patient1 {
    private String [] name;
    private String []  address;
    private int[] patientID;
    private int[] roomNo;

    public Patient1(String[] name, String[] address, int[] patientID, int[] roomNo) {
        this.name = name;
        this.address = address;
        this.patientID = patientID;
        this.roomNo = roomNo;
    }

    public String []  getName() {
        return name;
    }

    public void setName(String [] name) {
        this.name = name;
    }

    public String [] getAddress() {
        return address;
    }

    public void setAddress(String [] address) {
        this.address = address;
    }

    public int [] getPatientID() {
        return patientID;
    }

    public void setPatientID(int [] patientID) {
        this.patientID = patientID;
    }

    public int [] getRoomNo() {
        return roomNo;
    }
    //public void changeRoomNo(int newNum){
    //    this.roomNo=newNum;
   // }

    public void setRoomNo(int [] roomNo) {
        this.roomNo = roomNo;


    }
}