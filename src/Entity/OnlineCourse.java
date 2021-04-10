package Entity;

import java.util.HashMap;

public class OnlineCourse extends Course{

    private String date;
    private String block; //The time block of one day. 1:8:00-9:30 2:10:00->11:30 3:14:00->15:30 4: 16:00->17:30
    private String coachID;
    private String stuID;

    public OnlineCourse(HashMap<String, String> map) {
        super(map);
        this.date = map.get("date");
        this.block = map.get("block");
        this.coachID = map.get("coachID");
        this.stuID = map.get("stuID");
    }

    public OnlineCourse(String ID, String type, String des, String name) {
        super(ID, type, des, name);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getCoachID() {
        return coachID;
    }

    public void setCoachID(String coachID) {
        this.coachID = coachID;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }
}
