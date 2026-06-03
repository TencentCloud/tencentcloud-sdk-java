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

public class DescribeTokenPlanApiKeyUsageDetailRequest extends AbstractModel {

    /**
    * 套餐 ID。可通过DescribeTokenPlanList接口获取。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * 起始时间，RFC3339 格式。不传默认为结束时间前 15 分钟。
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 结束时间，RFC3339 格式。不传默认为当前时间。
    */
    @SerializedName("To")
    @Expose
    private String To;

    /**
    * 排序方式。取值：asc（升序）、desc（降序），默认为 desc。
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 返回条数，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 翻页上下文，首次查询不传，后续传入上次返回的 Context，直到 ListOver 为 true。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 按 API Key ID 精确过滤。最大 128 字符。与 ApiKeyName 至少需传入其一，都传时以 ApiKeyId 为准。可通过 DescribeTokenPlanApiKeyList 接口获取。
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * 按 API Key 名称模糊过滤。最大 64 字符。与 ApiKeyId 至少需传入其一，都传时以 ApiKeyId 为准。
    */
    @SerializedName("ApiKeyName")
    @Expose
    private String ApiKeyName;

    /**
    * 按模型 ID (Model ID) 精确过滤。需要按模型名称过滤时传入该字段。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

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
     * Get 起始时间，RFC3339 格式。不传默认为结束时间前 15 分钟。 
     * @return From 起始时间，RFC3339 格式。不传默认为结束时间前 15 分钟。
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 起始时间，RFC3339 格式。不传默认为结束时间前 15 分钟。
     * @param From 起始时间，RFC3339 格式。不传默认为结束时间前 15 分钟。
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 结束时间，RFC3339 格式。不传默认为当前时间。 
     * @return To 结束时间，RFC3339 格式。不传默认为当前时间。
     */
    public String getTo() {
        return this.To;
    }

    /**
     * Set 结束时间，RFC3339 格式。不传默认为当前时间。
     * @param To 结束时间，RFC3339 格式。不传默认为当前时间。
     */
    public void setTo(String To) {
        this.To = To;
    }

    /**
     * Get 排序方式。取值：asc（升序）、desc（降序），默认为 desc。 
     * @return Sort 排序方式。取值：asc（升序）、desc（降序），默认为 desc。
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式。取值：asc（升序）、desc（降序），默认为 desc。
     * @param Sort 排序方式。取值：asc（升序）、desc（降序），默认为 desc。
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 返回条数，默认为 20，最大值为 100。 
     * @return Limit 返回条数，默认为 20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回条数，默认为 20，最大值为 100。
     * @param Limit 返回条数，默认为 20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 翻页上下文，首次查询不传，后续传入上次返回的 Context，直到 ListOver 为 true。 
     * @return Context 翻页上下文，首次查询不传，后续传入上次返回的 Context，直到 ListOver 为 true。
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 翻页上下文，首次查询不传，后续传入上次返回的 Context，直到 ListOver 为 true。
     * @param Context 翻页上下文，首次查询不传，后续传入上次返回的 Context，直到 ListOver 为 true。
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 按 API Key ID 精确过滤。最大 128 字符。与 ApiKeyName 至少需传入其一，都传时以 ApiKeyId 为准。可通过 DescribeTokenPlanApiKeyList 接口获取。 
     * @return ApiKeyId 按 API Key ID 精确过滤。最大 128 字符。与 ApiKeyName 至少需传入其一，都传时以 ApiKeyId 为准。可通过 DescribeTokenPlanApiKeyList 接口获取。
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set 按 API Key ID 精确过滤。最大 128 字符。与 ApiKeyName 至少需传入其一，都传时以 ApiKeyId 为准。可通过 DescribeTokenPlanApiKeyList 接口获取。
     * @param ApiKeyId 按 API Key ID 精确过滤。最大 128 字符。与 ApiKeyName 至少需传入其一，都传时以 ApiKeyId 为准。可通过 DescribeTokenPlanApiKeyList 接口获取。
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get 按 API Key 名称模糊过滤。最大 64 字符。与 ApiKeyId 至少需传入其一，都传时以 ApiKeyId 为准。 
     * @return ApiKeyName 按 API Key 名称模糊过滤。最大 64 字符。与 ApiKeyId 至少需传入其一，都传时以 ApiKeyId 为准。
     */
    public String getApiKeyName() {
        return this.ApiKeyName;
    }

    /**
     * Set 按 API Key 名称模糊过滤。最大 64 字符。与 ApiKeyId 至少需传入其一，都传时以 ApiKeyId 为准。
     * @param ApiKeyName 按 API Key 名称模糊过滤。最大 64 字符。与 ApiKeyId 至少需传入其一，都传时以 ApiKeyId 为准。
     */
    public void setApiKeyName(String ApiKeyName) {
        this.ApiKeyName = ApiKeyName;
    }

    /**
     * Get 按模型 ID (Model ID) 精确过滤。需要按模型名称过滤时传入该字段。 
     * @return ModelName 按模型 ID (Model ID) 精确过滤。需要按模型名称过滤时传入该字段。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 按模型 ID (Model ID) 精确过滤。需要按模型名称过滤时传入该字段。
     * @param ModelName 按模型 ID (Model ID) 精确过滤。需要按模型名称过滤时传入该字段。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    public DescribeTokenPlanApiKeyUsageDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenPlanApiKeyUsageDetailRequest(DescribeTokenPlanApiKeyUsageDetailRequest source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.To != null) {
            this.To = new String(source.To);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.ApiKeyName != null) {
            this.ApiKeyName = new String(source.ApiKeyName);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "ApiKeyName", this.ApiKeyName);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);

    }
}

