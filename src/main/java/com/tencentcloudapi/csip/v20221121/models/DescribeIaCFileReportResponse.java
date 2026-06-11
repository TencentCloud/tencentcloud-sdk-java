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

public class DescribeIaCFileReportResponse extends AbstractModel {

    /**
    * <p>检测文件</p>
    */
    @SerializedName("File")
    @Expose
    private String File;

    /**
    * <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>检测时间</p>
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * <p>风险列表</p>
    */
    @SerializedName("Risks")
    @Expose
    private IaCFileRisk [] Risks;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>检测文件</p> 
     * @return File <p>检测文件</p>
     */
    public String getFile() {
        return this.File;
    }

    /**
     * Set <p>检测文件</p>
     * @param File <p>检测文件</p>
     */
    public void setFile(String File) {
        this.File = File;
    }

    /**
     * Get <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p> 
     * @return Status <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p>
     * @param Status <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>检测时间</p> 
     * @return ScanTime <p>检测时间</p>
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set <p>检测时间</p>
     * @param ScanTime <p>检测时间</p>
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get <p>风险列表</p> 
     * @return Risks <p>风险列表</p>
     */
    public IaCFileRisk [] getRisks() {
        return this.Risks;
    }

    /**
     * Set <p>风险列表</p>
     * @param Risks <p>风险列表</p>
     */
    public void setRisks(IaCFileRisk [] Risks) {
        this.Risks = Risks;
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

    public DescribeIaCFileReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIaCFileReportResponse(DescribeIaCFileReportResponse source) {
        if (source.File != null) {
            this.File = new String(source.File);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.Risks != null) {
            this.Risks = new IaCFileRisk[source.Risks.length];
            for (int i = 0; i < source.Risks.length; i++) {
                this.Risks[i] = new IaCFileRisk(source.Risks[i]);
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
        this.setParamSimple(map, prefix + "File", this.File);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamArrayObj(map, prefix + "Risks.", this.Risks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

