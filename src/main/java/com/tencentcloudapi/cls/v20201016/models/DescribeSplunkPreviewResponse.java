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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSplunkPreviewResponse extends AbstractModel {

    /**
    * <p>预览结果</p>
    */
    @SerializedName("PreviewInfos")
    @Expose
    private String [] PreviewInfos;

    /**
    * <p>数据过滤结果</p>
    */
    @SerializedName("FilterStats")
    @Expose
    private FilterStatistics FilterStats;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>预览结果</p> 
     * @return PreviewInfos <p>预览结果</p>
     */
    public String [] getPreviewInfos() {
        return this.PreviewInfos;
    }

    /**
     * Set <p>预览结果</p>
     * @param PreviewInfos <p>预览结果</p>
     */
    public void setPreviewInfos(String [] PreviewInfos) {
        this.PreviewInfos = PreviewInfos;
    }

    /**
     * Get <p>数据过滤结果</p> 
     * @return FilterStats <p>数据过滤结果</p>
     */
    public FilterStatistics getFilterStats() {
        return this.FilterStats;
    }

    /**
     * Set <p>数据过滤结果</p>
     * @param FilterStats <p>数据过滤结果</p>
     */
    public void setFilterStats(FilterStatistics FilterStats) {
        this.FilterStats = FilterStats;
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

    public DescribeSplunkPreviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSplunkPreviewResponse(DescribeSplunkPreviewResponse source) {
        if (source.PreviewInfos != null) {
            this.PreviewInfos = new String[source.PreviewInfos.length];
            for (int i = 0; i < source.PreviewInfos.length; i++) {
                this.PreviewInfos[i] = new String(source.PreviewInfos[i]);
            }
        }
        if (source.FilterStats != null) {
            this.FilterStats = new FilterStatistics(source.FilterStats);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PreviewInfos.", this.PreviewInfos);
        this.setParamObj(map, prefix + "FilterStats.", this.FilterStats);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

