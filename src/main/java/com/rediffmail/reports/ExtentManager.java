package com.rediffmail.reports;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentManager {
	private static ExtentReports extent;
    public static String screenshotFolderPath;
    
	public static ExtentReports getInstance(String reportPath) {
		if (extent == null) {
			String fileName="Report.html";
		    Date d=new Date();
			String folderName=d.toString().replace(":", "_").replace(" ", "_")+".html";
			//directory of the report folder
			new File(reportPath+folderName+"//screenshots").mkdirs();
			reportPath=reportPath+folderName+"//";
			screenshotFolderPath=reportPath+"screenshots//";
			createInstance(reportPath+fileName);
		}
		return extent;
	}
        public static ExtentReports createInstance(String fileName) {
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(fileName);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setReportName("RediffMail-Automation Testing");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Reports");
	    extent=new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    return extent;
	}
}
