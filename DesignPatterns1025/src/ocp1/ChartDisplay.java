package ocp1;

import org.junit.Test;

public class ChartDisplay {
     AbstractChart chart;
     @Test
     public void run()
     {
    		ChartDisplay cd1 =new ChartDisplay();
    		cd1.setChart(new PieChart());
     }
     public void setChart(AbstractChart chart)
     {
    	 chart.display();
     }
}
