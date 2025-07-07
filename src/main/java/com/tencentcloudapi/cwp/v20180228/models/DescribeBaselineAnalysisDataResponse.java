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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineAnalysisDataResponse extends AbstractModel {

    /**
    * 最后检测时间
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * 是否全部服务器：1-是 0-否
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 服务器总数
    */
    @SerializedName("ScanHostCount")
    @Expose
    private Long ScanHostCount;

    /**
    * 检测项总数
    */
    @SerializedName("ScanRuleCount")
    @Expose
    private Long ScanRuleCount;

    /**
    * 是否是第一次检测  1是 0不是
    */
    @SerializedName("IfFirstScan")
    @Expose
    private Long IfFirstScan;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 最后检测时间 
     * @return LatestScanTime 最后检测时间
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set 最后检测时间
     * @param LatestScanTime 最后检测时间
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get 是否全部服务器：1-是 0-否 
     * @return IsGlobal 是否全部服务器：1-是 0-否
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全部服务器：1-是 0-否
     * @param IsGlobal 是否全部服务器：1-是 0-否
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 服务器总数 
     * @return ScanHostCount 服务器总数
     */
    public Long getScanHostCount() {
        return this.ScanHostCount;
    }

    /**
     * Set 服务器总数
     * @param ScanHostCount 服务器总数
     */
    public void setScanHostCount(Long ScanHostCount) {
        this.ScanHostCount = ScanHostCount;
    }

    /**
     * Get 检测项总数 
     * @return ScanRuleCount 检测项总数
     */
    public Long getScanRuleCount() {
        return this.ScanRuleCount;
    }

    /**
     * Set 检测项总数
     * @param ScanRuleCount 检测项总数
     */
    public void setScanRuleCount(Long ScanRuleCount) {
        this.ScanRuleCount = ScanRuleCount;
    }

    /**
     * Get 是否是第一次检测  1是 0不是 
     * @return IfFirstScan 是否是第一次检测  1是 0不是
     */
    public Long getIfFirstScan() {
        return this.IfFirstScan;
    }

    /**
     * Set 是否是第一次检测  1是 0不是
     * @param IfFirstScan 是否是第一次检测  1是 0不是
     */
    public void setIfFirstScan(Long IfFirstScan) {
        this.IfFirstScan = IfFirstScan;
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

    public DescribeBaselineAnalysisDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineAnalysisDataResponse(DescribeBaselineAnalysisDataResponse source) {
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.ScanHostCount != null) {
            this.ScanHostCount = new Long(source.ScanHostCount);
        }
        if (source.ScanRuleCount != null) {
            this.ScanRuleCount = new Long(source.ScanRuleCount);
        }
        if (source.IfFirstScan != null) {
            this.IfFirstScan = new Long(source.IfFirstScan);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "ScanHostCount", this.ScanHostCount);
        this.setParamSimple(map, prefix + "ScanRuleCount", this.ScanRuleCount);
        this.setParamSimple(map, prefix + "IfFirstScan", this.IfFirstScan);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

