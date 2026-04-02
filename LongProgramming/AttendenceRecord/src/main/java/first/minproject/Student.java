package first.minproject;

public class Student {
    private String rollNO;
    private String name;
    private Boolean present;

    public Student(String rollNO,String name,Boolean present){
        this.name=name;
        this.present=present;
        this.rollNO=rollNO;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getRollNO() {
        return rollNO;
    }

    public void setRollNO(String rollNO) {
        this.rollNO = rollNO;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }
}
