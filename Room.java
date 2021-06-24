package com.room;

public class Room {
	int room_no;
	String room_type;
	double room_area;
	boolean acMachine;
	
	void setData(int no,String type, double area, boolean ac)
	{
		room_no = no;
		room_type = type;
		room_area = area;
		acMachine = ac;
	}
	void displayData()
	{
		System.out.println("The room No is: "+ room_no);
		System.out.println("The room Type is: "+ room_type);
		System.out.println("The room Area is: "+ room_area);
		System.out.println("The room has Ac: "+ acMachine);
	}
	public static void main(String [] args) {
		Room room= new Room();
		room.setData(105, "SingleRoom", 800, true);
		room.displayData();
		
		Room room1 = new Room();
		room1.setData(109, "DoubleRoom", 1050.5, true);
		room1.displayData();
	}
}

