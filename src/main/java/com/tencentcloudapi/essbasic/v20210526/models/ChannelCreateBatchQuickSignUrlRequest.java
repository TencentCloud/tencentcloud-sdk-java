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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateBatchQuickSignUrlRequest extends AbstractModel {

    /**
    * 批量签署的流程签署人，其中姓名(ApproverName)、参与人类型(ApproverType)必传，手机号(ApproverMobile)和证件信息(ApproverIdCardType、ApproverIdCardNumber)可任选一种或全部传入。
注:
`1. ApproverType目前只支持个人类型的签署人。`
`2. 签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。`
`3. 当需要通过短信验证码签署时，手机号ApproverMobile需要与发起合同时填写的用户手机号一致。`
    */
    @SerializedName("FlowApproverInfo")
    @Expose
    private FlowApproverInfo FlowApproverInfo;

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 批量签署的合同流程ID数组。
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。`
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 合同组编号
注：`该参数和合同流程ID数组必须二选一`
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * 签署完之后的H5页面的跳转链接，此链接及支持http://和https://，最大长度1000个字符。(建议https协议)
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 指定批量签署合同的签名类型，可传递以下值：
<ul><li>**0**：手写签名(默认)</li>
<li>**1**：OCR楷体</li>
<li>**2**：姓名印章</li>
<li>**3**：图片印章</li>
<li>**4**：系统签名</li></ul>
注：
<ul><li>默认情况下，签名类型为手写签名</li>
<li>您可以传递多种值，表示可用多种签名类型。</li>
<li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul>
    */
    @SerializedName("SignatureTypes")
    @Expose
    private Long [] SignatureTypes;

    /**
    * 指定批量签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证(默认)，需进行人脸识别成功后才能签署合同</li>
<li>**2**：密码认证(默认)，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息(名字、手机号、证件号)校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸和密码认证</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul>
    */
    @SerializedName("ApproverSignTypes")
    @Expose
    private Long [] ApproverSignTypes;

    /**
    * 生成H5签署链接时，您可以指定签署方签署合同的认证校验方式的选择模式，可传递一下值：
<ul><li>**0**：签署方自行选择，签署方可以从预先指定的认证方式中自由选择；</li>
<li>**1**：自动按顺序首位推荐，签署方无需选择，系统会优先推荐使用第一种认证方式。</li></ul>
注：
`不指定该值时，默认为签署方自行选择。`
    */
    @SerializedName("SignTypeSelector")
    @Expose
    private Long SignTypeSelector;

    /**
    * 批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。	
    */
    @SerializedName("FlowBatchUrlInfo")
    @Expose
    private FlowBatchUrlInfo FlowBatchUrlInfo;

    /**
    * <b>只有在生成H5签署链接的情形下</b>（ 如调用<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignUrl" target="_blank">获取H5签署链接</a>、<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchQuickSignUrl" target="_blank">获取H5批量签署链接</a>等接口），该配置才会生效。  您可以指定H5签署视频核身的意图配置，选择问答模式或点头模式的语音文本。  注意： 1. 视频认证为<b>白名单功能，使用前请联系对接的客户经理沟通</b>。 2. 使用视频认证时，<b>生成H5签署链接的时候必须将签署认证方式指定为人脸</b>（即ApproverSignTypes设置成人脸签署）。 3. 签署完成后，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelDescribeSignFaceVideo" target="_blank">查询签署认证人脸视频</a>获取到当时的视频。
    */
    @SerializedName("Intention")
    @Expose
    private Intention Intention;

    /**
    * 缓存签署人信息。在H5签署链接动态领取场景，首次填写后，选择缓存签署人信息，在下次签署人点击领取链接时，会自动将个人信息（姓名、身份证号、手机号）填入，否则需要每次手动填写。
    */
    @SerializedName("CacheApproverInfo")
    @Expose
    private Boolean CacheApproverInfo;

    /**
     * Get 批量签署的流程签署人，其中姓名(ApproverName)、参与人类型(ApproverType)必传，手机号(ApproverMobile)和证件信息(ApproverIdCardType、ApproverIdCardNumber)可任选一种或全部传入。
注:
`1. ApproverType目前只支持个人类型的签署人。`
`2. 签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。`
`3. 当需要通过短信验证码签署时，手机号ApproverMobile需要与发起合同时填写的用户手机号一致。` 
     * @return FlowApproverInfo 批量签署的流程签署人，其中姓名(ApproverName)、参与人类型(ApproverType)必传，手机号(ApproverMobile)和证件信息(ApproverIdCardType、ApproverIdCardNumber)可任选一种或全部传入。
注:
`1. ApproverType目前只支持个人类型的签署人。`
`2. 签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。`
`3. 当需要通过短信验证码签署时，手机号ApproverMobile需要与发起合同时填写的用户手机号一致。`
     */
    public FlowApproverInfo getFlowApproverInfo() {
        return this.FlowApproverInfo;
    }

    /**
     * Set 批量签署的流程签署人，其中姓名(ApproverName)、参与人类型(ApproverType)必传，手机号(ApproverMobile)和证件信息(ApproverIdCardType、ApproverIdCardNumber)可任选一种或全部传入。
注:
`1. ApproverType目前只支持个人类型的签署人。`
`2. 签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。`
`3. 当需要通过短信验证码签署时，手机号ApproverMobile需要与发起合同时填写的用户手机号一致。`
     * @param FlowApproverInfo 批量签署的流程签署人，其中姓名(ApproverName)、参与人类型(ApproverType)必传，手机号(ApproverMobile)和证件信息(ApproverIdCardType、ApproverIdCardNumber)可任选一种或全部传入。
注:
`1. ApproverType目前只支持个人类型的签署人。`
`2. 签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。`
`3. 当需要通过短信验证码签署时，手机号ApproverMobile需要与发起合同时填写的用户手机号一致。`
     */
    public void setFlowApproverInfo(FlowApproverInfo FlowApproverInfo) {
        this.FlowApproverInfo = FlowApproverInfo;
    }

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 批量签署的合同流程ID数组。
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。` 
     * @return FlowIds 批量签署的合同流程ID数组。
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。`
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 批量签署的合同流程ID数组。
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。`
     * @param FlowIds 批量签署的合同流程ID数组。
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。`
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 合同组编号
注：`该参数和合同流程ID数组必须二选一` 
     * @return FlowGroupId 合同组编号
注：`该参数和合同流程ID数组必须二选一`
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同组编号
注：`该参数和合同流程ID数组必须二选一`
     * @param FlowGroupId 合同组编号
注：`该参数和合同流程ID数组必须二选一`
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get 签署完之后的H5页面的跳转链接，此链接及支持http://和https://，最大长度1000个字符。(建议https协议) 
     * @return JumpUrl 签署完之后的H5页面的跳转链接，此链接及支持http://和https://，最大长度1000个字符。(建议https协议)
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完之后的H5页面的跳转链接，此链接及支持http://和https://，最大长度1000个字符。(建议https协议)
     * @param JumpUrl 签署完之后的H5页面的跳转链接，此链接及支持http://和https://，最大长度1000个字符。(建议https协议)
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 指定批量签署合同的签名类型，可传递以下值：
<ul><li>**0**：手写签名(默认)</li>
<li>**1**：OCR楷体</li>
<li>**2**：姓名印章</li>
<li>**3**：图片印章</li>
<li>**4**：系统签名</li></ul>
注：
<ul><li>默认情况下，签名类型为手写签名</li>
<li>您可以传递多种值，表示可用多种签名类型。</li>
<li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul> 
     * @return SignatureTypes 指定批量签署合同的签名类型，可传递以下值：
<ul><li>**0**：手写签名(默认)</li>
<li>**1**：OCR楷体</li>
<li>**2**：姓名印章</li>
<li>**3**：图片印章</li>
<li>**4**：系统签名</li></ul>
注：
<ul><li>默认情况下，签名类型为手写签名</li>
<li>您可以传递多种值，表示可用多种签名类型。</li>
<li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul>
     */
    public Long [] getSignatureTypes() {
        return this.SignatureTypes;
    }

    /**
     * Set 指定批量签署合同的签名类型，可传递以下值：
<ul><li>**0**：手写签名(默认)</li>
<li>**1**：OCR楷体</li>
<li>**2**：姓名印章</li>
<li>**3**：图片印章</li>
<li>**4**：系统签名</li></ul>
注：
<ul><li>默认情况下，签名类型为手写签名</li>
<li>您可以传递多种值，表示可用多种签名类型。</li>
<li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul>
     * @param SignatureTypes 指定批量签署合同的签名类型，可传递以下值：
<ul><li>**0**：手写签名(默认)</li>
<li>**1**：OCR楷体</li>
<li>**2**：姓名印章</li>
<li>**3**：图片印章</li>
<li>**4**：系统签名</li></ul>
注：
<ul><li>默认情况下，签名类型为手写签名</li>
<li>您可以传递多种值，表示可用多种签名类型。</li>
<li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul>
     */
    public void setSignatureTypes(Long [] SignatureTypes) {
        this.SignatureTypes = SignatureTypes;
    }

    /**
     * Get 指定批量签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证(默认)，需进行人脸识别成功后才能签署合同</li>
<li>**2**：密码认证(默认)，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息(名字、手机号、证件号)校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸和密码认证</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul> 
     * @return ApproverSignTypes 指定批量签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证(默认)，需进行人脸识别成功后才能签署合同</li>
<li>**2**：密码认证(默认)，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息(名字、手机号、证件号)校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸和密码认证</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul>
     */
    public Long [] getApproverSignTypes() {
        return this.ApproverSignTypes;
    }

    /**
     * Set 指定批量签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证(默认)，需进行人脸识别成功后才能签署合同</li>
<li>**2**：密码认证(默认)，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息(名字、手机号、证件号)校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸和密码认证</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul>
     * @param ApproverSignTypes 指定批量签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证(默认)，需进行人脸识别成功后才能签署合同</li>
<li>**2**：密码认证(默认)，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息(名字、手机号、证件号)校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸和密码认证</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul>
     */
    public void setApproverSignTypes(Long [] ApproverSignTypes) {
        this.ApproverSignTypes = ApproverSignTypes;
    }

    /**
     * Get 生成H5签署链接时，您可以指定签署方签署合同的认证校验方式的选择模式，可传递一下值：
<ul><li>**0**：签署方自行选择，签署方可以从预先指定的认证方式中自由选择；</li>
<li>**1**：自动按顺序首位推荐，签署方无需选择，系统会优先推荐使用第一种认证方式。</li></ul>
注：
`不指定该值时，默认为签署方自行选择。` 
     * @return SignTypeSelector 生成H5签署链接时，您可以指定签署方签署合同的认证校验方式的选择模式，可传递一下值：
<ul><li>**0**：签署方自行选择，签署方可以从预先指定的认证方式中自由选择；</li>
<li>**1**：自动按顺序首位推荐，签署方无需选择，系统会优先推荐使用第一种认证方式。</li></ul>
注：
`不指定该值时，默认为签署方自行选择。`
     */
    public Long getSignTypeSelector() {
        return this.SignTypeSelector;
    }

    /**
     * Set 生成H5签署链接时，您可以指定签署方签署合同的认证校验方式的选择模式，可传递一下值：
<ul><li>**0**：签署方自行选择，签署方可以从预先指定的认证方式中自由选择；</li>
<li>**1**：自动按顺序首位推荐，签署方无需选择，系统会优先推荐使用第一种认证方式。</li></ul>
注：
`不指定该值时，默认为签署方自行选择。`
     * @param SignTypeSelector 生成H5签署链接时，您可以指定签署方签署合同的认证校验方式的选择模式，可传递一下值：
<ul><li>**0**：签署方自行选择，签署方可以从预先指定的认证方式中自由选择；</li>
<li>**1**：自动按顺序首位推荐，签署方无需选择，系统会优先推荐使用第一种认证方式。</li></ul>
注：
`不指定该值时，默认为签署方自行选择。`
     */
    public void setSignTypeSelector(Long SignTypeSelector) {
        this.SignTypeSelector = SignTypeSelector;
    }

    /**
     * Get 批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。	 
     * @return FlowBatchUrlInfo 批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。	
     */
    public FlowBatchUrlInfo getFlowBatchUrlInfo() {
        return this.FlowBatchUrlInfo;
    }

    /**
     * Set 批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。	
     * @param FlowBatchUrlInfo 批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。	
     */
    public void setFlowBatchUrlInfo(FlowBatchUrlInfo FlowBatchUrlInfo) {
        this.FlowBatchUrlInfo = FlowBatchUrlInfo;
    }

    /**
     * Get <b>只有在生成H5签署链接的情形下</b>（ 如调用<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignUrl" target="_blank">获取H5签署链接</a>、<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchQuickSignUrl" target="_blank">获取H5批量签署链接</a>等接口），该配置才会生效。  您可以指定H5签署视频核身的意图配置，选择问答模式或点头模式的语音文本。  注意： 1. 视频认证为<b>白名单功能，使用前请联系对接的客户经理沟通</b>。 2. 使用视频认证时，<b>生成H5签署链接的时候必须将签署认证方式指定为人脸</b>（即ApproverSignTypes设置成人脸签署）。 3. 签署完成后，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelDescribeSignFaceVideo" target="_blank">查询签署认证人脸视频</a>获取到当时的视频。 
     * @return Intention <b>只有在生成H5签署链接的情形下</b>（ 如调用<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignUrl" target="_blank">获取H5签署链接</a>、<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchQuickSignUrl" target="_blank">获取H5批量签署链接</a>等接口），该配置才会生效。  您可以指定H5签署视频核身的意图配置，选择问答模式或点头模式的语音文本。  注意： 1. 视频认证为<b>白名单功能，使用前请联系对接的客户经理沟通</b>。 2. 使用视频认证时，<b>生成H5签署链接的时候必须将签署认证方式指定为人脸</b>（即ApproverSignTypes设置成人脸签署）。 3. 签署完成后，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelDescribeSignFaceVideo" target="_blank">查询签署认证人脸视频</a>获取到当时的视频。
     */
    public Intention getIntention() {
        return this.Intention;
    }

    /**
     * Set <b>只有在生成H5签署链接的情形下</b>（ 如调用<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignUrl" target="_blank">获取H5签署链接</a>、<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchQuickSignUrl" target="_blank">获取H5批量签署链接</a>等接口），该配置才会生效。  您可以指定H5签署视频核身的意图配置，选择问答模式或点头模式的语音文本。  注意： 1. 视频认证为<b>白名单功能，使用前请联系对接的客户经理沟通</b>。 2. 使用视频认证时，<b>生成H5签署链接的时候必须将签署认证方式指定为人脸</b>（即ApproverSignTypes设置成人脸签署）。 3. 签署完成后，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelDescribeSignFaceVideo" target="_blank">查询签署认证人脸视频</a>获取到当时的视频。
     * @param Intention <b>只有在生成H5签署链接的情形下</b>（ 如调用<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignUrl" target="_blank">获取H5签署链接</a>、<a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateBatchQuickSignUrl" target="_blank">获取H5批量签署链接</a>等接口），该配置才会生效。  您可以指定H5签署视频核身的意图配置，选择问答模式或点头模式的语音文本。  注意： 1. 视频认证为<b>白名单功能，使用前请联系对接的客户经理沟通</b>。 2. 使用视频认证时，<b>生成H5签署链接的时候必须将签署认证方式指定为人脸</b>（即ApproverSignTypes设置成人脸签署）。 3. 签署完成后，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelDescribeSignFaceVideo" target="_blank">查询签署认证人脸视频</a>获取到当时的视频。
     */
    public void setIntention(Intention Intention) {
        this.Intention = Intention;
    }

    /**
     * Get 缓存签署人信息。在H5签署链接动态领取场景，首次填写后，选择缓存签署人信息，在下次签署人点击领取链接时，会自动将个人信息（姓名、身份证号、手机号）填入，否则需要每次手动填写。 
     * @return CacheApproverInfo 缓存签署人信息。在H5签署链接动态领取场景，首次填写后，选择缓存签署人信息，在下次签署人点击领取链接时，会自动将个人信息（姓名、身份证号、手机号）填入，否则需要每次手动填写。
     */
    public Boolean getCacheApproverInfo() {
        return this.CacheApproverInfo;
    }

    /**
     * Set 缓存签署人信息。在H5签署链接动态领取场景，首次填写后，选择缓存签署人信息，在下次签署人点击领取链接时，会自动将个人信息（姓名、身份证号、手机号）填入，否则需要每次手动填写。
     * @param CacheApproverInfo 缓存签署人信息。在H5签署链接动态领取场景，首次填写后，选择缓存签署人信息，在下次签署人点击领取链接时，会自动将个人信息（姓名、身份证号、手机号）填入，否则需要每次手动填写。
     */
    public void setCacheApproverInfo(Boolean CacheApproverInfo) {
        this.CacheApproverInfo = CacheApproverInfo;
    }

    public ChannelCreateBatchQuickSignUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateBatchQuickSignUrlRequest(ChannelCreateBatchQuickSignUrlRequest source) {
        if (source.FlowApproverInfo != null) {
            this.FlowApproverInfo = new FlowApproverInfo(source.FlowApproverInfo);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.SignatureTypes != null) {
            this.SignatureTypes = new Long[source.SignatureTypes.length];
            for (int i = 0; i < source.SignatureTypes.length; i++) {
                this.SignatureTypes[i] = new Long(source.SignatureTypes[i]);
            }
        }
        if (source.ApproverSignTypes != null) {
            this.ApproverSignTypes = new Long[source.ApproverSignTypes.length];
            for (int i = 0; i < source.ApproverSignTypes.length; i++) {
                this.ApproverSignTypes[i] = new Long(source.ApproverSignTypes[i]);
            }
        }
        if (source.SignTypeSelector != null) {
            this.SignTypeSelector = new Long(source.SignTypeSelector);
        }
        if (source.FlowBatchUrlInfo != null) {
            this.FlowBatchUrlInfo = new FlowBatchUrlInfo(source.FlowBatchUrlInfo);
        }
        if (source.Intention != null) {
            this.Intention = new Intention(source.Intention);
        }
        if (source.CacheApproverInfo != null) {
            this.CacheApproverInfo = new Boolean(source.CacheApproverInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FlowApproverInfo.", this.FlowApproverInfo);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamArraySimple(map, prefix + "SignatureTypes.", this.SignatureTypes);
        this.setParamArraySimple(map, prefix + "ApproverSignTypes.", this.ApproverSignTypes);
        this.setParamSimple(map, prefix + "SignTypeSelector", this.SignTypeSelector);
        this.setParamObj(map, prefix + "FlowBatchUrlInfo.", this.FlowBatchUrlInfo);
        this.setParamObj(map, prefix + "Intention.", this.Intention);
        this.setParamSimple(map, prefix + "CacheApproverInfo", this.CacheApproverInfo);

    }
}

