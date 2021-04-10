package XMLdb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Delete {

}

//public static void delete(){

//Scanner scan = new Scanner(System.in);
//String num = null;
//while(true){
//System.out.println("请输入要删除的用户ID号(5位)");
//try{
//num = scan.next();
//HashMap<String,String> map = Query.startQuery(num);
//Set set = map.keySet();
//for(Iterator iter = set.iterator();iter.hasNext();){
//String key = (String)iter.next();
//String value = map.get(key);
//System.out.println(key+":"+value);
//}
////如果用户不存在，则不执行下面的操作，如果存在，则执行
//if(map.size()>1){
//Delete.toDelete(num);
//}
//break;
//}catch(Exception e){
//e.printStackTrace();
//}
//}
//}
//public static void toDelete(String num){
//SAXReader reader = new SAXReader();
//try {
////得到user.xml的Document
//Document doc = reader.read(new File(Computer.UserDir));
////得到跟结点
//Element root = doc.getRootElement();
////得到根节点下的所有user集合
//List<Element> userList = doc.selectNodes("//TUser/user").stream().filter(node->node instanceof Element).map(node->(Element)node).collect(Collectors.toList());
////得到迭代器
//Iterator<Element> iter = userList.iterator();
//while(iter.hasNext()){
////得到user元素
//Element e = iter.next();
////得到这个user元素的userID
//Attribute att = e.attribute("userID");
////判断这个userID是不是我们想要的user
//if(num.equals(att.getText())){
////如果是，则把自己（e）从跟结点处删除
//root.remove(e);
//}
//}
////得到XML的输出流
//XMLWriter output;
//OutputFormat xmlFormat = OutputFormat.createPrettyPrint();
//xmlFormat.setEncoding("GBK");
//try {
//output = new XMLWriter(new FileWriter( new File(Computer.UserDir) ),xmlFormat);
////将内存中的doc写入到新文件当中
//output.write(doc);
////关闭输出流
//output.close();
//System.out.println("该用户已被删除！");
//} catch (IOException e) {
//e.printStackTrace();
//}
//} catch (DocumentException e) {
//e.printStackTrace();
//}
//}
//}

