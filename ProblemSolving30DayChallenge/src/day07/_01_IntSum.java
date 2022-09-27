package day07;

public class _01_IntSum {

    public Integer sum(Integer i, Integer j){
//        System.out.println(i+j);
        return i+j;
    }

    public static void main(String[] args) {
        _01_IntSum obj = new _01_IntSum();
        obj.sum(18,10);
        System.out.println(obj.sum(18,99));
    }
}
