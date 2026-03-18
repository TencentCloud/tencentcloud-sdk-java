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

public class CreateSignUrlsRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>合同流程ID数组，最多支持100个。</p><p>注: </p><ol><li>必须选择提供此参数或合同组编号中的一个。</li><li>当生成类型（GenerateType）设为“ALL”时，不可提供多个流程ID。</li></ol>
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * <p>合同组编号<br>注：<code>该参数和合同流程ID数组必须二选一</code></p>
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * <p>签署链接类型,可以设置的参数如下</p><ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li><li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接(<b>GenerateType非ALL时候不能设置成CHANNEL</b>)</li><li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li><li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul><p><strong>注：</strong>动态签署人场景，如果签署链接类型设置为<code>APP</code>，则仅支持跳转到封面页。</p><p>详细使用场景可以参考接口描述说明中的 <strong>主要使用场景EndPoint分类</strong></p>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>签署链接生成类型，可以选择的类型如下</p><ul><li><strong>ALL</strong>：（默认）为所有签署方生成签署链接，但不包括自动签署（静默签署）的签署方。注意：<strong>此中类型不支持多个合同ID（FlowIds）</strong>。</li><li><strong>CHANNEL</strong>：适用于第三方子企业的员工签署方。</li><li><strong>NOT_CHANNEL</strong>：适用于SaaS平台企业的员工签署方。</li><li><strong>PERSON</strong>：适用于个人或自然人签署方。</li><li><strong>FOLLOWER</strong>：适用于关注方，目前指合同的抄送方。</li><li><strong>RECIPIENT</strong>：根据RecipientId生成对应的签署链接，适用于动态添加签署人的情况。</li></ul>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>SaaS平台企业员工签署方的企业名称如果名称中包含英文括号()，请使用中文括号（）代替。  注:  <code>1.GenerateType为&quot;NOT_CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的企业,预设后只能以该企业身份去领取合同并完成签署</code></p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>合同流程里边参与方的姓名。<br>注: </p><ol><li><code>GenerateType为&quot;PERSON&quot;(即个人签署方)时必填</code>。</li><li><code>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>注:  </p><ol><li><code>GenerateType为&quot;PERSON&quot;或&quot;FOLLOWER&quot;时必填。</code></li><li><code>在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></p>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * <p>证件号码，应符合以下规则</p><ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></p>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId。 注:  <code>1.GenerateType为&quot;CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的平台子客企业,预设后只能以该平台子客企业身份去领取合同并完成签署</code></p>
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * <p>第三方平台子客企业员工的标识OpenId，GenerateType为&quot;CHANNEL&quot;时可用，指定到具体参与人, 仅展示已经实名的经办人信息</p><p>注：<br>如果传进来的<font color="red">OpenId已经实名并且加入企业， 则忽略Name，IdCardType，IdCardNumber，Mobile这四个入参</font>（会用此OpenId实名的身份证和登录的手机号覆盖）</p>
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * <p>签署完成后是否自动回跳</p><ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul><p>注: </p><ol><li>该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效</li><li><font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考<a href="https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object">这个</a></li><li><font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font></li></ol>
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
    * <p>签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。</p>
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * <p>暂未开放</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>生成的签署链接在签署页面隐藏的按钮列表，可设置如下：</p><ul><li> **0** :合同签署页面更多操作按钮</li><li> **1** :合同签署页面更多操作的拒绝签署按钮</li><li> **2** :合同签署页面更多操作的转他人处理按钮</li><li> **3** :签署成功页的查看详情按钮</li><li> **4** :合同签署页面更多操作的查看合同基本信息按钮</li><li> **5** :合同签署页面更多操作的撤销按钮</li></ul><p>注:  <code>字段为数组, 可以传值隐藏多个按钮</code></p>
    */
    @SerializedName("Hides")
    @Expose
    private Long [] Hides;

    /**
    * <p>参与方角色ID，用于生成动态签署人链接完成领取。</p><p>注：<code>使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID</code>，</p>
    */
    @SerializedName("RecipientIds")
    @Expose
    private String [] RecipientIds;

    /**
    * <p>合同组相关信息，指定合同组子合同和签署方的信息，用于补充动态签署人。</p>
    */
    @SerializedName("FlowGroupUrlInfo")
    @Expose
    private FlowGroupUrlInfo FlowGroupUrlInfo;

    /**
    * <p><font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 <strong>WeChatOfficialAccounts</strong>，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 </p><p>参考 <a href="https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC">公众号 H5 跳转电子签小程序</a>。</p>
    */
    @SerializedName("UrlUseEnv")
    @Expose
    private String UrlUseEnv;

    /**
    * <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul> 注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名签署控件限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p><p>默认值：false</p>
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
     * Get <p>合同流程ID数组，最多支持100个。</p><p>注: </p><ol><li>必须选择提供此参数或合同组编号中的一个。</li><li>当生成类型（GenerateType）设为“ALL”时，不可提供多个流程ID。</li></ol> 
     * @return FlowIds <p>合同流程ID数组，最多支持100个。</p><p>注: </p><ol><li>必须选择提供此参数或合同组编号中的一个。</li><li>当生成类型（GenerateType）设为“ALL”时，不可提供多个流程ID。</li></ol>
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set <p>合同流程ID数组，最多支持100个。</p><p>注: </p><ol><li>必须选择提供此参数或合同组编号中的一个。</li><li>当生成类型（GenerateType）设为“ALL”时，不可提供多个流程ID。</li></ol>
     * @param FlowIds <p>合同流程ID数组，最多支持100个。</p><p>注: </p><ol><li>必须选择提供此参数或合同组编号中的一个。</li><li>当生成类型（GenerateType）设为“ALL”时，不可提供多个流程ID。</li></ol>
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get <p>合同组编号<br>注：<code>该参数和合同流程ID数组必须二选一</code></p> 
     * @return FlowGroupId <p>合同组编号<br>注：<code>该参数和合同流程ID数组必须二选一</code></p>
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set <p>合同组编号<br>注：<code>该参数和合同流程ID数组必须二选一</code></p>
     * @param FlowGroupId <p>合同组编号<br>注：<code>该参数和合同流程ID数组必须二选一</code></p>
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get <p>签署链接类型,可以设置的参数如下</p><ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li><li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接(<b>GenerateType非ALL时候不能设置成CHANNEL</b>)</li><li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li><li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul><p><strong>注：</strong>动态签署人场景，如果签署链接类型设置为<code>APP</code>，则仅支持跳转到封面页。</p><p>详细使用场景可以参考接口描述说明中的 <strong>主要使用场景EndPoint分类</strong></p> 
     * @return Endpoint <p>签署链接类型,可以设置的参数如下</p><ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li><li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接(<b>GenerateType非ALL时候不能设置成CHANNEL</b>)</li><li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li><li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul><p><strong>注：</strong>动态签署人场景，如果签署链接类型设置为<code>APP</code>，则仅支持跳转到封面页。</p><p>详细使用场景可以参考接口描述说明中的 <strong>主要使用场景EndPoint分类</strong></p>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>签署链接类型,可以设置的参数如下</p><ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li><li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接(<b>GenerateType非ALL时候不能设置成CHANNEL</b>)</li><li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li><li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul><p><strong>注：</strong>动态签署人场景，如果签署链接类型设置为<code>APP</code>，则仅支持跳转到封面页。</p><p>详细使用场景可以参考接口描述说明中的 <strong>主要使用场景EndPoint分类</strong></p>
     * @param Endpoint <p>签署链接类型,可以设置的参数如下</p><ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li><li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接(<b>GenerateType非ALL时候不能设置成CHANNEL</b>)</li><li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li><li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul><p><strong>注：</strong>动态签署人场景，如果签署链接类型设置为<code>APP</code>，则仅支持跳转到封面页。</p><p>详细使用场景可以参考接口描述说明中的 <strong>主要使用场景EndPoint分类</strong></p>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>签署链接生成类型，可以选择的类型如下</p><ul><li><strong>ALL</strong>：（默认）为所有签署方生成签署链接，但不包括自动签署（静默签署）的签署方。注意：<strong>此中类型不支持多个合同ID（FlowIds）</strong>。</li><li><strong>CHANNEL</strong>：适用于第三方子企业的员工签署方。</li><li><strong>NOT_CHANNEL</strong>：适用于SaaS平台企业的员工签署方。</li><li><strong>PERSON</strong>：适用于个人或自然人签署方。</li><li><strong>FOLLOWER</strong>：适用于关注方，目前指合同的抄送方。</li><li><strong>RECIPIENT</strong>：根据RecipientId生成对应的签署链接，适用于动态添加签署人的情况。</li></ul> 
     * @return GenerateType <p>签署链接生成类型，可以选择的类型如下</p><ul><li><strong>ALL</strong>：（默认）为所有签署方生成签署链接，但不包括自动签署（静默签署）的签署方。注意：<strong>此中类型不支持多个合同ID（FlowIds）</strong>。</li><li><strong>CHANNEL</strong>：适用于第三方子企业的员工签署方。</li><li><strong>NOT_CHANNEL</strong>：适用于SaaS平台企业的员工签署方。</li><li><strong>PERSON</strong>：适用于个人或自然人签署方。</li><li><strong>FOLLOWER</strong>：适用于关注方，目前指合同的抄送方。</li><li><strong>RECIPIENT</strong>：根据RecipientId生成对应的签署链接，适用于动态添加签署人的情况。</li></ul>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>签署链接生成类型，可以选择的类型如下</p><ul><li><strong>ALL</strong>：（默认）为所有签署方生成签署链接，但不包括自动签署（静默签署）的签署方。注意：<strong>此中类型不支持多个合同ID（FlowIds）</strong>。</li><li><strong>CHANNEL</strong>：适用于第三方子企业的员工签署方。</li><li><strong>NOT_CHANNEL</strong>：适用于SaaS平台企业的员工签署方。</li><li><strong>PERSON</strong>：适用于个人或自然人签署方。</li><li><strong>FOLLOWER</strong>：适用于关注方，目前指合同的抄送方。</li><li><strong>RECIPIENT</strong>：根据RecipientId生成对应的签署链接，适用于动态添加签署人的情况。</li></ul>
     * @param GenerateType <p>签署链接生成类型，可以选择的类型如下</p><ul><li><strong>ALL</strong>：（默认）为所有签署方生成签署链接，但不包括自动签署（静默签署）的签署方。注意：<strong>此中类型不支持多个合同ID（FlowIds）</strong>。</li><li><strong>CHANNEL</strong>：适用于第三方子企业的员工签署方。</li><li><strong>NOT_CHANNEL</strong>：适用于SaaS平台企业的员工签署方。</li><li><strong>PERSON</strong>：适用于个人或自然人签署方。</li><li><strong>FOLLOWER</strong>：适用于关注方，目前指合同的抄送方。</li><li><strong>RECIPIENT</strong>：根据RecipientId生成对应的签署链接，适用于动态添加签署人的情况。</li></ul>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>SaaS平台企业员工签署方的企业名称如果名称中包含英文括号()，请使用中文括号（）代替。  注:  <code>1.GenerateType为&quot;NOT_CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的企业,预设后只能以该企业身份去领取合同并完成签署</code></p> 
     * @return OrganizationName <p>SaaS平台企业员工签署方的企业名称如果名称中包含英文括号()，请使用中文括号（）代替。  注:  <code>1.GenerateType为&quot;NOT_CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的企业,预设后只能以该企业身份去领取合同并完成签署</code></p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>SaaS平台企业员工签署方的企业名称如果名称中包含英文括号()，请使用中文括号（）代替。  注:  <code>1.GenerateType为&quot;NOT_CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的企业,预设后只能以该企业身份去领取合同并完成签署</code></p>
     * @param OrganizationName <p>SaaS平台企业员工签署方的企业名称如果名称中包含英文括号()，请使用中文括号（）代替。  注:  <code>1.GenerateType为&quot;NOT_CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的企业,预设后只能以该企业身份去领取合同并完成签署</code></p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>合同流程里边参与方的姓名。<br>注: </p><ol><li><code>GenerateType为&quot;PERSON&quot;(即个人签署方)时必填</code>。</li><li><code>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol> 
     * @return Name <p>合同流程里边参与方的姓名。<br>注: </p><ol><li><code>GenerateType为&quot;PERSON&quot;(即个人签署方)时必填</code>。</li><li><code>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>合同流程里边参与方的姓名。<br>注: </p><ol><li><code>GenerateType为&quot;PERSON&quot;(即个人签署方)时必填</code>。</li><li><code>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
     * @param Name <p>合同流程里边参与方的姓名。<br>注: </p><ol><li><code>GenerateType为&quot;PERSON&quot;(即个人签署方)时必填</code>。</li><li><code>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>注:  </p><ol><li><code>GenerateType为&quot;PERSON&quot;或&quot;FOLLOWER&quot;时必填。</code></li><li><code>在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol> 
     * @return Mobile <p>合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>注:  </p><ol><li><code>GenerateType为&quot;PERSON&quot;或&quot;FOLLOWER&quot;时必填。</code></li><li><code>在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>注:  </p><ol><li><code>GenerateType为&quot;PERSON&quot;或&quot;FOLLOWER&quot;时必填。</code></li><li><code>在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
     * @param Mobile <p>合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。<br>注:  </p><ol><li><code>GenerateType为&quot;PERSON&quot;或&quot;FOLLOWER&quot;时必填。</code></li><li><code>在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></li></ol>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></p> 
     * @return IdCardType <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></p>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></p>
     * @param IdCardType <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。</code></p>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get <p>证件号码，应符合以下规则</p><ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></p> 
     * @return IdCardNumber <p>证件号码，应符合以下规则</p><ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></p>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set <p>证件号码，应符合以下规则</p><ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></p>
     * @param IdCardNumber <p>证件号码，应符合以下规则</p><ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p><code>注：在动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</code></p>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId。 注:  <code>1.GenerateType为&quot;CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的平台子客企业,预设后只能以该平台子客企业身份去领取合同并完成签署</code></p> 
     * @return OrganizationOpenId <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId。 注:  <code>1.GenerateType为&quot;CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的平台子客企业,预设后只能以该平台子客企业身份去领取合同并完成签署</code></p>
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId。 注:  <code>1.GenerateType为&quot;CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的平台子客企业,预设后只能以该平台子客企业身份去领取合同并完成签署</code></p>
     * @param OrganizationOpenId <p>第三方平台子客企业的企业的标识, 即OrganizationOpenId。 注:  <code>1.GenerateType为&quot;CHANNEL&quot;时必填</code> <code>2.获取B端动态签署人领取链接时,可指定此字段来预先设定签署人的平台子客企业,预设后只能以该平台子客企业身份去领取合同并完成签署</code></p>
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get <p>第三方平台子客企业员工的标识OpenId，GenerateType为&quot;CHANNEL&quot;时可用，指定到具体参与人, 仅展示已经实名的经办人信息</p><p>注：<br>如果传进来的<font color="red">OpenId已经实名并且加入企业， 则忽略Name，IdCardType，IdCardNumber，Mobile这四个入参</font>（会用此OpenId实名的身份证和登录的手机号覆盖）</p> 
     * @return OpenId <p>第三方平台子客企业员工的标识OpenId，GenerateType为&quot;CHANNEL&quot;时可用，指定到具体参与人, 仅展示已经实名的经办人信息</p><p>注：<br>如果传进来的<font color="red">OpenId已经实名并且加入企业， 则忽略Name，IdCardType，IdCardNumber，Mobile这四个入参</font>（会用此OpenId实名的身份证和登录的手机号覆盖）</p>
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set <p>第三方平台子客企业员工的标识OpenId，GenerateType为&quot;CHANNEL&quot;时可用，指定到具体参与人, 仅展示已经实名的经办人信息</p><p>注：<br>如果传进来的<font color="red">OpenId已经实名并且加入企业， 则忽略Name，IdCardType，IdCardNumber，Mobile这四个入参</font>（会用此OpenId实名的身份证和登录的手机号覆盖）</p>
     * @param OpenId <p>第三方平台子客企业员工的标识OpenId，GenerateType为&quot;CHANNEL&quot;时可用，指定到具体参与人, 仅展示已经实名的经办人信息</p><p>注：<br>如果传进来的<font color="red">OpenId已经实名并且加入企业， 则忽略Name，IdCardType，IdCardNumber，Mobile这四个入参</font>（会用此OpenId实名的身份证和登录的手机号覆盖）</p>
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
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
     * Get <p>签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。</p> 
     * @return JumpUrl <p>签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。</p>
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set <p>签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。</p>
     * @param JumpUrl <p>签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。</p>
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get <p>暂未开放</p> 
     * @return Operator <p>暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>暂未开放</p>
     * @param Operator <p>暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>生成的签署链接在签署页面隐藏的按钮列表，可设置如下：</p><ul><li> **0** :合同签署页面更多操作按钮</li><li> **1** :合同签署页面更多操作的拒绝签署按钮</li><li> **2** :合同签署页面更多操作的转他人处理按钮</li><li> **3** :签署成功页的查看详情按钮</li><li> **4** :合同签署页面更多操作的查看合同基本信息按钮</li><li> **5** :合同签署页面更多操作的撤销按钮</li></ul><p>注:  <code>字段为数组, 可以传值隐藏多个按钮</code></p> 
     * @return Hides <p>生成的签署链接在签署页面隐藏的按钮列表，可设置如下：</p><ul><li> **0** :合同签署页面更多操作按钮</li><li> **1** :合同签署页面更多操作的拒绝签署按钮</li><li> **2** :合同签署页面更多操作的转他人处理按钮</li><li> **3** :签署成功页的查看详情按钮</li><li> **4** :合同签署页面更多操作的查看合同基本信息按钮</li><li> **5** :合同签署页面更多操作的撤销按钮</li></ul><p>注:  <code>字段为数组, 可以传值隐藏多个按钮</code></p>
     */
    public Long [] getHides() {
        return this.Hides;
    }

    /**
     * Set <p>生成的签署链接在签署页面隐藏的按钮列表，可设置如下：</p><ul><li> **0** :合同签署页面更多操作按钮</li><li> **1** :合同签署页面更多操作的拒绝签署按钮</li><li> **2** :合同签署页面更多操作的转他人处理按钮</li><li> **3** :签署成功页的查看详情按钮</li><li> **4** :合同签署页面更多操作的查看合同基本信息按钮</li><li> **5** :合同签署页面更多操作的撤销按钮</li></ul><p>注:  <code>字段为数组, 可以传值隐藏多个按钮</code></p>
     * @param Hides <p>生成的签署链接在签署页面隐藏的按钮列表，可设置如下：</p><ul><li> **0** :合同签署页面更多操作按钮</li><li> **1** :合同签署页面更多操作的拒绝签署按钮</li><li> **2** :合同签署页面更多操作的转他人处理按钮</li><li> **3** :签署成功页的查看详情按钮</li><li> **4** :合同签署页面更多操作的查看合同基本信息按钮</li><li> **5** :合同签署页面更多操作的撤销按钮</li></ul><p>注:  <code>字段为数组, 可以传值隐藏多个按钮</code></p>
     */
    public void setHides(Long [] Hides) {
        this.Hides = Hides;
    }

    /**
     * Get <p>参与方角色ID，用于生成动态签署人链接完成领取。</p><p>注：<code>使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID</code>，</p> 
     * @return RecipientIds <p>参与方角色ID，用于生成动态签署人链接完成领取。</p><p>注：<code>使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID</code>，</p>
     */
    public String [] getRecipientIds() {
        return this.RecipientIds;
    }

    /**
     * Set <p>参与方角色ID，用于生成动态签署人链接完成领取。</p><p>注：<code>使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID</code>，</p>
     * @param RecipientIds <p>参与方角色ID，用于生成动态签署人链接完成领取。</p><p>注：<code>使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID</code>，</p>
     */
    public void setRecipientIds(String [] RecipientIds) {
        this.RecipientIds = RecipientIds;
    }

    /**
     * Get <p>合同组相关信息，指定合同组子合同和签署方的信息，用于补充动态签署人。</p> 
     * @return FlowGroupUrlInfo <p>合同组相关信息，指定合同组子合同和签署方的信息，用于补充动态签署人。</p>
     */
    public FlowGroupUrlInfo getFlowGroupUrlInfo() {
        return this.FlowGroupUrlInfo;
    }

    /**
     * Set <p>合同组相关信息，指定合同组子合同和签署方的信息，用于补充动态签署人。</p>
     * @param FlowGroupUrlInfo <p>合同组相关信息，指定合同组子合同和签署方的信息，用于补充动态签署人。</p>
     */
    public void setFlowGroupUrlInfo(FlowGroupUrlInfo FlowGroupUrlInfo) {
        this.FlowGroupUrlInfo = FlowGroupUrlInfo;
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
     * Get <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul> 注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名签署控件限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p><p>默认值：false</p> 
     * @return CanSkipReadFlow <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul> 注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名签署控件限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p><p>默认值：false</p>
     */
    public Boolean getCanSkipReadFlow() {
        return this.CanSkipReadFlow;
    }

    /**
     * Set <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul> 注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名签署控件限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p><p>默认值：false</p>
     * @param CanSkipReadFlow <p>是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul> 注：<code>1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名签署控件限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。</code></p><p>默认值：false</p>
     */
    public void setCanSkipReadFlow(Boolean CanSkipReadFlow) {
        this.CanSkipReadFlow = CanSkipReadFlow;
    }

    public CreateSignUrlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSignUrlsRequest(CreateSignUrlsRequest source) {
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
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.AutoJumpBack != null) {
            this.AutoJumpBack = new Boolean(source.AutoJumpBack);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Hides != null) {
            this.Hides = new Long[source.Hides.length];
            for (int i = 0; i < source.Hides.length; i++) {
                this.Hides[i] = new Long(source.Hides[i]);
            }
        }
        if (source.RecipientIds != null) {
            this.RecipientIds = new String[source.RecipientIds.length];
            for (int i = 0; i < source.RecipientIds.length; i++) {
                this.RecipientIds[i] = new String(source.RecipientIds[i]);
            }
        }
        if (source.FlowGroupUrlInfo != null) {
            this.FlowGroupUrlInfo = new FlowGroupUrlInfo(source.FlowGroupUrlInfo);
        }
        if (source.UrlUseEnv != null) {
            this.UrlUseEnv = new String(source.UrlUseEnv);
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
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "AutoJumpBack", this.AutoJumpBack);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "Hides.", this.Hides);
        this.setParamArraySimple(map, prefix + "RecipientIds.", this.RecipientIds);
        this.setParamObj(map, prefix + "FlowGroupUrlInfo.", this.FlowGroupUrlInfo);
        this.setParamSimple(map, prefix + "UrlUseEnv", this.UrlUseEnv);
        this.setParamSimple(map, prefix + "CanSkipReadFlow", this.CanSkipReadFlow);

    }
}

