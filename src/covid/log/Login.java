package covid.log;

public class Login 
{
 private String id;
 private String pass;
 private String fullName;
 private String age;
 private String gender;
 private String contactNo;
 private String address;
 private String city;
 private String pin;
 private String status;
private String type;
    private String aadharNo;

    public Login() {
    }

    public Login(String id, String pass, String fullName, String age, String gender, String contactNo, String address, String city, String pin, String status, String type, String aadharNo) {
        this.id = id;
        this.pass = pass;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
        this.address = address;
        this.city = city;
        this.pin = pin;
        this.status = status;
        this.type = type;
        this.aadharNo = aadharNo;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }
}