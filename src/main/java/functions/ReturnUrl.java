package functions;

import okhttp3.*;

import java.io.IOException;

public class ReturnUrl {
    public static String getUrl(String url){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).get().build();

        try {
            Response response = client.newCall(request).execute();
            if(response.isSuccessful()){
                String responseData = response.body().string();
                return(responseData);
            }else{
                return("GET请求失败，响应码：" + response.code());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
