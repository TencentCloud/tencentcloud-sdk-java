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

public class FlowApproverInfo extends AbstractModel {

    /**
    * 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE : 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。`
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)， 不支持海外手机号。
请确认手机号所有方为此合同签署方。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。
<ul>
<li>false: 默认值，第三方平台子客企业下员工</li>
<li>true: SaaS平台企业下的员工</li>
</ul>

    */
    @SerializedName("NotChannelOrganization")
    @Expose
    private Boolean NotChannelOrganization;

    /**
    * 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成

当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 同应用下第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样，签署方为非发起方企业场景下必传，最大长度64个字符
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
<ul><li> **PERSON** :个人/自然人</li>
<li> **PERSON_AUTO_SIGN** :个人/自然人自动签署，适用于个人自动签场景</li>
<li> **ORGANIZATION** :企业/企业员工（企业签署方或模板发起时的企业静默签）</li>
<li> **ENTERPRISESERVER** :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</li></ul>

注:  
`1. 个人自动签场景(PERSON_AUTO_SIGN)为白名单功能, 使用前请联系对接的客户经理沟通。`
`2. 若要实现他方企业（同一应用下）自动签，需要满足3个条件：`
<ul><li>条件1：ApproverType 设置为ENTERPRISESERVER</li>
<li>条件2：子客之间完成授权</li>
<li>条件3：联系对接的客户经理沟通如何使用</li></ul>
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 本签署人在此合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。
如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 签署完回调url，最大长度1000个字符
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 使用PDF文件直接发起合同时，签署人指定的签署控件；<br/>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br/>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署）
    */
    @SerializedName("ComponentLimitType")
    @Expose
    private String [] ComponentLimitType;

    /**
    * 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul>
<li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li>
</ul>
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * 签署完前端跳转的url，此字段的用法场景请联系客户经理确认
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人、是否为动态补充签署人等。
详细操作可以参考开发者中心的ApproverOption结构体。
    */
    @SerializedName("ApproverOption")
    @Expose
    private ApproverOption ApproverOption;

    /**
    * 当前签署方进行签署操作是否需要企业内部审批，true 则为需要
    */
    @SerializedName("ApproverNeedSignReview")
    @Expose
    private Boolean ApproverNeedSignReview;

    /**
    * 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）
</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段可传多个校验方式</li></ul>
    */
    @SerializedName("ApproverVerifyTypes")
    @Expose
    private Long [] ApproverVerifyTypes;

    /**
    * 签署人签署合同时的认证方式
<ul><li> **1** :人脸认证</li>
<li> **2** :签署密码</li>
<li> **3** :运营商三要素</li></ul>

默认为1(人脸认证 ),2(签署密码)

注: 
1. 用<font color='red'>模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color='red'>在创建合同重新指定无效</font>
2. 运营商三要素认证方式对手机号运营商及前缀有限制,可以参考[运营商支持列表类](https://qian.tencent.com/developers/partner/mobile_support)得到具体的支持说明
    */
    @SerializedName("ApproverSignTypes")
    @Expose
    private Long [] ApproverSignTypes;

    /**
    * 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 通知签署方经办人的方式, 有以下途径:
<ul><li> **SMS** :(默认)短信</li>
<li> **NONE** : 不通知</li></ul>

注: `签署方为第三方子客企业时会被置为NONE,   不会发短信通知`
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * [通过文件创建签署流程](https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles)时,如果设置了外层参数SignBeanTag=1(允许签署过程中添加签署控件),则可通过此参数明确规定合同所使用的签署控件类型（骑缝章、普通章法人章等）和具体的印章（印章ID）或签名方式。

注：`限制印章控件或骑缝章控件情况下,仅本企业签署方可以指定具体印章（通过传递ComponentValue,支持多个），他方企业或个人只支持限制控件类型。`
    */
    @SerializedName("AddSignComponentsLimits")
    @Expose
    private ComponentLimit [] AddSignComponentsLimits;

    /**
    * 可以自定义签署人角色名：收款人、开具人、见证人等，长度不能超过20，只能由中文、字母、数字和下划线组成。

注: `如果是用模板发起, 优先使用此处上传的, 如果不传则用模板的配置的`
    */
    @SerializedName("ApproverRoleName")
    @Expose
    private String ApproverRoleName;

    /**
     * Get 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。 
     * @return Name 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
     * @param Name 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE : 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。` 
     * @return IdCardType 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE : 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE : 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。`
     * @param IdCardType 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE : 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul> 
     * @return IdCardNumber 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     * @param IdCardNumber 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)， 不支持海外手机号。
请确认手机号所有方为此合同签署方。 
     * @return Mobile 签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)， 不支持海外手机号。
请确认手机号所有方为此合同签署方。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)， 不支持海外手机号。
请确认手机号所有方为此合同签署方。
     * @param Mobile 签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)， 不支持海外手机号。
请确认手机号所有方为此合同签署方。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。 
     * @return OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
     * @param OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。
<ul>
<li>false: 默认值，第三方平台子客企业下员工</li>
<li>true: SaaS平台企业下的员工</li>
</ul>
 
     * @return NotChannelOrganization 指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。
<ul>
<li>false: 默认值，第三方平台子客企业下员工</li>
<li>true: SaaS平台企业下的员工</li>
</ul>

     */
    public Boolean getNotChannelOrganization() {
        return this.NotChannelOrganization;
    }

    /**
     * Set 指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。
<ul>
<li>false: 默认值，第三方平台子客企业下员工</li>
<li>true: SaaS平台企业下的员工</li>
</ul>

     * @param NotChannelOrganization 指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。
<ul>
<li>false: 默认值，第三方平台子客企业下员工</li>
<li>true: SaaS平台企业下的员工</li>
</ul>

     */
    public void setNotChannelOrganization(Boolean NotChannelOrganization) {
        this.NotChannelOrganization = NotChannelOrganization;
    }

    /**
     * Get 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成

当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程 
     * @return OpenId 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成

当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成

当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程
     * @param OpenId 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成

当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 同应用下第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样，签署方为非发起方企业场景下必传，最大长度64个字符 
     * @return OrganizationOpenId 同应用下第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样，签署方为非发起方企业场景下必传，最大长度64个字符
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 同应用下第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样，签署方为非发起方企业场景下必传，最大长度64个字符
     * @param OrganizationOpenId 同应用下第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样，签署方为非发起方企业场景下必传，最大长度64个字符
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
<ul><li> **PERSON** :个人/自然人</li>
<li> **PERSON_AUTO_SIGN** :个人/自然人自动签署，适用于个人自动签场景</li>
<li> **ORGANIZATION** :企业/企业员工（企业签署方或模板发起时的企业静默签）</li>
<li> **ENTERPRISESERVER** :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</li></ul>

注:  
`1. 个人自动签场景(PERSON_AUTO_SIGN)为白名单功能, 使用前请联系对接的客户经理沟通。`
`2. 若要实现他方企业（同一应用下）自动签，需要满足3个条件：`
<ul><li>条件1：ApproverType 设置为ENTERPRISESERVER</li>
<li>条件2：子客之间完成授权</li>
<li>条件3：联系对接的客户经理沟通如何使用</li></ul> 
     * @return ApproverType 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
<ul><li> **PERSON** :个人/自然人</li>
<li> **PERSON_AUTO_SIGN** :个人/自然人自动签署，适用于个人自动签场景</li>
<li> **ORGANIZATION** :企业/企业员工（企业签署方或模板发起时的企业静默签）</li>
<li> **ENTERPRISESERVER** :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</li></ul>

注:  
`1. 个人自动签场景(PERSON_AUTO_SIGN)为白名单功能, 使用前请联系对接的客户经理沟通。`
`2. 若要实现他方企业（同一应用下）自动签，需要满足3个条件：`
<ul><li>条件1：ApproverType 设置为ENTERPRISESERVER</li>
<li>条件2：子客之间完成授权</li>
<li>条件3：联系对接的客户经理沟通如何使用</li></ul>
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
<ul><li> **PERSON** :个人/自然人</li>
<li> **PERSON_AUTO_SIGN** :个人/自然人自动签署，适用于个人自动签场景</li>
<li> **ORGANIZATION** :企业/企业员工（企业签署方或模板发起时的企业静默签）</li>
<li> **ENTERPRISESERVER** :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</li></ul>

注:  
`1. 个人自动签场景(PERSON_AUTO_SIGN)为白名单功能, 使用前请联系对接的客户经理沟通。`
`2. 若要实现他方企业（同一应用下）自动签，需要满足3个条件：`
<ul><li>条件1：ApproverType 设置为ENTERPRISESERVER</li>
<li>条件2：子客之间完成授权</li>
<li>条件3：联系对接的客户经理沟通如何使用</li></ul>
     * @param ApproverType 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
<ul><li> **PERSON** :个人/自然人</li>
<li> **PERSON_AUTO_SIGN** :个人/自然人自动签署，适用于个人自动签场景</li>
<li> **ORGANIZATION** :企业/企业员工（企业签署方或模板发起时的企业静默签）</li>
<li> **ENTERPRISESERVER** :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</li></ul>

注:  
`1. 个人自动签场景(PERSON_AUTO_SIGN)为白名单功能, 使用前请联系对接的客户经理沟通。`
`2. 若要实现他方企业（同一应用下）自动签，需要满足3个条件：`
<ul><li>条件1：ApproverType 设置为ENTERPRISESERVER</li>
<li>条件2：子客之间完成授权</li>
<li>条件3：联系对接的客户经理沟通如何使用</li></ul>
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置； 
     * @return RecipientId 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；
     * @param RecipientId 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 本签署人在此合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。
如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。 
     * @return Deadline 本签署人在此合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。
如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 本签署人在此合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。
如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。
     * @param Deadline 本签署人在此合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。
如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 签署完回调url，最大长度1000个字符 
     * @return CallbackUrl 签署完回调url，最大长度1000个字符
     * @deprecated
     */
    @Deprecated
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署完回调url，最大长度1000个字符
     * @param CallbackUrl 签署完回调url，最大长度1000个字符
     * @deprecated
     */
    @Deprecated
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 使用PDF文件直接发起合同时，签署人指定的签署控件；<br/>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br/>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。 
     * @return SignComponents 使用PDF文件直接发起合同时，签署人指定的签署控件；<br/>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br/>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 使用PDF文件直接发起合同时，签署人指定的签署控件；<br/>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br/>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。
     * @param SignComponents 使用PDF文件直接发起合同时，签署人指定的签署控件；<br/>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br/>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署） 
     * @return ComponentLimitType 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署）
     */
    public String [] getComponentLimitType() {
        return this.ComponentLimitType;
    }

    /**
     * Set 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署）
     * @param ComponentLimitType 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署）
     */
    public void setComponentLimitType(String [] ComponentLimitType) {
        this.ComponentLimitType = ComponentLimitType;
    }

    /**
     * Get 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul>
<li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li>
</ul> 
     * @return PreReadTime 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul>
<li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li>
</ul>
     */
    public Long getPreReadTime() {
        return this.PreReadTime;
    }

    /**
     * Set 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul>
<li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li>
</ul>
     * @param PreReadTime 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul>
<li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li>
</ul>
     */
    public void setPreReadTime(Long PreReadTime) {
        this.PreReadTime = PreReadTime;
    }

    /**
     * Get 签署完前端跳转的url，此字段的用法场景请联系客户经理确认 
     * @return JumpUrl 签署完前端跳转的url，此字段的用法场景请联系客户经理确认
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完前端跳转的url，此字段的用法场景请联系客户经理确认
     * @param JumpUrl 签署完前端跳转的url，此字段的用法场景请联系客户经理确认
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人、是否为动态补充签署人等。
详细操作可以参考开发者中心的ApproverOption结构体。 
     * @return ApproverOption 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人、是否为动态补充签署人等。
详细操作可以参考开发者中心的ApproverOption结构体。
     */
    public ApproverOption getApproverOption() {
        return this.ApproverOption;
    }

    /**
     * Set 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人、是否为动态补充签署人等。
详细操作可以参考开发者中心的ApproverOption结构体。
     * @param ApproverOption 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人、是否为动态补充签署人等。
详细操作可以参考开发者中心的ApproverOption结构体。
     */
    public void setApproverOption(ApproverOption ApproverOption) {
        this.ApproverOption = ApproverOption;
    }

    /**
     * Get 当前签署方进行签署操作是否需要企业内部审批，true 则为需要 
     * @return ApproverNeedSignReview 当前签署方进行签署操作是否需要企业内部审批，true 则为需要
     */
    public Boolean getApproverNeedSignReview() {
        return this.ApproverNeedSignReview;
    }

    /**
     * Set 当前签署方进行签署操作是否需要企业内部审批，true 则为需要
     * @param ApproverNeedSignReview 当前签署方进行签署操作是否需要企业内部审批，true 则为需要
     */
    public void setApproverNeedSignReview(Boolean ApproverNeedSignReview) {
        this.ApproverNeedSignReview = ApproverNeedSignReview;
    }

    /**
     * Get 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）
</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段可传多个校验方式</li></ul> 
     * @return ApproverVerifyTypes 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）
</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段可传多个校验方式</li></ul>
     */
    public Long [] getApproverVerifyTypes() {
        return this.ApproverVerifyTypes;
    }

    /**
     * Set 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）
</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段可传多个校验方式</li></ul>
     * @param ApproverVerifyTypes 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）
</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段可传多个校验方式</li></ul>
     */
    public void setApproverVerifyTypes(Long [] ApproverVerifyTypes) {
        this.ApproverVerifyTypes = ApproverVerifyTypes;
    }

    /**
     * Get 签署人签署合同时的认证方式
<ul><li> **1** :人脸认证</li>
<li> **2** :签署密码</li>
<li> **3** :运营商三要素</li></ul>

默认为1(人脸认证 ),2(签署密码)

注: 
1. 用<font color='red'>模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color='red'>在创建合同重新指定无效</font>
2. 运营商三要素认证方式对手机号运营商及前缀有限制,可以参考[运营商支持列表类](https://qian.tencent.com/developers/partner/mobile_support)得到具体的支持说明 
     * @return ApproverSignTypes 签署人签署合同时的认证方式
<ul><li> **1** :人脸认证</li>
<li> **2** :签署密码</li>
<li> **3** :运营商三要素</li></ul>

默认为1(人脸认证 ),2(签署密码)

注: 
1. 用<font color='red'>模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color='red'>在创建合同重新指定无效</font>
2. 运营商三要素认证方式对手机号运营商及前缀有限制,可以参考[运营商支持列表类](https://qian.tencent.com/developers/partner/mobile_support)得到具体的支持说明
     */
    public Long [] getApproverSignTypes() {
        return this.ApproverSignTypes;
    }

    /**
     * Set 签署人签署合同时的认证方式
<ul><li> **1** :人脸认证</li>
<li> **2** :签署密码</li>
<li> **3** :运营商三要素</li></ul>

默认为1(人脸认证 ),2(签署密码)

注: 
1. 用<font color='red'>模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color='red'>在创建合同重新指定无效</font>
2. 运营商三要素认证方式对手机号运营商及前缀有限制,可以参考[运营商支持列表类](https://qian.tencent.com/developers/partner/mobile_support)得到具体的支持说明
     * @param ApproverSignTypes 签署人签署合同时的认证方式
<ul><li> **1** :人脸认证</li>
<li> **2** :签署密码</li>
<li> **3** :运营商三要素</li></ul>

默认为1(人脸认证 ),2(签署密码)

注: 
1. 用<font color='red'>模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color='red'>在创建合同重新指定无效</font>
2. 运营商三要素认证方式对手机号运营商及前缀有限制,可以参考[运营商支持列表类](https://qian.tencent.com/developers/partner/mobile_support)得到具体的支持说明
     */
    public void setApproverSignTypes(Long [] ApproverSignTypes) {
        this.ApproverSignTypes = ApproverSignTypes;
    }

    /**
     * Get 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息 
     * @return SignId 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息
     * @param SignId 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 通知签署方经办人的方式, 有以下途径:
<ul><li> **SMS** :(默认)短信</li>
<li> **NONE** : 不通知</li></ul>

注: `签署方为第三方子客企业时会被置为NONE,   不会发短信通知` 
     * @return NotifyType 通知签署方经办人的方式, 有以下途径:
<ul><li> **SMS** :(默认)短信</li>
<li> **NONE** : 不通知</li></ul>

注: `签署方为第三方子客企业时会被置为NONE,   不会发短信通知`
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知签署方经办人的方式, 有以下途径:
<ul><li> **SMS** :(默认)短信</li>
<li> **NONE** : 不通知</li></ul>

注: `签署方为第三方子客企业时会被置为NONE,   不会发短信通知`
     * @param NotifyType 通知签署方经办人的方式, 有以下途径:
<ul><li> **SMS** :(默认)短信</li>
<li> **NONE** : 不通知</li></ul>

注: `签署方为第三方子客企业时会被置为NONE,   不会发短信通知`
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get [通过文件创建签署流程](https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles)时,如果设置了外层参数SignBeanTag=1(允许签署过程中添加签署控件),则可通过此参数明确规定合同所使用的签署控件类型（骑缝章、普通章法人章等）和具体的印章（印章ID）或签名方式。

注：`限制印章控件或骑缝章控件情况下,仅本企业签署方可以指定具体印章（通过传递ComponentValue,支持多个），他方企业或个人只支持限制控件类型。` 
     * @return AddSignComponentsLimits [通过文件创建签署流程](https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles)时,如果设置了外层参数SignBeanTag=1(允许签署过程中添加签署控件),则可通过此参数明确规定合同所使用的签署控件类型（骑缝章、普通章法人章等）和具体的印章（印章ID）或签名方式。

注：`限制印章控件或骑缝章控件情况下,仅本企业签署方可以指定具体印章（通过传递ComponentValue,支持多个），他方企业或个人只支持限制控件类型。`
     */
    public ComponentLimit [] getAddSignComponentsLimits() {
        return this.AddSignComponentsLimits;
    }

    /**
     * Set [通过文件创建签署流程](https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles)时,如果设置了外层参数SignBeanTag=1(允许签署过程中添加签署控件),则可通过此参数明确规定合同所使用的签署控件类型（骑缝章、普通章法人章等）和具体的印章（印章ID）或签名方式。

注：`限制印章控件或骑缝章控件情况下,仅本企业签署方可以指定具体印章（通过传递ComponentValue,支持多个），他方企业或个人只支持限制控件类型。`
     * @param AddSignComponentsLimits [通过文件创建签署流程](https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles)时,如果设置了外层参数SignBeanTag=1(允许签署过程中添加签署控件),则可通过此参数明确规定合同所使用的签署控件类型（骑缝章、普通章法人章等）和具体的印章（印章ID）或签名方式。

注：`限制印章控件或骑缝章控件情况下,仅本企业签署方可以指定具体印章（通过传递ComponentValue,支持多个），他方企业或个人只支持限制控件类型。`
     */
    public void setAddSignComponentsLimits(ComponentLimit [] AddSignComponentsLimits) {
        this.AddSignComponentsLimits = AddSignComponentsLimits;
    }

    /**
     * Get 可以自定义签署人角色名：收款人、开具人、见证人等，长度不能超过20，只能由中文、字母、数字和下划线组成。

注: `如果是用模板发起, 优先使用此处上传的, 如果不传则用模板的配置的` 
     * @return ApproverRoleName 可以自定义签署人角色名：收款人、开具人、见证人等，长度不能超过20，只能由中文、字母、数字和下划线组成。

注: `如果是用模板发起, 优先使用此处上传的, 如果不传则用模板的配置的`
     */
    public String getApproverRoleName() {
        return this.ApproverRoleName;
    }

    /**
     * Set 可以自定义签署人角色名：收款人、开具人、见证人等，长度不能超过20，只能由中文、字母、数字和下划线组成。

注: `如果是用模板发起, 优先使用此处上传的, 如果不传则用模板的配置的`
     * @param ApproverRoleName 可以自定义签署人角色名：收款人、开具人、见证人等，长度不能超过20，只能由中文、字母、数字和下划线组成。

注: `如果是用模板发起, 优先使用此处上传的, 如果不传则用模板的配置的`
     */
    public void setApproverRoleName(String ApproverRoleName) {
        this.ApproverRoleName = ApproverRoleName;
    }

    public FlowApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverInfo(FlowApproverInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.NotChannelOrganization != null) {
            this.NotChannelOrganization = new Boolean(source.NotChannelOrganization);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.ComponentLimitType != null) {
            this.ComponentLimitType = new String[source.ComponentLimitType.length];
            for (int i = 0; i < source.ComponentLimitType.length; i++) {
                this.ComponentLimitType[i] = new String(source.ComponentLimitType[i]);
            }
        }
        if (source.PreReadTime != null) {
            this.PreReadTime = new Long(source.PreReadTime);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.ApproverOption != null) {
            this.ApproverOption = new ApproverOption(source.ApproverOption);
        }
        if (source.ApproverNeedSignReview != null) {
            this.ApproverNeedSignReview = new Boolean(source.ApproverNeedSignReview);
        }
        if (source.ApproverVerifyTypes != null) {
            this.ApproverVerifyTypes = new Long[source.ApproverVerifyTypes.length];
            for (int i = 0; i < source.ApproverVerifyTypes.length; i++) {
                this.ApproverVerifyTypes[i] = new Long(source.ApproverVerifyTypes[i]);
            }
        }
        if (source.ApproverSignTypes != null) {
            this.ApproverSignTypes = new Long[source.ApproverSignTypes.length];
            for (int i = 0; i < source.ApproverSignTypes.length; i++) {
                this.ApproverSignTypes[i] = new Long(source.ApproverSignTypes[i]);
            }
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.AddSignComponentsLimits != null) {
            this.AddSignComponentsLimits = new ComponentLimit[source.AddSignComponentsLimits.length];
            for (int i = 0; i < source.AddSignComponentsLimits.length; i++) {
                this.AddSignComponentsLimits[i] = new ComponentLimit(source.AddSignComponentsLimits[i]);
            }
        }
        if (source.ApproverRoleName != null) {
            this.ApproverRoleName = new String(source.ApproverRoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "NotChannelOrganization", this.NotChannelOrganization);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamArraySimple(map, prefix + "ComponentLimitType.", this.ComponentLimitType);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamObj(map, prefix + "ApproverOption.", this.ApproverOption);
        this.setParamSimple(map, prefix + "ApproverNeedSignReview", this.ApproverNeedSignReview);
        this.setParamArraySimple(map, prefix + "ApproverVerifyTypes.", this.ApproverVerifyTypes);
        this.setParamArraySimple(map, prefix + "ApproverSignTypes.", this.ApproverSignTypes);
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamArrayObj(map, prefix + "AddSignComponentsLimits.", this.AddSignComponentsLimits);
        this.setParamSimple(map, prefix + "ApproverRoleName", this.ApproverRoleName);

    }
}

