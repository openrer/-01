package com.chenqi;

import java.util.Scanner;
public class Tms{
	//������ʦ����
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
			System.out.print("����һ������ѡ�");
			String option=scanner.nextLine(); 
			switch(option){
				//��ӽ�ʦ��Ϣ
				case "1":
					while(true){
					System.out.println("�������ʦ��Ϣ��id#name#age������break������һ��");
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
					System.out.println("����ɹ�");
					break;
				//��ѯ���н�ʦ��Ϣ
				case "2":
					System.out.println("����Ϊ���н�ʦ��Ϣ:");
					Teacher[] arr=tms.findAllTeacher();
					for(Teacher tc : arr){
						System.out.println(tc.toString());
					}
					System.out.println("����"+tms.index+"����ʦ");
					break;
				//ͨ����Ų�ѯĳһ����ʦ��Ϣ
				case "3":
					while(true){
						System.out.print("�������ѯ�Ľ�ʦ�ı�Ż�������break������һ��:");
						String idStr=scanner.nextLine();
						if (idStr.equals("break"))
							break;
						long id=Long.parseLong(idStr);
						Teacher tc=tms.findTeacherById(id);
						if(tc==null){
							System.out.println("��Ҫ��ѯ�Ľ�ʦ������.");
							continue;
						}
						System.out.println(tc.toString());
					}
					break;
				//ͨ�����ɾ����ʦ��Ϣ
				case "4":
					while(true){
						System.out.print("������ɾ����ʦ�ı�Ż�����break������һ��:");
						String idStr =scanner.nextLine();
						if(idStr.equals("break"))
							break;
						long id=Long.parseLong(idStr);
						Teacher tc=tms.findTeacherById(id);
						if(tc==null){
							System.out.println("��Ҫɾ���Ľ�ʦ������.");
							continue;
						}
							tms.deleteTeacherById(id);
							System.out.println("ɾ����ʦ��Ϣ�ɹ�.");
					}
					break;
				//ͨ����Ÿ��Ľ�ʦ��Ϣ
				case "5":
					while(true){
						System.out.print("��������Ľ�ʦ�ı�Ż�break������һ��:");
						String idStr =scanner.nextLine();
						if(idStr.equals("break"))
							break;
						long id=Long.parseLong(idStr);
						Teacher tc=tms.findTeacherById(id);
						if(tc==null){
							System.out.println("��Ҫ���ĵĽ�ʦ������.");
						}
						System.out.print("ԭ�н�ʦ��ϢΪ:");
						System.out.println(tc.toString());
						System.out.print("�����µĽ�ʦ��Ϣ:");
						String arrstr=scanner.nextLine();
						String[] str=arrstr.split("#");
						String name=str[0];
						int age=Integer.parseInt(str[1]);
						Teacher newtc=new Teacher(id,name,age);
						tms.updateTeacher(newtc);
						System.out.println("���Ľ�ʦ��Ϣ�ɹ�.");
					}
					break;
				//�˳�ϵͳ
				case "exit":
					System.out.println("�ټ�����ӭ�´η���!");
					System.exit(0);
				//�г��˵�
				case "menu":
					tms.menu();
					break;
				default:
					System.out.println("����ѡ������");
					break;
			}
		}
	}
}