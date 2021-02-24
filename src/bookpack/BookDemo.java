package bookpack;

import java.util.regex.*;

class Some {
    protected class InnerClass {
        private class InnerInnerClass {

        }
    }
}

abstract class BookDemo {
   static void revStr(StringBuilder sb, String str) {
       System.out.println(sb.toString());
       sb.replace(sb.indexOf(str), sb.indexOf(str)+2, new StringBuilder(str).reverse().toString());
       System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String reg = "8\\(912\\)[0-9]*12";
        String str = "8(912)2132321342128(912)23423128(912)1234123424";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);

        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group()).append(" ");
        }
        System.out.println(sb.toString());
    }
}


