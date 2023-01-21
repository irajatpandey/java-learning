package oops.inheritance;


public class HierarchicalInheritance  {
    String val;
    HierarchicalInheritance(){
        this.val = "-1";
    }
    public HierarchicalInheritance(String val) {
        this.val = val;
    }
}

class A1 extends HierarchicalInheritance{
    int value;

    public A1(String val, int value) {
        super(val);
        this.value = value;
    }
}

class B1 extends  HierarchicalInheritance{
    double cost;

    public B1(String val, double cost) {
        super(val);
        this.cost = cost;
    }
}