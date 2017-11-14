package socket;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Thinkpad on 2017/10/23.
 */
public class JsonTest {
    public static void main(String[] args) {
        /*String str = "{\"access_token\":\"6460d6b4-7faa-485d-86e0-932ba7c90fb6\",\"token_type\":\"bearer\",\"refresh_token\":\"aa254d11-7ac6-4d89-b967-df9449222993\",\"expires_in\":3599,\"scope\":\"read write\"}";
        Map<String,Object> aa = (Map)JSONObject.parse(str);
        System.out.println(aa);
        for(Map.Entry<String,Object> entry:aa.entrySet()){

            System.out.println("Key=" + entry.getKey() + ",Value=" + entry.getValue().toString());
        }
        System.out.println(aa.get("access_token"));
        System.out.println(aa.containsKey("access_token"));*/

       /* Map<String,Object> vo = new HashMap();
        List<String> snList = new ArrayList();
        snList.add("8888888888");
        String[] aa = new String[snList.size()];
        snList.toArray(aa);
        vo.put("snCode",aa);
        vo.put("endDate","2017-10-17");
        vo.put("startDate","2017-10-10");
        String jsonStr = JSONObject.toJSONString(vo);
        System.out.println(jsonStr);*/

       String reponseJsonStr = "{\"result\":[{\"num\":7,\"sn_code\":\"1111111111\"},{\"num\":19,\"sn_code\":\"8888888888\"}],\"endDate\":\"2017-10-17\",\"startDate\":\"2017-10-10\"}";
        ResponseModel modelOb = (ResponseModel)JSONObject.parseObject(reponseJsonStr,ResponseModel.class);
        Map<String,Object> aa = (Map)JSONObject.parse(reponseJsonStr);
        String bb = aa.get("result").toString();
        List<ResultBean> resultBean = JSONObject.parseArray(bb,ResultBean.class);
        JSONArray ja = JSONObject.parseArray(bb);
        for(int i=0; i<ja.size(); i++){
            JSONObject jj = (JSONObject)ja.get(i);
            System.out.println("sum:"+jj.get("num"));
            System.out.println("sn_code:"+jj.get("sn_code"));
        }
        System.out.println(modelOb.getResult().size());

    }
}
