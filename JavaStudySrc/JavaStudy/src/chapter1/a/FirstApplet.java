package chapter1.a;

import java.awt.Graphics; 
import java.util.Calendar; 

public class FirstApplet extends javax.swing.JApplet { 

	private static final long serialVersionUID = 1L;
	private final String sDTOfTaskBegin = "03.01.2013 11:00"; 
	private Calendar calendar;

	public void init() { 
		calendar = Calendar.getInstance();		
		getParent().setSize(2000, 2000);
		setSize(2001, 2001);
	} 
	
	public void paint(Graphics g) { 
		g.drawString("Developer: Sergey Yevochko", 10, 15); 
		g.drawString("Дата и время получения задания: " + sDTOfTaskBegin, 10,35); 
		g.drawString("Дата и время окончания задания: " + calendar.getTime().toString(), 10, 55);
		System.out.println(getWidth());
		System.out.println(getHeight());
	} 
} 