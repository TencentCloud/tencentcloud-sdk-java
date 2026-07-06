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

public class ChannelCreateBatchSignUrlRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：</p><ul><li>请确保和合同中填入的一致。</li><li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p><p>注：</p><ul><li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li></ul>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>证件类型，支持以下类型</p><ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li><li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li><li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></li></ol>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * <p>通知用户方式：</p><ul><li>**NONE** : 不通知（默认）</li><li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li></ul>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * <p>批量签署的合同流程ID数组。<font color="red">此参数必传。</font><br>注: <code>在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。</code></p>
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * <p>SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。</p><p>注：</p><ul><li>请确认该名称与企业营业执照中注册的名称一致。</li><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>请确保此企业已完成腾讯电子签企业认证。</li><li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数。如果此子客企业未认证，则此参数需要传子客企业名称**</li></ul>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>指定批量签署合同的签名类型，可传递以下值：<ul><li><strong>0</strong>：手写签名</li><li><strong>1</strong>：OCR楷体</li><li><strong>2</strong>：姓名印章</li><li><strong>3</strong>：图片印章</li><li><strong>4</strong>：系统签名</li><li><strong>5</strong>：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul></p>
    */
    @SerializedName("SignatureTypes")
    @Expose
    private Long [] SignatureTypes;

    /**
    * <p>是否直接跳转至合同内容页面进行签署</p><ul><li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li><li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li></ul>
    */
    @SerializedName("JumpToDetail")
    @Expose
    private Boolean JumpToDetail;

    /**
    * <p>批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。</p>
    */
    @SerializedName("FlowBatchUrlInfo")
    @Expose
    private FlowBatchUrlInfo FlowBatchUrlInfo;

    /**
    * <p>第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。</p><p>注：</p><ul><li>传入的OpenId对应员工在此子客企业下必须已经实名</li><li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li></ul>
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。</p>
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * <p>签署完成后是否自动回跳</p><ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol>
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
    * <p><font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 <strong>WeChatOfficialAccounts</strong>，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 </p><p>参考 <a href="https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC">公众号 H5 跳转电子签小程序</a>。</p>
    */
    @SerializedName("UrlUseEnv")
    @Expose
    private String UrlUseEnv;

    /**
    * <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul><br>注：<code>1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能</code></p>
    */
    @SerializedName("CanBatchReject")
    @Expose
    private Boolean CanBatchReject;

    /**
    * <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul><br>注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p>
    */
    @SerializedName("CanSkipReadFlow")
    @Expose
    private Boolean CanSkipReadFlow;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经过实名认证 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经过实名认证
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：</p><ul><li>请确保和合同中填入的一致。</li><li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li></ul> 
     * @return Name <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：</p><ul><li>请确保和合同中填入的一致。</li><li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：</p><ul><li>请确保和合同中填入的一致。</li><li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li></ul>
     * @param Name <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：</p><ul><li>请确保和合同中填入的一致。</li><li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p><p>注：</p><ul><li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li></ul> 
     * @return Mobile <p>手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p><p>注：</p><ul><li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li></ul>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p><p>注：</p><ul><li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li></ul>
     * @param Mobile <p>手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p><p>注：</p><ul><li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li></ul>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>证件类型，支持以下类型</p><ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li><li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li><li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></li></ol> 
     * @return IdCardType <p>证件类型，支持以下类型</p><ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li><li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li><li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></li></ol>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set <p>证件类型，支持以下类型</p><ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li><li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li><li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></li></ol>
     * @param IdCardType <p>证件类型，支持以下类型</p><ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li><li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li><li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></li></ol>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol> 
     * @return IdCardNumber <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
     * @param IdCardNumber <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：</p><ol><li><code>请确保和合同中填入的一致</code>。</li><li><code>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get <p>通知用户方式：</p><ul><li>**NONE** : 不通知（默认）</li><li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li></ul> 
     * @return NotifyType <p>通知用户方式：</p><ul><li>**NONE** : 不通知（默认）</li><li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li></ul>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set <p>通知用户方式：</p><ul><li>**NONE** : 不通知（默认）</li><li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li></ul>
     * @param NotifyType <p>通知用户方式：</p><ul><li>**NONE** : 不通知（默认）</li><li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li></ul>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get <p>批量签署的合同流程ID数组。<font color="red">此参数必传。</font><br>注: <code>在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。</code></p> 
     * @return FlowIds <p>批量签署的合同流程ID数组。<font color="red">此参数必传。</font><br>注: <code>在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。</code></p>
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set <p>批量签署的合同流程ID数组。<font color="red">此参数必传。</font><br>注: <code>在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。</code></p>
     * @param FlowIds <p>批量签署的合同流程ID数组。<font color="red">此参数必传。</font><br>注: <code>在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。</code></p>
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get <p>SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。</p><p>注：</p><ul><li>请确认该名称与企业营业执照中注册的名称一致。</li><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>请确保此企业已完成腾讯电子签企业认证。</li><li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数。如果此子客企业未认证，则此参数需要传子客企业名称**</li></ul> 
     * @return OrganizationName <p>SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。</p><p>注：</p><ul><li>请确认该名称与企业营业执照中注册的名称一致。</li><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>请确保此企业已完成腾讯电子签企业认证。</li><li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数。如果此子客企业未认证，则此参数需要传子客企业名称**</li></ul>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。</p><p>注：</p><ul><li>请确认该名称与企业营业执照中注册的名称一致。</li><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>请确保此企业已完成腾讯电子签企业认证。</li><li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数。如果此子客企业未认证，则此参数需要传子客企业名称**</li></ul>
     * @param OrganizationName <p>SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。</p><p>注：</p><ul><li>请确认该名称与企业营业执照中注册的名称一致。</li><li>如果名称中包含英文括号()，请使用中文括号（）代替。</li><li>请确保此企业已完成腾讯电子签企业认证。</li><li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数。如果此子客企业未认证，则此参数需要传子客企业名称**</li></ul>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>指定批量签署合同的签名类型，可传递以下值：<ul><li><strong>0</strong>：手写签名</li><li><strong>1</strong>：OCR楷体</li><li><strong>2</strong>：姓名印章</li><li><strong>3</strong>：图片印章</li><li><strong>4</strong>：系统签名</li><li><strong>5</strong>：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul></p> 
     * @return SignatureTypes <p>指定批量签署合同的签名类型，可传递以下值：<ul><li><strong>0</strong>：手写签名</li><li><strong>1</strong>：OCR楷体</li><li><strong>2</strong>：姓名印章</li><li><strong>3</strong>：图片印章</li><li><strong>4</strong>：系统签名</li><li><strong>5</strong>：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul></p>
     */
    public Long [] getSignatureTypes() {
        return this.SignatureTypes;
    }

    /**
     * Set <p>指定批量签署合同的签名类型，可传递以下值：<ul><li><strong>0</strong>：手写签名</li><li><strong>1</strong>：OCR楷体</li><li><strong>2</strong>：姓名印章</li><li><strong>3</strong>：图片印章</li><li><strong>4</strong>：系统签名</li><li><strong>5</strong>：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul></p>
     * @param SignatureTypes <p>指定批量签署合同的签名类型，可传递以下值：<ul><li><strong>0</strong>：手写签名</li><li><strong>1</strong>：OCR楷体</li><li><strong>2</strong>：姓名印章</li><li><strong>3</strong>：图片印章</li><li><strong>4</strong>：系统签名</li><li><strong>5</strong>：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li></ul></p>
     */
    public void setSignatureTypes(Long [] SignatureTypes) {
        this.SignatureTypes = SignatureTypes;
    }

    /**
     * Get <p>是否直接跳转至合同内容页面进行签署</p><ul><li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li><li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li></ul> 
     * @return JumpToDetail <p>是否直接跳转至合同内容页面进行签署</p><ul><li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li><li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li></ul>
     */
    public Boolean getJumpToDetail() {
        return this.JumpToDetail;
    }

    /**
     * Set <p>是否直接跳转至合同内容页面进行签署</p><ul><li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li><li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li></ul>
     * @param JumpToDetail <p>是否直接跳转至合同内容页面进行签署</p><ul><li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li><li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li></ul>
     */
    public void setJumpToDetail(Boolean JumpToDetail) {
        this.JumpToDetail = JumpToDetail;
    }

    /**
     * Get <p>批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。</p> 
     * @return FlowBatchUrlInfo <p>批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。</p>
     */
    public FlowBatchUrlInfo getFlowBatchUrlInfo() {
        return this.FlowBatchUrlInfo;
    }

    /**
     * Set <p>批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。</p>
     * @param FlowBatchUrlInfo <p>批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。</p>
     */
    public void setFlowBatchUrlInfo(FlowBatchUrlInfo FlowBatchUrlInfo) {
        this.FlowBatchUrlInfo = FlowBatchUrlInfo;
    }

    /**
     * Get <p>第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。</p><p>注：</p><ul><li>传入的OpenId对应员工在此子客企业下必须已经实名</li><li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li></ul> 
     * @return OpenId <p>第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。</p><p>注：</p><ul><li>传入的OpenId对应员工在此子客企业下必须已经实名</li><li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li></ul>
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set <p>第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。</p><p>注：</p><ul><li>传入的OpenId对应员工在此子客企业下必须已经实名</li><li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li></ul>
     * @param OpenId <p>第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。</p><p>注：</p><ul><li>传入的OpenId对应员工在此子客企业下必须已经实名</li><li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li></ul>
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。</p> 
     * @return OrganizationOpenId <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。</p>
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。</p>
     * @param OrganizationOpenId <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。</p>
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get <p>签署完成后是否自动回跳</p><ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol> 
     * @return AutoJumpBack <p>签署完成后是否自动回跳</p><ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol>
     */
    public Boolean getAutoJumpBack() {
        return this.AutoJumpBack;
    }

    /**
     * Set <p>签署完成后是否自动回跳</p><ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol>
     * @param AutoJumpBack <p>签署完成后是否自动回跳</p><ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol>
     */
    public void setAutoJumpBack(Boolean AutoJumpBack) {
        this.AutoJumpBack = AutoJumpBack;
    }

    /**
     * Get <p><font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 <strong>WeChatOfficialAccounts</strong>，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 </p><p>参考 <a href="https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC">公众号 H5 跳转电子签小程序</a>。</p> 
     * @return UrlUseEnv <p><font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 <strong>WeChatOfficialAccounts</strong>，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 </p><p>参考 <a href="https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC">公众号 H5 跳转电子签小程序</a>。</p>
     */
    public String getUrlUseEnv() {
        return this.UrlUseEnv;
    }

    /**
     * Set <p><font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 <strong>WeChatOfficialAccounts</strong>，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 </p><p>参考 <a href="https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC">公众号 H5 跳转电子签小程序</a>。</p>
     * @param UrlUseEnv <p><font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 <strong>WeChatOfficialAccounts</strong>，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 </p><p>参考 <a href="https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC">公众号 H5 跳转电子签小程序</a>。</p>
     */
    public void setUrlUseEnv(String UrlUseEnv) {
        this.UrlUseEnv = UrlUseEnv;
    }

    /**
     * Get <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul><br>注：<code>1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能</code></p> 
     * @return CanBatchReject <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul><br>注：<code>1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能</code></p>
     */
    public Boolean getCanBatchReject() {
        return this.CanBatchReject;
    }

    /**
     * Set <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul><br>注：<code>1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能</code></p>
     * @param CanBatchReject <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul><br>注：<code>1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能</code></p>
     */
    public void setCanBatchReject(Boolean CanBatchReject) {
        this.CanBatchReject = CanBatchReject;
    }

    /**
     * Get <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul><br>注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p> 
     * @return CanSkipReadFlow <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul><br>注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p>
     */
    public Boolean getCanSkipReadFlow() {
        return this.CanSkipReadFlow;
    }

    /**
     * Set <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul><br>注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p>
     * @param CanSkipReadFlow <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul><br>注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p>
     */
    public void setCanSkipReadFlow(Boolean CanSkipReadFlow) {
        this.CanSkipReadFlow = CanSkipReadFlow;
    }

    public ChannelCreateBatchSignUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateBatchSignUrlRequest(ChannelCreateBatchSignUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.SignatureTypes != null) {
            this.SignatureTypes = new Long[source.SignatureTypes.length];
            for (int i = 0; i < source.SignatureTypes.length; i++) {
                this.SignatureTypes[i] = new Long(source.SignatureTypes[i]);
            }
        }
        if (source.JumpToDetail != null) {
            this.JumpToDetail = new Boolean(source.JumpToDetail);
        }
        if (source.FlowBatchUrlInfo != null) {
            this.FlowBatchUrlInfo = new FlowBatchUrlInfo(source.FlowBatchUrlInfo);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.AutoJumpBack != null) {
            this.AutoJumpBack = new Boolean(source.AutoJumpBack);
        }
        if (source.UrlUseEnv != null) {
            this.UrlUseEnv = new String(source.UrlUseEnv);
        }
        if (source.CanBatchReject != null) {
            this.CanBatchReject = new Boolean(source.CanBatchReject);
        }
        if (source.CanSkipReadFlow != null) {
            this.CanSkipReadFlow = new Boolean(source.CanSkipReadFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamArraySimple(map, prefix + "SignatureTypes.", this.SignatureTypes);
        this.setParamSimple(map, prefix + "JumpToDetail", this.JumpToDetail);
        this.setParamObj(map, prefix + "FlowBatchUrlInfo.", this.FlowBatchUrlInfo);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "AutoJumpBack", this.AutoJumpBack);
        this.setParamSimple(map, prefix + "UrlUseEnv", this.UrlUseEnv);
        this.setParamSimple(map, prefix + "CanBatchReject", this.CanBatchReject);
        this.setParamSimple(map, prefix + "CanSkipReadFlow", this.CanSkipReadFlow);

    }
}

