class MainClass {
    def main(): int {
        return (new Test0()).method2();
    }
}

class Test2 extends Test1 {
    var variable : int[];

    def method2(): int {
        var i: string;
        var a: Test1;
        a = new Test1();
        i = a.toString();
        i = this.nn(new Test1().method1());
        variable = new int[10];
        return 1;
    }

    def nn(d : string) : string{
        return d;
    }

    def method3(): int {
        var a:int;
        var b:boolean;
        #var i : Test2;
        #a = b;
        i = new Test2();
        if(a == 2) then
            b = true && false;
        else
            b = false;

        while(true) {
            a = a - 1;
        }

        writeln("Hello kiki!");
        return this.method3();
    }

    def method4(): int {
        var arr : int[];
        arr = new int[666];
        writeln(arr.length);
        return 0;
    }
}

class Test1 extends Test5 {
    #var variable : int[];
    var i : Test2;
    def method1() : string {
        var j : string;
        j = "hello world!";
	    writeln(j);
        return j;
    }
}

class Test5 {
	def method2u(): int {
        var i: string;
        var a: Test1;
        a = new Test1();
        i = a.toString();
        i = this.nn(new Test1().method1());
        variable = new int[10];
        return 1;
    }
}
