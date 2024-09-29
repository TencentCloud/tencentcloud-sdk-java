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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenUsageResponse extends AbstractModel {

    /**
    * 总token消耗量
    */
    @SerializedName("TotalTokenUsage")
    @Expose
    private Float TotalTokenUsage;

    /**
    * 输入token消耗
    */
    @SerializedName("InputTokenUsage")
    @Expose
    private Float InputTokenUsage;

    /**
    * 输出token消耗
    */
    @SerializedName("OutputTokenUsage")
    @Expose
    private Float OutputTokenUsage;

    /**
    * 接口调用次数
    */
    @SerializedName("ApiCallStats")
    @Expose
    private Long ApiCallStats;

    /**
    * 搜索服务调用次数
    */
    @SerializedName("SearchUsage")
    @Expose
    private Float SearchUsage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总token消耗量 
     * @return TotalTokenUsage 总token消耗量
     */
    public Float getTotalTokenUsage() {
        return this.TotalTokenUsage;
    }

    /**
     * Set 总token消耗量
     * @param TotalTokenUsage 总token消耗量
     */
    public void setTotalTokenUsage(Float TotalTokenUsage) {
        this.TotalTokenUsage = TotalTokenUsage;
    }

    /**
     * Get 输入token消耗 
     * @return InputTokenUsage 输入token消耗
     */
    public Float getInputTokenUsage() {
        return this.InputTokenUsage;
    }

    /**
     * Set 输入token消耗
     * @param InputTokenUsage 输入token消耗
     */
    public void setInputTokenUsage(Float InputTokenUsage) {
        this.InputTokenUsage = InputTokenUsage;
    }

    /**
     * Get 输出token消耗 
     * @return OutputTokenUsage 输出token消耗
     */
    public Float getOutputTokenUsage() {
        return this.OutputTokenUsage;
    }

    /**
     * Set 输出token消耗
     * @param OutputTokenUsage 输出token消耗
     */
    public void setOutputTokenUsage(Float OutputTokenUsage) {
        this.OutputTokenUsage = OutputTokenUsage;
    }

    /**
     * Get 接口调用次数 
     * @return ApiCallStats 接口调用次数
     */
    public Long getApiCallStats() {
        return this.ApiCallStats;
    }

    /**
     * Set 接口调用次数
     * @param ApiCallStats 接口调用次数
     */
    public void setApiCallStats(Long ApiCallStats) {
        this.ApiCallStats = ApiCallStats;
    }

    /**
     * Get 搜索服务调用次数 
     * @return SearchUsage 搜索服务调用次数
     */
    public Float getSearchUsage() {
        return this.SearchUsage;
    }

    /**
     * Set 搜索服务调用次数
     * @param SearchUsage 搜索服务调用次数
     */
    public void setSearchUsage(Float SearchUsage) {
        this.SearchUsage = SearchUsage;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTokenUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenUsageResponse(DescribeTokenUsageResponse source) {
        if (source.TotalTokenUsage != null) {
            this.TotalTokenUsage = new Float(source.TotalTokenUsage);
        }
        if (source.InputTokenUsage != null) {
            this.InputTokenUsage = new Float(source.InputTokenUsage);
        }
        if (source.OutputTokenUsage != null) {
            this.OutputTokenUsage = new Float(source.OutputTokenUsage);
        }
        if (source.ApiCallStats != null) {
            this.ApiCallStats = new Long(source.ApiCallStats);
        }
        if (source.SearchUsage != null) {
            this.SearchUsage = new Float(source.SearchUsage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTokenUsage", this.TotalTokenUsage);
        this.setParamSimple(map, prefix + "InputTokenUsage", this.InputTokenUsage);
        this.setParamSimple(map, prefix + "OutputTokenUsage", this.OutputTokenUsage);
        this.setParamSimple(map, prefix + "ApiCallStats", this.ApiCallStats);
        this.setParamSimple(map, prefix + "SearchUsage", this.SearchUsage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

