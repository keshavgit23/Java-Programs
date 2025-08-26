// final keyword:-

class Test{
    public static void main(String[] args){
         
        final StringBuilder sb = new StringBuilder("Hello");
       sb.delete(0, 2);             // "llo"
       sb.append(" World");         // "llo World"
       sb.insert(0, "Hi ");         //  "Hi llo World"
       System.out.println(sb); 
         }
}
