/**
 * Created by zhuqiang3 on 2018/3/20.
 */
public class Main {

    public static void main(String[] args) {
        BigFileReader.Builder builder = new BigFileReader.Builder("d:/reliability.txt",new IHandle() {
            @Override
            public void handle(String line,String name) {
                System.out.println(name+":---------"+line);
            }
        });


        BigFileReader bigFileReader = builder.withTreahdSize(10)
                                            .withCharset("gbk")
                                            .withBufferSize(1024*1024)
                                            .build();

        bigFileReader.start();
    }

}