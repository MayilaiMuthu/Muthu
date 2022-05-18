package Day1;

import java.util.Scanner;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class StudentResult {
	static Logger logger=Logger.getLogger(StudentResult.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Scanner s=new Scanner(System.in);
		logger.info("Enter Subjects");
		 int n=s.nextInt();
		 logger.info("Enter Students Strength");
		 int m=s.nextInt();
		int[][] a=new int[m][n];
		for(int i=0;i<m;i++) {
			int b=i+1;
			logger.info("The "+b+" Student Value");
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
			}
			
		}
		
		for(int i=0;i<m;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum=sum+a[i][j];
			}
			int b=i+1;
			logger.info("The "+b+" Total Value");
			logger.info(sum);
			}
	}

}
