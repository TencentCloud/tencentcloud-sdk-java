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

public class CancelOrganizationFlowsRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。备注:<code>如果不传递撤回原因，那么默认撤回原因是 &quot;自动撤销（通过接口实现）&quot;</code></p>
    */
    @SerializedName("CancelMessage")
    @Expose
    private String CancelMessage;

    /**
    * <p>撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：<strong>0</strong> : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同<strong>1</strong> :  合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同<strong>2</strong> : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同<strong>3</strong> : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: <code>CancelMessage为撤销当前合同的理由</code><img src="https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png" alt="image"></p><p>枚举值：</p><ul><li>0：  默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>1： 合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>2： 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>3： 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: `CancelMessage为撤销当前合同的理由</li></ul>
    */
    @SerializedName("CancelMessageFormat")
    @Expose
    private Long CancelMessageFormat;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。备注:<code>如果不传递撤回原因，那么默认撤回原因是 &quot;自动撤销（通过接口实现）&quot;</code></p> 
     * @return CancelMessage <p>撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。备注:<code>如果不传递撤回原因，那么默认撤回原因是 &quot;自动撤销（通过接口实现）&quot;</code></p>
     */
    public String getCancelMessage() {
        return this.CancelMessage;
    }

    /**
     * Set <p>撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。备注:<code>如果不传递撤回原因，那么默认撤回原因是 &quot;自动撤销（通过接口实现）&quot;</code></p>
     * @param CancelMessage <p>撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。备注:<code>如果不传递撤回原因，那么默认撤回原因是 &quot;自动撤销（通过接口实现）&quot;</code></p>
     */
    public void setCancelMessage(String CancelMessage) {
        this.CancelMessage = CancelMessage;
    }

    /**
     * Get <p>撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：<strong>0</strong> : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同<strong>1</strong> :  合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同<strong>2</strong> : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同<strong>3</strong> : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: <code>CancelMessage为撤销当前合同的理由</code><img src="https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png" alt="image"></p><p>枚举值：</p><ul><li>0：  默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>1： 合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>2： 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>3： 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: `CancelMessage为撤销当前合同的理由</li></ul> 
     * @return CancelMessageFormat <p>撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：<strong>0</strong> : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同<strong>1</strong> :  合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同<strong>2</strong> : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同<strong>3</strong> : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: <code>CancelMessage为撤销当前合同的理由</code><img src="https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png" alt="image"></p><p>枚举值：</p><ul><li>0：  默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>1： 合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>2： 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>3： 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: `CancelMessage为撤销当前合同的理由</li></ul>
     */
    public Long getCancelMessageFormat() {
        return this.CancelMessageFormat;
    }

    /**
     * Set <p>撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：<strong>0</strong> : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同<strong>1</strong> :  合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同<strong>2</strong> : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同<strong>3</strong> : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: <code>CancelMessage为撤销当前合同的理由</code><img src="https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png" alt="image"></p><p>枚举值：</p><ul><li>0：  默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>1： 合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>2： 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>3： 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: `CancelMessage为撤销当前合同的理由</li></ul>
     * @param CancelMessageFormat <p>撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：<strong>0</strong> : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同<strong>1</strong> :  合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同<strong>2</strong> : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同<strong>3</strong> : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: <code>CancelMessage为撤销当前合同的理由</code><img src="https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png" alt="image"></p><p>枚举值：</p><ul><li>0：  默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>1： 合同封面页面会展示为:  发起方以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>2： 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以<strong>CancelMessage</strong>的理由撤销当前合同</li><li>3： 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以<strong>CancelMessage</strong>的理由撤销当前合同注: `CancelMessage为撤销当前合同的理由</li></ul>
     */
    public void setCancelMessageFormat(Long CancelMessageFormat) {
        this.CancelMessageFormat = CancelMessageFormat;
    }

    public CancelOrganizationFlowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelOrganizationFlowsRequest(CancelOrganizationFlowsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.CancelMessage != null) {
            this.CancelMessage = new String(source.CancelMessage);
        }
        if (source.CancelMessageFormat != null) {
            this.CancelMessageFormat = new Long(source.CancelMessageFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "CancelMessage", this.CancelMessage);
        this.setParamSimple(map, prefix + "CancelMessageFormat", this.CancelMessageFormat);

    }
}

