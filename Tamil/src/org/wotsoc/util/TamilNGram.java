package org.wotsoc.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Rajamani David
 * @since	Apr 1, 2019
 * Take a string and size to get any form of nGram by word or letter  
 */
public class TamilNGram {
	public static final String DELIMITOR =" ";
	
	public static List<List<String>> nGramWord(String str, int gramSize, String parseDelimitor, String ignoreDelimitor){
		List<String> strList = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(str,parseDelimitor,false);
		while(st.hasMoreTokens()){
			strList.add(st.nextToken());
		}
		return buildGramsList(strList,strList.size(),gramSize,ignoreDelimitor);
	}

	private static List<List<String>> buildGramsList(List<String> strList, int actualLength, int gramSize, String ignoreDelimitor){
		List<List<String>> newList = new ArrayList<List<String>>();
		int finalIds =0;
		int index=0;
		List<String> internalList = null;

		while(actualLength>=finalIds){
			internalList = new ArrayList<String>();
			for(index=0;index<gramSize;index++){
				if(finalIds+index < strList.size()){
					internalList.add(strList.get(finalIds+index));
				}
			}
			newList.add(internalList);
			if(finalIds+index >= strList.size())
				break;
			finalIds = finalIds + index;
			index = 0;
		}
		return newList;
	}
	
	private static List<String> buildGrams(List<String> strList, int actualLength, int gramSize){
		List<String> newList = new ArrayList<String>();
		int finalIds =0;
		int index=0;
		StringBuilder sb = null;

		while(actualLength>=finalIds){
			sb = new StringBuilder();
			for(index=0;index<gramSize;index++){
				if(finalIds+index < strList.size()){
					sb.append(strList.get(finalIds+index));
				}
			}
			newList.add(sb.toString());
			if(finalIds+index >= strList.size())
				break;
			finalIds = finalIds + index;
			index = 0;
		}
		return newList;
	}
	
	public static List<String> nGramLetter(String str, int size, String resultDelimitor)
	{
		TamilStringIterator tsi = new TamilStringIterator(str);
		List<String> strList = tsi.forwardIterator();
		if(size <= 1)
			return strList;
		return buildGrams(strList, tsi.length(), size);
	}
	
	public static void testLetterGram(){
		List<String> tamilList= null;
		String str="கண்களால்கைதுசெய்தாள்";
		for(int i=0;i<str.length();i++){
			tamilList=TamilNGram.nGramLetter(str,i,"");
			System.out.println(tamilList);
		}
	}
	
	public static void testWordGram(){
		String str="வான மழை போலே புது பாடல்கள் கான மழை தூவும் முகில் ஆடல்கள் நிலைக்கும் கானம் இது " +  
		"நெடுநாள் வாழும் இது வான மழை போலே புது பாடல்கள் கான மழை தூவும் முகில் ஆடல்கள் " + 
		"இதயம் ராத்திரியில் இசையால் அமைதி பெறும் இருக்கும் காயமெல்லாம் இசையால் ஆறிவிடும் " + 
		"கொதிக்கும் பாலையிலும் இசையால் பூ மலரும் இரும்பு பாறையிலும் இசையால் நீர் கசியும் " + 
		"பழி வாங்கும் பகை நெஞ்சும் இசையால் சாந்தி பெறும் வான மழை போலே புது பாடல்கள் " + 
		"கான மழை தூவும் முகில் ஆடல்கள் நிலைக்கும் கானம் இது நெடுநாள் வாழும் இது " + 
		"வான மழை போலே புது பாடல்கள் கான மழை தூவும் முகில் ஆடல்கள் ";
		List<List<String>> tamilList= null;
		
		tamilList=TamilNGram.nGramWord(str,2,DELIMITOR,",");
		System.out.println(tamilList);
	}

	public static void main(String args[]){
		//testLetterGram();
		testWordGram();
	}
}
