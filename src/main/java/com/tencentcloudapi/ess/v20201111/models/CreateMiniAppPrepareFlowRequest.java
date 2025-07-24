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

public class CreateMiniAppPrepareFlowRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。使用此接口时，必须填写userId。
支持填入集团子公司经办人 userId 代发合同。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 资源类型，取值有：
<ul><li> **1**：模板</li>
<li> **2**：文件 </li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源id，与ResourceType相对应，取值范围：
<ul>
<li>文件Id（通过UploadFiles获取文件资源Id）</li>
<li>模板Id（通过控制台创建模板后获取模板Id）</li>
</ul>
注意：需要同时设置 ResourceType 参数指定资源类型
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&)、（+）组成。

该名称还将用于合同签署完成后文件下载的默认文件名称。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息。
    */
    @SerializedName("Approvers")
    @Expose
    private MiniAppCreateApproverInfo [] Approvers;

    /**
    * 合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。

**注：暂不支持通过NotifyType参数控制抄送人通知方式**
    */
    @SerializedName("CcInfos")
    @Expose
    private CcInfo [] CcInfos;

    /**
    * 合同流程的签署顺序类型：
<ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li>
<li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul>

**注：仅在文件发起模式下设置有效，模板发起以模板配置为准**
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 合同发起后经过多少天截止（1-30天可选），默认7天
    */
    @SerializedName("DeadlineAfterStartDays")
    @Expose
    private Long DeadlineAfterStartDays;

    /**
    * 用户自定义合同类型Id  该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取
    */
    @SerializedName("UserFlowTypeId")
    @Expose
    private String UserFlowTypeId;

    /**
    * 发起合同个性化参数
用于满足小程序合同创建的个性化要求
具体定制化内容详见数据接口说明
    */
    @SerializedName("FlowOption")
    @Expose
    private MiniAppCreateFlowOption FlowOption;

    /**
    * 发起合同小程序页面个性化参数 
用于满足小程序合同创建页面的个性化要求 具体定制化内容详见数据接口说明
    */
    @SerializedName("PageOption")
    @Expose
    private MiniAppCreateFlowPageOption PageOption;

    /**
    * 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1000 长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

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
     * Get 资源类型，取值有：
<ul><li> **1**：模板</li>
<li> **2**：文件 </li></ul> 
     * @return ResourceType 资源类型，取值有：
<ul><li> **1**：模板</li>
<li> **2**：文件 </li></ul>
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，取值有：
<ul><li> **1**：模板</li>
<li> **2**：文件 </li></ul>
     * @param ResourceType 资源类型，取值有：
<ul><li> **1**：模板</li>
<li> **2**：文件 </li></ul>
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源id，与ResourceType相对应，取值范围：
<ul>
<li>文件Id（通过UploadFiles获取文件资源Id）</li>
<li>模板Id（通过控制台创建模板后获取模板Id）</li>
</ul>
注意：需要同时设置 ResourceType 参数指定资源类型 
     * @return ResourceId 资源id，与ResourceType相对应，取值范围：
<ul>
<li>文件Id（通过UploadFiles获取文件资源Id）</li>
<li>模板Id（通过控制台创建模板后获取模板Id）</li>
</ul>
注意：需要同时设置 ResourceType 参数指定资源类型
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id，与ResourceType相对应，取值范围：
<ul>
<li>文件Id（通过UploadFiles获取文件资源Id）</li>
<li>模板Id（通过控制台创建模板后获取模板Id）</li>
</ul>
注意：需要同时设置 ResourceType 参数指定资源类型
     * @param ResourceId 资源id，与ResourceType相对应，取值范围：
<ul>
<li>文件Id（通过UploadFiles获取文件资源Id）</li>
<li>模板Id（通过控制台创建模板后获取模板Id）</li>
</ul>
注意：需要同时设置 ResourceType 参数指定资源类型
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&)、（+）组成。

该名称还将用于合同签署完成后文件下载的默认文件名称。 
     * @return FlowName 自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&)、（+）组成。

该名称还将用于合同签署完成后文件下载的默认文件名称。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&)、（+）组成。

该名称还将用于合同签署完成后文件下载的默认文件名称。
     * @param FlowName 自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&)、（+）组成。

该名称还将用于合同签署完成后文件下载的默认文件名称。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
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
     * Get 合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息。 
     * @return Approvers 合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息。
     */
    public MiniAppCreateApproverInfo [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息。
     * @param Approvers 合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息。
     */
    public void setApprovers(MiniAppCreateApproverInfo [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。

**注：暂不支持通过NotifyType参数控制抄送人通知方式** 
     * @return CcInfos 合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。

**注：暂不支持通过NotifyType参数控制抄送人通知方式**
     */
    public CcInfo [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set 合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。

**注：暂不支持通过NotifyType参数控制抄送人通知方式**
     * @param CcInfos 合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。

**注：暂不支持通过NotifyType参数控制抄送人通知方式**
     */
    public void setCcInfos(CcInfo [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get 合同流程的签署顺序类型：
<ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li>
<li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul>

**注：仅在文件发起模式下设置有效，模板发起以模板配置为准** 
     * @return Unordered 合同流程的签署顺序类型：
<ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li>
<li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul>

**注：仅在文件发起模式下设置有效，模板发起以模板配置为准**
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 合同流程的签署顺序类型：
<ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li>
<li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul>

**注：仅在文件发起模式下设置有效，模板发起以模板配置为准**
     * @param Unordered 合同流程的签署顺序类型：
<ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li>
<li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul>

**注：仅在文件发起模式下设置有效，模板发起以模板配置为准**
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 合同发起后经过多少天截止（1-30天可选），默认7天 
     * @return DeadlineAfterStartDays 合同发起后经过多少天截止（1-30天可选），默认7天
     */
    public Long getDeadlineAfterStartDays() {
        return this.DeadlineAfterStartDays;
    }

    /**
     * Set 合同发起后经过多少天截止（1-30天可选），默认7天
     * @param DeadlineAfterStartDays 合同发起后经过多少天截止（1-30天可选），默认7天
     */
    public void setDeadlineAfterStartDays(Long DeadlineAfterStartDays) {
        this.DeadlineAfterStartDays = DeadlineAfterStartDays;
    }

    /**
     * Get 用户自定义合同类型Id  该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取 
     * @return UserFlowTypeId 用户自定义合同类型Id  该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取
     */
    public String getUserFlowTypeId() {
        return this.UserFlowTypeId;
    }

    /**
     * Set 用户自定义合同类型Id  该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取
     * @param UserFlowTypeId 用户自定义合同类型Id  该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取
     */
    public void setUserFlowTypeId(String UserFlowTypeId) {
        this.UserFlowTypeId = UserFlowTypeId;
    }

    /**
     * Get 发起合同个性化参数
用于满足小程序合同创建的个性化要求
具体定制化内容详见数据接口说明 
     * @return FlowOption 发起合同个性化参数
用于满足小程序合同创建的个性化要求
具体定制化内容详见数据接口说明
     */
    public MiniAppCreateFlowOption getFlowOption() {
        return this.FlowOption;
    }

    /**
     * Set 发起合同个性化参数
用于满足小程序合同创建的个性化要求
具体定制化内容详见数据接口说明
     * @param FlowOption 发起合同个性化参数
用于满足小程序合同创建的个性化要求
具体定制化内容详见数据接口说明
     */
    public void setFlowOption(MiniAppCreateFlowOption FlowOption) {
        this.FlowOption = FlowOption;
    }

    /**
     * Get 发起合同小程序页面个性化参数 
用于满足小程序合同创建页面的个性化要求 具体定制化内容详见数据接口说明 
     * @return PageOption 发起合同小程序页面个性化参数 
用于满足小程序合同创建页面的个性化要求 具体定制化内容详见数据接口说明
     */
    public MiniAppCreateFlowPageOption getPageOption() {
        return this.PageOption;
    }

    /**
     * Set 发起合同小程序页面个性化参数 
用于满足小程序合同创建页面的个性化要求 具体定制化内容详见数据接口说明
     * @param PageOption 发起合同小程序页面个性化参数 
用于满足小程序合同创建页面的个性化要求 具体定制化内容详见数据接口说明
     */
    public void setPageOption(MiniAppCreateFlowPageOption PageOption) {
        this.PageOption = PageOption;
    }

    /**
     * Get 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1000 长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。 
     * @return UserData 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1000 长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1000 长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。
     * @param UserData 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1000 长度。

在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    public CreateMiniAppPrepareFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMiniAppPrepareFlowRequest(CreateMiniAppPrepareFlowRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Approvers != null) {
            this.Approvers = new MiniAppCreateApproverInfo[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new MiniAppCreateApproverInfo(source.Approvers[i]);
            }
        }
        if (source.CcInfos != null) {
            this.CcInfos = new CcInfo[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new CcInfo(source.CcInfos[i]);
            }
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.DeadlineAfterStartDays != null) {
            this.DeadlineAfterStartDays = new Long(source.DeadlineAfterStartDays);
        }
        if (source.UserFlowTypeId != null) {
            this.UserFlowTypeId = new String(source.UserFlowTypeId);
        }
        if (source.FlowOption != null) {
            this.FlowOption = new MiniAppCreateFlowOption(source.FlowOption);
        }
        if (source.PageOption != null) {
            this.PageOption = new MiniAppCreateFlowPageOption(source.PageOption);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "DeadlineAfterStartDays", this.DeadlineAfterStartDays);
        this.setParamSimple(map, prefix + "UserFlowTypeId", this.UserFlowTypeId);
        this.setParamObj(map, prefix + "FlowOption.", this.FlowOption);
        this.setParamObj(map, prefix + "PageOption.", this.PageOption);
        this.setParamSimple(map, prefix + "UserData", this.UserData);

    }
}

