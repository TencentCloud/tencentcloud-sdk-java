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

public class KeySandboxCredential extends AbstractModel {

    /**
    * 凭证ID
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * 凭证名称
    */
    @SerializedName("CredentialName")
    @Expose
    private String CredentialName;

    /**
    * 凭证类型
枚举值：
access：常规密钥（Key/Value键值对）
sts：STS临时密钥凭据
    */
    @SerializedName("CredentialType")
    @Expose
    private String CredentialType;

    /**
    * 生效机器范围
    */
    @SerializedName("CredentialEffectScope")
    @Expose
    private CredentialEffectScope CredentialEffectScope;

    /**
    * 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 凭证ID 
     * @return CredentialId 凭证ID
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set 凭证ID
     * @param CredentialId 凭证ID
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get 凭证名称 
     * @return CredentialName 凭证名称
     */
    public String getCredentialName() {
        return this.CredentialName;
    }

    /**
     * Set 凭证名称
     * @param CredentialName 凭证名称
     */
    public void setCredentialName(String CredentialName) {
        this.CredentialName = CredentialName;
    }

    /**
     * Get 凭证类型
枚举值：
access：常规密钥（Key/Value键值对）
sts：STS临时密钥凭据 
     * @return CredentialType 凭证类型
枚举值：
access：常规密钥（Key/Value键值对）
sts：STS临时密钥凭据
     */
    public String getCredentialType() {
        return this.CredentialType;
    }

    /**
     * Set 凭证类型
枚举值：
access：常规密钥（Key/Value键值对）
sts：STS临时密钥凭据
     * @param CredentialType 凭证类型
枚举值：
access：常规密钥（Key/Value键值对）
sts：STS临时密钥凭据
     */
    public void setCredentialType(String CredentialType) {
        this.CredentialType = CredentialType;
    }

    /**
     * Get 生效机器范围 
     * @return CredentialEffectScope 生效机器范围
     */
    public CredentialEffectScope getCredentialEffectScope() {
        return this.CredentialEffectScope;
    }

    /**
     * Set 生效机器范围
     * @param CredentialEffectScope 生效机器范围
     */
    public void setCredentialEffectScope(CredentialEffectScope CredentialEffectScope) {
        this.CredentialEffectScope = CredentialEffectScope;
    }

    /**
     * Get 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return CreateTime 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param CreateTime 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return UpdateTime 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param UpdateTime 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public KeySandboxCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeySandboxCredential(KeySandboxCredential source) {
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.CredentialName != null) {
            this.CredentialName = new String(source.CredentialName);
        }
        if (source.CredentialType != null) {
            this.CredentialType = new String(source.CredentialType);
        }
        if (source.CredentialEffectScope != null) {
            this.CredentialEffectScope = new CredentialEffectScope(source.CredentialEffectScope);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "CredentialName", this.CredentialName);
        this.setParamSimple(map, prefix + "CredentialType", this.CredentialType);
        this.setParamObj(map, prefix + "CredentialEffectScope.", this.CredentialEffectScope);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

