All: make clean 


clean: 
	rm *.interp Smoola*.java *.tokens *.class
	find . -name "*.class" -type f -delete
