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

public class DescribeArchiveFlowTaskResponse extends AbstractModel {

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 任务完成</li><li>3： 任务完成(存在失败)</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>每条合同的处理结果，与创建任务的archive_flows列表顺序一致</p>
    */
    @SerializedName("ArchiveFlowResults")
    @Expose
    private ArchiveFlowResult [] ArchiveFlowResults;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 任务完成</li><li>3： 任务完成(存在失败)</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 任务完成</li><li>3： 任务完成(存在失败)</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 任务完成</li><li>3： 任务完成(存在失败)</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 任务完成</li><li>3： 任务完成(存在失败)</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>每条合同的处理结果，与创建任务的archive_flows列表顺序一致</p> 
     * @return ArchiveFlowResults <p>每条合同的处理结果，与创建任务的archive_flows列表顺序一致</p>
     */
    public ArchiveFlowResult [] getArchiveFlowResults() {
        return this.ArchiveFlowResults;
    }

    /**
     * Set <p>每条合同的处理结果，与创建任务的archive_flows列表顺序一致</p>
     * @param ArchiveFlowResults <p>每条合同的处理结果，与创建任务的archive_flows列表顺序一致</p>
     */
    public void setArchiveFlowResults(ArchiveFlowResult [] ArchiveFlowResults) {
        this.ArchiveFlowResults = ArchiveFlowResults;
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

    public DescribeArchiveFlowTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeArchiveFlowTaskResponse(DescribeArchiveFlowTaskResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ArchiveFlowResults != null) {
            this.ArchiveFlowResults = new ArchiveFlowResult[source.ArchiveFlowResults.length];
            for (int i = 0; i < source.ArchiveFlowResults.length; i++) {
                this.ArchiveFlowResults[i] = new ArchiveFlowResult(source.ArchiveFlowResults[i]);
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
        this.setParamArrayObj(map, prefix + "ArchiveFlowResults.", this.ArchiveFlowResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

