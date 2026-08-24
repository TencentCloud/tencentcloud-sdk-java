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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeTWeSeeComprehensionResponse extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>视觉理解结果</p>
    */
    @SerializedName("ComprehensionResult")
    @Expose
    private SeeComprehensionResult ComprehensionResult;

    /**
    * <p>完成该任务所消耗的基础能力额度</p>
    */
    @SerializedName("CostBasic")
    @Expose
    private Long CostBasic;

    /**
    * <p>完成该任务所消耗的高级能力额度</p>
    */
    @SerializedName("CostAdvanced")
    @Expose
    private Long CostAdvanced;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul> 
     * @return Status <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul>
     * @param Status <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>视觉理解结果</p> 
     * @return ComprehensionResult <p>视觉理解结果</p>
     */
    public SeeComprehensionResult getComprehensionResult() {
        return this.ComprehensionResult;
    }

    /**
     * Set <p>视觉理解结果</p>
     * @param ComprehensionResult <p>视觉理解结果</p>
     */
    public void setComprehensionResult(SeeComprehensionResult ComprehensionResult) {
        this.ComprehensionResult = ComprehensionResult;
    }

    /**
     * Get <p>完成该任务所消耗的基础能力额度</p> 
     * @return CostBasic <p>完成该任务所消耗的基础能力额度</p>
     */
    public Long getCostBasic() {
        return this.CostBasic;
    }

    /**
     * Set <p>完成该任务所消耗的基础能力额度</p>
     * @param CostBasic <p>完成该任务所消耗的基础能力额度</p>
     */
    public void setCostBasic(Long CostBasic) {
        this.CostBasic = CostBasic;
    }

    /**
     * Get <p>完成该任务所消耗的高级能力额度</p> 
     * @return CostAdvanced <p>完成该任务所消耗的高级能力额度</p>
     */
    public Long getCostAdvanced() {
        return this.CostAdvanced;
    }

    /**
     * Set <p>完成该任务所消耗的高级能力额度</p>
     * @param CostAdvanced <p>完成该任务所消耗的高级能力额度</p>
     */
    public void setCostAdvanced(Long CostAdvanced) {
        this.CostAdvanced = CostAdvanced;
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

    public InvokeTWeSeeComprehensionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeTWeSeeComprehensionResponse(InvokeTWeSeeComprehensionResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ComprehensionResult != null) {
            this.ComprehensionResult = new SeeComprehensionResult(source.ComprehensionResult);
        }
        if (source.CostBasic != null) {
            this.CostBasic = new Long(source.CostBasic);
        }
        if (source.CostAdvanced != null) {
            this.CostAdvanced = new Long(source.CostAdvanced);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "ComprehensionResult.", this.ComprehensionResult);
        this.setParamSimple(map, prefix + "CostBasic", this.CostBasic);
        this.setParamSimple(map, prefix + "CostAdvanced", this.CostAdvanced);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

