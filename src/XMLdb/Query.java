package XMLdb;

import java.lang.reflect.Field;
import java.util.*;
import Entity.Course;
import Entity.RecCourse;
import org.dom4j.*;

public class Query {
    /**
     *
     * @param filepath Xml file that stores the RecCourse information
     * @param nodeName mainly the course node
     * @param childNodeName maybe name, ID, type...
     * @param childNodeValue the value
     * @param debug if in debug, will print necessary information.
     * @return ArrayList<Course>, all necessary Course object.
     * @throws ClassNotFoundException
     */
    public static ArrayList<Course> searchRecCourse(String filepath, String nodeName, String childNodeName, String childNodeValue, boolean debug) throws ClassNotFoundException{
        //1. Preparation work

        //Define return value
        ArrayList<Course> courseArrayList = new ArrayList<>();

        //Define one course entity
        // Get all of the fields
        //Try to use reflection to get the course class path
        RecCourse recCourse = new RecCourse();
        Field[] field = XmlUtil.getAllFields(recCourse.getClass().getName());
        recCourse = null;

        ArrayList<String> fieldArrayList = new ArrayList<>();

        for(Field f: field){
            fieldArrayList.add(f.getName());
            if(debug){ System.out.println("f.getName()  "+ f.getName());
            }
        }
        if(debug){
            System.out.println("fieldArrayList.size():  "+ fieldArrayList.size());
        }
        //Prepare a buffer to construct the course
        //Prepare a hash map to construct the course
        HashMap<String,String> map = new HashMap<String,String>();

        //2. Data implementation
        Document document = XmlUtil.load(filepath);

        //Select Nodes
        List<Node> list = document.selectNodes("//"+ nodeName+  "["  + childNodeName +"='"   +   childNodeValue+"']");

        //Get iterator and prepare for conversion.
        Iterator<Node> item = list.iterator();

        while (item.hasNext()){
            //Conversion from Node to Element
            Element element = (Element) item.next();

            if(debug){
                System.out.println("---------------");
            }

            //Get the  key and value of subElements and store in map
            for(int i =0;i<fieldArrayList.size();i++){
                String fieldName = fieldArrayList.get(i);
                String fieldText = element.elementTextTrim(fieldArrayList.get(i));
                if(debug){
                    System.out.println("fieldName: "+ fieldName+ ", fieldText: "+ fieldText);
                }
                if(fieldText!=null) {
                    map.put(fieldName, fieldText);
                }
            }

            //Use Hash Map to construct the Course
            courseArrayList.add(new RecCourse(map));

        }
        return courseArrayList;
    }

    /**
     *
     * @param filepath search in which file
     * @param key what subkey in course
     * @param value keyValue
     * @param debug true is the debug mode, print info to sys.out
     * @return all of the suitable courses in arraylist
     * @throws ClassNotFoundException
     */
    public static ArrayList<Course> searchRecCourse(String filepath, String key, String value, boolean debug)throws ClassNotFoundException{
        return searchRecCourse(filepath, "RecCourse", key, value, debug);
    }

    public static ArrayList<Course> searchRecCourse(String nodeName, String childNodeName, String childNodeValue)throws ClassNotFoundException{
        String filePath = searchPath("RecCoursePath",true);
        return searchRecCourse(filePath,nodeName,childNodeName,childNodeValue,true);
    }

    public static ArrayList<Course> searchRecCourse(String key, String value) throws ClassNotFoundException{
        String filePath = searchPath("RecCoursePath",true);
        return searchRecCourse(filePath,key,value,true);
    }

    /**
     *
     * @param filepath search in which file
     * @param name what is the name of the course
     * @param debug true is the debug mode, print info to sys.out
     * @return all of the suitable courses in arraylist
     * @throws ClassNotFoundException
     */
    public static ArrayList<Course> searchRecCourseByName(String filepath,String name, boolean debug) throws ClassNotFoundException {
        return  searchRecCourse(filepath, "RecCourse","name",name, debug);
    }

    public static ArrayList<Course> searchRecCourseByName(String name, boolean debug) throws ClassNotFoundException{
        String filePath = searchPath("RecCoursePath",true);
        return  searchRecCourse(filePath, "RecCourse","name",name, debug);
    }

    /**
     *
     * @param filepath search in which file
     * @param type what is the type of the course
     * @param debug true is the debug mode, print info to sys.out
     * @return all of the suitable courses in arraylist
     * @throws ClassNotFoundException
     */
    public static ArrayList<Course> searchRecCourseByType(String filepath,String type, boolean debug)throws ClassNotFoundException{
        return  searchRecCourse(filepath, "RecCourse","type",type, debug);
    }

    public static ArrayList<Course> searchRecCourseByType(String type, boolean debug)throws ClassNotFoundException{
        String filePath = searchPath("RecCoursePath",true);
        return  searchRecCourse(filePath, "RecCourse","type",type, debug);
    }


    public static String searchPath(String key, boolean debug)throws ClassNotFoundException{
        //Deal with xml
        Document document = XmlUtil.load("src/config.xml");
        List<Node> list = document.selectNodes("//"+ key);
        if(debug) {
            System.out.println(list.get(0).getText());
        }
        return  list.get(0).getText();
    }

}


































//public static void getQuery(){
////定义输入
//Scanner scan = new Scanner(System.in);
//String num = null;
//while(true){
//System.out.println("type ID (5)");
//try{
////得到要查询的用户ID
//num = scan.next();
////定义一个HashMap，用于输出这个用户的所有信息
//HashMap<String,String> map = startQuery(num);
//Set set = map.keySet();
//for(Iterator iter = set.iterator();iter.hasNext();){
//String key = (String)iter.next();
//String value = map.get(key);
//System.out.println(key+":"+value);
//}
//
//break;
//}catch(Exception e){
//System.out.println("error ！ input again");
//}
//}
//}
//
//
//public static HashMap<String,String> startQuery(String num){
////定义一个reader和HashMap，HashMap是用来返回我们要查询的这个用户的信息的
//SAXReader reader = new SAXReader();
//HashMap<String,String> map = new HashMap<String,String>();
//try {
////得到user.xml的这个doc
//Document doc = reader.read(new File(Computer.UserDir));
////得到所有用户的一个集合userList
//List<Element> userList = doc.selectNodes("//TUser/user").stream().map(node->(Element)node).collect(Collectors.toList());
////得到迭代器，
//Iterator<Element> iter = userList.iterator();
//while(iter.hasNext()){
////得到每一个user元素，进行判断
//Element e = iter.next();
////得到这个user的ID
//Attribute att = e.attribute("userID");
////如果这个user的ID和我们查询的ID一致，则将其所有的信息放入到map当中
//if(num.equals(att.getText())){
////得到这个user的所有子元素
//List<Element> childElements = e.elements();
////得到所有子元素的迭代器
//Iterator<Element> childIter = childElements.iterator();
////如果还有子元素，则
//while(childIter.hasNext()){
////得到子元素，将其信息放入到map当中
//Element childElement = childIter.next();
//map.put(childElement.getQName().getName(), childElement.getText());
//}
//}
//}
//}catch(Exception e){
//System.out.println("failed to read！");
//e.printStackTrace();
//}
////如果map为0，则说明没有查找到我们要的信息，则往map当中添加未找到信息
//if(map.size()<1){
//map.put("not exist", "");
//}
//return map;
//}
//
//    public static Course startQueryCourse(String name){
//
//        Course qCourse = new Course();
//        SAXReader reader = new SAXReader();
//        try {
//            Document doc = reader.read(new File(Computer.CourseDir));
//            List<Element> CourseList = doc.selectNodes("//Tcourse/course").stream().map(node->(Element)node).collect(Collectors.toList());
//            Iterator<Element> iter = CourseList.iterator();
//
//            while(iter.hasNext()) {
//                System.out.println("Hello");
//                System.out.println("Hello");
//                System.out.println("Hello");
//                //得到每一个user元素，进行判断
//                Element e = iter.next();
//                //得到这个user的ID
//                Attribute att = e.attribute("name");
//                System.out.println("Hello");
//                if (name.equals(att.getText())) {
//                    qCourse.setName(att.getText());
//                    System.out.println(e.attribute("ID").getText());
//                    qCourse.setID(e.attribute("ID").getText());
//                    //得到这个user的所有子元素
//                    List<Element> childElements = e.elements();
//
//                    Iterator<Element> childIter = childElements.iterator();
//                    //如果还有子元素，则
//                    while(childIter.hasNext()){
//                    //得到子元素，将其信息放入到map当中
//                        Element childElement = childIter.next();
//                        //将Element的
//                        ChildHandler(childElement,qCourse);
//
//                    }
//                }
//            }
//        }catch (DocumentException exception1){ System.out.println("Open file Error!");}
//
//        return qCourse;
//    }
//
//    public static void ChildHandler(Element childElement, Course qCourse){
//        String tagName = childElement.getQName().getName();
//        if(tagName.equals("type")){
//            qCourse.setType(childElement.getText());
//        }else if(tagName.equals("dir")){
//            qCourse.setDir(childElement.getText());
//        }else if(tagName.equals("des")){
//            qCourse.setDes(childElement.getText());
//        }
//    }



