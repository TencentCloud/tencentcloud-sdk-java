/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrepareFlowRequest extends AbstractModel{

    /**
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 资源Id，通过多文件上传（UploadFiles）接口获得
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 合同名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 是否顺序签署
true:无序签
false:顺序签
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 签署流程的签署截止时间。
值为unix时间戳,精确到秒
不传默认为当前时间一年后
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 用户自定义合同类型Id
该id为电子签企业内的合同类型id
    */
    @SerializedName("UserFlowTypeId")
    @Expose
    private String UserFlowTypeId;

    /**
    * 签署流程参与者信息，最大限制50方
    */
    @SerializedName("Approvers")
    @Expose
    private FlowCreateApprover [] Approvers;

    /**
    * 打开智能添加填写区
(默认开启，打开:"OPEN"
 关闭："CLOSE"
    */
    @SerializedName("IntelligentStatus")
    @Expose
    private String IntelligentStatus;

    /**
    * 资源类型，
1：文件，
2：模板
不传默认为1：文件
目前仅支持文件
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 发起方填写控件
该类型控件由发起方完成填写
    */
    @SerializedName("Components")
    @Expose
    private Component Components;

    /**
    * 发起合同个性化参数
用于满足创建及页面操作过程中的个性化要求
具体定制化内容详见数据接口说明
    */
    @SerializedName("FlowOption")
    @Expose
    private CreateFlowOption FlowOption;

    /**
    * 是否开启发起方签署审核
true:开启发起方签署审核
false:不开启发起方签署审核
默认false:不开启发起方签署审核
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
    * 开启发起方发起合同审核
true:开启发起方发起合同审核
false:不开启发起方发起合同审核
默认false:不开启发起方发起合同审核
    */
    @SerializedName("NeedCreateReview")
    @Expose
    private Boolean NeedCreateReview;

    /**
    * 用户自定义参数
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 合同id,用于通过已web页面发起的合同id快速生成一个web发起合同链接
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同类型名称
该字段用于客户自定义合同类型
建议使用时指定合同类型，便于之后合同分类以及查看
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填	
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 资源Id，通过多文件上传（UploadFiles）接口获得 
     * @return ResourceId 资源Id，通过多文件上传（UploadFiles）接口获得
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id，通过多文件上传（UploadFiles）接口获得
     * @param ResourceId 资源Id，通过多文件上传（UploadFiles）接口获得
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 合同名称 
     * @return FlowName 合同名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同名称
     * @param FlowName 合同名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 是否顺序签署
true:无序签
false:顺序签 
     * @return Unordered 是否顺序签署
true:无序签
false:顺序签
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 是否顺序签署
true:无序签
false:顺序签
     * @param Unordered 是否顺序签署
true:无序签
false:顺序签
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 签署流程的签署截止时间。
值为unix时间戳,精确到秒
不传默认为当前时间一年后 
     * @return Deadline 签署流程的签署截止时间。
值为unix时间戳,精确到秒
不传默认为当前时间一年后
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署流程的签署截止时间。
值为unix时间戳,精确到秒
不传默认为当前时间一年后
     * @param Deadline 签署流程的签署截止时间。
值为unix时间戳,精确到秒
不传默认为当前时间一年后
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 用户自定义合同类型Id
该id为电子签企业内的合同类型id 
     * @return UserFlowTypeId 用户自定义合同类型Id
该id为电子签企业内的合同类型id
     */
    public String getUserFlowTypeId() {
        return this.UserFlowTypeId;
    }

    /**
     * Set 用户自定义合同类型Id
该id为电子签企业内的合同类型id
     * @param UserFlowTypeId 用户自定义合同类型Id
该id为电子签企业内的合同类型id
     */
    public void setUserFlowTypeId(String UserFlowTypeId) {
        this.UserFlowTypeId = UserFlowTypeId;
    }

    /**
     * Get 签署流程参与者信息，最大限制50方 
     * @return Approvers 签署流程参与者信息，最大限制50方
     */
    public FlowCreateApprover [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 签署流程参与者信息，最大限制50方
     * @param Approvers 签署流程参与者信息，最大限制50方
     */
    public void setApprovers(FlowCreateApprover [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 打开智能添加填写区
(默认开启，打开:"OPEN"
 关闭："CLOSE" 
     * @return IntelligentStatus 打开智能添加填写区
(默认开启，打开:"OPEN"
 关闭："CLOSE"
     */
    public String getIntelligentStatus() {
        return this.IntelligentStatus;
    }

    /**
     * Set 打开智能添加填写区
(默认开启，打开:"OPEN"
 关闭："CLOSE"
     * @param IntelligentStatus 打开智能添加填写区
(默认开启，打开:"OPEN"
 关闭："CLOSE"
     */
    public void setIntelligentStatus(String IntelligentStatus) {
        this.IntelligentStatus = IntelligentStatus;
    }

    /**
     * Get 资源类型，
1：文件，
2：模板
不传默认为1：文件
目前仅支持文件 
     * @return ResourceType 资源类型，
1：文件，
2：模板
不传默认为1：文件
目前仅支持文件
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，
1：文件，
2：模板
不传默认为1：文件
目前仅支持文件
     * @param ResourceType 资源类型，
1：文件，
2：模板
不传默认为1：文件
目前仅支持文件
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 发起方填写控件
该类型控件由发起方完成填写 
     * @return Components 发起方填写控件
该类型控件由发起方完成填写
     */
    public Component getComponents() {
        return this.Components;
    }

    /**
     * Set 发起方填写控件
该类型控件由发起方完成填写
     * @param Components 发起方填写控件
该类型控件由发起方完成填写
     */
    public void setComponents(Component Components) {
        this.Components = Components;
    }

    /**
     * Get 发起合同个性化参数
用于满足创建及页面操作过程中的个性化要求
具体定制化内容详见数据接口说明 
     * @return FlowOption 发起合同个性化参数
用于满足创建及页面操作过程中的个性化要求
具体定制化内容详见数据接口说明
     */
    public CreateFlowOption getFlowOption() {
        return this.FlowOption;
    }

    /**
     * Set 发起合同个性化参数
用于满足创建及页面操作过程中的个性化要求
具体定制化内容详见数据接口说明
     * @param FlowOption 发起合同个性化参数
用于满足创建及页面操作过程中的个性化要求
具体定制化内容详见数据接口说明
     */
    public void setFlowOption(CreateFlowOption FlowOption) {
        this.FlowOption = FlowOption;
    }

    /**
     * Get 是否开启发起方签署审核
true:开启发起方签署审核
false:不开启发起方签署审核
默认false:不开启发起方签署审核 
     * @return NeedSignReview 是否开启发起方签署审核
true:开启发起方签署审核
false:不开启发起方签署审核
默认false:不开启发起方签署审核
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set 是否开启发起方签署审核
true:开启发起方签署审核
false:不开启发起方签署审核
默认false:不开启发起方签署审核
     * @param NeedSignReview 是否开启发起方签署审核
true:开启发起方签署审核
false:不开启发起方签署审核
默认false:不开启发起方签署审核
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    /**
     * Get 开启发起方发起合同审核
true:开启发起方发起合同审核
false:不开启发起方发起合同审核
默认false:不开启发起方发起合同审核 
     * @return NeedCreateReview 开启发起方发起合同审核
true:开启发起方发起合同审核
false:不开启发起方发起合同审核
默认false:不开启发起方发起合同审核
     */
    public Boolean getNeedCreateReview() {
        return this.NeedCreateReview;
    }

    /**
     * Set 开启发起方发起合同审核
true:开启发起方发起合同审核
false:不开启发起方发起合同审核
默认false:不开启发起方发起合同审核
     * @param NeedCreateReview 开启发起方发起合同审核
true:开启发起方发起合同审核
false:不开启发起方发起合同审核
默认false:不开启发起方发起合同审核
     */
    public void setNeedCreateReview(Boolean NeedCreateReview) {
        this.NeedCreateReview = NeedCreateReview;
    }

    /**
     * Get 用户自定义参数 
     * @return UserData 用户自定义参数
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 用户自定义参数
     * @param UserData 用户自定义参数
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 合同id,用于通过已web页面发起的合同id快速生成一个web发起合同链接 
     * @return FlowId 合同id,用于通过已web页面发起的合同id快速生成一个web发起合同链接
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同id,用于通过已web页面发起的合同id快速生成一个web发起合同链接
     * @param FlowId 合同id,用于通过已web页面发起的合同id快速生成一个web发起合同链接
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 合同类型名称
该字段用于客户自定义合同类型
建议使用时指定合同类型，便于之后合同分类以及查看 
     * @return FlowType 合同类型名称
该字段用于客户自定义合同类型
建议使用时指定合同类型，便于之后合同分类以及查看
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同类型名称
该字段用于客户自定义合同类型
建议使用时指定合同类型，便于之后合同分类以及查看
     * @param FlowType 合同类型名称
该字段用于客户自定义合同类型
建议使用时指定合同类型，便于之后合同分类以及查看
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填	 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填	
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填	
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填	
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public CreatePrepareFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrepareFlowRequest(CreatePrepareFlowRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.UserFlowTypeId != null) {
            this.UserFlowTypeId = new String(source.UserFlowTypeId);
        }
        if (source.Approvers != null) {
            this.Approvers = new FlowCreateApprover[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new FlowCreateApprover(source.Approvers[i]);
            }
        }
        if (source.IntelligentStatus != null) {
            this.IntelligentStatus = new String(source.IntelligentStatus);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.Components != null) {
            this.Components = new Component(source.Components);
        }
        if (source.FlowOption != null) {
            this.FlowOption = new CreateFlowOption(source.FlowOption);
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
        if (source.NeedCreateReview != null) {
            this.NeedCreateReview = new Boolean(source.NeedCreateReview);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "UserFlowTypeId", this.UserFlowTypeId);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "IntelligentStatus", this.IntelligentStatus);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "Components.", this.Components);
        this.setParamObj(map, prefix + "FlowOption.", this.FlowOption);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);
        this.setParamSimple(map, prefix + "NeedCreateReview", this.NeedCreateReview);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

