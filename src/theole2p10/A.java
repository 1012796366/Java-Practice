package theole2p10;
class Tom{

    private int x=120;

    protected int y=20;

    int z=11;

    private void f(){

        x=200;

        System.out.printf("%d\n", x);

    }

    void g(){

        x=200;

        System.out.printf("%d\n", x);

    }

}

public class A{

    public static void main(String[] args){

        Tom tom=new Tom();

        // tom.x=22;

        tom.y=33;

        tom.z=55;

        // tom.f();

        tom.g();

    }

}