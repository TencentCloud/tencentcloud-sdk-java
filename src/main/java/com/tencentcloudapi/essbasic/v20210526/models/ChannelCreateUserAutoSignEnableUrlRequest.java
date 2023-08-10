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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateUserAutoSignEnableUrlRequest extends AbstractModel{

    /**
    * 渠道应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
    */
    @SerializedName("SceneKey")
    @Expose
    private String SceneKey;

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 自动签开通，签署相关配置
    */
    @SerializedName("AutoSignConfig")
    @Expose
    private AutoSignConfig AutoSignConfig;

    /**
    * 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
    */
    @SerializedName("UrlType")
    @Expose
    private String UrlType;

    /**
    * 通知类型，默认不填为不通知开通方，填写 SMS 为短信通知。
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 若上方填写为 SMS，则此处为手机号
    */
    @SerializedName("NotifyAddress")
    @Expose
    private String NotifyAddress;

    /**
    * 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为30天。如果不传，默认有效期为7天。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get 渠道应用相关信息 
     * @return Agent 渠道应用相关信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息
     * @param Agent 渠道应用相关信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方 
     * @return SceneKey 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
     */
    public String getSceneKey() {
        return this.SceneKey;
    }

    /**
     * Set 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
     * @param SceneKey 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
     */
    public void setSceneKey(String SceneKey) {
        this.SceneKey = SceneKey;
    }

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 自动签开通，签署相关配置 
     * @return AutoSignConfig 自动签开通，签署相关配置
     */
    public AutoSignConfig getAutoSignConfig() {
        return this.AutoSignConfig;
    }

    /**
     * Set 自动签开通，签署相关配置
     * @param AutoSignConfig 自动签开通，签署相关配置
     */
    public void setAutoSignConfig(AutoSignConfig AutoSignConfig) {
        this.AutoSignConfig = AutoSignConfig;
    }

    /**
     * Get 链接类型，空-默认小程序端链接，H5SIGN-h5端链接 
     * @return UrlType 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
     */
    public String getUrlType() {
        return this.UrlType;
    }

    /**
     * Set 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
     * @param UrlType 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
     */
    public void setUrlType(String UrlType) {
        this.UrlType = UrlType;
    }

    /**
     * Get 通知类型，默认不填为不通知开通方，填写 SMS 为短信通知。 
     * @return NotifyType 通知类型，默认不填为不通知开通方，填写 SMS 为短信通知。
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知类型，默认不填为不通知开通方，填写 SMS 为短信通知。
     * @param NotifyType 通知类型，默认不填为不通知开通方，填写 SMS 为短信通知。
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 若上方填写为 SMS，则此处为手机号 
     * @return NotifyAddress 若上方填写为 SMS，则此处为手机号
     */
    public String getNotifyAddress() {
        return this.NotifyAddress;
    }

    /**
     * Set 若上方填写为 SMS，则此处为手机号
     * @param NotifyAddress 若上方填写为 SMS，则此处为手机号
     */
    public void setNotifyAddress(String NotifyAddress) {
        this.NotifyAddress = NotifyAddress;
    }

    /**
     * Get 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为30天。如果不传，默认有效期为7天。 
     * @return ExpiredTime 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为30天。如果不传，默认有效期为7天。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为30天。如果不传，默认有效期为7天。
     * @param ExpiredTime 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为30天。如果不传，默认有效期为7天。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public ChannelCreateUserAutoSignEnableUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateUserAutoSignEnableUrlRequest(ChannelCreateUserAutoSignEnableUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.SceneKey != null) {
            this.SceneKey = new String(source.SceneKey);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.AutoSignConfig != null) {
            this.AutoSignConfig = new AutoSignConfig(source.AutoSignConfig);
        }
        if (source.UrlType != null) {
            this.UrlType = new String(source.UrlType);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.NotifyAddress != null) {
            this.NotifyAddress = new String(source.NotifyAddress);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "SceneKey", this.SceneKey);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "AutoSignConfig.", this.AutoSignConfig);
        this.setParamSimple(map, prefix + "UrlType", this.UrlType);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "NotifyAddress", this.NotifyAddress);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

