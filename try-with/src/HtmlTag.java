public class HtmlTag implements AutoCloseable {
    private String tag;

    public HtmlTag(String tag){
        this.tag=tag;
     System.out.println("<"+tag+">");
    }
    public void body(String body){
        System.out.println(body);
    }
    public void close(){
        System.out.println("</"+tag+">");
    }
}
