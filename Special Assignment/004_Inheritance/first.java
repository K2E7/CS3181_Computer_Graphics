package PACK1;

import PACK1.PACK2.*;
import PACK1.PACK2.PACK3.third;
public class first
{
    public static void main(String args[])
    {
        System.out.println("Hello this is the first class");

        second p = new second();
        p.f();

        third  q = new third();
        q.f2();

        second_derived r = new second_derived();
        r.fd();
        r.f();
    }
}
