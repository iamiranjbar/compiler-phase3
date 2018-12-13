class MainClass {
    def main(): int {
        return new Test2().method4();
    }
}

class Test2 extends Test1 {
    var variable : int[];
    var cc : Test1;

    def method2(): int {
        i = 10;
        cc = new Test1();
        #i = i.u();
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

        writeln(false);
        return 0;
    }

    def method4(): string {
        var arr : int[];
        arr = new int[666];
        writeln(arr.length + arr[arr]);
        return "f";
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

class A extends B{

}

class B extends A{
    
}