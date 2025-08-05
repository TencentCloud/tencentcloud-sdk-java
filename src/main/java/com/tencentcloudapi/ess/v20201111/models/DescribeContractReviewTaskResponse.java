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

public class DescribeContractReviewTaskResponse extends AbstractModel {

    /**
    * 用于审查任务的审查清单ID。
    */
    @SerializedName("ChecklistId")
    @Expose
    private String ChecklistId;

    /**
    * 合同审查任务创建时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 合同审查任务完成时间。
    */
    @SerializedName("FinishedOn")
    @Expose
    private Long FinishedOn;

    /**
    * 合同审查的审查立场方。

审查立场方如下：
<ul>
    <li>**0** - 【严格】以保护己方利益为核心，对合同条款进行严格把控，尽可能争取对己方有利的条款，同时对对方提出的不合理条款可进行坚决修改或删除。</li> 
    <li>**1** - 【中立】以公平合理为原则，平衡双方的权利义务，既不过分强调己方利益，也不过度让步，力求达成双方均可接受的条款。</li>   
    <li>**2** - 【宽松】以促成交易为核心，对合同条款的修改要求较为宽松，倾向于接受对方提出的条款，以尽快达成合作。</li>  
</ul>
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * 合同审查的PDF文件资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 合同审查识别出的PDF文件风险信息，如果是空数组表示无风险。

注意：`审查结果由AI生成，仅供参考。请结合相关法律法规和公司制度要求综合判断。`
    */
    @SerializedName("Risks")
    @Expose
    private OutputRisk [] Risks;

    /**
    * 合同审查中的角色信息。
    */
    @SerializedName("Role")
    @Expose
    private RiskIdentificationRoleInfo Role;

    /**
    * 合同审查任务状态。
状态如下：
<ul>
    <li>**1** - 合同审查任务创建成功</li>   
    <li>**2** - 合同审查任务排队中</li>  
    <li>**3** - 合同审查任务执行中</li>   
    <li>**4** - 合同审查任务执行成功</li>
    <li>**5** - 合同审查任务执行失败</li>
</ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 合同审查任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用于审查任务的审查清单ID。 
     * @return ChecklistId 用于审查任务的审查清单ID。
     */
    public String getChecklistId() {
        return this.ChecklistId;
    }

    /**
     * Set 用于审查任务的审查清单ID。
     * @param ChecklistId 用于审查任务的审查清单ID。
     */
    public void setChecklistId(String ChecklistId) {
        this.ChecklistId = ChecklistId;
    }

    /**
     * Get 合同审查任务创建时间。 
     * @return CreatedOn 合同审查任务创建时间。
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 合同审查任务创建时间。
     * @param CreatedOn 合同审查任务创建时间。
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 合同审查任务完成时间。 
     * @return FinishedOn 合同审查任务完成时间。
     */
    public Long getFinishedOn() {
        return this.FinishedOn;
    }

    /**
     * Set 合同审查任务完成时间。
     * @param FinishedOn 合同审查任务完成时间。
     */
    public void setFinishedOn(Long FinishedOn) {
        this.FinishedOn = FinishedOn;
    }

    /**
     * Get 合同审查的审查立场方。

审查立场方如下：
<ul>
    <li>**0** - 【严格】以保护己方利益为核心，对合同条款进行严格把控，尽可能争取对己方有利的条款，同时对对方提出的不合理条款可进行坚决修改或删除。</li> 
    <li>**1** - 【中立】以公平合理为原则，平衡双方的权利义务，既不过分强调己方利益，也不过度让步，力求达成双方均可接受的条款。</li>   
    <li>**2** - 【宽松】以促成交易为核心，对合同条款的修改要求较为宽松，倾向于接受对方提出的条款，以尽快达成合作。</li>  
</ul> 
     * @return PolicyType 合同审查的审查立场方。

审查立场方如下：
<ul>
    <li>**0** - 【严格】以保护己方利益为核心，对合同条款进行严格把控，尽可能争取对己方有利的条款，同时对对方提出的不合理条款可进行坚决修改或删除。</li> 
    <li>**1** - 【中立】以公平合理为原则，平衡双方的权利义务，既不过分强调己方利益，也不过度让步，力求达成双方均可接受的条款。</li>   
    <li>**2** - 【宽松】以促成交易为核心，对合同条款的修改要求较为宽松，倾向于接受对方提出的条款，以尽快达成合作。</li>  
</ul>
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 合同审查的审查立场方。

审查立场方如下：
<ul>
    <li>**0** - 【严格】以保护己方利益为核心，对合同条款进行严格把控，尽可能争取对己方有利的条款，同时对对方提出的不合理条款可进行坚决修改或删除。</li> 
    <li>**1** - 【中立】以公平合理为原则，平衡双方的权利义务，既不过分强调己方利益，也不过度让步，力求达成双方均可接受的条款。</li>   
    <li>**2** - 【宽松】以促成交易为核心，对合同条款的修改要求较为宽松，倾向于接受对方提出的条款，以尽快达成合作。</li>  
</ul>
     * @param PolicyType 合同审查的审查立场方。

审查立场方如下：
<ul>
    <li>**0** - 【严格】以保护己方利益为核心，对合同条款进行严格把控，尽可能争取对己方有利的条款，同时对对方提出的不合理条款可进行坚决修改或删除。</li> 
    <li>**1** - 【中立】以公平合理为原则，平衡双方的权利义务，既不过分强调己方利益，也不过度让步，力求达成双方均可接受的条款。</li>   
    <li>**2** - 【宽松】以促成交易为核心，对合同条款的修改要求较为宽松，倾向于接受对方提出的条款，以尽快达成合作。</li>  
</ul>
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 合同审查的PDF文件资源ID。 
     * @return ResourceId 合同审查的PDF文件资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 合同审查的PDF文件资源ID。
     * @param ResourceId 合同审查的PDF文件资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 合同审查识别出的PDF文件风险信息，如果是空数组表示无风险。

注意：`审查结果由AI生成，仅供参考。请结合相关法律法规和公司制度要求综合判断。` 
     * @return Risks 合同审查识别出的PDF文件风险信息，如果是空数组表示无风险。

注意：`审查结果由AI生成，仅供参考。请结合相关法律法规和公司制度要求综合判断。`
     */
    public OutputRisk [] getRisks() {
        return this.Risks;
    }

    /**
     * Set 合同审查识别出的PDF文件风险信息，如果是空数组表示无风险。

注意：`审查结果由AI生成，仅供参考。请结合相关法律法规和公司制度要求综合判断。`
     * @param Risks 合同审查识别出的PDF文件风险信息，如果是空数组表示无风险。

注意：`审查结果由AI生成，仅供参考。请结合相关法律法规和公司制度要求综合判断。`
     */
    public void setRisks(OutputRisk [] Risks) {
        this.Risks = Risks;
    }

    /**
     * Get 合同审查中的角色信息。 
     * @return Role 合同审查中的角色信息。
     */
    public RiskIdentificationRoleInfo getRole() {
        return this.Role;
    }

    /**
     * Set 合同审查中的角色信息。
     * @param Role 合同审查中的角色信息。
     */
    public void setRole(RiskIdentificationRoleInfo Role) {
        this.Role = Role;
    }

    /**
     * Get 合同审查任务状态。
状态如下：
<ul>
    <li>**1** - 合同审查任务创建成功</li>   
    <li>**2** - 合同审查任务排队中</li>  
    <li>**3** - 合同审查任务执行中</li>   
    <li>**4** - 合同审查任务执行成功</li>
    <li>**5** - 合同审查任务执行失败</li>
</ul> 
     * @return Status 合同审查任务状态。
状态如下：
<ul>
    <li>**1** - 合同审查任务创建成功</li>   
    <li>**2** - 合同审查任务排队中</li>  
    <li>**3** - 合同审查任务执行中</li>   
    <li>**4** - 合同审查任务执行成功</li>
    <li>**5** - 合同审查任务执行失败</li>
</ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 合同审查任务状态。
状态如下：
<ul>
    <li>**1** - 合同审查任务创建成功</li>   
    <li>**2** - 合同审查任务排队中</li>  
    <li>**3** - 合同审查任务执行中</li>   
    <li>**4** - 合同审查任务执行成功</li>
    <li>**5** - 合同审查任务执行失败</li>
</ul>
     * @param Status 合同审查任务状态。
状态如下：
<ul>
    <li>**1** - 合同审查任务创建成功</li>   
    <li>**2** - 合同审查任务排队中</li>  
    <li>**3** - 合同审查任务执行中</li>   
    <li>**4** - 合同审查任务执行成功</li>
    <li>**5** - 合同审查任务执行失败</li>
</ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 合同审查任务ID 
     * @return TaskId 合同审查任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 合同审查任务ID
     * @param TaskId 合同审查任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public DescribeContractReviewTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContractReviewTaskResponse(DescribeContractReviewTaskResponse source) {
        if (source.ChecklistId != null) {
            this.ChecklistId = new String(source.ChecklistId);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.FinishedOn != null) {
            this.FinishedOn = new Long(source.FinishedOn);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Risks != null) {
            this.Risks = new OutputRisk[source.Risks.length];
            for (int i = 0; i < source.Risks.length; i++) {
                this.Risks[i] = new OutputRisk(source.Risks[i]);
            }
        }
        if (source.Role != null) {
            this.Role = new RiskIdentificationRoleInfo(source.Role);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChecklistId", this.ChecklistId);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "FinishedOn", this.FinishedOn);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "Risks.", this.Risks);
        this.setParamObj(map, prefix + "Role.", this.Role);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

