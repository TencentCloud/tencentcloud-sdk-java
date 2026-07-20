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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwAnalysisDataResponse extends AbstractModel {

    /**
    * 查询结果。Response.Data 是 UTF-8 JSON object 字符串，调用方需要二次 JSON 解析。status 取值为 success、partial 或 error。section 查询失败时，error 只返回固定安全摘要，不包含底层服务内部信息。示例仅展示一个代表性 section；实际返回包含当前场景全部未跳过的 section；summary 包含 total_findings、high_risk_count 和 data_coverage，metadata 包含 scenario、time_range、object 和 query_stats，query_stats 包含 total_queries、successful 和 failed。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询结果。Response.Data 是 UTF-8 JSON object 字符串，调用方需要二次 JSON 解析。status 取值为 success、partial 或 error。section 查询失败时，error 只返回固定安全摘要，不包含底层服务内部信息。示例仅展示一个代表性 section；实际返回包含当前场景全部未跳过的 section；summary 包含 total_findings、high_risk_count 和 data_coverage，metadata 包含 scenario、time_range、object 和 query_stats，query_stats 包含 total_queries、successful 和 failed。 
     * @return Data 查询结果。Response.Data 是 UTF-8 JSON object 字符串，调用方需要二次 JSON 解析。status 取值为 success、partial 或 error。section 查询失败时，error 只返回固定安全摘要，不包含底层服务内部信息。示例仅展示一个代表性 section；实际返回包含当前场景全部未跳过的 section；summary 包含 total_findings、high_risk_count 和 data_coverage，metadata 包含 scenario、time_range、object 和 query_stats，query_stats 包含 total_queries、successful 和 failed。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 查询结果。Response.Data 是 UTF-8 JSON object 字符串，调用方需要二次 JSON 解析。status 取值为 success、partial 或 error。section 查询失败时，error 只返回固定安全摘要，不包含底层服务内部信息。示例仅展示一个代表性 section；实际返回包含当前场景全部未跳过的 section；summary 包含 total_findings、high_risk_count 和 data_coverage，metadata 包含 scenario、time_range、object 和 query_stats，query_stats 包含 total_queries、successful 和 failed。
     * @param Data 查询结果。Response.Data 是 UTF-8 JSON object 字符串，调用方需要二次 JSON 解析。status 取值为 success、partial 或 error。section 查询失败时，error 只返回固定安全摘要，不包含底层服务内部信息。示例仅展示一个代表性 section；实际返回包含当前场景全部未跳过的 section；summary 包含 total_findings、high_risk_count 和 data_coverage，metadata 包含 scenario、time_range、object 和 query_stats，query_stats 包含 total_queries、successful 和 failed。
     */
    public void setData(String Data) {
        this.Data = Data;
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

    public DescribeCfwAnalysisDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwAnalysisDataResponse(DescribeCfwAnalysisDataResponse source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

