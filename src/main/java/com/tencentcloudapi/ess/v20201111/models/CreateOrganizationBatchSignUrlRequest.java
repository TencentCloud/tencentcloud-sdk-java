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

public class CreateOrganizationBatchSignUrlRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。使用此接口时，必须填写userId。
支持填入集团子公司经办人 userId 代发合同。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 请指定需执行批量签署的流程ID，数量范围为1-100。您可登录腾讯电子签控制台，浏览 "合同"->"合同中心" 以查阅某一合同的FlowId（在页面中显示为合同ID）。用户将利用链接对这些合同实施批量操作。  注：生成动态签署方领取时此参数必传。 
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 员工在腾讯电子签平台的独特身份标识，为32位字符串。
您可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查阅某位员工的UserId（在页面中显示为用户ID）。
UserId必须是传入合同（FlowId）中的签署人。

<ul>
<li>1. 若UserId为空，Name和Mobile 必须提供。</li>
<li>2. 若UserId 与 Name，Mobile均存在，将优先采用UserId对应的员工。</li>
</ul>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 员工姓名，必须与手机号码一起使用。
如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 员工手机号，必须与姓名一起使用。
 如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。您可以通过查询合同接口（DescribeFlowInfo）查询此参数。若传了此参数，则可以不传 UserId, Name, Mobile等参数  注：生成动态签署方领取时此参数必传。
    */
    @SerializedName("RecipientIds")
    @Expose
    private String [] RecipientIds;

    /**
    * 合同组Id，传入此参数则可以不传FlowIds
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>注：`当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。`
    */
    @SerializedName("CanBatchReject")
    @Expose
    private Boolean CanBatchReject;

    /**
    * 动态签署方领取链接配置。
    */
    @SerializedName("DynamicSignOption")
    @Expose
    private DynamicSignOption DynamicSignOption;

    /**
     * Get 执行本接口操作的员工信息。使用此接口时，必须填写userId。
支持填入集团子公司经办人 userId 代发合同。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。
支持填入集团子公司经办人 userId 代发合同。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。使用此接口时，必须填写userId。
支持填入集团子公司经办人 userId 代发合同。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。
支持填入集团子公司经办人 userId 代发合同。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 请指定需执行批量签署的流程ID，数量范围为1-100。您可登录腾讯电子签控制台，浏览 "合同"->"合同中心" 以查阅某一合同的FlowId（在页面中显示为合同ID）。用户将利用链接对这些合同实施批量操作。  注：生成动态签署方领取时此参数必传。  
     * @return FlowIds 请指定需执行批量签署的流程ID，数量范围为1-100。您可登录腾讯电子签控制台，浏览 "合同"->"合同中心" 以查阅某一合同的FlowId（在页面中显示为合同ID）。用户将利用链接对这些合同实施批量操作。  注：生成动态签署方领取时此参数必传。 
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 请指定需执行批量签署的流程ID，数量范围为1-100。您可登录腾讯电子签控制台，浏览 "合同"->"合同中心" 以查阅某一合同的FlowId（在页面中显示为合同ID）。用户将利用链接对这些合同实施批量操作。  注：生成动态签署方领取时此参数必传。 
     * @param FlowIds 请指定需执行批量签署的流程ID，数量范围为1-100。您可登录腾讯电子签控制台，浏览 "合同"->"合同中心" 以查阅某一合同的FlowId（在页面中显示为合同ID）。用户将利用链接对这些合同实施批量操作。  注：生成动态签署方领取时此参数必传。 
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
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
     * Get 员工在腾讯电子签平台的独特身份标识，为32位字符串。
您可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查阅某位员工的UserId（在页面中显示为用户ID）。
UserId必须是传入合同（FlowId）中的签署人。

<ul>
<li>1. 若UserId为空，Name和Mobile 必须提供。</li>
<li>2. 若UserId 与 Name，Mobile均存在，将优先采用UserId对应的员工。</li>
</ul> 
     * @return UserId 员工在腾讯电子签平台的独特身份标识，为32位字符串。
您可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查阅某位员工的UserId（在页面中显示为用户ID）。
UserId必须是传入合同（FlowId）中的签署人。

<ul>
<li>1. 若UserId为空，Name和Mobile 必须提供。</li>
<li>2. 若UserId 与 Name，Mobile均存在，将优先采用UserId对应的员工。</li>
</ul>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 员工在腾讯电子签平台的独特身份标识，为32位字符串。
您可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查阅某位员工的UserId（在页面中显示为用户ID）。
UserId必须是传入合同（FlowId）中的签署人。

<ul>
<li>1. 若UserId为空，Name和Mobile 必须提供。</li>
<li>2. 若UserId 与 Name，Mobile均存在，将优先采用UserId对应的员工。</li>
</ul>
     * @param UserId 员工在腾讯电子签平台的独特身份标识，为32位字符串。
您可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查阅某位员工的UserId（在页面中显示为用户ID）。
UserId必须是传入合同（FlowId）中的签署人。

<ul>
<li>1. 若UserId为空，Name和Mobile 必须提供。</li>
<li>2. 若UserId 与 Name，Mobile均存在，将优先采用UserId对应的员工。</li>
</ul>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 员工姓名，必须与手机号码一起使用。
如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。 
     * @return Name 员工姓名，必须与手机号码一起使用。
如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 员工姓名，必须与手机号码一起使用。
如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。
     * @param Name 员工姓名，必须与手机号码一起使用。
如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 员工手机号，必须与姓名一起使用。
 如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。 
     * @return Mobile 员工手机号，必须与姓名一起使用。
 如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 员工手机号，必须与姓名一起使用。
 如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。
     * @param Mobile 员工手机号，必须与姓名一起使用。
 如果UserId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。您可以通过查询合同接口（DescribeFlowInfo）查询此参数。若传了此参数，则可以不传 UserId, Name, Mobile等参数  注：生成动态签署方领取时此参数必传。 
     * @return RecipientIds 为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。您可以通过查询合同接口（DescribeFlowInfo）查询此参数。若传了此参数，则可以不传 UserId, Name, Mobile等参数  注：生成动态签署方领取时此参数必传。
     */
    public String [] getRecipientIds() {
        return this.RecipientIds;
    }

    /**
     * Set 为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。您可以通过查询合同接口（DescribeFlowInfo）查询此参数。若传了此参数，则可以不传 UserId, Name, Mobile等参数  注：生成动态签署方领取时此参数必传。
     * @param RecipientIds 为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。您可以通过查询合同接口（DescribeFlowInfo）查询此参数。若传了此参数，则可以不传 UserId, Name, Mobile等参数  注：生成动态签署方领取时此参数必传。
     */
    public void setRecipientIds(String [] RecipientIds) {
        this.RecipientIds = RecipientIds;
    }

    /**
     * Get 合同组Id，传入此参数则可以不传FlowIds 
     * @return FlowGroupId 合同组Id，传入此参数则可以不传FlowIds
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同组Id，传入此参数则可以不传FlowIds
     * @param FlowGroupId 合同组Id，传入此参数则可以不传FlowIds
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>注：`当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。` 
     * @return CanBatchReject 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>注：`当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。`
     */
    public Boolean getCanBatchReject() {
        return this.CanBatchReject;
    }

    /**
     * Set 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>注：`当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。`
     * @param CanBatchReject 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>注：`当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。`
     */
    public void setCanBatchReject(Boolean CanBatchReject) {
        this.CanBatchReject = CanBatchReject;
    }

    /**
     * Get 动态签署方领取链接配置。 
     * @return DynamicSignOption 动态签署方领取链接配置。
     */
    public DynamicSignOption getDynamicSignOption() {
        return this.DynamicSignOption;
    }

    /**
     * Set 动态签署方领取链接配置。
     * @param DynamicSignOption 动态签署方领取链接配置。
     */
    public void setDynamicSignOption(DynamicSignOption DynamicSignOption) {
        this.DynamicSignOption = DynamicSignOption;
    }

    public CreateOrganizationBatchSignUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationBatchSignUrlRequest(CreateOrganizationBatchSignUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.RecipientIds != null) {
            this.RecipientIds = new String[source.RecipientIds.length];
            for (int i = 0; i < source.RecipientIds.length; i++) {
                this.RecipientIds[i] = new String(source.RecipientIds[i]);
            }
        }
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.CanBatchReject != null) {
            this.CanBatchReject = new Boolean(source.CanBatchReject);
        }
        if (source.DynamicSignOption != null) {
            this.DynamicSignOption = new DynamicSignOption(source.DynamicSignOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamArraySimple(map, prefix + "RecipientIds.", this.RecipientIds);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamSimple(map, prefix + "CanBatchReject", this.CanBatchReject);
        this.setParamObj(map, prefix + "DynamicSignOption.", this.DynamicSignOption);

    }
}

