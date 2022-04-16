//package com.my_blogs_system.test;
//
//import com.alibaba.fastjson.JSONObject;
//import org.junit.Test;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.Transaction;
//
//public class RedisConnectTest {
//    @Test
//    public void test(){
//        Jedis jedis=new Jedis("8.142.45.54",6379); //打码了
//        System.out.println(jedis.ping()); //输出pong则为连接成功
//
//        jedis.set("name","pht");
//        jedis.set("age","22");
//        System.out.println(jedis.get("name"));
//        System.out.println(jedis.keys("*"));
//
//        JSONObject js=new JSONObject();
//        js.put("fdfd","465");
//        js.put("rere","gegt");
//        String res=js.toJSONString();
//        //事务
//
//        Transaction transaction=jedis.multi();
//        transaction.set("1",res);
//        transaction.set("2",res);
//        transaction.exec();
//
//        jedis.close();
//        System.out.println(jedis.get("1"));
//        System.out.println(jedis.get("2"));
//
//        jedis.flushDB();
//        System.out.println(jedis.keys("*"));
//    }
//
//}
