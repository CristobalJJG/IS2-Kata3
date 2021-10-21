package Kata3;

import java.awt.Dimension;
import java.util.Set;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();    
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart",
                "Dominios email",
                "Nº de emails",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                false,
                rootPaneCheckingEnabled);   
        return chart;
        
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset(); 
        dataSet.addValue( 2., "", "ulpgc.es");
        dataSet.addValue( 8., "", "nano.ulpgc");
        dataSet.addValue( 3., "", "hotmail.com");
        dataSet.addValue( 6., "", "hotmail.es");
        dataSet.addValue( 4., "", "gmail.com");
        return dataSet;
    }
    
    
}
