package keyword;

import java.io.File;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ThreadLock {
	
	static Logger logger=Logger.getLogger(ThreadLock.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started.........");
		
		ExecutorService es=Executors.newFixedThreadPool(1);
		
		//Cricket c=new Cricket();
		
		synchronized(Cricket.class) {
			
			es.execute(()->{Thread.currentThread().setName("ODI");Cricket.t.throwBall();});
			
		}
		
		synchronized(Cricket.class) {
			
			es.execute(()->{Thread.currentThread().setName("T20");Cricket.t.throwBall();});
			
		}
		
		Shop Bag=new Shop();
		
		Shop Shoe=new Shop();
		
		synchronized(Bag) {
			
			es.execute(()->{Thread.currentThread().setName("Eagle Bag");Bag.s.Sale();});
			
		}
		
		synchronized (Shoe) {
			
			es.execute(()->{Thread.currentThread().setName("Bata Shoe");Shoe.s.Sale();});
			
		}
		
		College batch1=new College();
		
		College batch2=new College();
		
		College batch3=new College();
		
		College batch4=new College();
		
		es.execute(()->{Thread.currentThread().setName("Batch1");batch1.FYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch2");batch1.SYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch3");batch1.TYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch4");batch1.FoYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch1");batch2.FYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch2");batch2.SYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch3");batch2.TYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch4");batch2.FoYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch1");batch3.FYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch2");batch3.SYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch3");batch3.TYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch4");batch3.FoYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch1");batch4.FYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch2");batch4.SYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch3");batch4.TYear();});
		
		es.execute(()->{Thread.currentThread().setName("Batch4");batch4.FoYear();});
		
		es.shutdown();

		logger.warn("The Process is Ended............");
		
	}

}

class TrailBall{
	
	static Logger logger=Logger.getLogger(TrailBall.class);
	
	void throwBall() {
		
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		
		logger.debug(name+" Match started..........");
		
		logger.info("The Ball is ready to throw.......");
		
		try {Thread.sleep(2000);}catch(Exception e) {}
		
		logger.info("The Trail is completed..........");
		
	}
	
}

class Cricket{
	
	static TrailBall t=new TrailBall();
	
}

class Shop{
	
	SaleProduct s=new SaleProduct();
	
}

class SaleProduct{
	
	static Logger logger=Logger.getLogger(SaleProduct.class);
	
	void Sale() {
		
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		
		logger.debug("Only one "+name+" is saled..........");
		
		try {Thread.sleep(500);}catch(Exception e) {}
		
		logger.info("The amount will paid.........");
		
	}
	
}

class College{
	
	static Logger logger=Logger.getLogger(College.class);
	
	synchronized void FYear() {
		
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		
		logger.info("The "+name+" 50 Members Joined the College First Year.......");
		
		try {Thread.sleep(5000);}catch(Exception e) {}
		
		logger.debug("The "+name+" 50 Members Completed First Year..........");
		
	}
	
	synchronized void SYear() {
		
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		
		logger.info("The "+name+" 50 Members Joined the College Second Year.......");
		
		try {Thread.sleep(5000);}catch(Exception e) {}
		
		logger.debug("The "+name+" 50 Members Completed Second Year..........");
		
	}
	
	synchronized void TYear() {
		
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		
		logger.info("The "+name+" 50 Members Joined the College Third Year.......");
		
		try {Thread.sleep(5000);}catch(Exception e) {}
		
		logger.debug("The "+name+" 50 Members Completed Third Year..........");
		
	}
	
	synchronized void FoYear() {
		
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		
		logger.info("The "+name+" 50 Members Joined the College Fourth Year.......");
		
		try {Thread.sleep(5000);}catch(Exception e) {}
		
		logger.debug("The "+name+" 50 Members Completed Fourth Year..........");
		
	}
	
}
