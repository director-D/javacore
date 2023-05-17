package com.ebook;

import okhttp3.*;

import java.io.IOException;

/**
 * @Author: vincent
 * @License: (C) Copyright 2005-2200, vincent Corporation Limited.
 * @Contact: lookvincent@163.com
 * @Date: 3/4/23 20:11
 * @Version: 1.0
 * @Description:
 */
public class EbookDownload {

    public static void main(String[] args) throws IOException {
        //拿到OkHttpClient对象
        OkHttpClient client = new OkHttpClient();

//        Request request = new Request.Builder()
//                .get()
//                .url("https:www.baidu.com")
//                .build();
//
//
//        Call call = client.newCall(request);
//
//        //同步调用,返回Response,会抛出IO异常
////        Response response = call.execute();
//
//
//        //异步调用,并设置回调函数
//        call.enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                System.out.println("get failed"+e);
//            }
//
//            @Override
//            public void onResponse(Call call, final Response response) throws IOException {
//                final String res = response.body().string();
//                System.out.println(res);
//            }
//        });

        //Post请求
//        POST /CxstarReaderApi/api/CxstarDownload HTTP/1.1
//        Host: dzgy.cxstar.com
//        Content-Type: application/json;charset=utf-8
//        Accept: */*
//User-Agent: CXReader/1.0.1 CFNetwork/1402.0.8 Darwin/22.2.0
//Accept-Language: zh-CN,zh-Hans;q=0.9
//Accept-Encoding: gzip, deflate
//Content-Length: 1017
//Connection: keep-alive
//
//{
//  "bookId" : "2aa8c6b40000f5XXXX",
//  "deviceId" : "E1E1DF01-B22D-41D5-835B-C487E94F02EF",
//  "sTime" : "1677930587",
//  "part" : 1,
//  "partIndex" : 9,
//  "serverUrl" : "https:\/\/www.cxstar.com\/ebookapisso\/",
//  "version" : "6.9.0",
//  "token" : "eyJhbGciOiJIUzUxMiJ9.eyJiaXJ0aGRheSI6IjE5OTItMDUtMDIiLCJjYyI6MjE0NywiY29sbGVnZSI6IiIsIndlY2hhdG9wZW5pZCI6IiIsInNwZWNpYWx0eSI6IiIsImVtbCI6IiIsImxvZ2luVHlwZSI6IjAiLCJzZXgiOiIxIiwibG9naW5Db2RlIjoiMjE0NyIsInR5cGUiOiIxIiwicGluc3QiOiIiLCJ1aWQiOiIyMTQ3XzQxMTUyNjE5OTIwNTAyMjkxNiIsInJvbGVpZHMiOiIiLCJ1cnVpZCI6IkFNbWlQV25xdE1vVXRVNzg4MEZtIiwiY3VzaWQiOiJaQWZpYkFjc0VobVQ4V1ljdUhWIiwibG9naW5JcCI6IjExNy4xNDcuMTE5LjEwMSIsImV0aW1lIjoiIiwidGVsIjoiMTgwMTcxMTMzNjIiLCJpZCI6IiIsInBvc2l0aW9uIjoiIiwiZXhwIjoxNjc4MDEzMjQ0LCJpYXQiOjE2Nzc5MjY4NDQsImF0ciI6IiIsIm5tIjoi5p2o5paH54SwIn0.AnQ0thNuzCEeSYjimA4m0YOOdpA_MdtNLqcZg4t1PS81fwOifGiOXxk_tANOXc69zmnMoVvB9u7VVAhU5SYGJg",
//  "netWorkType" : "WiFi",
//  "sign" : "99C5C17883A1A48FE89381AD777DFFD5",
//  "nonce" : "4F3D2F4B987A62BB31AD0C98B5F7F731"
//}

        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), "{username:admin;password:admin}");










    }


}
