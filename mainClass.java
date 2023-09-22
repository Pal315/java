// class A{
//     int i;
//     public A(int a){
//         System.out.print("A");
//     }
// }

// class B extends A{
//     public B(String s, int a1){
//         super(a1);
//         System.out.print("B");
//     }
//     public static void main(String args[]){
//         A a = new A(2);
//         System.out.println(a.i);
//         String name = "pal";
//         new B(name, 2);
//         System.out.print("");
//     }

// }

// class test extends test2{
//     public static void main(String[] args){
//         // int min_value = Integer.MAX_VALUE;
//         // System.out.println(min_value);
//         // int a = 256;
//         // byte s1 = (byte)a;
//         // System.out.println(s1);
//         String name = "Hel@lo";
//         String[] s1 = name.split("e");
//         System.out.println(s1[0]);
//         sum(2,5);
//     }
// }

// class A{
//     public void getdetails(){
//         System.out.println("derived");
//     }
// }

// class B extends A{
//     public void getdetails(){
//         System.out.println("test");
//         super.getdetails();
//     }

//     public static void main(String args[]){
//         A obj = new B();
//         obj.getdetails();
//     }
// }

class A{
    String s = "Class A";
}

class B extends A{
    String s = "Class B";
    System.out.println("super.s");
}

class C extends B{
    String s = "Class C";
    System.out.println("super.s");
}

class mainClass{
    public static void main(String srgs[]){
        C c = new C();
        System.out.println(c.s);
    }
}