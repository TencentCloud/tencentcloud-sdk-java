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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApiKeyRequest extends AbstractModel {

    /**
    * <p>API 密钥名称，创建后不可修改。</p>
    */
    @SerializedName("ApiKeyName")
    @Expose
    private String ApiKeyName;

    /**
    * <p>平台类型。取值：maas</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>绑定类型。取值：all（全部模型和接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。</p><p>枚举值：</p><ul><li>all： 全部模型和接入点</li><li>model_custom_endpoint_custom： 自定义模型+自定义接入点</li></ul>
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>初始状态。取值：enable（启用）、disable（禁用）。不传默认 enable。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>资源绑定列表（model 和 endpoint 混合），每项需显式指定 ResourceType。BindType 为 all 时不填；BindType 为model_custom_endpoint_custom时必填。</p>
    */
    @SerializedName("Bindings")
    @Expose
    private BindingItem [] Bindings;

    /**
    * <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）和 CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个条目，不支持重复。不传或传空数组表示不限制 IP。</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private String [] IpWhitelist;

    /**
    * <p>Token 限额配置多维度列表。可选，不传表示不开启限额。</p>
    */
    @SerializedName("Quotas")
    @Expose
    private QuotaCreateItem [] Quotas;

    /**
     * Get <p>API 密钥名称，创建后不可修改。</p> 
     * @return ApiKeyName <p>API 密钥名称，创建后不可修改。</p>
     */
    public String getApiKeyName() {
        return this.ApiKeyName;
    }

    /**
     * Set <p>API 密钥名称，创建后不可修改。</p>
     * @param ApiKeyName <p>API 密钥名称，创建后不可修改。</p>
     */
    public void setApiKeyName(String ApiKeyName) {
        this.ApiKeyName = ApiKeyName;
    }

    /**
     * Get <p>平台类型。取值：maas</p> 
     * @return Platform <p>平台类型。取值：maas</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台类型。取值：maas</p>
     * @param Platform <p>平台类型。取值：maas</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>绑定类型。取值：all（全部模型和接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。</p><p>枚举值：</p><ul><li>all： 全部模型和接入点</li><li>model_custom_endpoint_custom： 自定义模型+自定义接入点</li></ul> 
     * @return BindType <p>绑定类型。取值：all（全部模型和接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。</p><p>枚举值：</p><ul><li>all： 全部模型和接入点</li><li>model_custom_endpoint_custom： 自定义模型+自定义接入点</li></ul>
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set <p>绑定类型。取值：all（全部模型和接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。</p><p>枚举值：</p><ul><li>all： 全部模型和接入点</li><li>model_custom_endpoint_custom： 自定义模型+自定义接入点</li></ul>
     * @param BindType <p>绑定类型。取值：all（全部模型和接入点）、model_custom_endpoint_custom（自定义模型+自定义接入点）。</p><p>枚举值：</p><ul><li>all： 全部模型和接入点</li><li>model_custom_endpoint_custom： 自定义模型+自定义接入点</li></ul>
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Remark <p>备注信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
     * @param Remark <p>备注信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>初始状态。取值：enable（启用）、disable（禁用）。不传默认 enable。</p> 
     * @return Status <p>初始状态。取值：enable（启用）、disable（禁用）。不传默认 enable。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>初始状态。取值：enable（启用）、disable（禁用）。不传默认 enable。</p>
     * @param Status <p>初始状态。取值：enable（启用）、disable（禁用）。不传默认 enable。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>资源绑定列表（model 和 endpoint 混合），每项需显式指定 ResourceType。BindType 为 all 时不填；BindType 为model_custom_endpoint_custom时必填。</p> 
     * @return Bindings <p>资源绑定列表（model 和 endpoint 混合），每项需显式指定 ResourceType。BindType 为 all 时不填；BindType 为model_custom_endpoint_custom时必填。</p>
     */
    public BindingItem [] getBindings() {
        return this.Bindings;
    }

    /**
     * Set <p>资源绑定列表（model 和 endpoint 混合），每项需显式指定 ResourceType。BindType 为 all 时不填；BindType 为model_custom_endpoint_custom时必填。</p>
     * @param Bindings <p>资源绑定列表（model 和 endpoint 混合），每项需显式指定 ResourceType。BindType 为 all 时不填；BindType 为model_custom_endpoint_custom时必填。</p>
     */
    public void setBindings(BindingItem [] Bindings) {
        this.Bindings = Bindings;
    }

    /**
     * Get <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）和 CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个条目，不支持重复。不传或传空数组表示不限制 IP。</p> 
     * @return IpWhitelist <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）和 CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个条目，不支持重复。不传或传空数组表示不限制 IP。</p>
     */
    public String [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）和 CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个条目，不支持重复。不传或传空数组表示不限制 IP。</p>
     * @param IpWhitelist <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）和 CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个条目，不支持重复。不传或传空数组表示不限制 IP。</p>
     */
    public void setIpWhitelist(String [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    /**
     * Get <p>Token 限额配置多维度列表。可选，不传表示不开启限额。</p> 
     * @return Quotas <p>Token 限额配置多维度列表。可选，不传表示不开启限额。</p>
     */
    public QuotaCreateItem [] getQuotas() {
        return this.Quotas;
    }

    /**
     * Set <p>Token 限额配置多维度列表。可选，不传表示不开启限额。</p>
     * @param Quotas <p>Token 限额配置多维度列表。可选，不传表示不开启限额。</p>
     */
    public void setQuotas(QuotaCreateItem [] Quotas) {
        this.Quotas = Quotas;
    }

    public CreateApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiKeyRequest(CreateApiKeyRequest source) {
        if (source.ApiKeyName != null) {
            this.ApiKeyName = new String(source.ApiKeyName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Bindings != null) {
            this.Bindings = new BindingItem[source.Bindings.length];
            for (int i = 0; i < source.Bindings.length; i++) {
                this.Bindings[i] = new BindingItem(source.Bindings[i]);
            }
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new String[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new String(source.IpWhitelist[i]);
            }
        }
        if (source.Quotas != null) {
            this.Quotas = new QuotaCreateItem[source.Quotas.length];
            for (int i = 0; i < source.Quotas.length; i++) {
                this.Quotas[i] = new QuotaCreateItem(source.Quotas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyName", this.ApiKeyName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Bindings.", this.Bindings);
        this.setParamArraySimple(map, prefix + "IpWhitelist.", this.IpWhitelist);
        this.setParamArrayObj(map, prefix + "Quotas.", this.Quotas);

    }
}

