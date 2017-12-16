package com.scp.selenium.utilities;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PieChart_AWT  {
	
	public static void createReport(int i,int j,int k) throws IOException{
		DefaultPieDataset dataset = new DefaultPieDataset( );
	      dataset.setValue("Pass", new Double( i ) );
	      dataset.setValue("Fail", new Double( j ) );
	      dataset.setValue("Skip", new Double( k ) );

	      JFreeChart chart = ChartFactory.createPieChart(
	         "Applicationreport",   // chart title
	         dataset,          // data
	         true,             // include legend
	         true,
	         false);
	         
	      int width = 640;   /* Width of the image */
	      int height = 480;  /* Height of the image */ 
	      File pieChart = new File( "PieChart.jpeg" ); 
	      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
	}
	
	
}