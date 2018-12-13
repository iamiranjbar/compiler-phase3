class MainClass {
    def main(): int {
        return new Test2().method2();
    }
}

class Test2 extends Test1 {
    var variable : int[];
    var cc : Test1;

    def method2(): int {
        i = 10;
        cc = new Test1();
        i = (new D()).u();
        variable = new int[10];
        return i;
    }

    def method3(): int {
        var a:int;
        var b:boolean;
        #a = b;
        if(a == 2) then
            b = true && false;
        else
            b = false;

        while(a <> 0) {
            a = a - 1;
        }

        writeln("Hello kiki!");
        return 0;
    }

    def method4(): int {
        var arr : int[];
        arr = new int[666];
        writeln(arr.length);
        return 0;
    }
}

class Test1 {
    #var variable : int[];
    var i : int;
    def method1() : string {
        var j : string;
        j = "hello world!";
	writeln(j);
        return j;
    }
}

