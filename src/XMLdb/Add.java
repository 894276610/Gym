package XMLdb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Add {
}

//public static void add(){
//while(true){
//try{
////new出一个User，调用user.createUser()方法来填写这个用户的各种信息
//User user = new User();
//System.out.println("准备创建用户：");
//user.createUser();
////调用添加用户，将user作为参数传递
//Add.addUser(user);
//break;
//}catch(Exception e){
//System.out.println("输入错误！请重新输入！");
//}
//}
//}
//public static void addUser(User user){
//try{
////读取文件
// SAXReader saxReader = new SAXReader();
// Document doc = saxReader.read(new File(Computer.UserDir));
//   //得到跟结点root
//   Element root = doc.getRootElement();
//   //往根节点添加user元素
//   Element User = root.addElement("user");
//	//设置user的userID
//	User.addAttribute("userID", user.getUserID());
//	//往user添加各种子元素和设置值
//	Element UserName = User.addElement("UserName");
//	UserName.setText(user.getUserName());
//	Element DeptId = User.addElement("DeptId");
//	DeptId.setText(user.getDeptId());
//	Element Sex = User.addElement("Sex");
//	Sex.setText(user.getSex());
//	Element IconId = User.addElement("IconId");
//	IconId.setText(user.getIconId());
//	Element City = User.addElement("City");
//	City.setText(user.getCity());
//	Element Password = User.addElement("Password");
//	Password.setText(user.getPassword());
//	Element OnLineState = User.addElement("OnLineState");
//	OnLineState.setText(user.getOnLineState());
//	Element LastLoginTime = User.addElement("LastLoginTime");
//	LastLoginTime.setText(user.getLastLoginTime());
//	Element RegisterTime = User.addElement("RegisterTime");
//	RegisterTime.setText(user.getRegisterTime());
//
//  //添加元素结束后往新的文件重新写入doc数据
//	OutputFormat xmlFormat = OutputFormat.createPrettyPrint();
//	xmlFormat.setEncoding("GBK");
//
//  XMLWriter output = new XMLWriter(new FileWriter( new File(Computer.UserDir) ),xmlFormat);
//  output.write(doc);
//  //关闭输出流
//  output.close();
//
//}
//
//catch(DocumentException e){
//e.printStackTrace();
//}
//
//catch(IOException e){
//e.printStackTrace();
//}
//}
//}

