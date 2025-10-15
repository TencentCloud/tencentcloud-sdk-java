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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMySqlProcessListResponse extends AbstractModel {

    /**
    * 实时线程列表。
    */
    @SerializedName("ProcessList")
    @Expose
    private MySqlProcess [] ProcessList;

    /**
    * sql会话统计信息。如果请求参数中包含StatDimensions，该参数则可能返回，否则不返回。
    */
    @SerializedName("Statistics")
    @Expose
    private StatisticInfo [] Statistics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实时线程列表。 
     * @return ProcessList 实时线程列表。
     */
    public MySqlProcess [] getProcessList() {
        return this.ProcessList;
    }

    /**
     * Set 实时线程列表。
     * @param ProcessList 实时线程列表。
     */
    public void setProcessList(MySqlProcess [] ProcessList) {
        this.ProcessList = ProcessList;
    }

    /**
     * Get sql会话统计信息。如果请求参数中包含StatDimensions，该参数则可能返回，否则不返回。 
     * @return Statistics sql会话统计信息。如果请求参数中包含StatDimensions，该参数则可能返回，否则不返回。
     */
    public StatisticInfo [] getStatistics() {
        return this.Statistics;
    }

    /**
     * Set sql会话统计信息。如果请求参数中包含StatDimensions，该参数则可能返回，否则不返回。
     * @param Statistics sql会话统计信息。如果请求参数中包含StatDimensions，该参数则可能返回，否则不返回。
     */
    public void setStatistics(StatisticInfo [] Statistics) {
        this.Statistics = Statistics;
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

    public DescribeMySqlProcessListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMySqlProcessListResponse(DescribeMySqlProcessListResponse source) {
        if (source.ProcessList != null) {
            this.ProcessList = new MySqlProcess[source.ProcessList.length];
            for (int i = 0; i < source.ProcessList.length; i++) {
                this.ProcessList[i] = new MySqlProcess(source.ProcessList[i]);
            }
        }
        if (source.Statistics != null) {
            this.Statistics = new StatisticInfo[source.Statistics.length];
            for (int i = 0; i < source.Statistics.length; i++) {
                this.Statistics[i] = new StatisticInfo(source.Statistics[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ProcessList.", this.ProcessList);
        this.setParamArrayObj(map, prefix + "Statistics.", this.Statistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

