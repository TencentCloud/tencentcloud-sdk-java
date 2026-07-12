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

public class ModifyApiKeyInfoRequest extends AbstractModel {

    /**
    * <p>API 密钥 ID。</p>
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * <p>平台类型。取值：maas。</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>API 密钥名称。最大 128 字符。不传表示不修改。</p>
    */
    @SerializedName("ApiKeyName")
    @Expose
    private String ApiKeyName;

    /**
    * <p>备注。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）、CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个，不支持重复。传入空数组表示清空白名单（不限制 IP）。不传表示不修改。</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private String [] IpWhitelist;

    /**
    * <p>【修改限额推荐使用QuotaDesired参数】Token 限额期望状态。可选，不传表示不修改，传入空数组表示清空。和 Quotas（Token限额配置）字段互斥，不支持同时传入</p>
    */
    @SerializedName("QuotasDesired")
    @Expose
    private QuotasDesired [] QuotasDesired;

    /**
     * Get <p>API 密钥 ID。</p> 
     * @return ApiKeyId <p>API 密钥 ID。</p>
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set <p>API 密钥 ID。</p>
     * @param ApiKeyId <p>API 密钥 ID。</p>
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get <p>平台类型。取值：maas。</p> 
     * @return Platform <p>平台类型。取值：maas。</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台类型。取值：maas。</p>
     * @param Platform <p>平台类型。取值：maas。</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>API 密钥名称。最大 128 字符。不传表示不修改。</p> 
     * @return ApiKeyName <p>API 密钥名称。最大 128 字符。不传表示不修改。</p>
     */
    public String getApiKeyName() {
        return this.ApiKeyName;
    }

    /**
     * Set <p>API 密钥名称。最大 128 字符。不传表示不修改。</p>
     * @param ApiKeyName <p>API 密钥名称。最大 128 字符。不传表示不修改。</p>
     */
    public void setApiKeyName(String ApiKeyName) {
        this.ApiKeyName = ApiKeyName;
    }

    /**
     * Get <p>备注。</p> 
     * @return Remark <p>备注。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注。</p>
     * @param Remark <p>备注。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）、CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个，不支持重复。传入空数组表示清空白名单（不限制 IP）。不传表示不修改。</p> 
     * @return IpWhitelist <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）、CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个，不支持重复。传入空数组表示清空白名单（不限制 IP）。不传表示不修改。</p>
     */
    public String [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）、CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个，不支持重复。传入空数组表示清空白名单（不限制 IP）。不传表示不修改。</p>
     * @param IpWhitelist <p>IP 白名单列表。支持 IPv4（如 1.2.3.4）、CIDR（如 10.0.0.0/24）格式，IPv6暂不支持。最多 50 个，不支持重复。传入空数组表示清空白名单（不限制 IP）。不传表示不修改。</p>
     */
    public void setIpWhitelist(String [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    /**
     * Get <p>【修改限额推荐使用QuotaDesired参数】Token 限额期望状态。可选，不传表示不修改，传入空数组表示清空。和 Quotas（Token限额配置）字段互斥，不支持同时传入</p> 
     * @return QuotasDesired <p>【修改限额推荐使用QuotaDesired参数】Token 限额期望状态。可选，不传表示不修改，传入空数组表示清空。和 Quotas（Token限额配置）字段互斥，不支持同时传入</p>
     */
    public QuotasDesired [] getQuotasDesired() {
        return this.QuotasDesired;
    }

    /**
     * Set <p>【修改限额推荐使用QuotaDesired参数】Token 限额期望状态。可选，不传表示不修改，传入空数组表示清空。和 Quotas（Token限额配置）字段互斥，不支持同时传入</p>
     * @param QuotasDesired <p>【修改限额推荐使用QuotaDesired参数】Token 限额期望状态。可选，不传表示不修改，传入空数组表示清空。和 Quotas（Token限额配置）字段互斥，不支持同时传入</p>
     */
    public void setQuotasDesired(QuotasDesired [] QuotasDesired) {
        this.QuotasDesired = QuotasDesired;
    }

    public ModifyApiKeyInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiKeyInfoRequest(ModifyApiKeyInfoRequest source) {
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ApiKeyName != null) {
            this.ApiKeyName = new String(source.ApiKeyName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new String[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new String(source.IpWhitelist[i]);
            }
        }
        if (source.QuotasDesired != null) {
            this.QuotasDesired = new QuotasDesired[source.QuotasDesired.length];
            for (int i = 0; i < source.QuotasDesired.length; i++) {
                this.QuotasDesired[i] = new QuotasDesired(source.QuotasDesired[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ApiKeyName", this.ApiKeyName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "IpWhitelist.", this.IpWhitelist);
        this.setParamArrayObj(map, prefix + "QuotasDesired.", this.QuotasDesired);

    }
}

