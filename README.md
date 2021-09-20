# compiler-phase3
./run-without-intellij.sh
export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
javac MySmoola.java
java MySmoola in.sml


It is third phase of Compiler course project at the University of Tehran. We developed a compiler for object oriented Smoola language.

In this phase, we add type checker using visitor pattern.
