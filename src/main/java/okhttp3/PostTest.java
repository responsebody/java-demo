package okhttp3;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Map;
import model.User;

/*
 * author yongkai.sun
 */
public class PostTest {
    public static void main(String[] args) throws JsonProcessingException {
        OkHttpClient okHttpClient = new OkHttpClient();
        User user = new User();
        user.setCode("Ser_yanlei.zhu");
        Map map = Maps.newHashMap();
        map.put("code","Ser_yanlei.zhu");
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(map);
        RequestBody requestBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), s);
        Request request = new Request.Builder().url("http://localhost:8084/online/pac/user/login")
                .post(requestBody).build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                String string = response.body().string();
                if ("true".equals(string)) {
//                    return "redirect:http://localhost:8084";
                    System.out.println("2");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
