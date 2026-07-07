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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHealthCheckTemplatesRequest extends AbstractModel {

    /**
    * 过滤器。通过指定的过滤条件来查询健康检查模版，支持：
- Name的值为**HealthCheckTemplateName**。通过名称来筛选健康检查模版。**Values**的值为模版名称列表。
- Name的值为**HealthCheckProtocol**。通过健康检查协议来筛选健康检查模版。**Values**的值为协议列表。
- 通过标签方式筛选。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。
    */
    @SerializedName("HealthCheckTemplateIds")
    @Expose
    private String [] HealthCheckTemplateIds;

    /**
    * 返回列表的数量，默认为20，最大值为100。
    */
    @SerializedName("MaxResults")
    @Expose
    private String MaxResults;

    /**
    * 下一次查询的Token值。第一次查询和没有下一次查询时，无需填写。
如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get 过滤器。通过指定的过滤条件来查询健康检查模版，支持：
- Name的值为**HealthCheckTemplateName**。通过名称来筛选健康检查模版。**Values**的值为模版名称列表。
- Name的值为**HealthCheckProtocol**。通过健康检查协议来筛选健康检查模版。**Values**的值为协议列表。
- 通过标签方式筛选。 
     * @return Filters 过滤器。通过指定的过滤条件来查询健康检查模版，支持：
- Name的值为**HealthCheckTemplateName**。通过名称来筛选健康检查模版。**Values**的值为模版名称列表。
- Name的值为**HealthCheckProtocol**。通过健康检查协议来筛选健康检查模版。**Values**的值为协议列表。
- 通过标签方式筛选。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器。通过指定的过滤条件来查询健康检查模版，支持：
- Name的值为**HealthCheckTemplateName**。通过名称来筛选健康检查模版。**Values**的值为模版名称列表。
- Name的值为**HealthCheckProtocol**。通过健康检查协议来筛选健康检查模版。**Values**的值为协议列表。
- 通过标签方式筛选。
     * @param Filters 过滤器。通过指定的过滤条件来查询健康检查模版，支持：
- Name的值为**HealthCheckTemplateName**。通过名称来筛选健康检查模版。**Values**的值为模版名称列表。
- Name的值为**HealthCheckProtocol**。通过健康检查协议来筛选健康检查模版。**Values**的值为协议列表。
- 通过标签方式筛选。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。 
     * @return HealthCheckTemplateIds 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。
     */
    public String [] getHealthCheckTemplateIds() {
        return this.HealthCheckTemplateIds;
    }

    /**
     * Set 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。
     * @param HealthCheckTemplateIds 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。
     */
    public void setHealthCheckTemplateIds(String [] HealthCheckTemplateIds) {
        this.HealthCheckTemplateIds = HealthCheckTemplateIds;
    }

    /**
     * Get 返回列表的数量，默认为20，最大值为100。 
     * @return MaxResults 返回列表的数量，默认为20，最大值为100。
     */
    public String getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 返回列表的数量，默认为20，最大值为100。
     * @param MaxResults 返回列表的数量，默认为20，最大值为100。
     */
    public void setMaxResults(String MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 下一次查询的Token值。第一次查询和没有下一次查询时，无需填写。
如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。 
     * @return NextToken 下一次查询的Token值。第一次查询和没有下一次查询时，无需填写。
如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 下一次查询的Token值。第一次查询和没有下一次查询时，无需填写。
如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。
     * @param NextToken 下一次查询的Token值。第一次查询和没有下一次查询时，无需填写。
如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeHealthCheckTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHealthCheckTemplatesRequest(DescribeHealthCheckTemplatesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.HealthCheckTemplateIds != null) {
            this.HealthCheckTemplateIds = new String[source.HealthCheckTemplateIds.length];
            for (int i = 0; i < source.HealthCheckTemplateIds.length; i++) {
                this.HealthCheckTemplateIds[i] = new String(source.HealthCheckTemplateIds[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new String(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "HealthCheckTemplateIds.", this.HealthCheckTemplateIds);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

