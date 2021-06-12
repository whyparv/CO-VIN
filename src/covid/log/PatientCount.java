package covid.log;

public class PatientCount 
{
    private String snNO;

    public PatientCount(String snNO, String state, String city, String infected, String recovered, String deaths, String total) {
        this.snNO = snNO;
        this.state = state;
        this.city = city;
        this.infected = infected;
        this.recovered = recovered;
        this.deaths = deaths;
        this.total = total;
    }
    private String state;
    private String city;
    private String infected;
    private String recovered;
    private String deaths;
    private String total;

   

    public PatientCount() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInfected() {
        return infected;
    }

    public void setInfected(String infected) {
        this.infected = infected;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSnNO() {
        return snNO;
    }

    public void setSnNO(String snNO) {
        this.snNO = snNO;
    }
}