package Utilities;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vsuley on 11/15/2014.
 */
public class Logger {

    String outputFileName;
    File outputFile;
    FileWriter fileWriter;
    CSVPrinter csvPrinter;

    public Logger() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        outputFileName = "AmplitudeSummation_" + dateFormat.format(new Date()) + ".csv";
        outputFile = new File(outputFileName);
    }

    public void StartLogging() {
        try {
            fileWriter = new FileWriter(outputFile, true);
            csvPrinter = new CSVPrinter(fileWriter, CSVFormat.EXCEL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void StopLogging() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void Log(double value){
        try {
            csvPrinter.printRecord(value);
        } catch (IOException e) {
            System.out.println(e.getStackTrace().toString());
        }
    }

}
