public class comapring2String {
    public static void main(String[] args) {
        String s1="Dammmmmm";
        String s2="Dammmmmm";
        System.out.println(s1.equals(s2));

        //string width
        String s3="say hello to all the guests";
        System.out.println(s3.endsWith("s"));//true
        System.out.println(s3.startsWith("sa"));//true
        System.out.println(s3.endsWith("gyf"));//fasle


        //replace string
        String s4="this all are the our guests";
        System.out.println(s4.replaceAll("are","at"));
    }
}
