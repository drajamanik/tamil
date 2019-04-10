# tamil
Tamil Text Parsing related API- download tamil.jar and start using

1. Any language Tranliteral can be done by this class 
   a. Copy all key and values in config.properties (Check sample file under properites directory)
   b. Paste text to be converted and pass an empty file (Check sample files under properties directory)
   c. Command to run java code.

java -cp tamil.jar -Dfile.encoding=UTF-8 org.wotsoc.util.TransliteralConvertor C://tmp//config.properties C://tmp//tamil_eng_literal.txt C://tmp//tamil_eng_literal.out

2. Check Tamil Charcter Iterator, Count, Length under testing package TamilStringIteratorDemo.java 
     ForwardIteratorExample:---------->நினைவுத்தடுமாற்றம்<------
நி
னை
வு
த்
த
டு
மா
ற்
ற
ம்

---------BackwardIteratorExample->பாண்டியன்மதிவாணனா<-------
னா
ண
வா
தி
ம
ன்
ய
டி
ண்
பா

---------Length Example ->பாண்டியன்மதிவாணனா<-------
Letters length:10 , Total Length:17


3. Tamil N Gram check the TamilNGram.java class for a demo. [Mulitple grams can be passed as parameter like 2 or 3 or 4..]
Sample Sentence "வான மழை போலே புது பாடல்கள் கான மழை தூவும் முகில் ஆடல்கள் நிலைக்கும் கானம் இது "

TWO- Gram Results
[[வான, மழை], [போலே, புது], [பாடல்கள், கான], [மழை, தூவும்], [முகில், ஆடல்கள்], [நிலைக்கும், கானம்], [இது]]

THREE - Gram Results
[[வான, மழை, போலே], [புது, பாடல்கள், கான], [மழை, தூவும், முகில்], [ஆடல்கள், நிலைக்கும், கானம்], [இது]]




