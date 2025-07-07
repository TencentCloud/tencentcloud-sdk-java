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

public class DescribeOnlineDDLJobResponse extends AbstractModel {

    /**
    * 任务状态。0：成功；1：失败；大于1：进行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务进度百分比
    */
    @SerializedName("Process")
    @Expose
    private Long Process;

    /**
    * 错误信息或提示信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 各分片DDL执行详情
    */
    @SerializedName("DDLDetails")
    @Expose
    private DDLDetail [] DDLDetails;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态。0：成功；1：失败；大于1：进行中 
     * @return Status 任务状态。0：成功；1：失败；大于1：进行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。0：成功；1：失败；大于1：进行中
     * @param Status 任务状态。0：成功；1：失败；大于1：进行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务进度百分比 
     * @return Process 任务进度百分比
     */
    public Long getProcess() {
        return this.Process;
    }

    /**
     * Set 任务进度百分比
     * @param Process 任务进度百分比
     */
    public void setProcess(Long Process) {
        this.Process = Process;
    }

    /**
     * Get 错误信息或提示信息 
     * @return ErrorMessage 错误信息或提示信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息或提示信息
     * @param ErrorMessage 错误信息或提示信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 各分片DDL执行详情 
     * @return DDLDetails 各分片DDL执行详情
     */
    public DDLDetail [] getDDLDetails() {
        return this.DDLDetails;
    }

    /**
     * Set 各分片DDL执行详情
     * @param DDLDetails 各分片DDL执行详情
     */
    public void setDDLDetails(DDLDetail [] DDLDetails) {
        this.DDLDetails = DDLDetails;
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

    public DescribeOnlineDDLJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOnlineDDLJobResponse(DescribeOnlineDDLJobResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Process != null) {
            this.Process = new Long(source.Process);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.DDLDetails != null) {
            this.DDLDetails = new DDLDetail[source.DDLDetails.length];
            for (int i = 0; i < source.DDLDetails.length; i++) {
                this.DDLDetails[i] = new DDLDetail(source.DDLDetails[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Process", this.Process);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamArrayObj(map, prefix + "DDLDetails.", this.DDLDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

