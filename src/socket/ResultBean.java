package socket;

import javax.xml.bind.annotation.XmlInlineBinaryData;

/**
 * Created by Thinkpad on 2017/10/24.
 */
public class ResultBean {

    private Integer num;

    private String sn_code;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSn_code() {
        return sn_code;
    }

    public void setSn_code(String sn_code) {
        this.sn_code = sn_code;
    }
}
