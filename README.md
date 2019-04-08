# tamil
Tamil Text Parsing related API- download tamil.jar and start using

1. Any language Tranliteral can be done by this class 
   a. Copy all key and values in config.properties (Check sample file under properites directory)
   b. Paste text to be converted and pass an empty file (Check sample files under properties directory)
   c. Command to run java code.
java -cp tamil.jar -Dfile.encoding=UTF-8 org.wotsoc.util.TransliteralConvertor C://tmp//config.properties C://tmp//tamil_eng_literal.txt C://tmp//tamil_eng_literal.out

2. Check Tamil Charcter Iterator, Count, Length under testing package TamilStringIteratorDemo.java

3. Tamil N Gram check the TamilNGram.java class for a demo.
