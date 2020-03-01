package com.Sourav_Paul;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.*;
public class Pcollection {
	public static void main(String args[])
	{
		int choice;
		String str=new String();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Sourav");
		list.add("Paul");
		list.add("India");
		list.add("Asia");
		list.add("EPAM");
		list.add("GIT");
		list.add("IM OUT OF WORDS");
		list.add("PEP_COLLECTION");
		list.add("9th WORD");
		list.add("10th WORD");
		do{
		System.out.println("Enter 1 to insert a data");
		System.out.println("Enter 2 to insert a data at first");
		System.out.println("Enter 3 to insert a data at last");
		System.out.println("Enter 4 to remove a data");
		System.out.println("Enter 5 to fetch a data");
		System.out.println("Enter 6 to display a data");
		System.out.println("Enter 0 to exit");
		System.out.println("Enter Your Choice:");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter the data:");
				sc.nextLine();
				str=sc.nextLine();
				list.add(str);
				System.out.println(list.size());
				break;
		
		case 2:System.out.println("Enter the data:");
				sc.nextLine();
				str=sc.nextLine();
				if(list.isEmpty())
					{list.add(str);
					break;
					}
				list.addFirst(str);
				break;
		case 3:System.out.println("Enter the data:");
		 	   sc.nextLine();
				str=sc.nextLine();
				if(list.isEmpty())
					{list.add(str);
					break;
					}
				list.addLast(str);
				break;
		case 4:System.out.println("Enter the data to remove:");
				sc.nextLine();
				str=sc.nextLine();
				if(list.isEmpty())
					{System.out.println("List is empty");
					break;
					}
				if(list.contains(str)!=true)
				{
					System.out.println(str+" not in list");
					break;
				}
				list.remove(str);
				break;
		case 5:System.out.println("Enter the data:");
				sc.nextLine();
				str=sc.nextLine();
				if(list.contains(str))
				{
					System.out.println("Index of "+str+" is "+list.indexOf(str));
					break;
				}
				System.out.println(str+" isnot in the list");
				break;
		case 6:if(!list.isEmpty())
				{System.out.println("List is:");
				for(String s:list)
				System.out.println(s);
				break;
				}
				System.out.println("List is empty");
				break;
		case 0:System.out.println("Exit");
				break;
		default:System.out.println("Invalid Choice");
		}
		}while(choice!=0);
	}
		
	}