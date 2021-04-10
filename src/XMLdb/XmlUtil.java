package XMLdb;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.SAXReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Xml Utility class
public class XmlUtil {

    public static final String RecCoursePath = "E:\\RecCourse.xml";
    public static final String CustomerPath = "E:\\customer.xml";

    //1. Load as document
    public static Document load(String fileName){
        //Define a document object
        Document document = null;
        try{
            //create doc reader
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(new File(fileName));

        } catch (DocumentException e) {
            document = null;
            e.printStackTrace();
        }
        return  document;
    }
    //2.get all fields in List
    public static List<Field> getAllFieldsList(String Classpath) throws ClassNotFoundException{
        Class cls = Class.forName(Classpath);
        if(cls != null){
            final List<Field> allFields = new ArrayList<Field>();
            Class<?> currentClass = cls;
            while (currentClass != null) {
                final Field[] declaredFields = currentClass.getDeclaredFields();
                for (final Field field : declaredFields) {
                    allFields.add(field);
                }
                currentClass = currentClass.getSuperclass();
            }
            return allFields;}
        else{
            return null;
        }
    }

    //3.get all fields in Array
    public static Field[] getAllFields(String Classpath)throws ClassNotFoundException {
        final List<Field> allFieldsList = getAllFieldsList(Classpath);
        return allFieldsList.toArray(new Field[allFieldsList.size()]);
    }




    //2. Get class fields
/*
    public static String[] getFieldName(String Classpath) throws ClassNotFoundException{
        //prepare the class object
        Class cls = Class.forName(Classpath);
        //get all fields in the class
        Field[] field = cls.getDeclaredFields();
        for(Field f:field){
            System.out.println(f.getName());
        }
        return null;
    }
    */

}
