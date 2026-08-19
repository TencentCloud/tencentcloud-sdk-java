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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineOverviewResponse extends AbstractModel {

    /**
    * <p>基线概览统计数据（主机/集群未通过项数、近一年修复数）。</p>
    */
    @SerializedName("Statistics")
    @Expose
    private BaselineOverviewStatistic Statistics;

    /**
    * <p>最近一次基线扫描完成时间。</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>当前是否已启用任意周期性扫描。true 启用，false 未启用。</p>
    */
    @SerializedName("EnableCycleScan")
    @Expose
    private Boolean EnableCycleScan;

    /**
    * <p>当前进行中的扫描主任务数量。</p>
    */
    @SerializedName("ScanningTaskCount")
    @Expose
    private Long ScanningTaskCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>基线概览统计数据（主机/集群未通过项数、近一年修复数）。</p> 
     * @return Statistics <p>基线概览统计数据（主机/集群未通过项数、近一年修复数）。</p>
     */
    public BaselineOverviewStatistic getStatistics() {
        return this.Statistics;
    }

    /**
     * Set <p>基线概览统计数据（主机/集群未通过项数、近一年修复数）。</p>
     * @param Statistics <p>基线概览统计数据（主机/集群未通过项数、近一年修复数）。</p>
     */
    public void setStatistics(BaselineOverviewStatistic Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get <p>最近一次基线扫描完成时间。</p> 
     * @return LatestScanTime <p>最近一次基线扫描完成时间。</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>最近一次基线扫描完成时间。</p>
     * @param LatestScanTime <p>最近一次基线扫描完成时间。</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>当前是否已启用任意周期性扫描。true 启用，false 未启用。</p> 
     * @return EnableCycleScan <p>当前是否已启用任意周期性扫描。true 启用，false 未启用。</p>
     */
    public Boolean getEnableCycleScan() {
        return this.EnableCycleScan;
    }

    /**
     * Set <p>当前是否已启用任意周期性扫描。true 启用，false 未启用。</p>
     * @param EnableCycleScan <p>当前是否已启用任意周期性扫描。true 启用，false 未启用。</p>
     */
    public void setEnableCycleScan(Boolean EnableCycleScan) {
        this.EnableCycleScan = EnableCycleScan;
    }

    /**
     * Get <p>当前进行中的扫描主任务数量。</p> 
     * @return ScanningTaskCount <p>当前进行中的扫描主任务数量。</p>
     */
    public Long getScanningTaskCount() {
        return this.ScanningTaskCount;
    }

    /**
     * Set <p>当前进行中的扫描主任务数量。</p>
     * @param ScanningTaskCount <p>当前进行中的扫描主任务数量。</p>
     */
    public void setScanningTaskCount(Long ScanningTaskCount) {
        this.ScanningTaskCount = ScanningTaskCount;
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

    public DescribeBaselineOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineOverviewResponse(DescribeBaselineOverviewResponse source) {
        if (source.Statistics != null) {
            this.Statistics = new BaselineOverviewStatistic(source.Statistics);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.EnableCycleScan != null) {
            this.EnableCycleScan = new Boolean(source.EnableCycleScan);
        }
        if (source.ScanningTaskCount != null) {
            this.ScanningTaskCount = new Long(source.ScanningTaskCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Statistics.", this.Statistics);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "EnableCycleScan", this.EnableCycleScan);
        this.setParamSimple(map, prefix + "ScanningTaskCount", this.ScanningTaskCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

