package hw01.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvService {

	public List<String> getListStringQuestion(InputStream is) {
		
		List<String> questionString = new ArrayList<>();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	        String line = null;
			while((line = reader.readLine()) != null ) {
				questionString.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return questionString;
	}
}
