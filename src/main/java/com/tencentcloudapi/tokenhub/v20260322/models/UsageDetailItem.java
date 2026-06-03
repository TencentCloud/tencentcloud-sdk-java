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

public class UsageDetailItem extends AbstractModel {

    /**
    * 主账号 UIN。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 模型名称。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * APIKey ID。
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * APIKey 名称。
    */
    @SerializedName("ApiKeyName")
    @Expose
    private String ApiKeyName;

    /**
    * 请求 ID。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 请求时间（RFC3339 格式）。
    */
    @SerializedName("RequestTime")
    @Expose
    private String RequestTime;

    /**
    * 输入 token 数。
    */
    @SerializedName("InputToken")
    @Expose
    private Long InputToken;

    /**
    * 缓存 token 数。
    */
    @SerializedName("CacheToken")
    @Expose
    private Long CacheToken;

    /**
    * 输出 token 数。
    */
    @SerializedName("OutputToken")
    @Expose
    private Long OutputToken;

    /**
    * 总 token 数。
    */
    @SerializedName("TotalToken")
    @Expose
    private Long TotalToken;

    /**
    * 未命中缓存输入消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
    */
    @SerializedName("InputQuota")
    @Expose
    private String InputQuota;

    /**
    * 缓存消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
    */
    @SerializedName("CacheQuota")
    @Expose
    private String CacheQuota;

    /**
    * 输出消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
    */
    @SerializedName("OutputQuota")
    @Expose
    private String OutputQuota;

    /**
    * 总消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
    */
    @SerializedName("TotalQuota")
    @Expose
    private String TotalQuota;

    /**
     * Get 主账号 UIN。 
     * @return Uin 主账号 UIN。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号 UIN。
     * @param Uin 主账号 UIN。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 模型名称。 
     * @return ModelName 模型名称。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称。
     * @param ModelName 模型名称。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get APIKey ID。 
     * @return ApiKeyId APIKey ID。
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set APIKey ID。
     * @param ApiKeyId APIKey ID。
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get APIKey 名称。 
     * @return ApiKeyName APIKey 名称。
     */
    public String getApiKeyName() {
        return this.ApiKeyName;
    }

    /**
     * Set APIKey 名称。
     * @param ApiKeyName APIKey 名称。
     */
    public void setApiKeyName(String ApiKeyName) {
        this.ApiKeyName = ApiKeyName;
    }

    /**
     * Get 请求 ID。 
     * @return RequestId 请求 ID。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 请求 ID。
     * @param RequestId 请求 ID。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 请求时间（RFC3339 格式）。 
     * @return RequestTime 请求时间（RFC3339 格式）。
     */
    public String getRequestTime() {
        return this.RequestTime;
    }

    /**
     * Set 请求时间（RFC3339 格式）。
     * @param RequestTime 请求时间（RFC3339 格式）。
     */
    public void setRequestTime(String RequestTime) {
        this.RequestTime = RequestTime;
    }

    /**
     * Get 输入 token 数。 
     * @return InputToken 输入 token 数。
     */
    public Long getInputToken() {
        return this.InputToken;
    }

    /**
     * Set 输入 token 数。
     * @param InputToken 输入 token 数。
     */
    public void setInputToken(Long InputToken) {
        this.InputToken = InputToken;
    }

    /**
     * Get 缓存 token 数。 
     * @return CacheToken 缓存 token 数。
     */
    public Long getCacheToken() {
        return this.CacheToken;
    }

    /**
     * Set 缓存 token 数。
     * @param CacheToken 缓存 token 数。
     */
    public void setCacheToken(Long CacheToken) {
        this.CacheToken = CacheToken;
    }

    /**
     * Get 输出 token 数。 
     * @return OutputToken 输出 token 数。
     */
    public Long getOutputToken() {
        return this.OutputToken;
    }

    /**
     * Set 输出 token 数。
     * @param OutputToken 输出 token 数。
     */
    public void setOutputToken(Long OutputToken) {
        this.OutputToken = OutputToken;
    }

    /**
     * Get 总 token 数。 
     * @return TotalToken 总 token 数。
     */
    public Long getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set 总 token 数。
     * @param TotalToken 总 token 数。
     */
    public void setTotalToken(Long TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get 未命中缓存输入消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。 
     * @return InputQuota 未命中缓存输入消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     */
    public String getInputQuota() {
        return this.InputQuota;
    }

    /**
     * Set 未命中缓存输入消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     * @param InputQuota 未命中缓存输入消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     */
    public void setInputQuota(String InputQuota) {
        this.InputQuota = InputQuota;
    }

    /**
     * Get 缓存消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。 
     * @return CacheQuota 缓存消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     */
    public String getCacheQuota() {
        return this.CacheQuota;
    }

    /**
     * Set 缓存消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     * @param CacheQuota 缓存消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     */
    public void setCacheQuota(String CacheQuota) {
        this.CacheQuota = CacheQuota;
    }

    /**
     * Get 输出消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。 
     * @return OutputQuota 输出消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     */
    public String getOutputQuota() {
        return this.OutputQuota;
    }

    /**
     * Set 输出消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     * @param OutputQuota 输出消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     */
    public void setOutputQuota(String OutputQuota) {
        this.OutputQuota = OutputQuota;
    }

    /**
     * Get 总消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。 
     * @return TotalQuota 总消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     */
    public String getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set 总消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     * @param TotalQuota 总消耗额度。单位说明如下：
- 套餐类型为专业套餐（enterprise），单位取值为积分；
- 套餐类型轻享套餐（enterprise-auto），单位取值为 token。
     */
    public void setTotalQuota(String TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    public UsageDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetailItem(UsageDetailItem source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.ApiKeyName != null) {
            this.ApiKeyName = new String(source.ApiKeyName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.RequestTime != null) {
            this.RequestTime = new String(source.RequestTime);
        }
        if (source.InputToken != null) {
            this.InputToken = new Long(source.InputToken);
        }
        if (source.CacheToken != null) {
            this.CacheToken = new Long(source.CacheToken);
        }
        if (source.OutputToken != null) {
            this.OutputToken = new Long(source.OutputToken);
        }
        if (source.TotalToken != null) {
            this.TotalToken = new Long(source.TotalToken);
        }
        if (source.InputQuota != null) {
            this.InputQuota = new String(source.InputQuota);
        }
        if (source.CacheQuota != null) {
            this.CacheQuota = new String(source.CacheQuota);
        }
        if (source.OutputQuota != null) {
            this.OutputQuota = new String(source.OutputQuota);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new String(source.TotalQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "ApiKeyName", this.ApiKeyName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "RequestTime", this.RequestTime);
        this.setParamSimple(map, prefix + "InputToken", this.InputToken);
        this.setParamSimple(map, prefix + "CacheToken", this.CacheToken);
        this.setParamSimple(map, prefix + "OutputToken", this.OutputToken);
        this.setParamSimple(map, prefix + "TotalToken", this.TotalToken);
        this.setParamSimple(map, prefix + "InputQuota", this.InputQuota);
        this.setParamSimple(map, prefix + "CacheQuota", this.CacheQuota);
        this.setParamSimple(map, prefix + "OutputQuota", this.OutputQuota);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);

    }
}

