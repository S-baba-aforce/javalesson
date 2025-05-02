package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class TaskId0502 {
//10
	public static void main(String[] args) {
		
		List<String>task = new ArrayList<>();
		
		task.add(0,"TASK001");
		task.add(1,"TASK002");
		task.add(2,"TASK003");
		task.add(3,"TASK001");
		task.add(4,"TASK004");
		task.add(5,"TASK002");
		
		System.out.println("処理済みのタスクID一覧: " + "\n" + "-" + task.get(0));
		System.out.println("-" + task.get(1));
		System.out.println("-" + task.get(2));
		System.out.println("-" + task.get(3));
		System.out.println("-" + task.get(4));
		System.out.println("-" + task.get(5));

		task.add(6,"TASK003");
		task.add(7,"TASK005");
		
		String[] searchTask = {"TASK003","TASK005"};
//		String searchTask2 = "TASK005";
		
		boolean contains = task.contains(searchTask);
		
		
//		if (contains != task.contains(searchTask)) {
//			System.out.println("タスクID" + searchTask + "は未処理です。");
//		} else {
//			System.out.println("タスクID" + searchTask + "は処理済みです。");
//		}
		
		System.out.println("処理済みのタスクの総数:" + " " + task.length() );
		
		
		
	}

}
