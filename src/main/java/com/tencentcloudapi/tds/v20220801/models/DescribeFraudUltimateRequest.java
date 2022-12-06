/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tds.v20220801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFraudUltimateRequest extends AbstractModel{

    /**
    * 客户端通过SDK获取的设备Token
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * 使用场景。目前仅支持login-登录场景、register-注册场景
    */
    @SerializedName("SceneCode")
    @Expose
    private String SceneCode;

    /**
    * 用户唯一标识
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 事件时间戳（毫秒）
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
    * 事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时
    */
    @SerializedName("ElapsedTime")
    @Expose
    private Long ElapsedTime;

    /**
    * 微信的OpenId
    */
    @SerializedName("WeChatOpenId")
    @Expose
    private String WeChatOpenId;

    /**
    * 手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 客户端IP
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * QQ的OpenId
    */
    @SerializedName("QQOpenId")
    @Expose
    private String QQOpenId;

    /**
     * Get 客户端通过SDK获取的设备Token 
     * @return DeviceToken 客户端通过SDK获取的设备Token
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set 客户端通过SDK获取的设备Token
     * @param DeviceToken 客户端通过SDK获取的设备Token
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get 使用场景。目前仅支持login-登录场景、register-注册场景 
     * @return SceneCode 使用场景。目前仅支持login-登录场景、register-注册场景
     */
    public String getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 使用场景。目前仅支持login-登录场景、register-注册场景
     * @param SceneCode 使用场景。目前仅支持login-登录场景、register-注册场景
     */
    public void setSceneCode(String SceneCode) {
        this.SceneCode = SceneCode;
    }

    /**
     * Get 用户唯一标识 
     * @return UserId 用户唯一标识
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一标识
     * @param UserId 用户唯一标识
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 事件时间戳（毫秒） 
     * @return EventTime 事件时间戳（毫秒）
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 事件时间戳（毫秒）
     * @param EventTime 事件时间戳（毫秒）
     */
    public void setEventTime(Long EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get 事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时 
     * @return ElapsedTime 事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时
     */
    public Long getElapsedTime() {
        return this.ElapsedTime;
    }

    /**
     * Set 事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时
     * @param ElapsedTime 事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时
     */
    public void setElapsedTime(Long ElapsedTime) {
        this.ElapsedTime = ElapsedTime;
    }

    /**
     * Get 微信的OpenId 
     * @return WeChatOpenId 微信的OpenId
     */
    public String getWeChatOpenId() {
        return this.WeChatOpenId;
    }

    /**
     * Set 微信的OpenId
     * @param WeChatOpenId 微信的OpenId
     */
    public void setWeChatOpenId(String WeChatOpenId) {
        this.WeChatOpenId = WeChatOpenId;
    }

    /**
     * Get 手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5 
     * @return PhoneNumber 手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5
     * @param PhoneNumber 手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 客户端IP 
     * @return ClientIP 客户端IP
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set 客户端IP
     * @param ClientIP 客户端IP
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get QQ的OpenId 
     * @return QQOpenId QQ的OpenId
     */
    public String getQQOpenId() {
        return this.QQOpenId;
    }

    /**
     * Set QQ的OpenId
     * @param QQOpenId QQ的OpenId
     */
    public void setQQOpenId(String QQOpenId) {
        this.QQOpenId = QQOpenId;
    }

    public DescribeFraudUltimateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFraudUltimateRequest(DescribeFraudUltimateRequest source) {
        if (source.DeviceToken != null) {
            this.DeviceToken = new String(source.DeviceToken);
        }
        if (source.SceneCode != null) {
            this.SceneCode = new String(source.SceneCode);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.EventTime != null) {
            this.EventTime = new Long(source.EventTime);
        }
        if (source.ElapsedTime != null) {
            this.ElapsedTime = new Long(source.ElapsedTime);
        }
        if (source.WeChatOpenId != null) {
            this.WeChatOpenId = new String(source.WeChatOpenId);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.QQOpenId != null) {
            this.QQOpenId = new String(source.QQOpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "ElapsedTime", this.ElapsedTime);
        this.setParamSimple(map, prefix + "WeChatOpenId", this.WeChatOpenId);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "QQOpenId", this.QQOpenId);

    }
}

