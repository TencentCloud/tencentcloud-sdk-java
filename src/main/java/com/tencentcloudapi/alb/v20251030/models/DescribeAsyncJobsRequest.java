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

public class DescribeAsyncJobsRequest extends AbstractModel {

    /**
    * 分批次查询时每次显示的条目数。取值范围：1~100，默认值：20。
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 是否拥有下一次查询的令牌（Token）。取值：  第一次查询和没有下一次查询时，均无需填写。 如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 异步请求返回的RequestId列表
    */
    @SerializedName("RequestIds")
    @Expose
    private String [] RequestIds;

    /**
     * Get 分批次查询时每次显示的条目数。取值范围：1~100，默认值：20。 
     * @return MaxResults 分批次查询时每次显示的条目数。取值范围：1~100，默认值：20。
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 分批次查询时每次显示的条目数。取值范围：1~100，默认值：20。
     * @param MaxResults 分批次查询时每次显示的条目数。取值范围：1~100，默认值：20。
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 是否拥有下一次查询的令牌（Token）。取值：  第一次查询和没有下一次查询时，均无需填写。 如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。 
     * @return NextToken 是否拥有下一次查询的令牌（Token）。取值：  第一次查询和没有下一次查询时，均无需填写。 如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 是否拥有下一次查询的令牌（Token）。取值：  第一次查询和没有下一次查询时，均无需填写。 如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。
     * @param NextToken 是否拥有下一次查询的令牌（Token）。取值：  第一次查询和没有下一次查询时，均无需填写。 如果有下一次查询，取值为上一次 API 调用返回的 NextToken 值。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 异步请求返回的RequestId列表 
     * @return RequestIds 异步请求返回的RequestId列表
     */
    public String [] getRequestIds() {
        return this.RequestIds;
    }

    /**
     * Set 异步请求返回的RequestId列表
     * @param RequestIds 异步请求返回的RequestId列表
     */
    public void setRequestIds(String [] RequestIds) {
        this.RequestIds = RequestIds;
    }

    public DescribeAsyncJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncJobsRequest(DescribeAsyncJobsRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.RequestIds != null) {
            this.RequestIds = new String[source.RequestIds.length];
            for (int i = 0; i < source.RequestIds.length; i++) {
                this.RequestIds[i] = new String(source.RequestIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArraySimple(map, prefix + "RequestIds.", this.RequestIds);

    }
}

