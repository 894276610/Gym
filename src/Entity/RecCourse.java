package Entity;

import java.util.HashMap;

public class RecCourse extends Course {


    private String dir;
    private String createDate;
    private String difficulty;

    public RecCourse(){    }
    public RecCourse(String dir, String createDate, String difficulty) {
        this.dir = dir;
        this.createDate = createDate;
        this.difficulty = difficulty;
    }

    public RecCourse(HashMap<String, String> map) {
        super(map);
        this.dir = map.get("dir");
        this.createDate = map.get("createDate");
        this.difficulty = map.get("difficulty");
    }

    public RecCourse(String ID, String type, String des, String name, String dir, String createDate, String difficulty) {
        super(ID, type, des, name);
        this.dir = dir;
        this.createDate = createDate;
        this.difficulty = difficulty;
    }


    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

}
