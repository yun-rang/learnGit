package com.example.demo.commons.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.commons.Constant.JWTConstant;
import java.util.Date;


public class JwtUtil {
    private String token;
    private final static String KEY = JWTConstant.KEY;
    private final static Long time = 1000L;
    public static String token(String str){
        return JWT.create()
                .withClaim("id",str)
                .withExpiresAt(new Date(System.currentTimeMillis()+time))
                .sign(Algorithm.HMAC256(KEY));
    }
    public static String parse(String token){
        return JWT.decode(token).getClaims().get("id").toString();
    }
//    public static boolean verify(String token){
//        JWT.require(Algorithm.HMAC256(KEY))
//    }
}
