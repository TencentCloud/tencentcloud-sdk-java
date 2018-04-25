/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;;

/**
 * 签名工具类
 */
public class Sign {
	
    private static final String CONTENT_CHARSET = "UTF-8";
    
    /**
     * 
     * @param sigStr
     * @param secretKey
     * @param sigMethod
     * @return string  sign string
     * @throws SdkException
     */
    public static String sign(String secretKey, String sigStr, String sigMethod) throws TencentCloudSDKException 
    {
    	String sig = null;
    	try{
	    	Mac mac = Mac.getInstance(sigMethod);
	        byte[] hash;
	        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(CONTENT_CHARSET), mac.getAlgorithm());

	        mac.init(secretKeySpec);
	        hash = mac.doFinal(sigStr.getBytes(CONTENT_CHARSET));
	        sig = DatatypeConverter.printBase64Binary(hash);
    	} catch (Exception e) {
    		throw new TencentCloudSDKException(e.getMessage());
    	}
        return sig;	
    }
    
    public static String makeSignPlainText(TreeMap<String, String> requestParams, String reqMethod, String host, String path) {

        String retStr = "";
        retStr += reqMethod;
        retStr += host;
        retStr += path;
        retStr += buildParamStr(requestParams, reqMethod);
        return retStr;
    }

    protected static String buildParamStr(TreeMap<String, String> requestParams, String requestMethod) {

        String retStr = "";
        for(String key: requestParams.keySet()) {
            String value = requestParams.get(key).toString();
            if (retStr.length() == 0) {
                retStr += '?';
            } else {
                retStr += '&';
            }
            retStr += key.replace("_", ".") + '=' + value;

        }
        return retStr;
    }	
}
