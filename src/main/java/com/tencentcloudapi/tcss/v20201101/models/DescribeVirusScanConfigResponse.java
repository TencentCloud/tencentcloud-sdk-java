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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusScanConfigResponse extends AbstractModel {

    /**
    * <p>是否开启定期扫描</p>
    */
    @SerializedName("EnableScan")
    @Expose
    private Boolean EnableScan;

    /**
    * <p>检测周期每隔多少天</p>
    */
    @SerializedName("Cycle")
    @Expose
    private Long Cycle;

    /**
    * <p>扫描开始时间</p>
    */
    @SerializedName("BeginScanAt")
    @Expose
    private String BeginScanAt;

    /**
    * <p>超时时长，单位小时</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>SCAN_NODE:扫描节点<br>SCAN_CONTAINER:扫描容器</p>
    */
    @SerializedName("ScanRangeType")
    @Expose
    private String ScanRangeType;

    /**
    * <p>自选扫描范围的容器id或者节点id</p>
    */
    @SerializedName("ScanIDs")
    @Expose
    private ScanRangeInfo [] ScanIDs;

    /**
    * <p>自选排除或扫描的地址</p>
    */
    @SerializedName("ScanPath")
    @Expose
    private String [] ScanPath;

    /**
    * <p>扫描路径模式：<br>SCAN_PATH_ALL：全部路径<br>SCAN_PATH_DEFAULT：默认路径<br>SCAN_PATH_USER_DEFINE：用户自定义路径</p>
    */
    @SerializedName("ScanPathMode")
    @Expose
    private String ScanPathMode;

    /**
    * <p>true:包含路径<br>false:排除路径</p>
    */
    @SerializedName("IsIncludePath")
    @Expose
    private Boolean IsIncludePath;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否开启定期扫描</p> 
     * @return EnableScan <p>是否开启定期扫描</p>
     */
    public Boolean getEnableScan() {
        return this.EnableScan;
    }

    /**
     * Set <p>是否开启定期扫描</p>
     * @param EnableScan <p>是否开启定期扫描</p>
     */
    public void setEnableScan(Boolean EnableScan) {
        this.EnableScan = EnableScan;
    }

    /**
     * Get <p>检测周期每隔多少天</p> 
     * @return Cycle <p>检测周期每隔多少天</p>
     */
    public Long getCycle() {
        return this.Cycle;
    }

    /**
     * Set <p>检测周期每隔多少天</p>
     * @param Cycle <p>检测周期每隔多少天</p>
     */
    public void setCycle(Long Cycle) {
        this.Cycle = Cycle;
    }

    /**
     * Get <p>扫描开始时间</p> 
     * @return BeginScanAt <p>扫描开始时间</p>
     */
    public String getBeginScanAt() {
        return this.BeginScanAt;
    }

    /**
     * Set <p>扫描开始时间</p>
     * @param BeginScanAt <p>扫描开始时间</p>
     */
    public void setBeginScanAt(String BeginScanAt) {
        this.BeginScanAt = BeginScanAt;
    }

    /**
     * Get <p>超时时长，单位小时</p> 
     * @return Timeout <p>超时时长，单位小时</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时长，单位小时</p>
     * @param Timeout <p>超时时长，单位小时</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>SCAN_NODE:扫描节点<br>SCAN_CONTAINER:扫描容器</p> 
     * @return ScanRangeType <p>SCAN_NODE:扫描节点<br>SCAN_CONTAINER:扫描容器</p>
     */
    public String getScanRangeType() {
        return this.ScanRangeType;
    }

    /**
     * Set <p>SCAN_NODE:扫描节点<br>SCAN_CONTAINER:扫描容器</p>
     * @param ScanRangeType <p>SCAN_NODE:扫描节点<br>SCAN_CONTAINER:扫描容器</p>
     */
    public void setScanRangeType(String ScanRangeType) {
        this.ScanRangeType = ScanRangeType;
    }

    /**
     * Get <p>自选扫描范围的容器id或者节点id</p> 
     * @return ScanIDs <p>自选扫描范围的容器id或者节点id</p>
     */
    public ScanRangeInfo [] getScanIDs() {
        return this.ScanIDs;
    }

    /**
     * Set <p>自选扫描范围的容器id或者节点id</p>
     * @param ScanIDs <p>自选扫描范围的容器id或者节点id</p>
     */
    public void setScanIDs(ScanRangeInfo [] ScanIDs) {
        this.ScanIDs = ScanIDs;
    }

    /**
     * Get <p>自选排除或扫描的地址</p> 
     * @return ScanPath <p>自选排除或扫描的地址</p>
     */
    public String [] getScanPath() {
        return this.ScanPath;
    }

    /**
     * Set <p>自选排除或扫描的地址</p>
     * @param ScanPath <p>自选排除或扫描的地址</p>
     */
    public void setScanPath(String [] ScanPath) {
        this.ScanPath = ScanPath;
    }

    /**
     * Get <p>扫描路径模式：<br>SCAN_PATH_ALL：全部路径<br>SCAN_PATH_DEFAULT：默认路径<br>SCAN_PATH_USER_DEFINE：用户自定义路径</p> 
     * @return ScanPathMode <p>扫描路径模式：<br>SCAN_PATH_ALL：全部路径<br>SCAN_PATH_DEFAULT：默认路径<br>SCAN_PATH_USER_DEFINE：用户自定义路径</p>
     */
    public String getScanPathMode() {
        return this.ScanPathMode;
    }

    /**
     * Set <p>扫描路径模式：<br>SCAN_PATH_ALL：全部路径<br>SCAN_PATH_DEFAULT：默认路径<br>SCAN_PATH_USER_DEFINE：用户自定义路径</p>
     * @param ScanPathMode <p>扫描路径模式：<br>SCAN_PATH_ALL：全部路径<br>SCAN_PATH_DEFAULT：默认路径<br>SCAN_PATH_USER_DEFINE：用户自定义路径</p>
     */
    public void setScanPathMode(String ScanPathMode) {
        this.ScanPathMode = ScanPathMode;
    }

    /**
     * Get <p>true:包含路径<br>false:排除路径</p> 
     * @return IsIncludePath <p>true:包含路径<br>false:排除路径</p>
     */
    public Boolean getIsIncludePath() {
        return this.IsIncludePath;
    }

    /**
     * Set <p>true:包含路径<br>false:排除路径</p>
     * @param IsIncludePath <p>true:包含路径<br>false:排除路径</p>
     */
    public void setIsIncludePath(Boolean IsIncludePath) {
        this.IsIncludePath = IsIncludePath;
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

    public DescribeVirusScanConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusScanConfigResponse(DescribeVirusScanConfigResponse source) {
        if (source.EnableScan != null) {
            this.EnableScan = new Boolean(source.EnableScan);
        }
        if (source.Cycle != null) {
            this.Cycle = new Long(source.Cycle);
        }
        if (source.BeginScanAt != null) {
            this.BeginScanAt = new String(source.BeginScanAt);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.ScanRangeType != null) {
            this.ScanRangeType = new String(source.ScanRangeType);
        }
        if (source.ScanIDs != null) {
            this.ScanIDs = new ScanRangeInfo[source.ScanIDs.length];
            for (int i = 0; i < source.ScanIDs.length; i++) {
                this.ScanIDs[i] = new ScanRangeInfo(source.ScanIDs[i]);
            }
        }
        if (source.ScanPath != null) {
            this.ScanPath = new String[source.ScanPath.length];
            for (int i = 0; i < source.ScanPath.length; i++) {
                this.ScanPath[i] = new String(source.ScanPath[i]);
            }
        }
        if (source.ScanPathMode != null) {
            this.ScanPathMode = new String(source.ScanPathMode);
        }
        if (source.IsIncludePath != null) {
            this.IsIncludePath = new Boolean(source.IsIncludePath);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableScan", this.EnableScan);
        this.setParamSimple(map, prefix + "Cycle", this.Cycle);
        this.setParamSimple(map, prefix + "BeginScanAt", this.BeginScanAt);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ScanRangeType", this.ScanRangeType);
        this.setParamArrayObj(map, prefix + "ScanIDs.", this.ScanIDs);
        this.setParamArraySimple(map, prefix + "ScanPath.", this.ScanPath);
        this.setParamSimple(map, prefix + "ScanPathMode", this.ScanPathMode);
        this.setParamSimple(map, prefix + "IsIncludePath", this.IsIncludePath);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

