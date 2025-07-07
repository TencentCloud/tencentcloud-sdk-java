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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CaptchaUserAllAppId extends AbstractModel {

    /**
    * 验证码应用ID
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * 注册应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 腾讯云APPID
    */
    @SerializedName("TcAppId")
    @Expose
    private Long TcAppId;

    /**
    * 渠道信息
    */
    @SerializedName("ChannelInfo")
    @Expose
    private String ChannelInfo;

    /**
     * Get 验证码应用ID 
     * @return CaptchaAppId 验证码应用ID
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set 验证码应用ID
     * @param CaptchaAppId 验证码应用ID
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get 注册应用名称 
     * @return AppName 注册应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 注册应用名称
     * @param AppName 注册应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 腾讯云APPID 
     * @return TcAppId 腾讯云APPID
     */
    public Long getTcAppId() {
        return this.TcAppId;
    }

    /**
     * Set 腾讯云APPID
     * @param TcAppId 腾讯云APPID
     */
    public void setTcAppId(Long TcAppId) {
        this.TcAppId = TcAppId;
    }

    /**
     * Get 渠道信息 
     * @return ChannelInfo 渠道信息
     */
    public String getChannelInfo() {
        return this.ChannelInfo;
    }

    /**
     * Set 渠道信息
     * @param ChannelInfo 渠道信息
     */
    public void setChannelInfo(String ChannelInfo) {
        this.ChannelInfo = ChannelInfo;
    }

    public CaptchaUserAllAppId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CaptchaUserAllAppId(CaptchaUserAllAppId source) {
        if (source.CaptchaAppId != null) {
            this.CaptchaAppId = new Long(source.CaptchaAppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.TcAppId != null) {
            this.TcAppId = new Long(source.TcAppId);
        }
        if (source.ChannelInfo != null) {
            this.ChannelInfo = new String(source.ChannelInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaAppId", this.CaptchaAppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "TcAppId", this.TcAppId);
        this.setParamSimple(map, prefix + "ChannelInfo", this.ChannelInfo);

    }
}

