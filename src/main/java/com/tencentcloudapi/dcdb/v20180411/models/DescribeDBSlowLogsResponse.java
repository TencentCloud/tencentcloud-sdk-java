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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSlowLogsResponse extends AbstractModel {

    /**
    * 所有语句锁时间总和
    */
    @SerializedName("LockTimeSum")
    @Expose
    private Float LockTimeSum;

    /**
    * 所有语句查询总次数
    */
    @SerializedName("QueryCount")
    @Expose
    private Long QueryCount;

    /**
    * 总记录数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 所有语句查询时间总和
    */
    @SerializedName("QueryTimeSum")
    @Expose
    private Float QueryTimeSum;

    /**
    * 慢查询日志数据
    */
    @SerializedName("Data")
    @Expose
    private SlowLogData [] Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 所有语句锁时间总和 
     * @return LockTimeSum 所有语句锁时间总和
     */
    public Float getLockTimeSum() {
        return this.LockTimeSum;
    }

    /**
     * Set 所有语句锁时间总和
     * @param LockTimeSum 所有语句锁时间总和
     */
    public void setLockTimeSum(Float LockTimeSum) {
        this.LockTimeSum = LockTimeSum;
    }

    /**
     * Get 所有语句查询总次数 
     * @return QueryCount 所有语句查询总次数
     */
    public Long getQueryCount() {
        return this.QueryCount;
    }

    /**
     * Set 所有语句查询总次数
     * @param QueryCount 所有语句查询总次数
     */
    public void setQueryCount(Long QueryCount) {
        this.QueryCount = QueryCount;
    }

    /**
     * Get 总记录数 
     * @return Total 总记录数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总记录数
     * @param Total 总记录数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 所有语句查询时间总和 
     * @return QueryTimeSum 所有语句查询时间总和
     */
    public Float getQueryTimeSum() {
        return this.QueryTimeSum;
    }

    /**
     * Set 所有语句查询时间总和
     * @param QueryTimeSum 所有语句查询时间总和
     */
    public void setQueryTimeSum(Float QueryTimeSum) {
        this.QueryTimeSum = QueryTimeSum;
    }

    /**
     * Get 慢查询日志数据 
     * @return Data 慢查询日志数据
     */
    public SlowLogData [] getData() {
        return this.Data;
    }

    /**
     * Set 慢查询日志数据
     * @param Data 慢查询日志数据
     */
    public void setData(SlowLogData [] Data) {
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

    public DescribeDBSlowLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSlowLogsResponse(DescribeDBSlowLogsResponse source) {
        if (source.LockTimeSum != null) {
            this.LockTimeSum = new Float(source.LockTimeSum);
        }
        if (source.QueryCount != null) {
            this.QueryCount = new Long(source.QueryCount);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.QueryTimeSum != null) {
            this.QueryTimeSum = new Float(source.QueryTimeSum);
        }
        if (source.Data != null) {
            this.Data = new SlowLogData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SlowLogData(source.Data[i]);
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
        this.setParamSimple(map, prefix + "LockTimeSum", this.LockTimeSum);
        this.setParamSimple(map, prefix + "QueryCount", this.QueryCount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "QueryTimeSum", this.QueryTimeSum);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

