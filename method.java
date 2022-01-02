import java.util.Locale;

public class method {

    public static void main(String[] args){
        String s1="tanuj";
        String s2="gaur";
        int length=s1.length();
        int length1=s2.length();
            System.out.println("empty-"+s1.isEmpty());
            System.out.println("lentgh-"+length);
            System.out.println("trim-"+s1.trim());
            System.out.println("equal-"+s1.equals(s2));
            System.out.println("ignore first alpha-"+s1.equalsIgnoreCase(s2));
            System.out.println("compare-"+s1.compareTo(s2));
            System.out.println("ignore compare-"+s1.compareToIgnoreCase(s2));
            System.out.println("concate-"+s1.concat(s2));
            System.out.println("join-"+String.join(",",s1,s2));
            System.out.println("subseqence-"+ s2.subSequence(0,2));
            System.out.println("substring-"+s1.substring(1));
            System.out.println("replace-"+s1.replace("ta","TA"));
            System.out.println("replce all-"+s2.replaceAll("gaur","tanuj"));
            System.out.println("replace-"+s1.replaceFirst("tanuj","TANUJ"));
            System.out.println("indexof-"+s1.indexOf("a"));
            System.out.println("lastindex-"+s2.lastIndexOf("u"));
            System.out.println("contains-"+s1.contains("an"));
            System.out.println("charat-"+s1.charAt(3));
            System.out.println("startwith-"+s2.startsWith("a"));
            System.out.println("startend-"+s2.endsWith("r"));
            System.out.println("uppercase-"+s1.toUpperCase(Locale.ROOT));
            String s3="TANUJ";
            System.out.println("tolower-"+s3.toLowerCase());
            char[] c=s3.toCharArray();
            System.out.println(c);
            int e=10,b=20;
            System.out.println(e+b);
            String a=String.valueOf(e);
            String f=String.valueOf(b);
            System.out.println(a+f);
    }
}
