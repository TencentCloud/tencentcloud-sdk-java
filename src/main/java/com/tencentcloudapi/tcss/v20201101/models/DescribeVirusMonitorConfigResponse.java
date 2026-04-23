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

public class DescribeVirusMonitorConfigResponse extends AbstractModel {

    /**
    * 是否开启实时监控
    */
    @SerializedName("EnableScan")
    @Expose
    private Boolean EnableScan;

    /**
    * true:包含路径 false:排除路径
    */
    @SerializedName("IsIncludePath")
    @Expose
    private Boolean IsIncludePath;

    /**
    * 自选排除或扫描的地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanPath")
    @Expose
    private String [] ScanPath;

    /**
    * 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径

    */
    @SerializedName("ScanPathMode")
    @Expose
    private String ScanPathMode;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否开启实时监控 
     * @return EnableScan 是否开启实时监控
     */
    public Boolean getEnableScan() {
        return this.EnableScan;
    }

    /**
     * Set 是否开启实时监控
     * @param EnableScan 是否开启实时监控
     */
    public void setEnableScan(Boolean EnableScan) {
        this.EnableScan = EnableScan;
    }

    /**
     * Get true:包含路径 false:排除路径 
     * @return IsIncludePath true:包含路径 false:排除路径
     */
    public Boolean getIsIncludePath() {
        return this.IsIncludePath;
    }

    /**
     * Set true:包含路径 false:排除路径
     * @param IsIncludePath true:包含路径 false:排除路径
     */
    public void setIsIncludePath(Boolean IsIncludePath) {
        this.IsIncludePath = IsIncludePath;
    }

    /**
     * Get 自选排除或扫描的地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanPath 自选排除或扫描的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getScanPath() {
        return this.ScanPath;
    }

    /**
     * Set 自选排除或扫描的地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanPath 自选排除或扫描的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanPath(String [] ScanPath) {
        this.ScanPath = ScanPath;
    }

    /**
     * Get 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径
 
     * @return ScanPathMode 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径

     */
    public String getScanPathMode() {
        return this.ScanPathMode;
    }

    /**
     * Set 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径

     * @param ScanPathMode 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径

     */
    public void setScanPathMode(String ScanPathMode) {
        this.ScanPathMode = ScanPathMode;
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

    public DescribeVirusMonitorConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusMonitorConfigResponse(DescribeVirusMonitorConfigResponse source) {
        if (source.EnableScan != null) {
            this.EnableScan = new Boolean(source.EnableScan);
        }
        if (source.IsIncludePath != null) {
            this.IsIncludePath = new Boolean(source.IsIncludePath);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableScan", this.EnableScan);
        this.setParamSimple(map, prefix + "IsIncludePath", this.IsIncludePath);
        this.setParamArraySimple(map, prefix + "ScanPath.", this.ScanPath);
        this.setParamSimple(map, prefix + "ScanPathMode", this.ScanPathMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

