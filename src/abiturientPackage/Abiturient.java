package abiturientPackage;

public class Abiturient {//id, Прізвище, Ім'я, По батькові, Адреса, Телефон, Середній бал.
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private String phoneNumber;
    private double averageMark;

    public void setId(int id) {
        this.id = id;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getId() {
        return id;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", averageMark=" + averageMark +
                '}';
    }
}

