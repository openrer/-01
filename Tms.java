package com.chenqi;

import java.util.Scanner;
public class Tms{
	//创建教师数组
	private Teacher[] tcs=new Teacher[3];
	private int index=0;
	public void menu(){
	
	}

	public void addTeacher(Teacher tc){
	
	}
	public Teacher[] findAllTeacher(){
	}
	public Teacher findTeacherById(long id){
		
	}
	public int findIndexById(long id){
		
	}
	public void deleteTeacherById(long id){
		
	}
	public void updateTeacher(Teacher newtc){
		
	}
	public static void main(String[] args){
		Tms tms=new Tms();
		tms.menu();
		Scanner scanner=new Scanner(System.in);
		while (true){
			System.out.print("输入一个功能选项：");
			String option=scanner.nextLine(); 
			switch(option){
				//添加教师信息
				case "1":
					while(true){
					System.out.println("请输入教师信息【id#name#age】或者break返回上一级");
					String tcStr=scanner.nextLine();
					if(tcStr.equals("break"))
						break;
					String[] tcarr=tcStr.split("#");
					long id=Long.parseLong(tcarr[0]);
					String name=tcarr[1];
					int age=Integer.parseInt(tcarr[2]);
					Teacher tc=new Teacher(id,name,age);
					tms.addTeacher(tc);
					}
					System.out.println("保存成功");
					break;
				//查询所有教师信息
				case "2":
					System.out.println("以下为所有教师信息:");
					Teacher[] arr=tms.findAllTeacher();
					for(Teacher tc : arr){
						System.out.println(tc.toString());
					}
					System.out.println("共计"+tms.index+"个教师");
					break;
				//通过编号查询某一个教师信息
				case "3":
					while(true){
						System.out.print("请输入查询的教师的编号或者输入break返回上一级:");
						String idStr=scanner.nextLine();
						if (idStr.equals("break"))
							break;
						long id=Long.parseLong(idStr);
						Teacher tc=tms.findTeacherById(id);
						if(tc==null){
							System.out.println("您要查询的教师不存在.");
							continue;
						}
						System.out.println(tc.toString());
					}
					break;
				//通过编号删除教师信息
				case "4":
					while(true){
						System.out.print("请输入删除教师的编号或输入break返回上一级:");
						String idStr =scanner.nextLine();
						if(idStr.equals("break"))
							break;
						long id=Long.parseLong(idStr);
						Teacher tc=tms.findTeacherById(id);
						if(tc==null){
							System.out.println("您要删除的教师不存在.");
							continue;
						}
							tms.deleteTeacherById(id);
							System.out.println("删除教师信息成功.");
					}
					break;
				//通过编号更改教师信息
				case "5":
					while(true){
						System.out.print("请输入更改教师的编号或按break返回上一级:");
						String idStr =scanner.nextLine();
						if(idStr.equals("break"))
							break;
						long id=Long.parseLong(idStr);
						Teacher tc=tms.findTeacherById(id);
						if(tc==null){
							System.out.println("您要更改的教师不存在.");
						}
						System.out.print("原有教师信息为:");
						System.out.println(tc.toString());
						System.out.print("输入新的教师信息:");
						String arrstr=scanner.nextLine();
						String[] str=arrstr.split("#");
						String name=str[0];
						int age=Integer.parseInt(str[1]);
						Teacher newtc=new Teacher(id,name,age);
						tms.updateTeacher(newtc);
						System.out.println("更改教师信息成功.");
					}
					break;
				//退出系统
				case "exit":
					System.out.println("再见，欢迎下次访问!");
					System.exit(0);
				//列出菜单
				case "menu":
					tms.menu();
					break;
				default:
					System.out.println("输入选项有误");
					break;
			}
		}
	}
}