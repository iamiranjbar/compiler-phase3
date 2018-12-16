import ast.VisitorImpl;
import ast.VisitorType;
import ast.node.Program;
import org.antlr.v4.runtime.*;
import java.io.IOException;

public class MySmoola {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        SmoolaLexer lexer = new SmoolaLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SmoolaParser parser = new SmoolaParser(tokens);
        Program p = parser.program().p;
        if (parser.program().error_count == 0) {
        	VisitorType v = new VisitorType(parser.program().synthesized_table);
        	p.accept(v);	
        }
    }
}