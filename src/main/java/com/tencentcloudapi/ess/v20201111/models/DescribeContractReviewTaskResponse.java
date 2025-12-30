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
    * 用于审查任务的审查清单ID。注意：如果用户没有配置清单时此值可能为空，需要等大模型根据合同内容推荐出可以使用的审查清单。
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
    * 合同审查中的角色信息。注意： `如果用户没有配置审查角色时此值可能为null，需要等大模型根据合同内容推荐出审查角色信息。`
注意：此字段可能返回 null，表示取不到有效值。
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
    * 审查任务备注信息，长度不能超过100个字符
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 合同审查出的高风险项数量
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * 合同审查出的风险总数
    */
    @SerializedName("TotalRiskCount")
    @Expose
    private Long TotalRiskCount;

    /**
    * 通过项信息(详细引文信息)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApprovedLists")
    @Expose
    private OutputReference [] ApprovedLists;

    /**
    * 摘要信息
    */
    @SerializedName("Summaries")
    @Expose
    private ContractSummary [] Summaries;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用于审查任务的审查清单ID。注意：如果用户没有配置清单时此值可能为空，需要等大模型根据合同内容推荐出可以使用的审查清单。 
     * @return ChecklistId 用于审查任务的审查清单ID。注意：如果用户没有配置清单时此值可能为空，需要等大模型根据合同内容推荐出可以使用的审查清单。
     */
    public String getChecklistId() {
        return this.ChecklistId;
    }

    /**
     * Set 用于审查任务的审查清单ID。注意：如果用户没有配置清单时此值可能为空，需要等大模型根据合同内容推荐出可以使用的审查清单。
     * @param ChecklistId 用于审查任务的审查清单ID。注意：如果用户没有配置清单时此值可能为空，需要等大模型根据合同内容推荐出可以使用的审查清单。
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
     * Get 合同审查中的角色信息。注意： `如果用户没有配置审查角色时此值可能为null，需要等大模型根据合同内容推荐出审查角色信息。`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Role 合同审查中的角色信息。注意： `如果用户没有配置审查角色时此值可能为null，需要等大模型根据合同内容推荐出审查角色信息。`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskIdentificationRoleInfo getRole() {
        return this.Role;
    }

    /**
     * Set 合同审查中的角色信息。注意： `如果用户没有配置审查角色时此值可能为null，需要等大模型根据合同内容推荐出审查角色信息。`
注意：此字段可能返回 null，表示取不到有效值。
     * @param Role 合同审查中的角色信息。注意： `如果用户没有配置审查角色时此值可能为null，需要等大模型根据合同内容推荐出审查角色信息。`
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 审查任务备注信息，长度不能超过100个字符 
     * @return Comment 审查任务备注信息，长度不能超过100个字符
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 审查任务备注信息，长度不能超过100个字符
     * @param Comment 审查任务备注信息，长度不能超过100个字符
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。 
     * @return UserData 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。
     * @param UserData 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的[回调通知](https://qian.tencent.com/developers/company/callback_types_v2)模块。
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 合同审查出的高风险项数量 
     * @return HighRiskCount 合同审查出的高风险项数量
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set 合同审查出的高风险项数量
     * @param HighRiskCount 合同审查出的高风险项数量
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get 合同审查出的风险总数 
     * @return TotalRiskCount 合同审查出的风险总数
     */
    public Long getTotalRiskCount() {
        return this.TotalRiskCount;
    }

    /**
     * Set 合同审查出的风险总数
     * @param TotalRiskCount 合同审查出的风险总数
     */
    public void setTotalRiskCount(Long TotalRiskCount) {
        this.TotalRiskCount = TotalRiskCount;
    }

    /**
     * Get 通过项信息(详细引文信息)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApprovedLists 通过项信息(详细引文信息)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutputReference [] getApprovedLists() {
        return this.ApprovedLists;
    }

    /**
     * Set 通过项信息(详细引文信息)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApprovedLists 通过项信息(详细引文信息)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApprovedLists(OutputReference [] ApprovedLists) {
        this.ApprovedLists = ApprovedLists;
    }

    /**
     * Get 摘要信息 
     * @return Summaries 摘要信息
     */
    public ContractSummary [] getSummaries() {
        return this.Summaries;
    }

    /**
     * Set 摘要信息
     * @param Summaries 摘要信息
     */
    public void setSummaries(ContractSummary [] Summaries) {
        this.Summaries = Summaries;
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
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.TotalRiskCount != null) {
            this.TotalRiskCount = new Long(source.TotalRiskCount);
        }
        if (source.ApprovedLists != null) {
            this.ApprovedLists = new OutputReference[source.ApprovedLists.length];
            for (int i = 0; i < source.ApprovedLists.length; i++) {
                this.ApprovedLists[i] = new OutputReference(source.ApprovedLists[i]);
            }
        }
        if (source.Summaries != null) {
            this.Summaries = new ContractSummary[source.Summaries.length];
            for (int i = 0; i < source.Summaries.length; i++) {
                this.Summaries[i] = new ContractSummary(source.Summaries[i]);
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
        this.setParamSimple(map, prefix + "ChecklistId", this.ChecklistId);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "FinishedOn", this.FinishedOn);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "Risks.", this.Risks);
        this.setParamObj(map, prefix + "Role.", this.Role);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "TotalRiskCount", this.TotalRiskCount);
        this.setParamArrayObj(map, prefix + "ApprovedLists.", this.ApprovedLists);
        this.setParamArrayObj(map, prefix + "Summaries.", this.Summaries);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

