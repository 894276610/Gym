package XMLdb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.util.stream.Collectors;


public class Update {

}
//public static void update(){
////定义输入字符串，即num（我们要修改的id名称），要修改的元素，和元素的值
//Scanner scan = new Scanner(System.in);
//String num = null;
//Scanner scan1 = new Scanner(System.in);
//String element = null;
//Scanner scan2 = new Scanner(System.in);
//String elementValue = null;
//while(true){
//System.out.println("请输入要修改的用户ID号(5位)");
//try{
//num = scan.next();
////调用查询方法，将用户的各种信息显示出来
//HashMap<String,String> map = Query.startQuery(num);
//Set set = map.keySet();
//for(Iterator iter = set.iterator();iter.hasNext();){
//String key = (String)iter.next();
//String value = map.get(key);
//System.out.println(key+":"+value);
//}
////如果用户不存在，则不执行下面的操作，如果存在，则执行
//if(map.size()>1){
//System.out.println("请输入你要修改的元素：");
//element = scan1.next();
//System.out.println("请输入你要修改元素的值：");
//elementValue = scan2.next();
//Update.updateUser(num,element, elementValue);
//}
//break;
//}catch(Exception e){
//System.out.println("输入错误！请重新输入！");
//}
//}
//}
//public static void updateUser(String num,String element,String value){
//try {
////得到user.xml文件，将其读取到doc当中
//SAXReader reader = new SAXReader();
//Document doc = reader.read(new File(Computer.UserDir));
////得到跟结点root
//Element root = doc.getRootElement();
////得到根节点TUser下的所有用户，将其存放到userList当中
//List<Element> userList = doc.selectNodes("//TUser/user").stream().filter(node->node instanceof Element).map(node->(Element)node).collect(Collectors.toList());
////得到可以访问所有用户的迭代器Iterator
//Iterator<Element> iter = userList.iterator();
////如果迭代器还有下一个，则取出来
//while(iter.hasNext()){
////得到迭代器中下一个元素
//Element user = iter.next();
////得到user元素的一个属性，即userID，
//Attribute userId = user.attribute("userID");
////判断这个user的属性值是否等于我们要修改的这个用户的ID，如果是，则取出来进行就该
//if(num.equals(userId.getText())){
////通过user.element("子元素名")得到我们要修改的子元素
//Element childElement = user.element(element);
////修改子元素的text值
//childElement.setText(value);
//}
//}
////得到XML的输出流
//XMLWriter output;
//OutputFormat xmlFormat = OutputFormat.createPrettyPrint();
//xmlFormat.setEncoding("GBK");
//
//try {
//output = new XMLWriter(new FileWriter( new File(Computer.UserDir) ),xmlFormat);
////将内存中的doc写入到新文件当中
//output.write(doc);
////关闭输出流
//output.close();
//} catch (IOException e) {
//e.printStackTrace();
//}
//} catch (DocumentException e) {
//e.printStackTrace();
//}
//}
//
//}
