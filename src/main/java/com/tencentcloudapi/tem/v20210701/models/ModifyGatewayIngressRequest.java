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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGatewayIngressRequest extends AbstractModel {

    /**
    * 环境 ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 网关名称
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * 网关类型，如 clb
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 转发配置名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * rules 配置
    */
    @SerializedName("Rules")
    @Expose
    private IngressRule [] Rules;

    /**
    * 是否混合 https，默认 false，可选值 true 代表有 https 协议监听
    */
    @SerializedName("Mixed")
    @Expose
    private Boolean Mixed;

    /**
    * tls 配置
    */
    @SerializedName("Tls")
    @Expose
    private IngressTls [] Tls;

    /**
    * 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向）
    */
    @SerializedName("RewriteType")
    @Expose
    private String RewriteType;

    /**
     * Get 环境 ID 
     * @return EnvironmentId 环境 ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境 ID
     * @param EnvironmentId 环境 ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 网关名称 
     * @return GatewayName 网关名称
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set 网关名称
     * @param GatewayName 网关名称
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get 网关类型，如 clb 
     * @return GatewayType 网关类型，如 clb
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 网关类型，如 clb
     * @param GatewayType 网关类型，如 clb
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 转发配置名称 
     * @return Name 转发配置名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 转发配置名称
     * @param Name 转发配置名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get rules 配置 
     * @return Rules rules 配置
     */
    public IngressRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set rules 配置
     * @param Rules rules 配置
     */
    public void setRules(IngressRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 是否混合 https，默认 false，可选值 true 代表有 https 协议监听 
     * @return Mixed 是否混合 https，默认 false，可选值 true 代表有 https 协议监听
     */
    public Boolean getMixed() {
        return this.Mixed;
    }

    /**
     * Set 是否混合 https，默认 false，可选值 true 代表有 https 协议监听
     * @param Mixed 是否混合 https，默认 false，可选值 true 代表有 https 协议监听
     */
    public void setMixed(Boolean Mixed) {
        this.Mixed = Mixed;
    }

    /**
     * Get tls 配置 
     * @return Tls tls 配置
     */
    public IngressTls [] getTls() {
        return this.Tls;
    }

    /**
     * Set tls 配置
     * @param Tls tls 配置
     */
    public void setTls(IngressTls [] Tls) {
        this.Tls = Tls;
    }

    /**
     * Get 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向） 
     * @return RewriteType 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向）
     */
    public String getRewriteType() {
        return this.RewriteType;
    }

    /**
     * Set 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向）
     * @param RewriteType 重定向模式，可选值：
- AUTO（自动重定向http到https）
- NONE（不使用重定向）
     */
    public void setRewriteType(String RewriteType) {
        this.RewriteType = RewriteType;
    }

    public ModifyGatewayIngressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGatewayIngressRequest(ModifyGatewayIngressRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rules != null) {
            this.Rules = new IngressRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new IngressRule(source.Rules[i]);
            }
        }
        if (source.Mixed != null) {
            this.Mixed = new Boolean(source.Mixed);
        }
        if (source.Tls != null) {
            this.Tls = new IngressTls[source.Tls.length];
            for (int i = 0; i < source.Tls.length; i++) {
                this.Tls[i] = new IngressTls(source.Tls[i]);
            }
        }
        if (source.RewriteType != null) {
            this.RewriteType = new String(source.RewriteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Mixed", this.Mixed);
        this.setParamArrayObj(map, prefix + "Tls.", this.Tls);
        this.setParamSimple(map, prefix + "RewriteType", this.RewriteType);

    }
}

