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
    * 套餐 ID。可通过DescribeTokenPlanList接口获取。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。
    */
    @SerializedName("ApiKeyName")
    @Expose
    private String ApiKeyName;

    /**
    * 创建数量。取值范围：1 ~ 10。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 可用模型列表。如果套餐类型为企业版专业套餐，可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入，如果不传则表示该API Key不支持任何模型，从而影响API Key的正常使用。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为["auto"]。
    */
    @SerializedName("AllowedModels")
    @Expose
    private String [] AllowedModels;

    /**
    * 独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
    */
    @SerializedName("ExclusiveQuota")
    @Expose
    private Long ExclusiveQuota;

    /**
    * 总额度上限。-1 表示不限，必须为 -1 或 >= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 >= 0 且 <= 套餐 TPM。
    */
    @SerializedName("TPM")
    @Expose
    private Long TPM;

    /**
     * Get 套餐 ID。可通过DescribeTokenPlanList接口获取。 
     * @return TeamId 套餐 ID。可通过DescribeTokenPlanList接口获取。
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set 套餐 ID。可通过DescribeTokenPlanList接口获取。
     * @param TeamId 套餐 ID。可通过DescribeTokenPlanList接口获取。
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。 
     * @return ApiKeyName API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。
     */
    public String getApiKeyName() {
        return this.ApiKeyName;
    }

    /**
     * Set API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。
     * @param ApiKeyName API Key 名称，最大 128 字符。如果创建 API Key 的数量超过1个，实际名称格式为 {ApiKeyName}-{序号}（如 mykey-1, mykey-2）。
     */
    public void setApiKeyName(String ApiKeyName) {
        this.ApiKeyName = ApiKeyName;
    }

    /**
     * Get 创建数量。取值范围：1 ~ 10。 
     * @return Count 创建数量。取值范围：1 ~ 10。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 创建数量。取值范围：1 ~ 10。
     * @param Count 创建数量。取值范围：1 ~ 10。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 可用模型列表。如果套餐类型为企业版专业套餐，可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入，如果不传则表示该API Key不支持任何模型，从而影响API Key的正常使用。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为["auto"]。 
     * @return AllowedModels 可用模型列表。如果套餐类型为企业版专业套餐，可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入，如果不传则表示该API Key不支持任何模型，从而影响API Key的正常使用。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为["auto"]。
     */
    public String [] getAllowedModels() {
        return this.AllowedModels;
    }

    /**
     * Set 可用模型列表。如果套餐类型为企业版专业套餐，可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入，如果不传则表示该API Key不支持任何模型，从而影响API Key的正常使用。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为["auto"]。
     * @param AllowedModels 可用模型列表。如果套餐类型为企业版专业套餐，可以指定模型，也可以传入“all”，传入 “all“表示可以使用套餐支持的所有模型，如果要指定具体模型，传入 Model ID，“all“和具体的 Model ID 不能同时传入，如果不传则表示该API Key不支持任何模型，从而影响API Key的正常使用。如果套餐类型为企业版轻享套餐，则无论是否传入该字段，以及该字段传入什么值，都会被强制覆盖为["auto"]。
     */
    public void setAllowedModels(String [] AllowedModels) {
        this.AllowedModels = AllowedModels;
    }

    /**
     * Get 独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。 
     * @return ExclusiveQuota 独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public Long getExclusiveQuota() {
        return this.ExclusiveQuota;
    }

    /**
     * Set 独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     * @param ExclusiveQuota 独占额度。不传则为0，代表该 API Key 不被分配任何独占配额。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public void setExclusiveQuota(Long ExclusiveQuota) {
        this.ExclusiveQuota = ExclusiveQuota;
    }

    /**
     * Get 总额度上限。-1 表示不限，必须为 -1 或 >= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。 
     * @return TotalQuota 总额度上限。-1 表示不限，必须为 -1 或 >= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set 总额度上限。-1 表示不限，必须为 -1 或 >= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     * @param TotalQuota 总额度上限。-1 表示不限，必须为 -1 或 >= API Key 当前的 ExclusiveQuota（独占额度）。不传表示不设置上限。单位说明如下：
- 套餐类型为专业，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 >= 0 且 <= 套餐 TPM。 
     * @return TPM TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 >= 0 且 <= 套餐 TPM。
     */
    public Long getTPM() {
        return this.TPM;
    }

    /**
     * Set TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 >= 0 且 <= 套餐 TPM。
     * @param TPM TPM（Tokens Per Minute）限制。不传使用套餐级别 TPM。必须 >= 0 且 <= 套餐 TPM。
     */
    public void setTPM(Long TPM) {
        this.TPM = TPM;
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

    }
}

