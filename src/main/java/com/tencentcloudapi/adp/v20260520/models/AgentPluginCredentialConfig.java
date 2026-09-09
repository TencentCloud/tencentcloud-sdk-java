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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentPluginCredentialConfig extends AbstractModel {

    /**
    * <p>插件鉴权值来源</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 使用插件默认鉴权值，仅 APIKey/AccessKey 支持</li><li>2： 引用凭证</li><li>3： 引用变量</li></ul>
    */
    @SerializedName("AuthValueSource")
    @Expose
    private Long AuthValueSource;

    /**
    * <p>凭证ID</p><p>入参限制：AuthValueSource=2时必填</p>
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * <p>参数配置</p>
    */
    @SerializedName("ParamList")
    @Expose
    private AgentPluginCredentialParam [] ParamList;

    /**
     * Get <p>插件鉴权值来源</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 使用插件默认鉴权值，仅 APIKey/AccessKey 支持</li><li>2： 引用凭证</li><li>3： 引用变量</li></ul> 
     * @return AuthValueSource <p>插件鉴权值来源</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 使用插件默认鉴权值，仅 APIKey/AccessKey 支持</li><li>2： 引用凭证</li><li>3： 引用变量</li></ul>
     */
    public Long getAuthValueSource() {
        return this.AuthValueSource;
    }

    /**
     * Set <p>插件鉴权值来源</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 使用插件默认鉴权值，仅 APIKey/AccessKey 支持</li><li>2： 引用凭证</li><li>3： 引用变量</li></ul>
     * @param AuthValueSource <p>插件鉴权值来源</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 使用插件默认鉴权值，仅 APIKey/AccessKey 支持</li><li>2： 引用凭证</li><li>3： 引用变量</li></ul>
     */
    public void setAuthValueSource(Long AuthValueSource) {
        this.AuthValueSource = AuthValueSource;
    }

    /**
     * Get <p>凭证ID</p><p>入参限制：AuthValueSource=2时必填</p> 
     * @return CredentialId <p>凭证ID</p><p>入参限制：AuthValueSource=2时必填</p>
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set <p>凭证ID</p><p>入参限制：AuthValueSource=2时必填</p>
     * @param CredentialId <p>凭证ID</p><p>入参限制：AuthValueSource=2时必填</p>
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get <p>参数配置</p> 
     * @return ParamList <p>参数配置</p>
     */
    public AgentPluginCredentialParam [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>参数配置</p>
     * @param ParamList <p>参数配置</p>
     */
    public void setParamList(AgentPluginCredentialParam [] ParamList) {
        this.ParamList = ParamList;
    }

    public AgentPluginCredentialConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginCredentialConfig(AgentPluginCredentialConfig source) {
        if (source.AuthValueSource != null) {
            this.AuthValueSource = new Long(source.AuthValueSource);
        }
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.ParamList != null) {
            this.ParamList = new AgentPluginCredentialParam[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new AgentPluginCredentialParam(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthValueSource", this.AuthValueSource);
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

