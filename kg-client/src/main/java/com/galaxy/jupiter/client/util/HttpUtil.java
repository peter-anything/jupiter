package com.galaxy.jupiter.client.util;

import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.nio.charset.StandardCharsets;

public class HttpUtil {
    public static String doPost(String uri, String json) {
        final CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response;
        HttpPost httpPost = new HttpPost(uri);
        StringEntity stringEntity = new StringEntity(json.replaceAll("}\n", "}"), ContentType.APPLICATION_JSON);
        stringEntity.setContentEncoding("utf-8");
        httpPost.setProtocolVersion(HttpVersion.HTTP_1_1);
        httpPost.setEntity(stringEntity);
        RequestConfig config = RequestConfig.custom()
                .setSocketTimeout(5000)
                .setConnectionRequestTimeout(5000)
                .build();
        httpPost.setConfig(config);
        try {
            response = httpClient.execute(httpPost);
            if (response != null && response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
            } else {
                return "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            httpPost.releaseConnection();
        }

        return "";
    }
}

