package covid.log;

public class General {
    private String id;
 private String ques1;
 private String ques2;
 private String ques3;
 private String ques4;
 private String ques5;
 private String ques6;
 private String ques7;
 private String status;

    public General(String id, String ques1, String ques2, String ques3, String ques4, String ques5, String ques6, String ques7, String status) {
        this.id = id;
        this.ques1 = ques1;
        this.ques2 = ques2;
        this.ques3 = ques3;
        this.ques4 = ques4;
        this.ques5 = ques5;
        this.ques6 = ques6;
        this.ques7 = ques7;
        this.status = status;
    }

    public General() {
    }

    
    public String getQues1() {
        return ques1;
    }

    public void setQues1(String ques1) {
        this.ques1 = ques1;
    }

    public String getQues2() {
        return ques2;
    }

    public void setQues2(String ques2) {
        this.ques2 = ques2;
    }

    public String getQues3() {
        return ques3;
    }

    public void setQues3(String ques3) {
        this.ques3 = ques3;
    }

    public String getQues4() {
        return ques4;
    }

    public void setQues4(String ques4) {
        this.ques4 = ques4;
    }

    public String getQues5() {
        return ques5;
    }

    public void setQues5(String ques5) {
        this.ques5 = ques5;
    }

    public String getQues6() {
        return ques6;
    }

    public void setQues6(String ques6) {
        this.ques6 = ques6;
    }

    public String getQues7() {
        return ques7;
    }

    public void setQues7(String ques7) {
        this.ques7 = ques7;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
