package lab15_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task implements Runnable {
	
	static int count;
	
	public void run(){	
		
		for(int i = 0; i < 10; i++) {
			try {
				performTask();
			} catch (Exception exn) {
				System.out.println("Encountered an error executing task");
				return;
			}
		}
		
		
	}
	
	
	public synchronized void performTask() throws IOException {

		String filePath = "C:\\Users\\ckdat\\Desktop\\output.txt"; // Change path if needed
		//count += 1;
		String message = "\r" + Thread.currentThread().getName() + " - message: ";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(message + ++count);
            writer.close(); // not necessary as try will close this resource
            System.out.println("Successfully wrote to file: " + filePath);
            
        } catch (IOException error) {
            System.err.println("Error writing to file: " + error.getMessage());
        }
	}

	
}
