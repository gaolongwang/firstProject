import org.apache.commons.lang3.StringUtils;

/**
 * Created by Thinkpad on 2017/10/16.
 */
public class ChinesTest {
    public static void main(String[] args) {
        String 变量="这是一个汉字变量";
        System.out.println(变量);

        String[] aaa = {"a","b","c"};
        String bbb= StringUtils.join(aaa,",");
        System.out.println(bbb);
    }
}
