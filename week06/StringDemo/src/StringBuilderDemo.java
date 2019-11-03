public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder("world");

        StringBuilder sb2 = sb.append("hello");
        System.out.println(sb2 == sb);

        sb.delete(1,4);
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.insert(1,"it");
        System.out.println(sb);

        sb.replace(0,3,"java ");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.charAt(0));

        sb.reverse();
        System.out.println(sb.indexOf("java",5));
        String str = sb.substring(0,1);
        System.out.println(str);
        str = sb.substring(1);
        System.out.println(str);
        sb.append("hello").append(true).append(100);
        System.out.println(sb);
    }
}
