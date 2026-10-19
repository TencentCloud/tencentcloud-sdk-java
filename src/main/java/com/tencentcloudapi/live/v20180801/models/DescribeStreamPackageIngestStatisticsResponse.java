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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageIngestStatisticsResponse extends AbstractModel {

    /**
    * <p>输入流量数据</p>
    */
    @SerializedName("DataInfoList")
    @Expose
    private IngestStatisticsDataInfo [] DataInfoList;

    /**
    * <p>总输入用量</p>
    */
    @SerializedName("TotalIngest")
    @Expose
    private Long TotalIngest;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>输入流量数据</p> 
     * @return DataInfoList <p>输入流量数据</p>
     */
    public IngestStatisticsDataInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set <p>输入流量数据</p>
     * @param DataInfoList <p>输入流量数据</p>
     */
    public void setDataInfoList(IngestStatisticsDataInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
    }

    /**
     * Get <p>总输入用量</p> 
     * @return TotalIngest <p>总输入用量</p>
     */
    public Long getTotalIngest() {
        return this.TotalIngest;
    }

    /**
     * Set <p>总输入用量</p>
     * @param TotalIngest <p>总输入用量</p>
     */
    public void setTotalIngest(Long TotalIngest) {
        this.TotalIngest = TotalIngest;
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

    public DescribeStreamPackageIngestStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageIngestStatisticsResponse(DescribeStreamPackageIngestStatisticsResponse source) {
        if (source.DataInfoList != null) {
            this.DataInfoList = new IngestStatisticsDataInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new IngestStatisticsDataInfo(source.DataInfoList[i]);
            }
        }
        if (source.TotalIngest != null) {
            this.TotalIngest = new Long(source.TotalIngest);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "TotalIngest", this.TotalIngest);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

