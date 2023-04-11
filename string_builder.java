import javax.xml.transform.Source;

public class string_builder {
    public static void main(String[]args){
        StringBuilder a = new StringBuilder("Sadhak saini");
        System.out.println(a);

        StringBuilder b = new StringBuilder("Sadhak Saini");
        System.out.println(b.charAt(4));

        StringBuilder c = new StringBuilder("Sadhak Saini");
        c.setCharAt(0, 'R');
        System.out.println(c);

        StringBuilder d = new StringBuilder("Sadhak Saini");
        d.insert(0, 'R');
        System.out.println(d);

        StringBuilder e = new StringBuilder("Sadhak Saini");
        e.delete(0, 4);
        System.out.println(e);

        StringBuilder f = new StringBuilder("Sadhak Saini");
        f.append(" is Boss");
        System.out.println(f);

        StringBuilder g = new StringBuilder("Sadhak Saini");
        System.out.println(g.length());

    }
    
}
