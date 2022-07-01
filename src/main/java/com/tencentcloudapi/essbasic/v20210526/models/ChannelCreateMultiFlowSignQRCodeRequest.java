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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateMultiFlowSignQRCodeRequest extends AbstractModel{

    /**
    * 渠道应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 模版ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 签署流程名称，最大长度200个字符。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 最大可发起签署流程份数，默认5份；发起签署流程数量超过此上限后，二维码自动失效。
    */
    @SerializedName("MaxFlowNum")
    @Expose
    private Long MaxFlowNum;

    /**
    * 签署流程有效天数 默认7天 最高设置不超过30天
    */
    @SerializedName("FlowEffectiveDay")
    @Expose
    private Long FlowEffectiveDay;

    /**
    * 二维码有效天数 默认7天 最高设置不超过90天
    */
    @SerializedName("QrEffectiveDay")
    @Expose
    private Long QrEffectiveDay;

    /**
    * 回调地址，最大长度1000个字符
不传默认使用渠道应用号配置的回调地址
回调时机:用户通过签署二维码发起合同时，企业额度不足导致失败
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 用户信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 渠道应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。 
     * @return Agent 渠道应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     * @param Agent 渠道应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 模版ID 
     * @return TemplateId 模版ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版ID
     * @param TemplateId 模版ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 签署流程名称，最大长度200个字符。 
     * @return FlowName 签署流程名称，最大长度200个字符。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 签署流程名称，最大长度200个字符。
     * @param FlowName 签署流程名称，最大长度200个字符。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 最大可发起签署流程份数，默认5份；发起签署流程数量超过此上限后，二维码自动失效。 
     * @return MaxFlowNum 最大可发起签署流程份数，默认5份；发起签署流程数量超过此上限后，二维码自动失效。
     */
    public Long getMaxFlowNum() {
        return this.MaxFlowNum;
    }

    /**
     * Set 最大可发起签署流程份数，默认5份；发起签署流程数量超过此上限后，二维码自动失效。
     * @param MaxFlowNum 最大可发起签署流程份数，默认5份；发起签署流程数量超过此上限后，二维码自动失效。
     */
    public void setMaxFlowNum(Long MaxFlowNum) {
        this.MaxFlowNum = MaxFlowNum;
    }

    /**
     * Get 签署流程有效天数 默认7天 最高设置不超过30天 
     * @return FlowEffectiveDay 签署流程有效天数 默认7天 最高设置不超过30天
     */
    public Long getFlowEffectiveDay() {
        return this.FlowEffectiveDay;
    }

    /**
     * Set 签署流程有效天数 默认7天 最高设置不超过30天
     * @param FlowEffectiveDay 签署流程有效天数 默认7天 最高设置不超过30天
     */
    public void setFlowEffectiveDay(Long FlowEffectiveDay) {
        this.FlowEffectiveDay = FlowEffectiveDay;
    }

    /**
     * Get 二维码有效天数 默认7天 最高设置不超过90天 
     * @return QrEffectiveDay 二维码有效天数 默认7天 最高设置不超过90天
     */
    public Long getQrEffectiveDay() {
        return this.QrEffectiveDay;
    }

    /**
     * Set 二维码有效天数 默认7天 最高设置不超过90天
     * @param QrEffectiveDay 二维码有效天数 默认7天 最高设置不超过90天
     */
    public void setQrEffectiveDay(Long QrEffectiveDay) {
        this.QrEffectiveDay = QrEffectiveDay;
    }

    /**
     * Get 回调地址，最大长度1000个字符
不传默认使用渠道应用号配置的回调地址
回调时机:用户通过签署二维码发起合同时，企业额度不足导致失败 
     * @return CallbackUrl 回调地址，最大长度1000个字符
不传默认使用渠道应用号配置的回调地址
回调时机:用户通过签署二维码发起合同时，企业额度不足导致失败
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调地址，最大长度1000个字符
不传默认使用渠道应用号配置的回调地址
回调时机:用户通过签署二维码发起合同时，企业额度不足导致失败
     * @param CallbackUrl 回调地址，最大长度1000个字符
不传默认使用渠道应用号配置的回调地址
回调时机:用户通过签署二维码发起合同时，企业额度不足导致失败
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 用户信息 
     * @return Operator 用户信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 用户信息
     * @param Operator 用户信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelCreateMultiFlowSignQRCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateMultiFlowSignQRCodeRequest(ChannelCreateMultiFlowSignQRCodeRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.MaxFlowNum != null) {
            this.MaxFlowNum = new Long(source.MaxFlowNum);
        }
        if (source.FlowEffectiveDay != null) {
            this.FlowEffectiveDay = new Long(source.FlowEffectiveDay);
        }
        if (source.QrEffectiveDay != null) {
            this.QrEffectiveDay = new Long(source.QrEffectiveDay);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "MaxFlowNum", this.MaxFlowNum);
        this.setParamSimple(map, prefix + "FlowEffectiveDay", this.FlowEffectiveDay);
        this.setParamSimple(map, prefix + "QrEffectiveDay", this.QrEffectiveDay);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

