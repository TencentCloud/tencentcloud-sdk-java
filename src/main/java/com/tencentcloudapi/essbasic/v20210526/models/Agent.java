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

public class Agent extends AbstractModel{

    /**
    * 腾讯电子签颁发给渠道的应用ID，32位字符串
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 腾讯电子签颁发给渠道侧合作企业的企业ID
    */
    @SerializedName("ProxyOrganizationId")
    @Expose
    private String ProxyOrganizationId;

    /**
    * 腾讯电子签颁发给渠道侧合作企业的应用ID
    */
    @SerializedName("ProxyAppId")
    @Expose
    private String ProxyAppId;

    /**
    * 渠道/平台合作企业经办人（操作员）
    */
    @SerializedName("ProxyOperator")
    @Expose
    private UserInfo ProxyOperator;

    /**
    * 渠道/平台合作企业的企业ID
    */
    @SerializedName("ProxyOrganizationOpenId")
    @Expose
    private String ProxyOrganizationOpenId;

    /**
     * Get 腾讯电子签颁发给渠道的应用ID，32位字符串 
     * @return AppId 腾讯电子签颁发给渠道的应用ID，32位字符串
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 腾讯电子签颁发给渠道的应用ID，32位字符串
     * @param AppId 腾讯电子签颁发给渠道的应用ID，32位字符串
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 腾讯电子签颁发给渠道侧合作企业的企业ID 
     * @return ProxyOrganizationId 腾讯电子签颁发给渠道侧合作企业的企业ID
     */
    public String getProxyOrganizationId() {
        return this.ProxyOrganizationId;
    }

    /**
     * Set 腾讯电子签颁发给渠道侧合作企业的企业ID
     * @param ProxyOrganizationId 腾讯电子签颁发给渠道侧合作企业的企业ID
     */
    public void setProxyOrganizationId(String ProxyOrganizationId) {
        this.ProxyOrganizationId = ProxyOrganizationId;
    }

    /**
     * Get 腾讯电子签颁发给渠道侧合作企业的应用ID 
     * @return ProxyAppId 腾讯电子签颁发给渠道侧合作企业的应用ID
     */
    public String getProxyAppId() {
        return this.ProxyAppId;
    }

    /**
     * Set 腾讯电子签颁发给渠道侧合作企业的应用ID
     * @param ProxyAppId 腾讯电子签颁发给渠道侧合作企业的应用ID
     */
    public void setProxyAppId(String ProxyAppId) {
        this.ProxyAppId = ProxyAppId;
    }

    /**
     * Get 渠道/平台合作企业经办人（操作员） 
     * @return ProxyOperator 渠道/平台合作企业经办人（操作员）
     */
    public UserInfo getProxyOperator() {
        return this.ProxyOperator;
    }

    /**
     * Set 渠道/平台合作企业经办人（操作员）
     * @param ProxyOperator 渠道/平台合作企业经办人（操作员）
     */
    public void setProxyOperator(UserInfo ProxyOperator) {
        this.ProxyOperator = ProxyOperator;
    }

    /**
     * Get 渠道/平台合作企业的企业ID 
     * @return ProxyOrganizationOpenId 渠道/平台合作企业的企业ID
     */
    public String getProxyOrganizationOpenId() {
        return this.ProxyOrganizationOpenId;
    }

    /**
     * Set 渠道/平台合作企业的企业ID
     * @param ProxyOrganizationOpenId 渠道/平台合作企业的企业ID
     */
    public void setProxyOrganizationOpenId(String ProxyOrganizationOpenId) {
        this.ProxyOrganizationOpenId = ProxyOrganizationOpenId;
    }

    public Agent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Agent(Agent source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProxyOrganizationId != null) {
            this.ProxyOrganizationId = new String(source.ProxyOrganizationId);
        }
        if (source.ProxyAppId != null) {
            this.ProxyAppId = new String(source.ProxyAppId);
        }
        if (source.ProxyOperator != null) {
            this.ProxyOperator = new UserInfo(source.ProxyOperator);
        }
        if (source.ProxyOrganizationOpenId != null) {
            this.ProxyOrganizationOpenId = new String(source.ProxyOrganizationOpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProxyOrganizationId", this.ProxyOrganizationId);
        this.setParamSimple(map, prefix + "ProxyAppId", this.ProxyAppId);
        this.setParamObj(map, prefix + "ProxyOperator.", this.ProxyOperator);
        this.setParamSimple(map, prefix + "ProxyOrganizationOpenId", this.ProxyOrganizationOpenId);

    }
}

