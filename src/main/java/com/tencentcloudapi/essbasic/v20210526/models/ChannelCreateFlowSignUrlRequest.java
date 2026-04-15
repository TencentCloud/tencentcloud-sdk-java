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

public class ChannelCreateFlowSignUrlRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>流程签署人列表，其中结构体的ApproverType必传。<br>若为个人签署方或saas企业签署方，则Name，Mobile必传。OrganizationName 传对应企业名称。<br>若为子客企业签署方则需传OpenId、OrganizationOpenId、OrganizationName， 其他可不传。（如果对应OrganizationOpenId 子客已经认证激活了，则可以省去OrganizationName）</p><p>此结构体和发起接口参与方结构体复用，除了上述参数外，可传递的参数有：</p><ol><li>RecipientId: 发起合同会返回，可以直接用于指定需要生成链接的签署方。</li><li>ApproverSignTypes: 指定签署方签署时候的认证方式，仅此链接生效。</li><li>SignTypeSelector: 可以指定签署方签署合同的认证校验方式的选择模式。</li><li>Intention: 指定H5签署视频核身的意图配置，仅视频签署需要使用。</li></ol><p>注:<br><code>1. 签署人只能有手写签名、时间类型、印章类型、签批类型的签署控件和内容填写控件，其他类型的签署控件暂时未支持。</code><br><code>2. 生成发起方预览链接时，该字段（FlowApproverInfos）传空或者不传</code></p>
    */
    @SerializedName("FlowApproverInfos")
    @Expose
    private FlowApproverInfo [] FlowApproverInfos;

    /**
    * <p>用于指定进入视频签署的限制次数，次数取值范围：1 - 10，不设置则默认为5次，仅视频签署时生效。</p>
    */
    @SerializedName("VideoVerifyTimesLimit")
    @Expose
    private Long VideoVerifyTimesLimit;

    /**
    * <p>用户信息，暂未开放</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>机构信息，暂未开放</p>
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
    * <p>签署完之后的H5页面的跳转链接，最大长度1000个字符。链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a></p>
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * <p>链接类型，支持指定以下类型</p><ul><li>0 : 签署链接 (默认值)</li><li>1 : 预览链接</li></ul>注:<code>1. 当指定链接类型为1时，链接为预览链接，打开链接无法签署仅支持预览以及查看当前合同状态。</code><code>2. 如需生成发起方预览链接，则签署方信息传空，即FlowApproverInfos传空或者不传。</code>
    */
    @SerializedName("UrlType")
    @Expose
    private Long UrlType;

    /**
    * <p>链接的有效时间，单位为秒。取值范围为 30分钟（1800）-90天（7776000）。如果不传，默认有效期为30分钟。</p><p>注意：</p><ol><li><code>出于安全性考虑，若有效期大于30分钟，同设备24小时内点击链接查看合同需要进行手机验证码校验。</code></li><li><code>若生成合同发起方预览链接，有效期大于30分钟，则需要进行验证码校验的手机号为发起方账号绑定的手机号。</code></li></ol>
    */
    @SerializedName("ExpiredOn")
    @Expose
    private Long ExpiredOn;

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
     * Get <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p> 
     * @return FlowId <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p>
     * @param FlowId <p>合同流程ID，为32位字符串。<br>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>流程签署人列表，其中结构体的ApproverType必传。<br>若为个人签署方或saas企业签署方，则Name，Mobile必传。OrganizationName 传对应企业名称。<br>若为子客企业签署方则需传OpenId、OrganizationOpenId、OrganizationName， 其他可不传。（如果对应OrganizationOpenId 子客已经认证激活了，则可以省去OrganizationName）</p><p>此结构体和发起接口参与方结构体复用，除了上述参数外，可传递的参数有：</p><ol><li>RecipientId: 发起合同会返回，可以直接用于指定需要生成链接的签署方。</li><li>ApproverSignTypes: 指定签署方签署时候的认证方式，仅此链接生效。</li><li>SignTypeSelector: 可以指定签署方签署合同的认证校验方式的选择模式。</li><li>Intention: 指定H5签署视频核身的意图配置，仅视频签署需要使用。</li></ol><p>注:<br><code>1. 签署人只能有手写签名、时间类型、印章类型、签批类型的签署控件和内容填写控件，其他类型的签署控件暂时未支持。</code><br><code>2. 生成发起方预览链接时，该字段（FlowApproverInfos）传空或者不传</code></p> 
     * @return FlowApproverInfos <p>流程签署人列表，其中结构体的ApproverType必传。<br>若为个人签署方或saas企业签署方，则Name，Mobile必传。OrganizationName 传对应企业名称。<br>若为子客企业签署方则需传OpenId、OrganizationOpenId、OrganizationName， 其他可不传。（如果对应OrganizationOpenId 子客已经认证激活了，则可以省去OrganizationName）</p><p>此结构体和发起接口参与方结构体复用，除了上述参数外，可传递的参数有：</p><ol><li>RecipientId: 发起合同会返回，可以直接用于指定需要生成链接的签署方。</li><li>ApproverSignTypes: 指定签署方签署时候的认证方式，仅此链接生效。</li><li>SignTypeSelector: 可以指定签署方签署合同的认证校验方式的选择模式。</li><li>Intention: 指定H5签署视频核身的意图配置，仅视频签署需要使用。</li></ol><p>注:<br><code>1. 签署人只能有手写签名、时间类型、印章类型、签批类型的签署控件和内容填写控件，其他类型的签署控件暂时未支持。</code><br><code>2. 生成发起方预览链接时，该字段（FlowApproverInfos）传空或者不传</code></p>
     */
    public FlowApproverInfo [] getFlowApproverInfos() {
        return this.FlowApproverInfos;
    }

    /**
     * Set <p>流程签署人列表，其中结构体的ApproverType必传。<br>若为个人签署方或saas企业签署方，则Name，Mobile必传。OrganizationName 传对应企业名称。<br>若为子客企业签署方则需传OpenId、OrganizationOpenId、OrganizationName， 其他可不传。（如果对应OrganizationOpenId 子客已经认证激活了，则可以省去OrganizationName）</p><p>此结构体和发起接口参与方结构体复用，除了上述参数外，可传递的参数有：</p><ol><li>RecipientId: 发起合同会返回，可以直接用于指定需要生成链接的签署方。</li><li>ApproverSignTypes: 指定签署方签署时候的认证方式，仅此链接生效。</li><li>SignTypeSelector: 可以指定签署方签署合同的认证校验方式的选择模式。</li><li>Intention: 指定H5签署视频核身的意图配置，仅视频签署需要使用。</li></ol><p>注:<br><code>1. 签署人只能有手写签名、时间类型、印章类型、签批类型的签署控件和内容填写控件，其他类型的签署控件暂时未支持。</code><br><code>2. 生成发起方预览链接时，该字段（FlowApproverInfos）传空或者不传</code></p>
     * @param FlowApproverInfos <p>流程签署人列表，其中结构体的ApproverType必传。<br>若为个人签署方或saas企业签署方，则Name，Mobile必传。OrganizationName 传对应企业名称。<br>若为子客企业签署方则需传OpenId、OrganizationOpenId、OrganizationName， 其他可不传。（如果对应OrganizationOpenId 子客已经认证激活了，则可以省去OrganizationName）</p><p>此结构体和发起接口参与方结构体复用，除了上述参数外，可传递的参数有：</p><ol><li>RecipientId: 发起合同会返回，可以直接用于指定需要生成链接的签署方。</li><li>ApproverSignTypes: 指定签署方签署时候的认证方式，仅此链接生效。</li><li>SignTypeSelector: 可以指定签署方签署合同的认证校验方式的选择模式。</li><li>Intention: 指定H5签署视频核身的意图配置，仅视频签署需要使用。</li></ol><p>注:<br><code>1. 签署人只能有手写签名、时间类型、印章类型、签批类型的签署控件和内容填写控件，其他类型的签署控件暂时未支持。</code><br><code>2. 生成发起方预览链接时，该字段（FlowApproverInfos）传空或者不传</code></p>
     */
    public void setFlowApproverInfos(FlowApproverInfo [] FlowApproverInfos) {
        this.FlowApproverInfos = FlowApproverInfos;
    }

    /**
     * Get <p>用于指定进入视频签署的限制次数，次数取值范围：1 - 10，不设置则默认为5次，仅视频签署时生效。</p> 
     * @return VideoVerifyTimesLimit <p>用于指定进入视频签署的限制次数，次数取值范围：1 - 10，不设置则默认为5次，仅视频签署时生效。</p>
     */
    public Long getVideoVerifyTimesLimit() {
        return this.VideoVerifyTimesLimit;
    }

    /**
     * Set <p>用于指定进入视频签署的限制次数，次数取值范围：1 - 10，不设置则默认为5次，仅视频签署时生效。</p>
     * @param VideoVerifyTimesLimit <p>用于指定进入视频签署的限制次数，次数取值范围：1 - 10，不设置则默认为5次，仅视频签署时生效。</p>
     */
    public void setVideoVerifyTimesLimit(Long VideoVerifyTimesLimit) {
        this.VideoVerifyTimesLimit = VideoVerifyTimesLimit;
    }

    /**
     * Get <p>用户信息，暂未开放</p> 
     * @return Operator <p>用户信息，暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>用户信息，暂未开放</p>
     * @param Operator <p>用户信息，暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>机构信息，暂未开放</p> 
     * @return Organization <p>机构信息，暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set <p>机构信息，暂未开放</p>
     * @param Organization <p>机构信息，暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    /**
     * Get <p>签署完之后的H5页面的跳转链接，最大长度1000个字符。链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a></p> 
     * @return JumpUrl <p>签署完之后的H5页面的跳转链接，最大长度1000个字符。链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a></p>
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set <p>签署完之后的H5页面的跳转链接，最大长度1000个字符。链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a></p>
     * @param JumpUrl <p>签署完之后的H5页面的跳转链接，最大长度1000个字符。链接类型请参考 <a href="https://qian.tencent.com/developers/company/openqianh5" target="_blank">跳转电子签H5</a></p>
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get <p>链接类型，支持指定以下类型</p><ul><li>0 : 签署链接 (默认值)</li><li>1 : 预览链接</li></ul>注:<code>1. 当指定链接类型为1时，链接为预览链接，打开链接无法签署仅支持预览以及查看当前合同状态。</code><code>2. 如需生成发起方预览链接，则签署方信息传空，即FlowApproverInfos传空或者不传。</code> 
     * @return UrlType <p>链接类型，支持指定以下类型</p><ul><li>0 : 签署链接 (默认值)</li><li>1 : 预览链接</li></ul>注:<code>1. 当指定链接类型为1时，链接为预览链接，打开链接无法签署仅支持预览以及查看当前合同状态。</code><code>2. 如需生成发起方预览链接，则签署方信息传空，即FlowApproverInfos传空或者不传。</code>
     */
    public Long getUrlType() {
        return this.UrlType;
    }

    /**
     * Set <p>链接类型，支持指定以下类型</p><ul><li>0 : 签署链接 (默认值)</li><li>1 : 预览链接</li></ul>注:<code>1. 当指定链接类型为1时，链接为预览链接，打开链接无法签署仅支持预览以及查看当前合同状态。</code><code>2. 如需生成发起方预览链接，则签署方信息传空，即FlowApproverInfos传空或者不传。</code>
     * @param UrlType <p>链接类型，支持指定以下类型</p><ul><li>0 : 签署链接 (默认值)</li><li>1 : 预览链接</li></ul>注:<code>1. 当指定链接类型为1时，链接为预览链接，打开链接无法签署仅支持预览以及查看当前合同状态。</code><code>2. 如需生成发起方预览链接，则签署方信息传空，即FlowApproverInfos传空或者不传。</code>
     */
    public void setUrlType(Long UrlType) {
        this.UrlType = UrlType;
    }

    /**
     * Get <p>链接的有效时间，单位为秒。取值范围为 30分钟（1800）-90天（7776000）。如果不传，默认有效期为30分钟。</p><p>注意：</p><ol><li><code>出于安全性考虑，若有效期大于30分钟，同设备24小时内点击链接查看合同需要进行手机验证码校验。</code></li><li><code>若生成合同发起方预览链接，有效期大于30分钟，则需要进行验证码校验的手机号为发起方账号绑定的手机号。</code></li></ol> 
     * @return ExpiredOn <p>链接的有效时间，单位为秒。取值范围为 30分钟（1800）-90天（7776000）。如果不传，默认有效期为30分钟。</p><p>注意：</p><ol><li><code>出于安全性考虑，若有效期大于30分钟，同设备24小时内点击链接查看合同需要进行手机验证码校验。</code></li><li><code>若生成合同发起方预览链接，有效期大于30分钟，则需要进行验证码校验的手机号为发起方账号绑定的手机号。</code></li></ol>
     */
    public Long getExpiredOn() {
        return this.ExpiredOn;
    }

    /**
     * Set <p>链接的有效时间，单位为秒。取值范围为 30分钟（1800）-90天（7776000）。如果不传，默认有效期为30分钟。</p><p>注意：</p><ol><li><code>出于安全性考虑，若有效期大于30分钟，同设备24小时内点击链接查看合同需要进行手机验证码校验。</code></li><li><code>若生成合同发起方预览链接，有效期大于30分钟，则需要进行验证码校验的手机号为发起方账号绑定的手机号。</code></li></ol>
     * @param ExpiredOn <p>链接的有效时间，单位为秒。取值范围为 30分钟（1800）-90天（7776000）。如果不传，默认有效期为30分钟。</p><p>注意：</p><ol><li><code>出于安全性考虑，若有效期大于30分钟，同设备24小时内点击链接查看合同需要进行手机验证码校验。</code></li><li><code>若生成合同发起方预览链接，有效期大于30分钟，则需要进行验证码校验的手机号为发起方账号绑定的手机号。</code></li></ol>
     */
    public void setExpiredOn(Long ExpiredOn) {
        this.ExpiredOn = ExpiredOn;
    }

    public ChannelCreateFlowSignUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowSignUrlRequest(ChannelCreateFlowSignUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowApproverInfos != null) {
            this.FlowApproverInfos = new FlowApproverInfo[source.FlowApproverInfos.length];
            for (int i = 0; i < source.FlowApproverInfos.length; i++) {
                this.FlowApproverInfos[i] = new FlowApproverInfo(source.FlowApproverInfos[i]);
            }
        }
        if (source.VideoVerifyTimesLimit != null) {
            this.VideoVerifyTimesLimit = new Long(source.VideoVerifyTimesLimit);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Organization != null) {
            this.Organization = new OrganizationInfo(source.Organization);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.UrlType != null) {
            this.UrlType = new Long(source.UrlType);
        }
        if (source.ExpiredOn != null) {
            this.ExpiredOn = new Long(source.ExpiredOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "FlowApproverInfos.", this.FlowApproverInfos);
        this.setParamSimple(map, prefix + "VideoVerifyTimesLimit", this.VideoVerifyTimesLimit);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "UrlType", this.UrlType);
        this.setParamSimple(map, prefix + "ExpiredOn", this.ExpiredOn);

    }
}

