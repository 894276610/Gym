package XMLdb;

import java.util.Scanner;

//目前已经可以进行数据库的操作了。
//但是需要和界面做在一起。
//
public class Computer {

}
//public static final String UserDir = "E://users.xml";
//public static final String CourseDir = "E://course.xml";
//	public Computer(){
//		//开始整个系统，判断用户使用的是哪种数据库
//		System.out.println("type 1 to use the db");
//
//		Scanner scan = new Scanner(System.in);
//		int choice;
//		while(true){
//			try{ //如果用户输入的数值不是1或者2，则出错
//				choice = scan.nextInt();
//				if(choice!=1){
//				System.out.println("wrong type again");
//				}else{
//				//如果输入的正确，则启动！
//				//如果输入的是1，则启用XML作为数据库，否则，启用MySql作为数据库
//				this.startXML();
//				break;
//				}
//			}catch(Exception e){
//			System.out.println("wrong type again");
//			}
//
//		}
//	}
//
//	public void startXML(){
//		System.out.println("欢迎使用该系统！");
//		Scanner scan = new Scanner(System.in);
//		int num = 0;
//		while(true){
//			System.out.println("Please type！");
//			System.out.println("1：search");
//			System.out.println("2：add");
//			System.out.println("3：modify user");
//			System.out.println("4：delete user info");
//
//			try{
//			num = scan.nextInt();
//			if(num<1||num>4){
//			System.out.println("wrong! type again");
//			continue;
//			}
//			}catch(Exception e){
//			System.out.println("type wrong！");
//			}
//
//			switch(num){
//			case(1):Query.getQuery();continue;//查询用户操作
//			case(2):Add.add();continue;//添加用户操作
//			case(3):Update.update();continue;//更新用户操作
//			case(4):Delete.delete();continue;//删除用户操作
//			default:System.out.println("wrong, type again!");continue;
//			}
//		}
//	}
//
//public static void main(String[] args) {
////启动系统
//Computer com = new Computer();
//}
//}

