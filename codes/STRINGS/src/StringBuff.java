public class StringBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append(" Khusi");
        sb.insert(6,"sam");
        System.out.println(sb);
    }
}
