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

public class CreateBatchContractReviewTaskRequest extends AbstractModel {

    /**
    * 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同审查的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。 

注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下，文件必须是PDF格式`
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 合同审查的审查尺度。默认为`0`严格尺度

审查尺度如下：
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
    * 合同审查中的角色信息，通过明确入参角色的名称和描述，可以提高合同审查的效率和准确性。用户不做配置时大模型会根据合同内容推荐出风险识别角色的名称和描述信息。
    */
    @SerializedName("Role")
    @Expose
    private RiskIdentificationRoleInfo Role;

    /**
    * 用户配置的审查清单ID，基于此清单ID批量创建合同审查任务，为32位字符串。
[点击查看审查清单ID在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/2c6588549e28ca49bd8bb7f4a072b19e.png)。如果用户不做此配置大模型会根据合同内容在当前企业下的审查清单和系统默认的清单中选择一个清单进行审查。
    */
    @SerializedName("ChecklistId")
    @Expose
    private String ChecklistId;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 备注信息，长度不能超过100个字符
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
    * 启用附加通用风险审查清单。默认为启用状态
可选值如下：

- 1: 启用系统提供的附加通用风险审查清单
- 2:不启用系统提供的附加通用风险审查清单
    */
    @SerializedName("EnableGeneralChecklist")
    @Expose
    private Long EnableGeneralChecklist;

    /**
     * Get 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同审查的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。 

注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下，文件必须是PDF格式` 
     * @return ResourceIds 合同审查的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。 

注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下，文件必须是PDF格式`
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 合同审查的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。 

注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下，文件必须是PDF格式`
     * @param ResourceIds 合同审查的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。 

注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下，文件必须是PDF格式`
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 合同审查的审查尺度。默认为`0`严格尺度

审查尺度如下：
<ul>
    <li>**0** - 【严格】以保护己方利益为核心，对合同条款进行严格把控，尽可能争取对己方有利的条款，同时对对方提出的不合理条款可进行坚决修改或删除。</li> 
    <li>**1** - 【中立】以公平合理为原则，平衡双方的权利义务，既不过分强调己方利益，也不过度让步，力求达成双方均可接受的条款。</li>   
    <li>**2** - 【宽松】以促成交易为核心，对合同条款的修改要求较为宽松，倾向于接受对方提出的条款，以尽快达成合作。</li>  
</ul> 
     * @return PolicyType 合同审查的审查尺度。默认为`0`严格尺度

审查尺度如下：
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
     * Set 合同审查的审查尺度。默认为`0`严格尺度

审查尺度如下：
<ul>
    <li>**0** - 【严格】以保护己方利益为核心，对合同条款进行严格把控，尽可能争取对己方有利的条款，同时对对方提出的不合理条款可进行坚决修改或删除。</li> 
    <li>**1** - 【中立】以公平合理为原则，平衡双方的权利义务，既不过分强调己方利益，也不过度让步，力求达成双方均可接受的条款。</li>   
    <li>**2** - 【宽松】以促成交易为核心，对合同条款的修改要求较为宽松，倾向于接受对方提出的条款，以尽快达成合作。</li>  
</ul>
     * @param PolicyType 合同审查的审查尺度。默认为`0`严格尺度

审查尺度如下：
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
     * Get 合同审查中的角色信息，通过明确入参角色的名称和描述，可以提高合同审查的效率和准确性。用户不做配置时大模型会根据合同内容推荐出风险识别角色的名称和描述信息。 
     * @return Role 合同审查中的角色信息，通过明确入参角色的名称和描述，可以提高合同审查的效率和准确性。用户不做配置时大模型会根据合同内容推荐出风险识别角色的名称和描述信息。
     */
    public RiskIdentificationRoleInfo getRole() {
        return this.Role;
    }

    /**
     * Set 合同审查中的角色信息，通过明确入参角色的名称和描述，可以提高合同审查的效率和准确性。用户不做配置时大模型会根据合同内容推荐出风险识别角色的名称和描述信息。
     * @param Role 合同审查中的角色信息，通过明确入参角色的名称和描述，可以提高合同审查的效率和准确性。用户不做配置时大模型会根据合同内容推荐出风险识别角色的名称和描述信息。
     */
    public void setRole(RiskIdentificationRoleInfo Role) {
        this.Role = Role;
    }

    /**
     * Get 用户配置的审查清单ID，基于此清单ID批量创建合同审查任务，为32位字符串。
[点击查看审查清单ID在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/2c6588549e28ca49bd8bb7f4a072b19e.png)。如果用户不做此配置大模型会根据合同内容在当前企业下的审查清单和系统默认的清单中选择一个清单进行审查。 
     * @return ChecklistId 用户配置的审查清单ID，基于此清单ID批量创建合同审查任务，为32位字符串。
[点击查看审查清单ID在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/2c6588549e28ca49bd8bb7f4a072b19e.png)。如果用户不做此配置大模型会根据合同内容在当前企业下的审查清单和系统默认的清单中选择一个清单进行审查。
     */
    public String getChecklistId() {
        return this.ChecklistId;
    }

    /**
     * Set 用户配置的审查清单ID，基于此清单ID批量创建合同审查任务，为32位字符串。
[点击查看审查清单ID在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/2c6588549e28ca49bd8bb7f4a072b19e.png)。如果用户不做此配置大模型会根据合同内容在当前企业下的审查清单和系统默认的清单中选择一个清单进行审查。
     * @param ChecklistId 用户配置的审查清单ID，基于此清单ID批量创建合同审查任务，为32位字符串。
[点击查看审查清单ID在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/2c6588549e28ca49bd8bb7f4a072b19e.png)。如果用户不做此配置大模型会根据合同内容在当前企业下的审查清单和系统默认的清单中选择一个清单进行审查。
     */
    public void setChecklistId(String ChecklistId) {
        this.ChecklistId = ChecklistId;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 备注信息，长度不能超过100个字符 
     * @return Comment 备注信息，长度不能超过100个字符
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注信息，长度不能超过100个字符
     * @param Comment 备注信息，长度不能超过100个字符
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
     * Get 启用附加通用风险审查清单。默认为启用状态
可选值如下：

- 1: 启用系统提供的附加通用风险审查清单
- 2:不启用系统提供的附加通用风险审查清单 
     * @return EnableGeneralChecklist 启用附加通用风险审查清单。默认为启用状态
可选值如下：

- 1: 启用系统提供的附加通用风险审查清单
- 2:不启用系统提供的附加通用风险审查清单
     */
    public Long getEnableGeneralChecklist() {
        return this.EnableGeneralChecklist;
    }

    /**
     * Set 启用附加通用风险审查清单。默认为启用状态
可选值如下：

- 1: 启用系统提供的附加通用风险审查清单
- 2:不启用系统提供的附加通用风险审查清单
     * @param EnableGeneralChecklist 启用附加通用风险审查清单。默认为启用状态
可选值如下：

- 1: 启用系统提供的附加通用风险审查清单
- 2:不启用系统提供的附加通用风险审查清单
     */
    public void setEnableGeneralChecklist(Long EnableGeneralChecklist) {
        this.EnableGeneralChecklist = EnableGeneralChecklist;
    }

    public CreateBatchContractReviewTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchContractReviewTaskRequest(CreateBatchContractReviewTaskRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.Role != null) {
            this.Role = new RiskIdentificationRoleInfo(source.Role);
        }
        if (source.ChecklistId != null) {
            this.ChecklistId = new String(source.ChecklistId);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.EnableGeneralChecklist != null) {
            this.EnableGeneralChecklist = new Long(source.EnableGeneralChecklist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamObj(map, prefix + "Role.", this.Role);
        this.setParamSimple(map, prefix + "ChecklistId", this.ChecklistId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "EnableGeneralChecklist", this.EnableGeneralChecklist);

    }
}

