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

public class DescribeCancelFlowsTaskRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelBatchCancelFlows">批量撤销合同流程</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul>
    */
    @SerializedName("CancelType")
    @Expose
    private Long CancelType;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelBatchCancelFlows">批量撤销合同流程</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p> 
     * @return TaskId <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelBatchCancelFlows">批量撤销合同流程</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelBatchCancelFlows">批量撤销合同流程</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p>
     * @param TaskId <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelBatchCancelFlows">批量撤销合同流程</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>或者<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul> 
     * @return CancelType <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul>
     */
    public Long getCancelType() {
        return this.CancelType;
    }

    /**
     * Set <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul>
     * @param CancelType <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul>
     */
    public void setCancelType(Long CancelType) {
        this.CancelType = CancelType;
    }

    public DescribeCancelFlowsTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCancelFlowsTaskRequest(DescribeCancelFlowsTaskRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CancelType != null) {
            this.CancelType = new Long(source.CancelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CancelType", this.CancelType);

    }
}

