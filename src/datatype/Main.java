package datatype;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Main {
    static public  void  main(java.lang.String[] args) {
     JavaTest test;
     char c = 8555;
     boolean a  = true;
     boolean b  = false;
     byte t = 1;
     short d = 31596;
     int e = 1626666665;
     long f = (long) 1;
     float q = (float) 17.987; //17.987f
     double r = 17.98;
     float y = (float) r; //rf

        java.lang.String str = "";
        System.out.println(str.isBlank());
        datatype.String str2 = new datatype.String();
        str2.toLowerCase();
        int eded1 = 17;
        int eded2 = eded1;
        eded1 = 15;
        System.out.println("eded1: " + eded1);
        System.out.println("eded2: " + eded2);

        Integer intEded1 = 17;
        Integer intEded2 = intEded1;
        intEded1 = 15;
        System.out.println("intEded1: " + intEded1);
        System.out.println("intEded2: " + intEded2);



    }
}