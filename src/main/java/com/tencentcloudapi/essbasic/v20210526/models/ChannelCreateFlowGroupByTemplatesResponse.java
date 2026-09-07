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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateFlowGroupByTemplatesResponse extends AbstractModel {

    /**
    * <p>合同组ID，为32位字符串。<br>建议开发者妥善保存此合同组ID，以便于顺利进行后续操作。</p>
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * <p>合同组中每个合同流程ID，每个ID均为32位字符串。</p><p>注:<br><code>此数组的顺序和入参中的FlowInfos顺序一致</code></p>
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过<a href="https://qian.tencent.com/developers/partnerApis/files/DescribeFileConvertTask">查询转换任务状态</a>接口查询任务详情；</p>
    */
    @SerializedName("TaskInfos")
    @Expose
    private TaskInfo [] TaskInfos;

    /**
    * <p>合同组签署方信息</p>
    */
    @SerializedName("Approvers")
    @Expose
    private FlowGroupApprovers [] Approvers;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>合同组ID，为32位字符串。<br>建议开发者妥善保存此合同组ID，以便于顺利进行后续操作。</p> 
     * @return FlowGroupId <p>合同组ID，为32位字符串。<br>建议开发者妥善保存此合同组ID，以便于顺利进行后续操作。</p>
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set <p>合同组ID，为32位字符串。<br>建议开发者妥善保存此合同组ID，以便于顺利进行后续操作。</p>
     * @param FlowGroupId <p>合同组ID，为32位字符串。<br>建议开发者妥善保存此合同组ID，以便于顺利进行后续操作。</p>
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get <p>合同组中每个合同流程ID，每个ID均为32位字符串。</p><p>注:<br><code>此数组的顺序和入参中的FlowInfos顺序一致</code></p> 
     * @return FlowIds <p>合同组中每个合同流程ID，每个ID均为32位字符串。</p><p>注:<br><code>此数组的顺序和入参中的FlowInfos顺序一致</code></p>
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set <p>合同组中每个合同流程ID，每个ID均为32位字符串。</p><p>注:<br><code>此数组的顺序和入参中的FlowInfos顺序一致</code></p>
     * @param FlowIds <p>合同组中每个合同流程ID，每个ID均为32位字符串。</p><p>注:<br><code>此数组的顺序和入参中的FlowInfos顺序一致</code></p>
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过<a href="https://qian.tencent.com/developers/partnerApis/files/DescribeFileConvertTask">查询转换任务状态</a>接口查询任务详情；</p> 
     * @return TaskInfos <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过<a href="https://qian.tencent.com/developers/partnerApis/files/DescribeFileConvertTask">查询转换任务状态</a>接口查询任务详情；</p>
     */
    public TaskInfo [] getTaskInfos() {
        return this.TaskInfos;
    }

    /**
     * Set <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过<a href="https://qian.tencent.com/developers/partnerApis/files/DescribeFileConvertTask">查询转换任务状态</a>接口查询任务详情；</p>
     * @param TaskInfos <p>复杂文档合成任务（如，包含动态表格的预览任务）的任务信息数组；<br>如果文档需要异步合成，此字段会返回该异步任务的任务信息，后续可以通过<a href="https://qian.tencent.com/developers/partnerApis/files/DescribeFileConvertTask">查询转换任务状态</a>接口查询任务详情；</p>
     */
    public void setTaskInfos(TaskInfo [] TaskInfos) {
        this.TaskInfos = TaskInfos;
    }

    /**
     * Get <p>合同组签署方信息</p> 
     * @return Approvers <p>合同组签署方信息</p>
     */
    public FlowGroupApprovers [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set <p>合同组签署方信息</p>
     * @param Approvers <p>合同组签署方信息</p>
     */
    public void setApprovers(FlowGroupApprovers [] Approvers) {
        this.Approvers = Approvers;
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

    public ChannelCreateFlowGroupByTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowGroupByTemplatesResponse(ChannelCreateFlowGroupByTemplatesResponse source) {
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.TaskInfos != null) {
            this.TaskInfos = new TaskInfo[source.TaskInfos.length];
            for (int i = 0; i < source.TaskInfos.length; i++) {
                this.TaskInfos[i] = new TaskInfo(source.TaskInfos[i]);
            }
        }
        if (source.Approvers != null) {
            this.Approvers = new FlowGroupApprovers[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new FlowGroupApprovers(source.Approvers[i]);
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
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamArrayObj(map, prefix + "TaskInfos.", this.TaskInfos);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

