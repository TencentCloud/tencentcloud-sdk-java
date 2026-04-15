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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkloadGroupResponse extends AbstractModel {

    /**
    * <p>资源组信息</p>
    */
    @SerializedName("WorkloadGroups")
    @Expose
    private WorkloadGroupConfig [] WorkloadGroups;

    /**
    * <p>是否开启资源组：开启-open、关闭-close</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * <p>是否开启监控，0：未开启，1：开启</p>
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>资源组信息</p> 
     * @return WorkloadGroups <p>资源组信息</p>
     */
    public WorkloadGroupConfig [] getWorkloadGroups() {
        return this.WorkloadGroups;
    }

    /**
     * Set <p>资源组信息</p>
     * @param WorkloadGroups <p>资源组信息</p>
     */
    public void setWorkloadGroups(WorkloadGroupConfig [] WorkloadGroups) {
        this.WorkloadGroups = WorkloadGroups;
    }

    /**
     * Get <p>是否开启资源组：开启-open、关闭-close</p> 
     * @return Status <p>是否开启资源组：开启-open、关闭-close</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>是否开启资源组：开启-open、关闭-close</p>
     * @param Status <p>是否开启资源组：开启-open、关闭-close</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrorMsg <p>错误信息</p>
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrorMsg <p>错误信息</p>
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get <p>是否开启监控，0：未开启，1：开启</p> 
     * @return MonitorStatus <p>是否开启监控，0：未开启，1：开启</p>
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set <p>是否开启监控，0：未开启，1：开启</p>
     * @param MonitorStatus <p>是否开启监控，0：未开启，1：开启</p>
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
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

    public DescribeWorkloadGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkloadGroupResponse(DescribeWorkloadGroupResponse source) {
        if (source.WorkloadGroups != null) {
            this.WorkloadGroups = new WorkloadGroupConfig[source.WorkloadGroups.length];
            for (int i = 0; i < source.WorkloadGroups.length; i++) {
                this.WorkloadGroups[i] = new WorkloadGroupConfig(source.WorkloadGroups[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WorkloadGroups.", this.WorkloadGroups);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

