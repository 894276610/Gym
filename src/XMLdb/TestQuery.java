package XMLdb;

import Entity.Course;
import Entity.RecCourse;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static XMLdb.XmlUtil.RecCoursePath;

public class TestQuery {
    public static void main(String[] args) throws ClassNotFoundException {
//        Query.searchCourseByName("DKL");
//            System.out.println("Good!");

        /*1. Test mlUtil.getAllFields()*/
        /*
        Field[] field =XmlUtil.getAllFields("Entity.Customer");
        for(Field f:field){
            System.out.println(f.getName());
        }

         */

        /*2. Test public static ArrayList<Course> searchCourseByName(String name)*/
        // ArrayList<Course> arrayList =  Query.searchRecCourse(RecCoursePath,"course","name", "myYoga",true);

        /*3. Test other interface methods*/
        ArrayList<Course> arrayList =  Query.searchRecCourse("type", "yoga");
        RecCourse recCourse= (RecCourse) arrayList.get(0);
        System.out.println(recCourse.getCreateDate());
        System.out.println(recCourse.getDifficulty());
        System.out.println(recCourse.getDes());
        RecCourse recCourse1= (RecCourse) arrayList.get(1);
        System.out.println(recCourse1.getCreateDate());
        System.out.println(recCourse1.getDifficulty());
        System.out.println(recCourse1.getDes());
        /*4. Test searchConfig*/
/*
        try {
            Query.searchPath("RecCoursePath", true);
        }catch (IndexOutOfBoundsException exception){
            System.out.println("test"+"main: INVALID KEY");
        }
*/


    }
}
