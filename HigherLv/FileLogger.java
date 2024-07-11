package conf.lms.log;


import conf.lms.util.FileHelper;
import conf.lms.util.Helper;



public class FileLogger implements Logger{

	public int logData(String transactionData){

		int result = 0;

		try{

			transactionData = Helper.getCurretDateAndTime() + " : " + transactionData;
			FileHelper.updateTransaction(transactionData);
			result = 1;

		}catch(Exception e ){
			System.out.println("error : FileLogger : logData" + e);
			result = -1;
		}

		return result;

	}
	
}