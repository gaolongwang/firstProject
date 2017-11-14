package socket;

import java.util.List;

/**
 * Created by Thinkpad on 2017/10/24.
 */
public class ResponseModel {

    private List<ResultBean> result;

    private String endDate;

    private String startDate;

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
