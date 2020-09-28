package com.galaxy.jupiter.client;

import com.alibaba.fastjson.JSONObject;
import com.galaxy.jupiter.client.util.HttpUtil;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.*;

public class HttpTest {
    public static void main(String[] args) throws IOException {
        sendPost("http://127.0.0.1:50000", "{\n" +
                "    \"username\": \"admin\",\n" +
                "    \"password\": \"admin\"\n" +
                "}");

//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//        headers.setContentType(type);
//        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
//        JSONObject jsonObj = new JSONObject();
//
//        jsonObj.put("username", "admin");
//        jsonObj.put("password", "admin");
//
//        HttpEntity<String> formEntity = new HttpEntity<String>(jsonObj.toString(), headers);
//        System.out.println(jsonObj.toString());
//        //100.100.20.108
////        String result = HttpUtil.doPost("http://localhost:50000/auth/login/", jsonObj.toString());
//        String result = HttpUtil.doPost("http://39.106.253.136:28182/api/", jsonObj.toString());
//        System.out.println(result);
//        Socket socket = new Socket();
//        InetSocketAddress inetSocketAddress = new InetSocketAddress("100.100.20.108", 50000);
//        socket.connect(inetSocketAddress);
//        String data = URLEncoder.encode("name", "utf-8") + "=" + URLEncoder.encode("gloomyfish", "utf-8") + "&" +
//                URLEncoder.encode("age", "utf-8") + "=" + URLEncoder.encode("32", "utf-8");
//
//        String request = "POST /auth/login/ HTTP/1.1\r\n"+
//                "Host: 100.100.20.108:50000\r\n";

//        OutputStreamWriter streamWriter = new OutputStreamWriter(socket.getOutputStream(), "utf-8");
//        BufferedWriter bufferedWriter = new BufferedWriter(streamWriter);
//
//        bufferedWriter.write("POST " + "/auth/login/" + " HTTP/1.1\r\n");
//        bufferedWriter.write("Host: " + "50000" + "\r\n");
//        bufferedWriter.write("Content-Length: " + data.length() + "\r\n");
//        bufferedWriter.write("Content-Type: application/x-www-form-urlencoded\r\n");
//        bufferedWriter.write("\r\n");
//        bufferedWriter.write(data);
//        bufferedWriter.flush();
//        bufferedWriter.write("\r\n");
//        bufferedWriter.flush();
//
//        BufferedInputStream streamReader = new BufferedInputStream(socket.getInputStream());
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(streamReader, "utf-8"));
//        String line = null;
//        while((line = bufferedReader.readLine())!= null)
//        {
//            System.out.println(line);
//        }
//        bufferedReader.close();
//        bufferedWriter.close();
//        socket.close();

    }

    public static String sendPost(String url,String Params)throws IOException{
        OutputStreamWriter out = null;
        BufferedReader reader = null;
        String response="";
        try {
            URL httpUrl = null; //HTTP URL类 用这个类来创建连接
            //创建URL
            httpUrl = new URL(url);
            //建立连接
            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("connection", "keep-alive");
            conn.setUseCaches(false);//设置不要缓存
            conn.setInstanceFollowRedirects(true);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.connect();
            //POST请求
            out = new OutputStreamWriter(
                    conn.getOutputStream());
            out.write(Params);
            out.flush();
            //读取响应
            reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String lines;
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                response+=lines;
            }
            reader.close();
            // 断开连接
            conn.disconnect();
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(reader!=null){
                    reader.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }

        return response;
    }
}
