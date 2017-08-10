package com.data;

public class main {

	public static void main(String[] args) {
		StockData stockData = new StockData();
		String csvFile = "/Users/jirigesifnu/Desktop/Infusion.csv";
		
		stockData.loadDataFromFile(csvFile);
		stockData.fillTheRecord();
		
		
		//System.out.print(stockData.getNumberOfRecords()); calculate the lines of the data
		
		for(int i=0; i<stockData.getNumberOfRecords();i++)
		{
			//if(!stockData.getRecordNumber(i).getSmellName().isEmpty())
			System.out.println(stockData.getRecordNumber(i).getLevelOfSmell()+" "+stockData.getRecordNumber(i).getSmellName());
		}
		
		
		return;

	}

}
