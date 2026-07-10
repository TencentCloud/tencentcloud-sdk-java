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

public class CreateFlowByFilesResponse extends AbstractModel {

    /**
    * <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</p><p>注: 如果是预览模式(即NeedPreview设置为true)时, 此处不会有值返回。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/0a83015166cfe1cb043d14f9ec4bd75e.png">点击查看FlowId在控制台中的位置</a></p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>合同预览链接URL。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL</p>
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * <p>签署方信息，如角色ID、角色名称等</p>
    */
    @SerializedName("Approvers")
    @Expose
    private ApproverItem [] Approvers;

    /**
    * <p>发起审批流id，仅在CreateFlowByFiles时指定了WorkFlow=true时返回</p>
    */
    @SerializedName("WorkflowInstanceId")
    @Expose
    private String WorkflowInstanceId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</p><p>注: 如果是预览模式(即NeedPreview设置为true)时, 此处不会有值返回。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/0a83015166cfe1cb043d14f9ec4bd75e.png">点击查看FlowId在控制台中的位置</a></p> 
     * @return FlowId <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</p><p>注: 如果是预览模式(即NeedPreview设置为true)时, 此处不会有值返回。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/0a83015166cfe1cb043d14f9ec4bd75e.png">点击查看FlowId在控制台中的位置</a></p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</p><p>注: 如果是预览模式(即NeedPreview设置为true)时, 此处不会有值返回。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/0a83015166cfe1cb043d14f9ec4bd75e.png">点击查看FlowId在控制台中的位置</a></p>
     * @param FlowId <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</p><p>注: 如果是预览模式(即NeedPreview设置为true)时, 此处不会有值返回。</p><p><a href="https://qcloudimg.tencent-cloud.cn/raw/0a83015166cfe1cb043d14f9ec4bd75e.png">点击查看FlowId在控制台中的位置</a></p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>合同预览链接URL。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL</p> 
     * @return PreviewUrl <p>合同预览链接URL。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL</p>
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set <p>合同预览链接URL。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL</p>
     * @param PreviewUrl <p>合同预览链接URL。</p><p>注：如果是预览模式(即NeedPreview设置为true)时, 才会有此预览链接URL</p>
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get <p>签署方信息，如角色ID、角色名称等</p> 
     * @return Approvers <p>签署方信息，如角色ID、角色名称等</p>
     */
    public ApproverItem [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set <p>签署方信息，如角色ID、角色名称等</p>
     * @param Approvers <p>签署方信息，如角色ID、角色名称等</p>
     */
    public void setApprovers(ApproverItem [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get <p>发起审批流id，仅在CreateFlowByFiles时指定了WorkFlow=true时返回</p> 
     * @return WorkflowInstanceId <p>发起审批流id，仅在CreateFlowByFiles时指定了WorkFlow=true时返回</p>
     */
    public String getWorkflowInstanceId() {
        return this.WorkflowInstanceId;
    }

    /**
     * Set <p>发起审批流id，仅在CreateFlowByFiles时指定了WorkFlow=true时返回</p>
     * @param WorkflowInstanceId <p>发起审批流id，仅在CreateFlowByFiles时指定了WorkFlow=true时返回</p>
     */
    public void setWorkflowInstanceId(String WorkflowInstanceId) {
        this.WorkflowInstanceId = WorkflowInstanceId;
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

    public CreateFlowByFilesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowByFilesResponse(CreateFlowByFilesResponse source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.Approvers != null) {
            this.Approvers = new ApproverItem[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new ApproverItem(source.Approvers[i]);
            }
        }
        if (source.WorkflowInstanceId != null) {
            this.WorkflowInstanceId = new String(source.WorkflowInstanceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "WorkflowInstanceId", this.WorkflowInstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

