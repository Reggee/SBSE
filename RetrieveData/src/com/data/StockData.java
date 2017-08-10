package com.data;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StockData {
	private ArrayList<StockRecord> records; // store all data;
	
	public StockData(){
		records = new ArrayList<StockRecord>(); 
	}
	
	//fill every record
	public void fillTheRecord(){
		
		for(int i=0; i<records.size();i++)
		 {
			if(records.get(i).getLevelOfSmell().isEmpty())
			 {
						records.get(i).setLevelOfSmell(records.get(i-1).getLevelOfSmell());
			 }	
		}	
		
		for(int i=1; i<records.size();i++)
		{
			if( records.get(i).getSmellName().isEmpty() )
			{
				records.get(i).setSmellName(records.get(i-1).getSmellName().replaceAll("\\d+", "").replaceAll(":", ""));
			}
		}
		
		
		
	}
	
	
	//calculate number lines of records
	public StockRecord getRecordNumber(int i){
		return records.get(i);
	}

	
	public int getNumberOfRecords(){
		return records.size();
	}
	
	public String[] split(String string){
		Pattern p = Pattern.compile("(.*),(.*),(.*),(.*),(.*),(.*)");
		Matcher m = p.matcher(string);
		
		String[] result = new String[6];
		
		while(m.find()){
			result[0] = m.group(1);
			result[1] = m.group(2);
			result[2] = m.group(3);
			result[3] = m.group(4);
			result[4] = m.group(5);
			result[5] = m.group(6);
		}
		
		return result;
	}
	
	//reads the file in filepath, create stockRecord objects and adds them to stockRecord
	public void loadDataFromFile(String filepath) {
		
		try{
		Scanner scanner = new Scanner(new FileReader(filepath));
		String line;
		StockRecord record;
		
		
		while(scanner.hasNextLine()){
			line = scanner.nextLine();
			//System.out.println(line);
			String[] results = split(line);
			//System.out.println(Arrays.toString(results));
			
			String levelOfSmell = results[0];
			String smellName = results[1];
			String packageName = results[2];
			String className = results[3];
			String methodName = results[4];
			//create the record
			record =new StockRecord(levelOfSmell, smellName,packageName,className,methodName);		
			//add every line to the records
			records.add(record);
			
		}
		scanner.close();
		} catch (Exception e){
			e.printStackTrace();
		}	
		
		
		
	}
	
	

}

