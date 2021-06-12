package covid.log;

public class Apply 
{
    private String id;
    private String name;
    private String contactNo;
    private String date;
    private String time;
    private String location;
    private String appliedFor;

    public Apply() 
    {
        
    }

    public Apply(String id, String name, String contactNo, String date, String time, String location, String appliedFor) 
    {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.date = date;
        this.time = time;
        this.location = location;
        this.appliedFor = appliedFor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAppliedFor() {
        return appliedFor;
    }

    public void setAppliedFor(String appliedFor) {
        this.appliedFor = appliedFor;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}