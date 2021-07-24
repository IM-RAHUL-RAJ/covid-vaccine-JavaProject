package importedPackage;



public class govInfo extends Thread{
		
	String [] arr=new String[] {"https://www.mohfw.gov.in/","https://www.mygov.in/covid-19","https://www.who.int/emergencies/diseases/novel-coronavirus-2019"};
	
	public void run(){  
		
		  for(int i=0;i<3;i++){  
		    try{
		    	Thread.sleep(1000);
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(arr[i]);  
		  }  
		 }  
}


	 

