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

public class CreateTokenPlanApiKeysRequest extends AbstractModel {

    /**
    * <p>套餐 ID。可通过DescribeTokenPlanList接口获取。</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。</p>
    */
    @SerializedName("ApiKeyName")
    @Expose
    private String ApiKeyName;

    /**
    * <p>创建数量。取值范围：1 ~ 10。</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>可用模型列表。如果套餐类型为企业版专业套餐，该字段必传！可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为[&quot;auto&quot;]。</p>
    */
    @SerializedName("AllowedModels")
    @Expose
    private String [] AllowedModels;

    /**
    * <p>独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("ExclusiveQuota")
    @Expose
    private Long ExclusiveQuota;

    /**
    * <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * <p>TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p>
    */
    @SerializedName("TPM")
    @Expose
    private Long TPM;

    /**
    * <p>IP 白名单列表。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式。最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。不传或传空数组表示不限制。批量创建时所有 APIKey 共用同一份白名单。</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private String [] IpWhitelist;

    /**
    * <p>是否开启超额按量计费。默认值为 false。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式，该部分将按所用模型的按量计费定价额外计费；未开启时用量达上限后调用报错。</p>
    */
    @SerializedName("OverageEnabled")
    @Expose
    private Boolean OverageEnabled;

    /**
     * Get <p>套餐 ID。可通过DescribeTokenPlanList接口获取。</p> 
     * @return TeamId <p>套餐 ID。可通过DescribeTokenPlanList接口获取。</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>套餐 ID。可通过DescribeTokenPlanList接口获取。</p>
     * @param TeamId <p>套餐 ID。可通过DescribeTokenPlanList接口获取。</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。</p> 
     * @return ApiKeyName <p>API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。</p>
     */
    public String getApiKeyName() {
        return this.ApiKeyName;
    }

    /**
     * Set <p>API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。</p>
     * @param ApiKeyName <p>API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。</p>
     */
    public void setApiKeyName(String ApiKeyName) {
        this.ApiKeyName = ApiKeyName;
    }

    /**
     * Get <p>创建数量。取值范围：1 ~ 10。</p> 
     * @return Count <p>创建数量。取值范围：1 ~ 10。</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>创建数量。取值范围：1 ~ 10。</p>
     * @param Count <p>创建数量。取值范围：1 ~ 10。</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>可用模型列表。如果套餐类型为企业版专业套餐，该字段必传！可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为[&quot;auto&quot;]。</p> 
     * @return AllowedModels <p>可用模型列表。如果套餐类型为企业版专业套餐，该字段必传！可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为[&quot;auto&quot;]。</p>
     */
    public String [] getAllowedModels() {
        return this.AllowedModels;
    }

    /**
     * Set <p>可用模型列表。如果套餐类型为企业版专业套餐，该字段必传！可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为[&quot;auto&quot;]。</p>
     * @param AllowedModels <p>可用模型列表。如果套餐类型为企业版专业套餐，该字段必传！可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为[&quot;auto&quot;]。</p>
     */
    public void setAllowedModels(String [] AllowedModels) {
        this.AllowedModels = AllowedModels;
    }

    /**
     * Get <p>独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return ExclusiveQuota <p>独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public Long getExclusiveQuota() {
        return this.ExclusiveQuota;
    }

    /**
     * Set <p>独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param ExclusiveQuota <p>独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setExclusiveQuota(Long ExclusiveQuota) {
        this.ExclusiveQuota = ExclusiveQuota;
    }

    /**
     * Get <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return TotalQuota <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param TotalQuota <p>总额度上限。-1 表示不限，必须为 -1 或 &gt;= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：</p><ul><li>套餐类型为专业，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get <p>TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p> 
     * @return TPM <p>TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p>
     */
    public Long getTPM() {
        return this.TPM;
    }

    /**
     * Set <p>TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p>
     * @param TPM <p>TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 &gt;= 0 且 &lt;= 套餐 TPM。</p>
     */
    public void setTPM(Long TPM) {
        this.TPM = TPM;
    }

    /**
     * Get <p>IP 白名单列表。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式。最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。不传或传空数组表示不限制。批量创建时所有 APIKey 共用同一份白名单。</p> 
     * @return IpWhitelist <p>IP 白名单列表。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式。最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。不传或传空数组表示不限制。批量创建时所有 APIKey 共用同一份白名单。</p>
     */
    public String [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>IP 白名单列表。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式。最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。不传或传空数组表示不限制。批量创建时所有 APIKey 共用同一份白名单。</p>
     * @param IpWhitelist <p>IP 白名单列表。支持 IPv4 单地址（如 1.2.3.4）和 IPv4 CIDR（如 10.0.0.0/24）格式。最多 50 个条目，不允许重复；不支持 IPv6 与 IP 范围。不传或传空数组表示不限制。批量创建时所有 APIKey 共用同一份白名单。</p>
     */
    public void setIpWhitelist(String [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    /**
     * Get <p>是否开启超额按量计费。默认值为 false。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式，该部分将按所用模型的按量计费定价额外计费；未开启时用量达上限后调用报错。</p> 
     * @return OverageEnabled <p>是否开启超额按量计费。默认值为 false。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式，该部分将按所用模型的按量计费定价额外计费；未开启时用量达上限后调用报错。</p>
     */
    public Boolean getOverageEnabled() {
        return this.OverageEnabled;
    }

    /**
     * Set <p>是否开启超额按量计费。默认值为 false。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式，该部分将按所用模型的按量计费定价额外计费；未开启时用量达上限后调用报错。</p>
     * @param OverageEnabled <p>是否开启超额按量计费。默认值为 false。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式，该部分将按所用模型的按量计费定价额外计费；未开启时用量达上限后调用报错。</p>
     */
    public void setOverageEnabled(Boolean OverageEnabled) {
        this.OverageEnabled = OverageEnabled;
    }

    public CreateTokenPlanApiKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTokenPlanApiKeysRequest(CreateTokenPlanApiKeysRequest source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.ApiKeyName != null) {
            this.ApiKeyName = new String(source.ApiKeyName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
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
        if (source.TPM != null) {
            this.TPM = new Long(source.TPM);
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new String[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new String(source.IpWhitelist[i]);
            }
        }
        if (source.OverageEnabled != null) {
            this.OverageEnabled = new Boolean(source.OverageEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "ApiKeyName", this.ApiKeyName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "AllowedModels.", this.AllowedModels);
        this.setParamSimple(map, prefix + "ExclusiveQuota", this.ExclusiveQuota);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "TPM", this.TPM);
        this.setParamArraySimple(map, prefix + "IpWhitelist.", this.IpWhitelist);
        this.setParamSimple(map, prefix + "OverageEnabled", this.OverageEnabled);

    }
}

