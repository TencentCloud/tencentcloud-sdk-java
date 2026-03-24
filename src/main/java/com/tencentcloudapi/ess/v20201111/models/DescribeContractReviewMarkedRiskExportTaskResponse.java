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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContractReviewMarkedRiskExportTaskResponse extends AbstractModel {

    /**
    * 导出文件 url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 任务状态。未知 = 0;   创建完成 = 1;   队列中 = 2;   执行中 = 3;   执行成功 = 4;   失败 = 5;   终止 = 6;
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 导出文件 url。 
     * @return Url 导出文件 url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 导出文件 url。
     * @param Url 导出文件 url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 任务状态。未知 = 0;   创建完成 = 1;   队列中 = 2;   执行中 = 3;   执行成功 = 4;   失败 = 5;   终止 = 6; 
     * @return Status 任务状态。未知 = 0;   创建完成 = 1;   队列中 = 2;   执行中 = 3;   执行成功 = 4;   失败 = 5;   终止 = 6;
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。未知 = 0;   创建完成 = 1;   队列中 = 2;   执行中 = 3;   执行成功 = 4;   失败 = 5;   终止 = 6;
     * @param Status 任务状态。未知 = 0;   创建完成 = 1;   队列中 = 2;   执行中 = 3;   执行成功 = 4;   失败 = 5;   终止 = 6;
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public DescribeContractReviewMarkedRiskExportTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContractReviewMarkedRiskExportTaskResponse(DescribeContractReviewMarkedRiskExportTaskResponse source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

