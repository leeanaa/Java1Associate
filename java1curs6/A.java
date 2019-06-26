public class A{
    public int x;
    protected int y;
    int z;
    private int t;
    public void m2(){
        B b= new B();
        b.m1();
    }
    //C c = new C();
    
    public class B{
        int w;
        public void m1(){
            x=1;
            y=2;
            z=3;
            t=4;
            m2();
        }
    }
    //local class
    
    public void m3(){
        int v = 4; 
        class C{
            int m;
            int n;
            int t;
            public void m4(){
                x=1;
                y=2;
                z=3;
                A.this.t=4;
                this.t=5;
                m2();
                //System.out.println(v);
                //int v = 4; 
            }
        }
        v=5;
        C c = new C();
    }
}
