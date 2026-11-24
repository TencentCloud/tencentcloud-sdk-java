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

public class ModifyTokenPlanApiKeyRequest extends AbstractModel {

    /**
    * <p>API Key ID。</p>
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * <p>可用模型列表。不传则不修改。</p><ul><li><p>如果套餐类型为企业版专业套餐：<br>1）传入“all“ ：使用套餐支持的所有模型<br>2）传入 Model ID：指定具体模型。“all“和具体的 Model ID 不能同时传入。</p></li><li><p>如果套餐类型为企业版轻享套餐，不允许传该参数。</p></li></ul>
    */
    @SerializedName("AllowedModels")
    @Expose
    private String [] AllowedModels;

    /**
    * <p>独占额度，不传则不修改。单位说明：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("ExclusiveQuota")
    @Expose
    private Long ExclusiveQuota;

    /**
    * <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度），不传则不修改。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * <p>是否启用该 API Key。取值：enable（启用）、disable（停用），不传则不修改。</p>
    */
    @SerializedName("UseStatus")
    @Expose
    private String UseStatus;

    /**
    * <p>TPM（Tokens Per Minute）限制。不传则不修改。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p>
    */
    @SerializedName("TPM")
    @Expose
    private Long TPM;

    /**
    * <p>IP 白名单列表。不传则不修改；传空数组表示清空（不限制 IP）；传非空数组表示覆盖。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式，最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private String [] IpWhitelist;

    /**
     * Get <p>API Key ID。</p> 
     * @return ApiKeyId <p>API Key ID。</p>
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set <p>API Key ID。</p>
     * @param ApiKeyId <p>API Key ID。</p>
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get <p>可用模型列表。不传则不修改。</p><ul><li><p>如果套餐类型为企业版专业套餐：<br>1）传入“all“ ：使用套餐支持的所有模型<br>2）传入 Model ID：指定具体模型。“all“和具体的 Model ID 不能同时传入。</p></li><li><p>如果套餐类型为企业版轻享套餐，不允许传该参数。</p></li></ul> 
     * @return AllowedModels <p>可用模型列表。不传则不修改。</p><ul><li><p>如果套餐类型为企业版专业套餐：<br>1）传入“all“ ：使用套餐支持的所有模型<br>2）传入 Model ID：指定具体模型。“all“和具体的 Model ID 不能同时传入。</p></li><li><p>如果套餐类型为企业版轻享套餐，不允许传该参数。</p></li></ul>
     */
    public String [] getAllowedModels() {
        return this.AllowedModels;
    }

    /**
     * Set <p>可用模型列表。不传则不修改。</p><ul><li><p>如果套餐类型为企业版专业套餐：<br>1）传入“all“ ：使用套餐支持的所有模型<br>2）传入 Model ID：指定具体模型。“all“和具体的 Model ID 不能同时传入。</p></li><li><p>如果套餐类型为企业版轻享套餐，不允许传该参数。</p></li></ul>
     * @param AllowedModels <p>可用模型列表。不传则不修改。</p><ul><li><p>如果套餐类型为企业版专业套餐：<br>1）传入“all“ ：使用套餐支持的所有模型<br>2）传入 Model ID：指定具体模型。“all“和具体的 Model ID 不能同时传入。</p></li><li><p>如果套餐类型为企业版轻享套餐，不允许传该参数。</p></li></ul>
     */
    public void setAllowedModels(String [] AllowedModels) {
        this.AllowedModels = AllowedModels;
    }

    /**
     * Get <p>独占额度，不传则不修改。单位说明：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return ExclusiveQuota <p>独占额度，不传则不修改。单位说明：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public Long getExclusiveQuota() {
        return this.ExclusiveQuota;
    }

    /**
     * Set <p>独占额度，不传则不修改。单位说明：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param ExclusiveQuota <p>独占额度，不传则不修改。单位说明：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setExclusiveQuota(Long ExclusiveQuota) {
        this.ExclusiveQuota = ExclusiveQuota;
    }

    /**
     * Get <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度），不传则不修改。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return TotalQuota <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度），不传则不修改。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度），不传则不修改。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param TotalQuota <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度），不传则不修改。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get <p>是否启用该 API Key。取值：enable（启用）、disable（停用），不传则不修改。</p> 
     * @return UseStatus <p>是否启用该 API Key。取值：enable（启用）、disable（停用），不传则不修改。</p>
     */
    public String getUseStatus() {
        return this.UseStatus;
    }

    /**
     * Set <p>是否启用该 API Key。取值：enable（启用）、disable（停用），不传则不修改。</p>
     * @param UseStatus <p>是否启用该 API Key。取值：enable（启用）、disable（停用），不传则不修改。</p>
     */
    public void setUseStatus(String UseStatus) {
        this.UseStatus = UseStatus;
    }

    /**
     * Get <p>TPM（Tokens Per Minute）限制。不传则不修改。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p> 
     * @return TPM <p>TPM（Tokens Per Minute）限制。不传则不修改。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p>
     */
    public Long getTPM() {
        return this.TPM;
    }

    /**
     * Set <p>TPM（Tokens Per Minute）限制。不传则不修改。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p>
     * @param TPM <p>TPM（Tokens Per Minute）限制。不传则不修改。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p>
     */
    public void setTPM(Long TPM) {
        this.TPM = TPM;
    }

    /**
     * Get <p>IP 白名单列表。不传则不修改；传空数组表示清空（不限制 IP）；传非空数组表示覆盖。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式，最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。</p> 
     * @return IpWhitelist <p>IP 白名单列表。不传则不修改；传空数组表示清空（不限制 IP）；传非空数组表示覆盖。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式，最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。</p>
     */
    public String [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>IP 白名单列表。不传则不修改；传空数组表示清空（不限制 IP）；传非空数组表示覆盖。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式，最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。</p>
     * @param IpWhitelist <p>IP 白名单列表。不传则不修改；传空数组表示清空（不限制 IP）；传非空数组表示覆盖。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式，最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。</p>
     */
    public void setIpWhitelist(String [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    public ModifyTokenPlanApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTokenPlanApiKeyRequest(ModifyTokenPlanApiKeyRequest source) {
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.AllowedModels != null) {
            this.AllowedModels = new String[source.AllowedModels.length];
            for (int i = 0; i < source.AllowedModels.length; i++) {
                this.AllowedModels[i] = new String(source.AllowedModels[i]);
            }
        }
        if (source.ExclusiveQuota != null) {
            this.ExclusiveQuota = new Long(source.ExclusiveQuota);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.UseStatus != null) {
            this.UseStatus = new String(source.UseStatus);
        }
        if (source.TPM != null) {
            this.TPM = new Long(source.TPM);
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new String[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new String(source.IpWhitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamArraySimple(map, prefix + "AllowedModels.", this.AllowedModels);
        this.setParamSimple(map, prefix + "ExclusiveQuota", this.ExclusiveQuota);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "UseStatus", this.UseStatus);
        this.setParamSimple(map, prefix + "TPM", this.TPM);
        this.setParamArraySimple(map, prefix + "IpWhitelist.", this.IpWhitelist);

    }
}

