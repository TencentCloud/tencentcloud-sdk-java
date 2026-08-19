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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIAnalysisRobotInfoRequest extends AbstractModel {

    /**
    * <p>接入类型，0/不传入：企业微信url配置接入 1:企业微信扫码接入 2:微信扫码接入 3:QQ 账密接入 4:飞书 账密接入 5:钉钉 账密接入</p>
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * <p>QQ/飞书/钉钉 创建Bot账号ID</p>
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * <p>QQ/飞书/钉钉 创建Bot密钥</p>
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
    * <p>预设机器人名称，为空时则后台生成</p>
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
     * Get <p>接入类型，0/不传入：企业微信url配置接入 1:企业微信扫码接入 2:微信扫码接入 3:QQ 账密接入 4:飞书 账密接入 5:钉钉 账密接入</p> 
     * @return AccessType <p>接入类型，0/不传入：企业微信url配置接入 1:企业微信扫码接入 2:微信扫码接入 3:QQ 账密接入 4:飞书 账密接入 5:钉钉 账密接入</p>
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>接入类型，0/不传入：企业微信url配置接入 1:企业微信扫码接入 2:微信扫码接入 3:QQ 账密接入 4:飞书 账密接入 5:钉钉 账密接入</p>
     * @param AccessType <p>接入类型，0/不传入：企业微信url配置接入 1:企业微信扫码接入 2:微信扫码接入 3:QQ 账密接入 4:飞书 账密接入 5:钉钉 账密接入</p>
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>QQ/飞书/钉钉 创建Bot账号ID</p> 
     * @return AccountId <p>QQ/飞书/钉钉 创建Bot账号ID</p>
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set <p>QQ/飞书/钉钉 创建Bot账号ID</p>
     * @param AccountId <p>QQ/飞书/钉钉 创建Bot账号ID</p>
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get <p>QQ/飞书/钉钉 创建Bot密钥</p> 
     * @return Secret <p>QQ/飞书/钉钉 创建Bot密钥</p>
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set <p>QQ/飞书/钉钉 创建Bot密钥</p>
     * @param Secret <p>QQ/飞书/钉钉 创建Bot密钥</p>
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Get <p>预设机器人名称，为空时则后台生成</p> 
     * @return BotName <p>预设机器人名称，为空时则后台生成</p>
     */
    public String getBotName() {
        return this.BotName;
    }

    /**
     * Set <p>预设机器人名称，为空时则后台生成</p>
     * @param BotName <p>预设机器人名称，为空时则后台生成</p>
     */
    public void setBotName(String BotName) {
        this.BotName = BotName;
    }

    public DescribeAIAnalysisRobotInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIAnalysisRobotInfoRequest(DescribeAIAnalysisRobotInfoRequest source) {
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.Secret != null) {
            this.Secret = new String(source.Secret);
        }
        if (source.BotName != null) {
            this.BotName = new String(source.BotName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "Secret", this.Secret);
        this.setParamSimple(map, prefix + "BotName", this.BotName);

    }
}

