package Entity;

import java.util.HashMap;

public class Course {
    private String ID;
    private String type;
    private String des;
    private String name;

    //I am going to use the hash map to construct the Course class
    //1. get the corresponding value
    public Course(){}

    public Course(HashMap<String,String> map){
        this.ID = map.get("ID");
        this.type =map.get("type");
        this.des =map.get("des");
        this.name =map.get("name");
    }
    public Course(String ID, String type, String des, String name) {
        this.ID = ID;
        this.type = type;
        this.des = des;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
