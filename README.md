# compiler-phase3
./run-without-intellij.sh
export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
javac MySmoola.java
java MySmoola in.sml
