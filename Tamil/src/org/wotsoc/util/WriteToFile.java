package org.wotsoc.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/**
 * @author Rajamani David
 * @since	Oct 25, 2017
 */
public class WriteToFile 
{
	public WriteToFile() 
	{
		// TODO Auto-generated constructor stub
	}
 
	public static void writeToFile(StringBuilder sb) throws Exception{
		writeToFile(sb,null);
	}

	public static void writeToFile(StringBuilder sb,String fileName) throws Exception 
	{
		BufferedWriter bw = null;
		FileWriter fw = null;

		try 
		{
			FileOutputStream fos = new FileOutputStream(fileName,true);
		    Writer out = new OutputStreamWriter(fos,Charset.forName("UTF-8").newEncoder());
			out.append(sb.toString());
			out.flush();
			out.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}
}
