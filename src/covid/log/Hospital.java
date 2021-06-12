package covid.log;

public class Hospital 
{
    private String name;
    private String contactNo;
    private String location;
    private String totalBeds;
    private String occupiedBeds;
    private String vaccineAvailability;
    private String doctor;
    private String doctorNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(String totalBeds) {
        this.totalBeds = totalBeds;
    }

    public String getOccupiedBeds() {
        return occupiedBeds;
    }

    public void setOccupiedBeds(String occupiedBeds) {
        this.occupiedBeds = occupiedBeds;
    }

    public String getVaccineAvailability() {
        return vaccineAvailability;
    }

    public void setVaccineAvailability(String vaccineAvailability) {
        this.vaccineAvailability = vaccineAvailability;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDoctorNo() {
        return doctorNo;
    }

    public void setDoctorNo(String doctorNo) {
        this.doctorNo = doctorNo;
    }
}
