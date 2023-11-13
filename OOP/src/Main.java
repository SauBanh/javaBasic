import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] sa = new String[5];
        ArrayList<String> sal = new ArrayList<String>();
        sal.add("Tuan anh dep train");
        sal.add("Tai Le");
        sal.add("Cuong");
        int index = sal.indexOf("Cuong");
        System.out.println(index);
        System.out.println(sal.get(1));
        sal.set(1, "Tai Cho Dien");
        System.out.println(sal.get(1));
        System.out.println(sal.size());
        sal.clear();
        System.out.println(sal.size());
    }
}