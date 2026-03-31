/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFinanceFraudUltimateRequest extends AbstractModel {

    /**
    * <p>客户端通过SDK获取的设备Token</p>
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * <p>使用场景。目前仅支持login-登录场景、register-注册场景</p>
    */
    @SerializedName("SceneCode")
    @Expose
    private String SceneCode;

    /**
    * <p>用户唯一标识</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>事件时间戳（毫秒）</p>
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
    * <p>事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时</p>
    */
    @SerializedName("ElapsedTime")
    @Expose
    private Long ElapsedTime;

    /**
    * <p>微信的OpenId</p>
    */
    @SerializedName("WeChatOpenId")
    @Expose
    private String WeChatOpenId;

    /**
    * <p>手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5</p>
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>业务客户端IP</p>
    */
    @SerializedName("BizClientIp")
    @Expose
    private String BizClientIp;

    /**
    * <p>QQ的OpenId</p>
    */
    @SerializedName("QQOpenId")
    @Expose
    private String QQOpenId;

    /**
    * <p>数据授权信息</p>
    */
    @SerializedName("DataAuthorization")
    @Expose
    private DataAuthorizationInfo DataAuthorization;

    /**
     * Get <p>客户端通过SDK获取的设备Token</p> 
     * @return DeviceToken <p>客户端通过SDK获取的设备Token</p>
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set <p>客户端通过SDK获取的设备Token</p>
     * @param DeviceToken <p>客户端通过SDK获取的设备Token</p>
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get <p>使用场景。目前仅支持login-登录场景、register-注册场景</p> 
     * @return SceneCode <p>使用场景。目前仅支持login-登录场景、register-注册场景</p>
     */
    public String getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set <p>使用场景。目前仅支持login-登录场景、register-注册场景</p>
     * @param SceneCode <p>使用场景。目前仅支持login-登录场景、register-注册场景</p>
     */
    public void setSceneCode(String SceneCode) {
        this.SceneCode = SceneCode;
    }

    /**
     * Get <p>用户唯一标识</p> 
     * @return UserId <p>用户唯一标识</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户唯一标识</p>
     * @param UserId <p>用户唯一标识</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>事件时间戳（毫秒）</p> 
     * @return EventTime <p>事件时间戳（毫秒）</p>
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>事件时间戳（毫秒）</p>
     * @param EventTime <p>事件时间戳（毫秒）</p>
     */
    public void setEventTime(Long EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时</p> 
     * @return ElapsedTime <p>事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时</p>
     */
    public Long getElapsedTime() {
        return this.ElapsedTime;
    }

    /**
     * Set <p>事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时</p>
     * @param ElapsedTime <p>事件耗时（毫秒），例如进入登录界面到点击登录按钮耗时</p>
     */
    public void setElapsedTime(Long ElapsedTime) {
        this.ElapsedTime = ElapsedTime;
    }

    /**
     * Get <p>微信的OpenId</p> 
     * @return WeChatOpenId <p>微信的OpenId</p>
     */
    public String getWeChatOpenId() {
        return this.WeChatOpenId;
    }

    /**
     * Set <p>微信的OpenId</p>
     * @param WeChatOpenId <p>微信的OpenId</p>
     */
    public void setWeChatOpenId(String WeChatOpenId) {
        this.WeChatOpenId = WeChatOpenId;
    }

    /**
     * Get <p>手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5</p> 
     * @return PhoneNumber <p>手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5</p>
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5</p>
     * @param PhoneNumber <p>手机号码（注：不需要带国家代码 例如：13430421011）。可以传入原文或MD5</p>
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get <p>业务客户端IP</p> 
     * @return BizClientIp <p>业务客户端IP</p>
     */
    public String getBizClientIp() {
        return this.BizClientIp;
    }

    /**
     * Set <p>业务客户端IP</p>
     * @param BizClientIp <p>业务客户端IP</p>
     */
    public void setBizClientIp(String BizClientIp) {
        this.BizClientIp = BizClientIp;
    }

    /**
     * Get <p>QQ的OpenId</p> 
     * @return QQOpenId <p>QQ的OpenId</p>
     */
    public String getQQOpenId() {
        return this.QQOpenId;
    }

    /**
     * Set <p>QQ的OpenId</p>
     * @param QQOpenId <p>QQ的OpenId</p>
     */
    public void setQQOpenId(String QQOpenId) {
        this.QQOpenId = QQOpenId;
    }

    /**
     * Get <p>数据授权信息</p> 
     * @return DataAuthorization <p>数据授权信息</p>
     */
    public DataAuthorizationInfo getDataAuthorization() {
        return this.DataAuthorization;
    }

    /**
     * Set <p>数据授权信息</p>
     * @param DataAuthorization <p>数据授权信息</p>
     */
    public void setDataAuthorization(DataAuthorizationInfo DataAuthorization) {
        this.DataAuthorization = DataAuthorization;
    }

    public DescribeFinanceFraudUltimateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFinanceFraudUltimateRequest(DescribeFinanceFraudUltimateRequest source) {
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
        if (source.BizClientIp != null) {
            this.BizClientIp = new String(source.BizClientIp);
        }
        if (source.QQOpenId != null) {
            this.QQOpenId = new String(source.QQOpenId);
        }
        if (source.DataAuthorization != null) {
            this.DataAuthorization = new DataAuthorizationInfo(source.DataAuthorization);
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
        this.setParamSimple(map, prefix + "BizClientIp", this.BizClientIp);
        this.setParamSimple(map, prefix + "QQOpenId", this.QQOpenId);
        this.setParamObj(map, prefix + "DataAuthorization.", this.DataAuthorization);

    }
}

