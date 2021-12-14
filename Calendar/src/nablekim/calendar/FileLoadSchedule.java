package nablekim.calendar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileLoadSchedule implements ManageSchedule {

	private static final String FILE_NAME = "Schedule.dat";
	
	@Override
	public void loadSchduleData(Calendar cal) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(FILE_NAME);
			Scanner sc = new Scanner(fis);
			
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				String[] strArr = str.split(",");
				String dateStr = strArr[0];
				String scheduleStr = strArr[1];
				
				cal.registerSchedule(dateStr, scheduleStr);
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	@Override
	public void storeScheduleData(String dateStr, String scheduleStr) {
		
		try {
			FileWriter fw = new FileWriter(FILE_NAME, true);
			fw.write(dateStr+","+scheduleStr+"\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
