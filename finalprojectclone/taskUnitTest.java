package finalprojectclone;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.PriorityQueue;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import javafx.concurrent.Task;

class taskUnitTest {

	@Test
	public void addTask() {//Scanner n, PriorityQueue<Task2> pq) {
		Task2 task = new Task2("gym",2, 0);
		System.out.print(task.getTask());
		assertEquals("Task {id ='0 task='gym', levelofImportant = 2}", task);
	//	task.setId(1);
	//	assertEquals(task.getTask(),task.addTask(n, pq).getTask());
	//	PriorityQueue<Task2> pq = new PriorityQueue<Task2>(new Task2Comparator());
	//	Scanner n = n.nextLine();
		
		//Task2 task = task.addTask(n, pq);
		//Task2 taskadded = new Task2()
		
		//task.addTask(n, pq);
		
		
	}
	
	public void seetask() {
		
	}
	
	
//	public void myPublicMethod() {
//		Task2 task = new Task2(pq.toString());

//		assertEquals(pq.toString(), task.myPublicMethod(pq));
	//}

}
