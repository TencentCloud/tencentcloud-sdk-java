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
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。

注：
<ul>
<li>请确保和合同中填入的一致。</li>
<li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li>
</ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。

注：
<ul>
<li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li>
</ul>

    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 证件类型，支持以下类型
<ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li>
<li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li>
<li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。`
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。`
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 通知用户方式：
<ul>
<li>**NONE** : 不通知（默认）</li>
<li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li>
</ul>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 批量签署的合同流程ID数组。<font color="red">此参数必传。</font>
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。`
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。

注：
<ul>
<li>请确认该名称与企业营业执照中注册的名称一致。</li>
<li>如果名称中包含英文括号()，请使用中文括号（）代替。</li>
<li>请确保此企业已完成腾讯电子签企业认证。</li>
<li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数，此参数留空即可**</li>
</ul>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 指定批量签署合同的签名类型，可传递以下值：<ul><li>**0**：手写签名</li><li>**1**：OCR楷体</li><li>**2**：姓名印章</li><li>**3**：图片印章</li><li>**4**：系统签名</li><li>**5**：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li><li>若签署方为企业员工，此参数无效，签名方式将以合同中为准。</li></ul>
    */
    @SerializedName("SignatureTypes")
    @Expose
    private Long [] SignatureTypes;

    /**
    * 是否直接跳转至合同内容页面进行签署
<ul>
<li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li>
<li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li>
</ul>
    */
    @SerializedName("JumpToDetail")
    @Expose
    private Boolean JumpToDetail;

    /**
    * 批量签署合同相关信息，指定合同和签署方的信息，用于补充动态签署人。	
    */
    @SerializedName("FlowBatchUrlInfo")
    @Expose
    private FlowBatchUrlInfo FlowBatchUrlInfo;

    /**
    * 第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。

注：
<ul>
<li>传入的OpenId对应员工在此子客企业下必须已经实名</li>
<li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li>
</ul>
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 签署完成后是否自动回跳
<ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font> 
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
    * <font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 **WeChatOfficialAccounts**，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 

参考 [公众号 H5 跳转电子签小程序](https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC)。
    */
    @SerializedName("UrlUseEnv")
    @Expose
    private String UrlUseEnv;

    /**
    * 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>
注：`1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能`
    */
    @SerializedName("CanBatchReject")
    @Expose
    private Boolean CanBatchReject;

    /**
    * 是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul>
注：`1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。`
    */
    @SerializedName("CanSkipReadFlow")
    @Expose
    private Boolean CanSkipReadFlow;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。

注：
<ul>
<li>请确保和合同中填入的一致。</li>
<li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li>
</ul> 
     * @return Name 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。

注：
<ul>
<li>请确保和合同中填入的一致。</li>
<li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li>
</ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。

注：
<ul>
<li>请确保和合同中填入的一致。</li>
<li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li>
</ul>
     * @param Name 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。

注：
<ul>
<li>请确保和合同中填入的一致。</li>
<li>在动态签署人补充链接场景中，可以通过传入这个值，对补充的个人参与方信息进行限制。仅匹配传入姓名的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。</li>
</ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。

注：
<ul>
<li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li>
</ul>
 
     * @return Mobile 手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。

注：
<ul>
<li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li>
</ul>

     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。

注：
<ul>
<li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li>
</ul>

     * @param Mobile 手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。

注：
<ul>
<li>请确保和合同中填入的一致,  若无法保持一致，请确保在发起和生成批量签署链接时传入相同的参与方证件信息。</li><li>在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入手机号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。 </li>
</ul>

     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 证件类型，支持以下类型
<ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li>
<li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li>
<li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。` 
     * @return IdCardType 证件类型，支持以下类型
<ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li>
<li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li>
<li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。`
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 证件类型，支持以下类型
<ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li>
<li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li>
<li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。`
     * @param IdCardType 证件类型，支持以下类型
<ul><li>**ID_CARD** : 中国大陆居民身份证 (默认值)</li>
<li>**HONGKONG_AND_MACAO** : 中国港澳居民来往内地通行证</li>
<li>**HONGKONG_MACAO_AND_TAIWAN** : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件类型的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方，且需要和证件号参数一同传递，不能单独进行限制。`
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。` 
     * @return IdCardNumber 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。`
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。`
     * @param IdCardNumber 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>

注：
1. `请确保和合同中填入的一致`。
2. `在生成动态签署人补充链接场景中，可以通过传入此值，对补充的个人参与方信息进行限制。仅匹配传入证件号的参与方才能补充合同。此参数预设信息功能暂时仅支持个人动态参与方。`
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 通知用户方式：
<ul>
<li>**NONE** : 不通知（默认）</li>
<li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li>
</ul> 
     * @return NotifyType 通知用户方式：
<ul>
<li>**NONE** : 不通知（默认）</li>
<li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li>
</ul>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知用户方式：
<ul>
<li>**NONE** : 不通知（默认）</li>
<li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li>
</ul>
     * @param NotifyType 通知用户方式：
<ul>
<li>**NONE** : 不通知（默认）</li>
<li>**SMS** : 短信通知（发送短信通知到Mobile参数所传的手机号）</li>
</ul>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 批量签署的合同流程ID数组。<font color="red">此参数必传。</font>
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。` 
     * @return FlowIds 批量签署的合同流程ID数组。<font color="red">此参数必传。</font>
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。`
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 批量签署的合同流程ID数组。<font color="red">此参数必传。</font>
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。`
     * @param FlowIds 批量签署的合同流程ID数组。<font color="red">此参数必传。</font>
注: `在调用此接口时，请确保合同流程均为本企业发起，且合同数量不超过100个。`
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。

注：
<ul>
<li>请确认该名称与企业营业执照中注册的名称一致。</li>
<li>如果名称中包含英文括号()，请使用中文括号（）代替。</li>
<li>请确保此企业已完成腾讯电子签企业认证。</li>
<li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数，此参数留空即可**</li>
</ul> 
     * @return OrganizationName SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。

注：
<ul>
<li>请确认该名称与企业营业执照中注册的名称一致。</li>
<li>如果名称中包含英文括号()，请使用中文括号（）代替。</li>
<li>请确保此企业已完成腾讯电子签企业认证。</li>
<li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数，此参数留空即可**</li>
</ul>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。

注：
<ul>
<li>请确认该名称与企业营业执照中注册的名称一致。</li>
<li>如果名称中包含英文括号()，请使用中文括号（）代替。</li>
<li>请确保此企业已完成腾讯电子签企业认证。</li>
<li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数，此参数留空即可**</li>
</ul>
     * @param OrganizationName SaaS平台企业员工签署方的企业名称。目标签署人如果为saas应用企业员工身份，此参数必填。

注：
<ul>
<li>请确认该名称与企业营业执照中注册的名称一致。</li>
<li>如果名称中包含英文括号()，请使用中文括号（）代替。</li>
<li>请确保此企业已完成腾讯电子签企业认证。</li>
<li>**若为子客企业员工，请使用OpenId，OrganizationOpenId参数，此参数留空即可**</li>
</ul>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 指定批量签署合同的签名类型，可传递以下值：<ul><li>**0**：手写签名</li><li>**1**：OCR楷体</li><li>**2**：姓名印章</li><li>**3**：图片印章</li><li>**4**：系统签名</li><li>**5**：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li><li>若签署方为企业员工，此参数无效，签名方式将以合同中为准。</li></ul> 
     * @return SignatureTypes 指定批量签署合同的签名类型，可传递以下值：<ul><li>**0**：手写签名</li><li>**1**：OCR楷体</li><li>**2**：姓名印章</li><li>**3**：图片印章</li><li>**4**：系统签名</li><li>**5**：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li><li>若签署方为企业员工，此参数无效，签名方式将以合同中为准。</li></ul>
     */
    public Long [] getSignatureTypes() {
        return this.SignatureTypes;
    }

    /**
     * Set 指定批量签署合同的签名类型，可传递以下值：<ul><li>**0**：手写签名</li><li>**1**：OCR楷体</li><li>**2**：姓名印章</li><li>**3**：图片印章</li><li>**4**：系统签名</li><li>**5**：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li><li>若签署方为企业员工，此参数无效，签名方式将以合同中为准。</li></ul>
     * @param SignatureTypes 指定批量签署合同的签名类型，可传递以下值：<ul><li>**0**：手写签名</li><li>**1**：OCR楷体</li><li>**2**：姓名印章</li><li>**3**：图片印章</li><li>**4**：系统签名</li><li>**5**：长效手写签名（包含手写签名）</li></ul>注：<ul><li>不传值的情况则计算所有合同中个人签署区的签名类型，规则如下：<ul><li>1.如果所有合同中所有的个人签署区方式包含多种则是手写</li><li>2.如果所有合同中所有个人签名区签名类型仅为一种则就是那一种签名方式（例如合同1有多个签署区都是指定OCR楷体，合同2中也是多个签署区都是指定OCR楷体...则使用OCR楷体）</li></ul></li><li>该参数会覆盖您合同中的签名类型，若您在发起合同时限定了签名类型(赋值签名类型给ComponentTypeLimit)，请将这些签名类型赋予此参数</li><li>若签署方为企业员工，此参数无效，签名方式将以合同中为准。</li></ul>
     */
    public void setSignatureTypes(Long [] SignatureTypes) {
        this.SignatureTypes = SignatureTypes;
    }

    /**
     * Get 是否直接跳转至合同内容页面进行签署
<ul>
<li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li>
<li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li>
</ul> 
     * @return JumpToDetail 是否直接跳转至合同内容页面进行签署
<ul>
<li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li>
<li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li>
</ul>
     */
    public Boolean getJumpToDetail() {
        return this.JumpToDetail;
    }

    /**
     * Set 是否直接跳转至合同内容页面进行签署
<ul>
<li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li>
<li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li>
</ul>
     * @param JumpToDetail 是否直接跳转至合同内容页面进行签署
<ul>
<li>**false**: 会跳转至批量合同流程的列表,  点击需要批量签署合同后进入合同内容页面进行签署(默认)</li>
<li>**true**: 跳过合同流程列表, 直接进入合同内容页面进行签署</li>
</ul>
     */
    public void setJumpToDetail(Boolean JumpToDetail) {
        this.JumpToDetail = JumpToDetail;
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
     * Get 第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。

注：
<ul>
<li>传入的OpenId对应员工在此子客企业下必须已经实名</li>
<li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li>
</ul> 
     * @return OpenId 第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。

注：
<ul>
<li>传入的OpenId对应员工在此子客企业下必须已经实名</li>
<li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li>
</ul>
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。

注：
<ul>
<li>传入的OpenId对应员工在此子客企业下必须已经实名</li>
<li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li>
</ul>
     * @param OpenId 第三方平台子客企业员工的标识OpenId，批签合同经办人为子客员工的情况下为必填。

注：
<ul>
<li>传入的OpenId对应员工在此子客企业下必须已经实名</li>
<li>传递了此参数可以无需传递Name，Mobile，IdCardNumber，IdCardType参数。系统会根据员工OpenId自动拉取实名信息。</li>
</ul>
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。 
     * @return OrganizationOpenId 第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。
     * @param OrganizationOpenId 第三方平台子客企业的企业的标识, 即OrganizationOpenId，批签合同经办人为子客企业员工是为必填。
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 签署完成后是否自动回跳
<ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font>  
     * @return AutoJumpBack 签署完成后是否自动回跳
<ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font> 
     */
    public Boolean getAutoJumpBack() {
        return this.AutoJumpBack;
    }

    /**
     * Set 签署完成后是否自动回跳
<ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font> 
     * @param AutoJumpBack 签署完成后是否自动回跳
<ul><li>false：否, 签署完成不会自动跳转回来(默认)</li><li>true：是, 签署完成会自动跳转回来</li></ul>

注: 
1. 该参数<font color="red">只针对APP类型（电子签小程序跳转贵方小程序）场景</font> 的签署链接有效
2. <font color="red">手机应用APP 或 微信小程序需要监控界面的返回走后序逻辑</font>, 微信小程序的文档可以参考[这个](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html#onShow-Object-object)
3. <font color="red">电子签小程序跳转贵方APP，不支持自动跳转，必需用户手动点击完成按钮（微信的限制）</font> 
     */
    public void setAutoJumpBack(Boolean AutoJumpBack) {
        this.AutoJumpBack = AutoJumpBack;
    }

    /**
     * Get <font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 **WeChatOfficialAccounts**，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 

参考 [公众号 H5 跳转电子签小程序](https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC)。 
     * @return UrlUseEnv <font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 **WeChatOfficialAccounts**，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 

参考 [公众号 H5 跳转电子签小程序](https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC)。
     */
    public String getUrlUseEnv() {
        return this.UrlUseEnv;
    }

    /**
     * Set <font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 **WeChatOfficialAccounts**，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 

参考 [公众号 H5 跳转电子签小程序](https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC)。
     * @param UrlUseEnv <font color="red">仅公众号 H5 跳转电子签小程序时</font>，如需签署完成的“返回应用”功能，在获取签署链接接口的 UrlUseEnv 参数需设置为 **WeChatOfficialAccounts**，小程序签署成功的结果页面中才会出现“返回应用”按钮。在用户点击“返回应用”按钮之后，会返回到公众号 H5。 

参考 [公众号 H5 跳转电子签小程序](https://qian.tencent.com/developers/company/openwxminiprogram/#23-%E5%85%AC%E4%BC%97%E5%8F%B7-h5-%E4%B8%AD%E8%B7%B3%E8%BD%AC)。
     */
    public void setUrlUseEnv(String UrlUseEnv) {
        this.UrlUseEnv = UrlUseEnv;
    }

    /**
     * Get 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>
注：`1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能` 
     * @return CanBatchReject 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>
注：`1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能`
     */
    public Boolean getCanBatchReject() {
        return this.CanBatchReject;
    }

    /**
     * Set 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>
注：`1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能`
     * @param CanBatchReject 是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul>
注：`1. 当前合同组不支持批量拒签功能。请对合同组中的每个子合同逐一执行拒签操作，以达到拒签整个合同组的效果。2. 如果是链接直接跳转至详情页（JumpToDetail参数为true），也不支持批量拒签功能`
     */
    public void setCanBatchReject(Boolean CanBatchReject) {
        this.CanBatchReject = CanBatchReject;
    }

    /**
     * Get 是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul>
注：`1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。` 
     * @return CanSkipReadFlow 是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul>
注：`1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。`
     */
    public Boolean getCanSkipReadFlow() {
        return this.CanSkipReadFlow;
    }

    /**
     * Set 是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul>
注：`1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。`
     * @param CanSkipReadFlow 是否允许此链接中签署方批量确认已读文件。 <ul><li>false (默认): 不允许批量确认已读文件。</li> <li>true : 允许批量确认已读文件。</li></ul>
注：`1. 此功能为白名单功能，使用前请联系对应客户经理进行开通。2. 使用此功能时，FlowIds参数必传。3. 对于企业签署方，如果对印章/签名控件有限制要求，需要保证所有印章/签名控件的限制要求(印章id或印章/签名类型限制)一致，否则无法使用此功能。`
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

